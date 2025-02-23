package Tous_les_tp.animaux;
abstract class Animal {
    protected int poids;
    protected String couleur;

    public int getPoids(){ return poids;}
    public void setPoids(int poids){this.poids= poids;}

    public String getCouleur(){ return couleur;}
    public void setCouleur( String couleur){ this.couleur = couleur;}

    

    public void manger(){
        System.out.println("je mange de la viande ");
    }

    public void boire(){
        System.out.println("je bois de l'eau ");
    }

    public abstract void deplacement();
    public abstract void crier();
}