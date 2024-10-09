import java.util.Scanner;

public class TestMaDate {
    public static void main(String[] args) {
    
        
        MaDate date1 = new MaDate(2024); 
        MaDate date2 = new MaDate(15, 8, 2023);
        MaDate date3 = new MaDate(1, 1, 2022); 

        //date1.setJour(10);
        //date1.setMois(10);
        //date1.setAnnee(2024);

        //date2.setJour(25);
        //date2.setMois(12);
        //date2.setAnnee(2023);

        //date3.setJour(5);
        //date3.setMois(7);
        //date3.setAnnee(2022);
        
        
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);

        date1.ajouterUnJour();
        date2.ajouterUnJour();
        date3.ajouterUnJour();

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);

        date1.ajouterPlusieursJours(3); 
        date2.ajouterPlusieursJours(2); 
        date3.ajouterPlusieursJours(1); 

        System.out.println("\nAprès ajout de plusieurs jours : ");
        System.out.println(date1);
        System.out.println(date2); 
        System.out.println(date3); 

        date1.ajouterUnMois(); 
        date2.ajouterUnMois(); 
        date3.ajouterUnMois(); 

        System.out.println("\nAprès ajout d'un mois : ");
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);

        
        date1.ajouterUnAn();
        date2.ajouterUnAn(); 
        date3.ajouterUnAn(); 

        System.out.println("\nAprès ajout d'un an : ");
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);


        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Entrez le jour : ");
        int jour = scanner.nextInt();
        System.out.println("Entrez le mois : ");
        int mois = scanner.nextInt();
        System.out.println("Entrez l'année : ");
        int annee = scanner.nextInt();

      
        MaDate date = new MaDate(jour, mois, annee);
        System.out.println("Date initiale : " + date);

        int choix;
        do {
            System.out.println("\nQue voulez-vous faire ?");
            System.out.println("1. Ajouter un jour");
            System.out.println("2. Ajouter plusieurs jours");
            System.out.println("3. Ajouter un mois");
            System.out.println("4. Ajouter une année");
            System.out.println("5. Quitter");

            choix = scanner.nextInt();
            switch (choix) {
                case 1:
                    date.ajouterUnJour();
                    System.out.println("Date après ajout d'un jour : " + date);
                    break;
                case 2:
                    System.out.println("Combien de jours voulez-vous ajouter ? ");
                    int joursAAjouter = scanner.nextInt();
                    date.ajouterPlusieursJours(joursAAjouter);
                    System.out.println("Date après ajout de jours : " + date);
                    break;
                case 3:
                    date.ajouterUnMois();
                    System.out.println("Date après ajout d'un mois : " + date);
                    break;
                case 4:
                    date.ajouterUnAn();
                    System.out.println("Date après ajout d'une année : " + date);
                    break;
                case 5: 
                System.out.println("c'est bon");
                    break;
                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
                    break;
            }
        } while (choix != 5);












    }
}
