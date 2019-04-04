package casino;

public class MyCasino_1 {

    private String nomCasino;
    private Joueur_1[] joueurs;
    private int maxJoueurs;
    private int joueursPresents;
    private Jeu_1 jeu;
    private Joueur_1 joueur;

    public MyCasino_1() { //constructeur sans argument
        this("", 0);
    }

    public void MyCasinoJeu_1(Jeu_1 jeu) {
        this.jeu = jeu;
    }

    public MyCasino_1(String nomCasino, int maxJoueurs) { //constructeur avec argument
        this.nomCasino = nomCasino;
        this.maxJoueurs = maxJoueurs;
        this.joueurs = new Joueur_1[maxJoueurs];
        this.joueursPresents = 0;
    }

    public MyCasino_1(MyCasino_1 autre) {  //constructeur par copie
        this.nomCasino = autre.nomCasino;
        this.maxJoueurs = autre.maxJoueurs;
        this.joueurs = new Joueur_1[maxJoueurs];

        for (int i = 0; i < joueurs.length; i++) {
            this.joueurs[i] = autre.joueurs[i];
        }
    }

    public int getMaxJoueurs() {
        return maxJoueurs;
    }

    public void setMaxJoueurs(int maxJoueurs) {
        this.maxJoueurs = maxJoueurs;
    }

    public String getNomCasino() {
        return nomCasino;
    }

    public void setNomCasino(String nomCasino) {
        this.nomCasino = nomCasino;
    }

    public int getJoueursPresents() {
        return joueursPresents;
    }

    public Joueur_1[] getJoueurs() {
        return joueurs;
    }

    public void ajouterJoueur(Joueur_1 joueur) {
        if (joueursPresents < maxJoueurs) {
            joueurs[joueursPresents] = joueur;
            joueursPresents++;
        }
    }

    public void enleverJoueur(Joueur_1 joueur) {
        Joueur_1[] tmpJoueurs = new Joueur_1[joueurs.length];
        int tmpCounter = 0;
        for (int i = 0; i < joueurs.length; i++) {
            if (joueurs[i] != null && !joueurs[i].equals(joueur)) {
                tmpJoueurs[tmpCounter] = joueurs[i];
                tmpCounter++;
            }
        }
        joueurs = new Joueur_1[tmpCounter];
        tmpCounter = 0;
        for (int i = 0; i < tmpJoueurs.length; i++) {
            if (tmpJoueurs[i] != null) {
                joueurs[tmpCounter] = tmpJoueurs[i];
                tmpCounter++;
            }
        }
        joueursPresents = joueurs.length;
    }

    public void jouer(Joueur_1 joueur, int mise) {
        int gaings;
        gaings = Jeu_1.calculerGains(joueur, mise);
        joueur.setCapital(gaings);
    }

    public void afficher(){
      for (int i = 0; i < joueursPresents; i++) {
            System.out.println(joueurs[i]);
        }
    }
    
    public String toString() {
        String chaine;

        chaine = "Nom casino: " + this.nomCasino + " contient actuellement " + this.joueursPresents + " joueurs sur un maximum de " + this.maxJoueurs;
        if (this.jeu != null) {
            chaine += "\n" + jeu;
        }

        for (int i = 0; i < joueurs.length; i++) {
            if (joueurs[i] != null) {
                chaine += "\n" + joueurs[i];

            }
        }
        return chaine;
    }
    
    public boolean equals(MyCasino_1 autre) {
        if ((this.nomCasino == autre.nomCasino) && (this.maxJoueurs == autre.maxJoueurs)) {
            return true;
        }
        return false;
    }
}
