package Tous_les_tp.animaux;
public class Lion extends Animal {

    public Lion(int poids,String couleur){
        this.poids=poids;
        this.couleur=couleur;
    }

    public void deplacement(){
        System.out.println("le lion bondi ");
    }

    public void crier(){
        System.out.println("le lion rugi: grrrrrr ");
    }
}