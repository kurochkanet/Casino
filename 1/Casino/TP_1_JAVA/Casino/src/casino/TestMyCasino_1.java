package casino;

public class TestMyCasino_1 {

    public static void main(String[] args) {

        System.out.println("---------CLASS MyCasino --------------------");
        System.out.println();
        MyCasino_1 Casino1 = new MyCasino_1(); //objet nouveau sans argument
        System.out.println("Casino1(sans argument): " + Casino1);
        MyCasino_1 Casino2 = new MyCasino_1("Casino2 ", 5); //objet nouveau avec deux argument
        System.out.println("Casino2(avec 2 argument): " + Casino2);
        System.out.println();

        System.out.println("---------set et get --------------------");
        Casino1.setNomCasino("Casino 1 Set");
        Casino1.setMaxJoueurs(8); //SET et GET
        System.out.println("Nom - `" + Casino1.getNomCasino() + "` ou peut etre present " + Casino1.getMaxJoueurs() + " joueurs maximum.");
        System.out.println();

        System.out.println("---------ajouter joueur --------------------");
        Joueur_1 joueur0 = new Joueur_1("Premiere", 100);
        Casino2.ajouterJoueur(joueur0); //AJOUTER Joueur
        Joueur_1 joueur1 = new Joueur_1("Deuxieme", 200);
        Casino2.ajouterJoueur(joueur1);
        Joueur_1 joueur2 = new Joueur_1("Troisieme", 300);
        Casino2.ajouterJoueur(joueur2);
        Casino2.afficher();
        System.out.println();

        System.out.println("---------copie objet --------------------");
        MyCasino_1 CasinoCopy = new MyCasino_1(Casino2);
        System.out.println("Copie Casino1 en CasinoCopy: " + CasinoCopy);
        System.out.println();

        System.out.println("--------- constructeur pour nouveau jeu -----");
        Jeu_1 jue = new Jeu_1("Pile ou Face");
        Casino1.MyCasinoJeu_1(jue);
        Casino2.MyCasinoJeu_1(jue);
        System.out.println(Casino2);
        System.out.println();

        System.out.println("---------enlever joueur --------------------");
        Casino2.enleverJoueur(joueur0); //ENLEVER Joueur
        System.out.println(Casino2);
        System.out.println();

        System.out.println("---------CLASS Joueur --------------------");
        System.out.println();
        System.out.println("---------equals joueur --------------------");
        Joueur_1 a = new Joueur_1("Astana",77);
        Joueur_1 b = new Joueur_1("Budapesht",65);
        Joueur_1 c = new Joueur_1("Budapesht",65);
        System.out.println(a.equals(b));
        System.out.println(b.equals(c));
        
        System.out.println("---------joindreCasino--------------------");
        MyCasino_1 CasinoforJoindre = new MyCasino_1("Casino Ajouter joueur", 7);
        Joueur_1 joueur51 = new Joueur_1("joueur51", 51);
        joueur51.joindreCasino(CasinoforJoindre);
        Joueur_1 joueur40 = new Joueur_1("joueur40", 40); //le joueur a peu d`argent. Le programme devrait afficher une erreur
        joueur40.joindreCasino(CasinoforJoindre);
        Joueur_1 joueur70 = new Joueur_1("joueur70", 70);
        joueur70.joindreCasino(CasinoforJoindre);
        Joueur_1 joueur80 = new Joueur_1("joueur80", 80);
        joueur80.joindreCasino(CasinoforJoindre);
        Joueur_1 joueur90 = new Joueur_1("joueur90", 90);
        joueur90.joindreCasino(CasinoforJoindre);
        Joueur_1 joueur100 = new Joueur_1("joueur100", 100);
        joueur100.joindreCasino(CasinoforJoindre);
        Joueur_1 joueur200 = new Joueur_1("joueur200", 200);
        joueur200.joindreCasino(CasinoforJoindre);
        System.out.println();

        System.out.println("---------(f) quitterCasino--------------------");
        joueur80.quitterCasino(CasinoforJoindre, "joueur80"); //joueur exist,Le programme devrait supprimer cet joueur et afficher un message.
        joueur80.quitterCasino(CasinoforJoindre, "joueur80"); //joueur n`existe pas maintenant. Le programme devrait afficher un message.
        System.out.println(CasinoforJoindre);
        System.out.println();

        System.out.println("-------(f) MyCasino(jouer)----------------------");
        CasinoforJoindre.jouer(joueur51, 2);
        CasinoforJoindre.jouer(joueur70, 5);
        System.out.println(CasinoforJoindre);
        System.out.println();

        System.out.println("-------(f) Joueur(jouerMise)----------------------");
        joueur90.jouerMiseL(20);
        joueur100.jouerMiseL(1);
        joueur200.jouerMiseL(30);
        joueur90.jouerMiseL(50);
        System.out.println();

        System.out.println("-------Tester----------------------");
        System.out.println();
        MyCasino_1 CasinoforTester = new MyCasino_1("Casino Tester", 4);
        Joueur_1 jt0 = new Joueur_1("Tbilisi40", 40);
        jt0.joindreCasino(CasinoforTester);            //le joueur joindre du Casino
        Joueur_1 jt1 = new Joueur_1("Paris55", 55);
        jt1.joindreCasino(CasinoforTester);
        Joueur_1 jt2 = new Joueur_1("Toronto60", 60);
        jt2.joindreCasino(CasinoforTester);
        Joueur_1 jt3 = new Joueur_1("NewYork51", 51);
        jt3.joindreCasino(CasinoforTester);
        jt3.joindreCasino(CasinoforTester);            //le joueur deja existe
        Joueur_1 jt4 = new Joueur_1("TelAviv80", 80);
        jt4.joindreCasino(CasinoforTester);
        System.out.println(CasinoforTester);
        System.out.println();
        
        jt1.jouerMiseL(5);                               //le joueur joue au Casino
        jt1.jouerMiseL(10);
        jt1.jouerMiseL(10);
        System.out.println();
        
        jt1.quitterCasino(CasinoforTester, "Paris55");  //le joueur quitter Casino
        jt1.quitterCasino(CasinoforTester, "Paris55");
        System.out.println(CasinoforTester);
        System.out.println();
        jt1.jouerMiseL(10);  // le joueur nèst pas presente
    }
}
