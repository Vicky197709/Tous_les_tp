package Tous_les_tp.animaux;
public class Chien extends Animal{
    
    public Chien(int poids,String couleur){
        this.poids=poids;
        this.couleur=couleur;
    }

    public void deplacement(){
        System.out.println("le chien court");
    }

    public void crier(){
        System.out.println("le chien aboie: waoufff");
    }
}
