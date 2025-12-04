package FactoryMethode;

public class Client {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("bonjour le monde");

        FabriqueProduit fabriqueProduit=new FabriqueProduit();
        Produit produit=null;
        // affiche un produit de type A
        produit=fabriqueProduit.createProduit(fabriqueProduit.typeA);
        produit.methodeproduit();
        // affiche un produit de type B
        produit=fabriqueProduit.createProduit(fabriqueProduit.typeB);
        produit.methodeproduit();
        // affiche un produit de type C
        produit=fabriqueProduit.createProduit(fabriqueProduit.typeC);
        produit.methodeproduit();
//        // produit inexistant
//        String d="D";
//        produit=fabriqueProduit.createProduit(d);
//        produit.methodeproduit();
    }
}
