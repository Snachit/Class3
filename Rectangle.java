public class Rectangle {
    public int longeur;
    public int largeur;

    public Rectangle(int longeur, int largeur) {
        this.longeur = longeur;
        this.largeur = largeur;
    }

    public void AfficherInfo() {
        System.out.println("longueur = " + longeur);
        System.out.println("largeur = " + largeur);
        System.out.println("Le perimetre = " + 2 * (longeur + largeur));
        System.out.println("L'Air = " + (longeur * largeur));
    }

}


