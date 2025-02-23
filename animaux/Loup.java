package Tous_les_tp.animaux;
public class Loup  extends Animal{

    public Loup(int poids,String couleur){
        this.poids=poids;
        this.couleur=couleur;
    }

    public void deplacement(){
        System.out.println("le loup se deplace en meute");
    }

    public void crier(){
        System.out.println("le loup  hurle: aouuuuuuuu");
    }
}