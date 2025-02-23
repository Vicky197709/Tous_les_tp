 package Tous_les_tp.animaux;

class MainClass {

    public static void main(String[] args) {
        Chat monChat= new Chat(5, "marron");
        System.out.println("création d'un chat:)");
        System.out.println("le chat pèse "+ monChat.getPoids()+" et est de couleur "+monChat.getCouleur());

        monChat.setCouleur("grise");
        System.out.println("le chat pèse "+ monChat.getPoids()+" et est de couleur "+monChat.getCouleur());

        monChat.manger();
        monChat.boire();
        monChat.deplacement();
        monChat.crier();
    }

    
}