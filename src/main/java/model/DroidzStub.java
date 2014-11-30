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
		String description = "La modélisation d'un robot1, considéré comme étant un système mécanique articulé, "
				+ "actionné et commandé, consiste à en établir un modèle mathématique. "
				+ "Outre une fonction générale d'aide à la conception, elle a de multiples utilisations pour, "
				+ "la prédiction des mouvements, l'adaptation des actionneurs, la planication des tâches, "
				+ "l'établissement deslois de commande, l'incorporation du robot dans des simulations "
				+ "informatiques...etc. Dans le langage courant, la modélisation précède la simulation "
				+ "sans que l'on distingue une séparation nette entre ces deux activités.";
				
		//Commentaires
		ArrayList<Comment> commentList = new ArrayList<Comment>();
		String commentaire =  "Bonne qualite. Apres modification du servomoteur en rotation continu je m'apercois qu'il est tres complique de trouver la valeur pour les stopper.";
		Comment comment1 = new Comment(0, 0, commentaire, 4);
		Comment comment2 = new Comment(1, 0, "La batterie ne dure que 24 heures. Insatisfait.", 1);
		Comment comment3 = new Comment(2, 0, "Ce modele cuisine merveilleusement bien! 5/5!", 5);
		Comment comment4 = new Comment(3, 0, "Elle cuisine comme ma belle-mere!", 2);
		Comment comment5 = new Comment(4, 0, "Tres bien en general.", 4);
		Comment comment6 = new Comment(5, 0, "Pas mal pour un prototype.", 3);
		
		//Droid 49
		commentList = new ArrayList<Comment>();
		commentList.add(comment3);
		droid = new Droid(49, 3, 4999.99, "Seyfried Model", description, "49", commentList, "img1",
				//combat, cook, garden, laundry, clean , dishes
				true, true, true, true, true, true);
		droidList.add(droid);
		promoList.add(droid);
		
		//Droid 39
		commentList = new ArrayList<Comment>();
		commentList.add(comment5);
		droid = new Droid(39, 1, 4999.99, "Kia Pub", "Description personnalisee de KiaPub", "39", commentList, "img2",
				//combat, cook, garden, laundry, clean , dishes
				false, true, true, true, true, true);
		droidList.add(droid);
		promoList.add(droid);
		
		//Droid 56
		commentList = new ArrayList<Comment>();
		commentList.add(comment2);
		droid = new Droid(56, 2, 4999.99, "Sara Android", description, "56", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, true, true, true, true, true);
		droidList.add(droid);
		
		//Droid 47
		commentList = new ArrayList<Comment>();
		commentList.add(comment2);
		droid = new Droid(47, 4, 4999.99, "Yellow Fiora", description, "47", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, true, true, true, true, false);
		droidList.add(droid);
		
		//Droid 40
		commentList = new ArrayList<Comment>();
		commentList.add(comment5);
		droid = new Droid(40, 0, 4999.99, "Sherly Robot", "Description � venir.", "40", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, false, true, true, false, false);
		droidList.add(droid);
		
		//Droid 36
		commentList = new ArrayList<Comment>();
		commentList.add(comment3);
		droid = new Droid(36, 100, 4999.99, "Sun Tech", description, "36", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, true, true, true, true, true);
		droidList.add(droid);
				
		//Droid 48
		commentList = new ArrayList<Comment>();
		commentList.add(comment2);
		droid = new Droid(48, 100, 4999.99, "White Fiora", description, "48", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, true, true, true, true, false);
		droidList.add(droid);
				
		//Droid 50
		commentList = new ArrayList<Comment>();
		commentList.add(comment4);
		droid = new Droid(50, 100, 4999.99, "Teal Fiora", description, "50", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, true, true, true, true, false);
		droidList.add(droid);
				
		//Droid 51
		commentList = new ArrayList<Comment>();
		commentList.add(comment4);
		droid = new Droid(51, 100, 4999.99, "Pink Fiora", description, "51", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, true, true, true, true, false);
		droidList.add(droid);
				
		//Droid 52
		commentList = new ArrayList<Comment>();
		commentList.add(comment5);
		droid = new Droid(52, 100, 4999.99, "Generation Mia-Z", description, "52", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, true, true, true, true, true);
		droidList.add(droid);
				
		//Droid 53
		commentList = new ArrayList<Comment>();
		commentList.add(comment5);
		droid = new Droid(53, 100, 4999.99, "ZS-D Techno", description, "53", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, true, true, true, true, true);
		droidList.add(droid);
		
		//Droid 12
		commentList = new ArrayList<Comment>();
		commentList.add(comment1);
		droid = new Droid(12, 100, 4999.99, "Raw Science", description, "12", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, true, true, true, true, true);
		droidList.add(droid);
		
		//Droid 15
		commentList = new ArrayList<Comment>();
		droid = new Droid(15, 100, 4999.99, "Rose", description, "15", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, true, true, true, true, true);
		droidList.add(droid);
		
		//Droid 22	
		commentList = new ArrayList<Comment>();
		commentList.add(comment6);
		droid = new Droid(22, 100, 4999.99, "Knight SSS", description, "22", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, true, true, true, true, true);
		droidList.add(droid);
		
		//Droid 23	
		commentList = new ArrayList<Comment>();
		commentList.add(comment1);
		droid = new Droid(23, 100, 4999.99, "H-GH", description, "23", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, false, true, true, false, true);
		droidList.add(droid);
		
		//Droid 16
		commentList = new ArrayList<Comment>();
		commentList.add(comment6);
		droid = new Droid(16, 100, 4999.99, "Jenkins XR", description, "16", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, true, false, true, true, false);
		droidList.add(droid);
		
		//Droid 54		
		commentList = new ArrayList<Comment>();
		commentList.add(comment3);
		droid = new Droid(54, 100, 4999.99, "Cuoco FFF", description, "54", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, true, true, true, true, true);
		droidList.add(droid);
		
		//Droid 18
		commentList = new ArrayList<Comment>();
		commentList.add(comment3);
		droid = new Droid(18, 100, 4999.99, "Red Mia", description, "18", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, false, false, true, true, false);
		droidList.add(droid);
		
		//Droid 19		
		commentList = new ArrayList<Comment>();
		commentList.add(comment4);
		droid = new Droid(19, 100, 4999.99, "Mod�le Soph", description, "19", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, true, true, true, true, true);
		droidList.add(droid);
		
		//Droid 20	
		commentList = new ArrayList<Comment>();
		commentList.add(comment5);
		droid = new Droid(20, 100, 4999.99, "FBR", description, "20", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, true, true, true, true, false);
		droidList.add(droid);
		
		//Droid 21	
		commentList = new ArrayList<Comment>();
		commentList.add(comment5);
		droid = new Droid(21, 100, 4999.99, "X-TREM", description, "21", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, true, true, true, false, false);
		droidList.add(droid);
		
		//Droid 26	
		commentList = new ArrayList<Comment>();
		commentList.add(comment2);
		droid = new Droid(26, 100, 4999.99, "RedEye-Sirena", description, "26", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, true, true, true, true, true);
		droidList.add(droid);
		
		//Droid 27	
		commentList = new ArrayList<Comment>();
		commentList.add(comment3);
		droid = new Droid(27, 100, 4999.99, "Hey-Bi**h", description, "27", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, false, false, false, false, false);
		droidList.add(droid);
		
		//Droid 28	
		commentList = new ArrayList<Comment>();
		commentList.add(comment4);
		droid = new Droid(28, 100, 4999.99, "Combat-Jolie", description, "28", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, false, false, false, false, false);
		droidList.add(droid);
		
		//Droid 29
		commentList = new ArrayList<Comment>();
		commentList.add(comment5);
		droid = new Droid(29, 100, 4999.99, "RG Generation", description, "29", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, true, true, true, false, true);
		droidList.add(droid);
		
		//Droid 30
		commentList = new ArrayList<Comment>();
		commentList.add(comment6);
		droid = new Droid(30, 100, 4999.99, "Multifonction Jannah", description, "30", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, true, true, true, true, true);
		droidList.add(droid);
		
		//Droid 31
		commentList = new ArrayList<Comment>();
		commentList.add(comment1);
		droid = new Droid(31, 100, 4999.99, "Scary Ria-NJ", description, "31", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, false, false, false, false, false);
		droidList.add(droid);
		
		//Droid 32
		commentList = new ArrayList<Comment>();
		commentList.add(comment1);
		droid = new Droid(32, 100, 4999.99, "Eve Version", description, "32", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, true, true, true, false, true);
		droidList.add(droid);
		
		//Droid 38
		commentList = new ArrayList<Comment>();
		commentList.add(comment4);
		droid = new Droid(38, 100, 4999.99, "Last Tech Z", description, "38", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, false, false, false, true, true);
		droidList.add(droid);
		
		//Droid 41
		commentList = new ArrayList<Comment>();
		commentList.add(comment6);
		droid = new Droid(41, 100, 4999.99, "Mass-E", description, "41", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, false, false, false, false, false);
		droidList.add(droid);
		
		//Droid 42
		commentList = new ArrayList<Comment>();
		commentList.add(comment1);
		droid = new Droid(42, 100, 4999.99, "Prototype D-L", description, "42", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, true, true, false, true, true);
		droidList.add(droid);
		
		//Droid 45
		commentList = new ArrayList<Comment>();
		commentList.add(comment1);
		droid = new Droid(45, 100, 4999.99, "Rachel-V", description, "45", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, false, false, false, false, true);
		droidList.add(droid);
		
		//Droid 46
		commentList = new ArrayList<Comment>();
		commentList.add(comment2);
		droid = new Droid(46, 100, 4999.99, "Blue Fiora", description, "46", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, true, true, true, true, false);
		droidList.add(droid);
		
		//Droid 55
		commentList = new ArrayList<Comment>();
		commentList.add(comment6);
		droid = new Droid(55, 100, 4999.99, "Siri-V Apple", description, "55", commentList, "img3",
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
		droid = new Droid(2, 88, 3499.99, "Prototype B96", description, "2", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, true, false, true, true, false);
		droidList.add(droid);
				
		//Droid 3
		commentList = new ArrayList<Comment>();
		commentList.add(comment1);
		commentList.add(comment2);
		commentList.add(comment3);
		droid = new Droid(3, 56, 13499.99, "F-Gun", description, "3", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				true, true, false, false, false, false);
		droidList.add(droid);
			
		//Droid 4
		commentList = new ArrayList<Comment>();
		commentList.add(comment2);
		commentList.add(comment6);
		droid = new Droid(4, 97, 500, "Miriante", description, "4", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, false, false, true, false, false);
		droidList.add(droid);
			
		//Droid 5
		commentList = new ArrayList<Comment>();
		commentList.add(comment5);
		droid = new Droid(5, 12, 3000, "Prototype B97", description, "5", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, false, false, false, true, true);
		droidList.add(droid);
				
		//Droid 8
		commentList = new ArrayList<Comment>();
		commentList.add(comment5);
		droid = new Droid(8, 1250, 4705.50, "Yvonna-Tech", description, "8", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, true, false, true, true, true);
		droidList.add(droid);
				
		//Droid 9
		commentList = new ArrayList<Comment>();
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
				droid = new Droid(10, 1234, 1899.99, "Mod�le Jolie", description, "10", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, true, true, true, false, false);
		droidList.add(droid);
				
		//Droid 11
		commentList = new ArrayList<Comment>();
		commentList.add(comment1);
		commentList.add(comment2);
		commentList.add(comment5);
		commentList.add(comment6);
		description = "Poor PSD skills. ";
		droid = new Droid(11, 76, 2999.99, "Michelle-101", description, "11", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, false, true, true, false, false);
		droidList.add(droid);
		
		//Droid 13
		commentList = new ArrayList<Comment>();
		commentList.add(comment2);
		description = "Description a venir.";
		droid = new Droid(13, 100, 4999.99, "Bell Robots - F", description, "13", commentList, null,
				//combat, cook, garden, laundry, clean , dishes
				false, true, false, true, false, true);
		droidList.add(droid);
				
		//Droid 14
		commentList = new ArrayList<Comment>();
		commentList.add(comment4);
		description = "Description a venir.";
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
