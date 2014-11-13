package amazone;
/**********************************************************************************************
 * Copyright 2009 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file 
 * except in compliance with the License. A copy of the License is located at
 *
 *       http://aws.amazon.com/apache2.0/
 *
 * or in the "LICENSE.txt" file accompanying this file. This file is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under the License. 
 *
 * ********************************************************************************************
 *
 *  Amazon Product Advertising API
 *  Signed Requests Sample Code
 *
 *  API Version: 2009-03-31
 *
 */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import model.Droid;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/*
 * This class shows how to make a simple authenticated ItemLookup call to the
 * Amazon Product Advertising API.
 * 
 * See the README.html that came with this sample for instructions on
 * configuring and running the sample.
 */
public class ItemLookupSample {
    /*
     * Your AWS Access Key ID, as taken from the AWS Your Account page.
     */
    private static final String AWS_ACCESS_KEY_ID = "AKIAJVFPNT37IDLUWCRA";

    /*
     * Your AWS Secret Key corresponding to the above ID, as taken from the AWS
     * Your Account page.
     */
    private static final String AWS_SECRET_KEY = "QLhbkQn11HvknA4zGlCaLEuQZmWV15MIINRsoYr0";

    /*
     * Use one of the following end-points, according to the region you are
     * interested in:
     * 
     *      US: ecs.amazonaws.com 
     *      CA: ecs.amazonaws.ca 
     *      UK: ecs.amazonaws.co.uk 
     *      DE: ecs.amazonaws.de 
     *      FR: ecs.amazonaws.fr 
     *      JP: ecs.amazonaws.jp
     * 
     */
    private static final String ENDPOINT = "ecs.amazonaws.com";

    /*
     * The Item ID to lookup. The value below was selected for the US locale.
     * You can choose a different value if this value does not work in the
     * locale of your choice.
     */
    private static final String ITEM_ID = "B002KHN23S";

    public static ArrayList<Amazones> main() {
        /*
         * Set up the signed requests helper 
         */
        SignedRequestsHelper helper = null;
        try {
            helper = SignedRequestsHelper.getInstance(ENDPOINT, AWS_ACCESS_KEY_ID, AWS_SECRET_KEY);
        } catch (Exception e) {
            e.printStackTrace();
            
        }
        
        String requestUrl = null;
        ArrayList<Amazones> matches = null;

        /* The helper can sign requests in two forms - map form and string form */
        
        /*
         * Here is an example in map form, where the request parameters are stored in a map.
         */
        System.out.println("Map form example:");
        
        Map<String, String> params = new HashMap<String, String>();
        params.put("Service", "AWSECommerceService");
        params.put("Version", "2009-03-31");
        params.put("Operation", "SimilarityLookup");
        params.put("ItemId", ITEM_ID);
        params.put("ResponseGroup", "Image,Large");
        params.put("AssociateTag", "edroidz-20");

        requestUrl = helper.sign(params);
        System.out.println("Signed Request is \"" + requestUrl + "\"");

        matches = fetchTitle(requestUrl);
        

       return matches;

    }

    private static ArrayList<Amazones> fetchTitle(String requestUrl) {
    	ArrayList<Amazones> matches = new ArrayList<Amazones>();
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(requestUrl);            
            
            NodeList items = doc.getElementsByTagName("Item");
            for (int i = 0; i < items.getLength(); ++i){
            	
            	Node titleNode = doc.getElementsByTagName("Title").item(i);
            	Node titleDescription = doc.getElementsByTagName("ProductGroup").item(i);
            	Node titleImage = doc.getElementsByTagName("LargeImage").item(i).getFirstChild();
            	Node titleUrl = doc.getElementsByTagName("DetailPageURL").item(i);            	
            	
            	Amazones item = new Amazones(titleNode.getTextContent(), titleDescription.getTextContent(),titleImage.getTextContent(),titleUrl.getTextContent());
            	matches.add(item);       	
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return matches;
    }

}
