package casino;

public class Joueur_1 {

    private String nomJoueur;
    private int capital;
    private MyCasino_1 casino;

    public Joueur_1(String nomJoueur, int capital) {    //constructeur avec argument
        this.nomJoueur = nomJoueur;
        this.capital = capital;
    }

    public Joueur_1() {      //constructeur sans argument
        this(null, 0);
    }

    public Joueur_1(Joueur_1 autre) {     //constructeur par copie
        this.nomJoueur = autre.nomJoueur;
        this.capital = autre.capital;
    }

    public void joindreCasino(MyCasino_1 casino) {
        boolean joindre = false;
        for (int i = 0; i < casino.getJoueursPresents(); i++) {
            if (this.nomJoueur.equals(casino.getJoueurs()[i].getNomJoueur())) {
                joindre = true;
            }
        }
        if (joindre == false) {
            if (casino.getMaxJoueurs() == casino.getJoueursPresents()) {
                System.out.println(this.nomJoueur + " votre requete est refusé. Casino est plaine!");
            } else {
                if (this.capital < 50) {
                    System.out.println("Joueur " + this.nomJoueur + " n`avez pas d`argent! La mise minimum - 50$");
                } else {
                    casino.ajouterJoueur(this);
                    this.casino = casino;
                }
            }
        } else {
            System.out.println("Joueur " + this.nomJoueur + " deja existe!!");
        }
    }

    public void quitterCasino(MyCasino_1 casino, String nomJ) {
        boolean enlever = false;
        for (int i = 0; i < casino.getJoueurs().length; i++) {
            if (nomJ.equals(casino.getJoueurs()[i].getNomJoueur())) {
                casino.enleverJoueur(this);
                System.out.println("Le joueur " + nomJ + " a quittee le jeu.");
                enlever = true;
                break;
            }
        }
        if (!enlever) {
            System.out.println("Le joueur " + nomJ + " n`est pas dans le jeu en cours.");
        }
    }

    public void jouerMiseL(int mise) {
        boolean enlever = false;
        
      //  if(this.casino != null){
            
        //}
            
        for (int i = 0; i < casino.getJoueurs().length; i++) {
            if (this.nomJoueur.equals(casino.getJoueurs()[i].getNomJoueur())) {
                this.capital += Jeu_1.calculerGainsMise(mise);
                System.out.println("Le joueur " + this.nomJoueur + " a maintenant " + this.capital + " $");
                enlever = true;
                break;
            }
        }
        if (!enlever) {
            System.out.println("Le joueur " + this.nomJoueur + " n`est pas presente!!!!");
        }
    }

    //public void jouerMise(int mise) {
    //    this.capital += Jeu.calculerGainsMise(mise);
    //    System.out.println("Le joueur " + this.nomJoueur + " a maintenant " + this.capital + " $");
    // }
    public boolean equals(Joueur_1 autre) {
        if ((this.nomJoueur == autre.nomJoueur) && (this.capital == autre.capital)) {
            return true;
        }
        return false;
    }

    public String getNomJoueur() {
        return nomJoueur;
    }

    public void setNomJoueur(String nomJoueur) {
        this.nomJoueur = nomJoueur;
    }

    public int getCapital() {
        return capital;
    }

    public void setCapital(int capital) {
        this.capital = capital;
    }

    public String toString() {
        return "Joueur " + nomJoueur + ", capital= " + capital;
    }

}
