package casino;

public class Jeu_1 {

    private String nomJeu;
    
    public Jeu_1(String nomJeu) {  //constructeur avec argument
        this.nomJeu = nomJeu;
    }

    public String getNomJeu() {  
        return nomJeu;
    }

    public void setNomJeu(String nomJeu) {  
        this.nomJeu = nomJeu;
    }

    public Jeu_1(Jeu_1 autre) {     //constructeur par copie
        this.nomJeu = autre.nomJeu;
    }
    
    
     public boolean equals(Jeu_1 autre) {
        if ((this.nomJeu == autre.nomJeu)) {
            return true;
        }
        return false;
    }
    

    public static int calculerGains(Joueur_1 joueur, int mise) { //calculer nouv
        int random = (int) (2 * Math.random());
        int gain = joueur.getCapital();
        if (random == 0) {
            gain += mise * 2;
        } else {
            gain -= mise;
        }
        return gain;
    }

    public static int calculerGainsMise(int mise) {
        int random = (int) (2 * Math.random());
        int gain = 0;
        if (random == 0) { //gagner
            gain += mise * 2;
        } else {           //perdre
            gain -= mise;
        }
        return gain;
    }

    public String toString() {
        return "Le jeu" + nomJeu
                + "Le pile ou face est un jeu de hasard se jouant "
                + "avec une pièce de monnaie. Le principe du jeu"
                + " est de lancer en l'air une pièce équilibrée"
                + " et de parier sur le côté sorti. "
                + "La pièce tournoyante tombe au sol et s'y stabilise,"
                + " ou bien elle est rattrapee d'une main et posee"
                + " à plat dans l'autre main.";
    }
}
