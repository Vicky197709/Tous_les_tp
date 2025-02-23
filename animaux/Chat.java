package Tous_les_tp.animaux;
public class Chat extends Animal {

    public Chat(int poids, String couleur){
        this.poids=poids;
        this.couleur=couleur;
    }


    public void deplacement(){
        System.out.println("le chat se déplace silencieusement");
    }

    public void crier(){
        System.out.println("le chat miaule: miaouuuu");
    }

    
}
