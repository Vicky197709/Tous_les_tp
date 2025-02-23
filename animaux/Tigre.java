package Tous_les_tp.animaux;
public class Tigre extends Animal{

    public Tigre(int poids , String couleur){
        this.poids=poids;
        this.couleur=couleur;
    }

    public void deplacement(){
        System.out.println("le tigre se déplace");
    }

    public void crier(){
        System.out.println("le tigre pousse son  cri");
    }

    
}
