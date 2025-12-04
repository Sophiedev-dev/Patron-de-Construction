package Singleton;

public class TestSingleton {

    public static void main(String[] args) {
        int som=Singleton.getInstance().Somme(2, 5); // Note: 'x:2, y:5' sont des indications de l'IDE, pas du code.
        System.out.println("la somme est: "+som);
        //une instance est déjà en cour

        Singleton s1=Singleton.getInstance(8,3); // Note: 'x:8,y:3' sont des indications de l'IDE.
        s1.affiche();

        Singleton s2=Singleton.getInstance(16,19); // Note: 'x:16,y:19' sont des indications de l'IDE.
        s2.affiche();
    }
}
