package model;

import java.util.ArrayList;

public class DroidzStub
{
	private ArrayList<Droid> promoList = new ArrayList<Droid>();
	
	public ArrayList<Droid> createDroidList()
	{
		//Liste de droids
		ArrayList<Droid> droidList = new ArrayList<Droid>();
		Droid droid;
		String description;
				
		//Commentaires
		ArrayList<Comment> commentList = new ArrayList<Comment>();
		String commentaire =  "Bonne qualité. Après modification du servomoteur en rotation continu je m'aperçois qu'il est très compliqué de trouver la valeur pour les stopper. Dans mon cas je suis sur une valeur de 82°, mais on sens bien que malgré la stabilité, la volonté de repartir est bien présente.";
		Comment comment1 = new Comment(0, commentaire, 4);
		Comment comment2 = new Comment(1, "La batterie ne dure que 24 heures. Insatisfait.", 1);
		Comment comment3 = new Comment(2, "Ce modèle cuisine merveilleusement bien! 5/5!", 5);
		Comment comment4 = new Comment(3, "Elle cuisine comme ma belle-mère!", 2);
		Comment comment5 = new Comment(4, "Très bien en général.", 4);
		Comment comment6 = new Comment(5, "Pas mal pour un prototype.", 3);
		
		//Droid 49
		commentList = new ArrayList<Comment>();
		commentList.add(comment3);
		description = "Description à venir.";
		droid = new Droid(49, 100, 4999.99, "Seyfried Model", description, "49", commentList, "img1",
				//combat, cook, garden, laundry, clean , dishes
				true, true, true, true, true, true);
		droidList.add(droid);
		promoList.add(droid);
		
		//Droid 39
		commentList = new ArrayList<Comment>();
		commentList.add(comment5);
		description = "Description à venir.";
		droid = new Droid(39, 100, 4999.99, "Kia Pub", description, "39", commentList, "img2",
				//combat, cook, garden, laundry, clean , dishes
				false, true, true, true, true, true);
		droidList.add(droid);
		promoList.add(droid);
		
		//Droid 56
		commentList = new ArrayList<Comment>();
		commentList.add(comment2);
		description = "Description à venir.";
		droid = new Droid(56, 100, 4999.99, "Sara Android", description, "56", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, true, true, true, true, true);
		droidList.add(droid);
		
		//Droid 47
		commentList = new ArrayList<Comment>();
		commentList.add(comment2);
		description = "Description à venir.";
		droid = new Droid(47, 100, 4999.99, "Yellow Fiora", description, "47", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, true, true, true, true, false);
		droidList.add(droid);
		
		//Droid 40
		commentList = new ArrayList<Comment>();
		commentList.add(comment5);
		description = "Description à venir.";
		droid = new Droid(40, 100, 4999.99, "Sherly Robot", description, "40", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, false, true, true, false, false);
		droidList.add(droid);
		
		//Droid 36
		commentList = new ArrayList<Comment>();
		commentList.add(comment3);
		description = "Description à venir.";
		droid = new Droid(36, 100, 4999.99, "Sun Tech", description, "36", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, true, true, true, true, true);
		droidList.add(droid);
				
		//Droid 48
		commentList = new ArrayList<Comment>();
		commentList.add(comment2);
		description = "Description à venir.";
		droid = new Droid(48, 100, 4999.99, "White Fiora", description, "48", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, true, true, true, true, false);
		droidList.add(droid);
				
		//Droid 50
		commentList = new ArrayList<Comment>();
		commentList.add(comment4);
		description = "Description à venir.";
		droid = new Droid(50, 100, 4999.99, "Teal Fiora", description, "50", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, true, true, true, true, false);
		droidList.add(droid);
				
		//Droid 51
		commentList = new ArrayList<Comment>();
		commentList.add(comment4);
		description = "Description à venir.";
		droid = new Droid(51, 100, 4999.99, "Pink Fiora", description, "51", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, true, true, true, true, false);
		droidList.add(droid);
				
		//Droid 52
		commentList = new ArrayList<Comment>();
		commentList.add(comment5);
		description = "Description à venir.";
		droid = new Droid(52, 100, 4999.99, "Generation Mia-Z4", description, "52", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, true, true, true, true, true);
		droidList.add(droid);
				
		//Droid 53
		commentList = new ArrayList<Comment>();
		commentList.add(comment5);
		description = "Description à venir.";
		droid = new Droid(53, 100, 4999.99, "ZS-D-243 Techno", description, "53", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, true, true, true, true, true);
		droidList.add(droid);
		
		//Droid 12
		commentList = new ArrayList<Comment>();
		commentList.add(comment1);
		description = "Description à venir.";
		droid = new Droid(12, 100, 4999.99, "Raw Science", description, "12", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, true, true, true, true, true);
		droidList.add(droid);
		
		//Droid 15
		commentList = new ArrayList<Comment>();
		description = "Description à venir.";
		droid = new Droid(15, 100, 4999.99, "Rose", description, "15", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, true, true, true, true, true);
		droidList.add(droid);
		
		//Droid 22	
		commentList = new ArrayList<Comment>();
		commentList.add(comment6);
		description = "Description à venir.";
		droid = new Droid(22, 100, 4999.99, "Knight S2", description, "22", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, true, true, true, true, true);
		droidList.add(droid);
		
		//Droid 23	
		commentList = new ArrayList<Comment>();
		commentList.add(comment1);
		description = "Description à venir.";
		droid = new Droid(23, 100, 4999.99, "H-2036", description, "23", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, false, true, true, false, true);
		droidList.add(droid);
		
		//Droid 16
		commentList = new ArrayList<Comment>();
		commentList.add(comment6);
		description = "Description à venir.";
		droid = new Droid(16, 100, 4999.99, "Jenkins XR56", description, "16", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, true, false, true, true, false);
		droidList.add(droid);
		
		//Droid 54		
		commentList = new ArrayList<Comment>();
		commentList.add(comment3);
		description = "Description à venir.";
		droid = new Droid(54, 100, 4999.99, "Cuoco F150", description, "54", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, true, true, true, true, true);
		droidList.add(droid);
		
		//Droid 18
		commentList = new ArrayList<Comment>();
		commentList.add(comment3);
		description = "Description à venir.";
		droid = new Droid(18, 100, 4999.99, "Red Mia", description, "18", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, false, false, true, true, false);
		droidList.add(droid);
		
		//Droid 19		
		commentList = new ArrayList<Comment>();
		commentList.add(comment4);
		description = "Description à venir.";
		droid = new Droid(19, 100, 4999.99, "Modèle Soph", description, "19", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, true, true, true, true, true);
		droidList.add(droid);
		
		//Droid 20	
		commentList = new ArrayList<Comment>();
		commentList.add(comment5);
		description = "Description à venir.";
		droid = new Droid(20, 100, 4999.99, "F2BR3", description, "20", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, true, true, true, true, false);
		droidList.add(droid);
		
		//Droid 21	
		commentList = new ArrayList<Comment>();
		commentList.add(comment5);
		description = "Description à venir.";
		droid = new Droid(21, 100, 4999.99, "X-TREM", description, "21", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, true, true, true, false, false);
		droidList.add(droid);
		
		//Droid 26	
		commentList = new ArrayList<Comment>();
		commentList.add(comment2);
		description = "Description à venir.";
		droid = new Droid(26, 100, 4999.99, "RedEye-Sirena", description, "26", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, true, true, true, true, true);
		droidList.add(droid);
		
		//Droid 27	
		commentList = new ArrayList<Comment>();
		commentList.add(comment3);
		description = "Description à venir.";
		droid = new Droid(27, 100, 4999.99, "Hey-Bi**h", description, "27", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, false, false, false, false, false);
		droidList.add(droid);
		
		//Droid 28	
		commentList = new ArrayList<Comment>();
		commentList.add(comment4);
		description = "Description à venir.";
		droid = new Droid(28, 100, 4999.99, "Combat-Jolie", description, "28", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, false, false, false, false, false);
		droidList.add(droid);
		
		//Droid 29
		commentList = new ArrayList<Comment>();
		commentList.add(comment5);
		description = "Description à venir.";
		droid = new Droid(29, 100, 4999.99, "R88 Generation", description, "29", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, true, true, true, false, true);
		droidList.add(droid);
		
		//Droid 30
		commentList = new ArrayList<Comment>();
		commentList.add(comment6);
		description = "Description à venir.";
		droid = new Droid(30, 100, 4999.99, "Multifonction Jannah", description, "30", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, true, true, true, true, true);
		droidList.add(droid);
		
		//Droid 31
		commentList = new ArrayList<Comment>();
		commentList.add(comment1);
		description = "Description à venir.";
		droid = new Droid(31, 100, 4999.99, "Scary Ria-666", description, "31", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, false, false, false, false, false);
		droidList.add(droid);
		
		//Droid 32
		commentList = new ArrayList<Comment>();
		commentList.add(comment1);
		description = "Description à venir.";
		droid = new Droid(32, 100, 4999.99, "Eve Version", description, "32", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, true, true, true, false, true);
		droidList.add(droid);
		
		//Droid 38
		commentList = new ArrayList<Comment>();
		commentList.add(comment4);
		description = "Description à venir.";
		droid = new Droid(38, 100, 4999.99, "Last Tech Z34", description, "38", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, false, false, false, true, true);
		droidList.add(droid);
		
		//Droid 41
		commentList = new ArrayList<Comment>();
		commentList.add(comment6);
		description = "Description à venir.";
		droid = new Droid(41, 100, 4999.99, "Mass-E3", description, "41", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, false, false, false, false, false);
		droidList.add(droid);
		
		//Droid 42
		commentList = new ArrayList<Comment>();
		commentList.add(comment1);
		description = "Description à venir.";
		droid = new Droid(42, 100, 4999.99, "Prototype D-23L", description, "42", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, true, true, false, true, true);
		droidList.add(droid);
		
		//Droid 45
		commentList = new ArrayList<Comment>();
		commentList.add(comment1);
		description = "Description à venir.";
		droid = new Droid(45, 100, 4999.99, "Rachel-V1-2020", description, "45", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, false, false, false, false, true);
		droidList.add(droid);
		
		//Droid 46
		commentList = new ArrayList<Comment>();
		commentList.add(comment2);
		description = "Description à venir.";
		droid = new Droid(46, 100, 4999.99, "Blue Fiora", description, "46", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, true, true, true, true, false);
		droidList.add(droid);
		
		//Droid 55
		commentList = new ArrayList<Comment>();
		commentList.add(comment6);
		description = "Description à venir.";
		droid = new Droid(55, 100, 4999.99, "Siri-V6 Apple", description, "55", commentList, "img3",
				//combat, cook, garden, laundry, clean , dishes
				false, true, false, true, true, true);
		droidList.add(droid);
		promoList.add(droid);
		
		//Droid 2
		commentList = new ArrayList<Comment>();
		commentList.add(comment1);
		commentList.add(comment2);
		commentList.add(comment3);
		commentList.add(comment4);
		commentList.add(comment5);
		commentList.add(comment6);
		description = "Prototype B96 est un robot polyvalent de 6e génération. "
				+ "Son bras manipulateur possède une structure série à six liaisons rotoïdes "
				+ "repérées de J1 à J6 de la base vers le poignet. Les mouvements sont réalisés grâce à six servomoteurs "
				+ "électriques à courant alternatif de type « sans-balais ». "
				+ "Chacun des axes est équipé d’un codeur absolu sur un tour permettant de repérer sa position angulaire "
				+ "par rapport à la configuration d’origine.";
		droid = new Droid(2, 88, 3499.99, "Prototype B96", description, "2", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, true, false, true, true, false);
		droidList.add(droid);
				
		//Droid 3
		commentList = new ArrayList<Comment>();
		commentList.add(comment1);
		commentList.add(comment2);
		commentList.add(comment3);
		description = "F-Gun est spécialisé dans les combats au corps à corps. Elle n'a jamais perdu un combat contre un humain. "
				+ "Elle est aussi excellente dans une cuisine. "
				+ "Son bras manipulateur possède une structure série à six liaisons rotoïdes "
				+ "repérées de J1 à J6 de la base vers le poignet. Les mouvements sont réalisés grâce à six servomoteurs "
				+ "électriques à courant alternatif de type « sans-balais ». "
				+ "Chacun des axes est équipé d’un codeur absolu sur un tour permettant de repérer sa position angulaire "
				+ "par rapport à la configuration d’origine.";
		droid = new Droid(3, 56, 13499.99, "F-Gun", description, "3", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, true, false, false, false, false);
		droidList.add(droid);
			
		//Droid 4
		commentList = new ArrayList<Comment>();
		commentList.add(comment2);
		commentList.add(comment6);
		description = "Disponible en plusieurs teintes de couleur. "
				+ "Son bras manipulateur possède une structure série à six liaisons rotoïdes "
				+ "repérées de J1 à J6 de la base vers le poignet. Les mouvements sont réalisés grâce à six servomoteurs "
				+ "électriques à courant alternatif de type « sans-balais ». "
				+ "Chacun des axes est équipé d’un codeur absolu sur un tour permettant de repérer sa position angulaire "
				+ "par rapport à la configuration d’origine.";
		droid = new Droid(4, 97, 500, "Miriante", description, "4", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, false, false, true, false, false);
		droidList.add(droid);
			
		//Droid 5
		commentList = new ArrayList<Comment>();
		commentList.add(comment5);
		description = "Prototype B97 est disponible en plusieurs teintes de couleur. "
				+ "Son bras manipulateur possède une structure série à six liaisons rotoïdes "
				+ "repérées de J1 à J6 de la base vers le poignet. Les mouvements sont réalisés grâce à six servomoteurs "
				+ "électriques à courant alternatif de type « sans-balais ».";
		droid = new Droid(5, 12, 3000, "Prototype B97", description, "5", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, false, false, false, true, true);
		droidList.add(droid);
				
		//Droid 8
		commentList = new ArrayList<Comment>();
		commentList.add(comment5);
		description = "Yvonna-Tech est spécialisée dans les tâches ménagères. "
				+ "Son bras manipulateur possède une structure série à six liaisons rotoïdes "
				+ "repérées de J1 à J6 de la base vers le poignet.";
		droid = new Droid(8, 1250, 4705.50, "Yvonna-Tech", description, "8", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, true, false, true, true, true);
		droidList.add(droid);
				
		//Droid 9
		commentList = new ArrayList<Comment>();
		description = "Jiyu Motors est issue de la fine pointe de la technologie chinoise. "
				+ "Son bras manipulateur possède une structure série à six liaisons rotoïdes "
				+ "repérées de J1 à J6 de la base vers le poignet.";
		droid = new Droid(9, 37, 3522, "Jiyu Motors", description, "9", commentList, "img4",
				//combat, cook, garden, laundry, clean , dishes
				false, false, true, true, true, true);
		droidList.add(droid);
		promoList.add(droid);
				
		//Droid 10
		commentList = new ArrayList<Comment>();
		commentList.add(comment1);
		commentList.add(comment4);
		commentList.add(comment6);
		description = "Une prochaine version du modèle lui permettra de faire la lessive. "
				+ "Son bras manipulateur possède une structure série à six liaisons rotoïdes "
				+ "repérées de J1 à J6 de la base vers le poignet. Les mouvements sont réalisés grâce à six servomoteurs "
				+ "électriques à courant alternatif de type « sans-balais ». "
				+ "Chacun des axes est équipé d’un codeur absolu sur un tour permettant de repérer sa position angulaire "
				+ "par rapport à la configuration d’origine.";
				droid = new Droid(10, 1234, 1899.99, "Modèle Jolie", description, "10", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, true, true, true, false, false);
		droidList.add(droid);
				
		//Droid 11
		commentList = new ArrayList<Comment>();
		commentList.add(comment1);
		commentList.add(comment2);
		commentList.add(comment5);
		commentList.add(comment6);
		description = "Poor PSD skills. "
				+ "Son bras manipulateur possède une structure série à six liaisons rotoïdes "
				+ "repérées de J1 à J6 de la base vers le poignet. Les mouvements sont réalisés grâce à six servomoteurs "
				+ "électriques à courant alternatif de type « sans-balais ». "
				+ "Chacun des axes est équipé d’un codeur absolu sur un tour permettant de repérer sa position angulaire "
				+ "par rapport à la configuration d’origine.";
		droid = new Droid(11, 76, 2999.99, "Michelle-101", description, "11", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, false, true, true, false, false);
		droidList.add(droid);
		
		//Droid 13
		commentList = new ArrayList<Comment>();
		commentList.add(comment2);
		description = "Description à venir.";
		droid = new Droid(13, 100, 4999.99, "Bell Robots - F", description, "13", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, true, false, true, false, true);
		droidList.add(droid);
				
		//Droid 14
		commentList = new ArrayList<Comment>();
		commentList.add(comment4);
		description = "Description à venir.";
		droid = new Droid(14, 100, 4999.99, "Bell Robots - M", description, "14", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, false, true, false, false, false);
		droidList.add(droid);
		
		//Droid 17
		commentList = new ArrayList<Comment>();
		commentList.add(comment2);
		description = "Poor PSD Skills.";
		droid = new Droid(17, 100, 4999.99, "Knight S1", description, "17", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, true, true, true, true, false);
		droidList.add(droid);
		
		return droidList;
	}
	
	
	public ArrayList<Droid> getPromoList() {
		return promoList;
	}
}
