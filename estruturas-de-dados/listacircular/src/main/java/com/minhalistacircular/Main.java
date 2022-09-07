package com.minhalistacircular;

public class Main {
    
    public static void main(String[] args){
        ListaCircular<String> minhaListaCircular = new ListaCircular<>();
        
        minhaListaCircular.add("No0");
        System.out.println(minhaListaCircular);
    
        minhaListaCircular.remove(0);
        System.out.println(minhaListaCircular);
    
        minhaListaCircular.add("No0");
        System.out.println(minhaListaCircular);
    
        minhaListaCircular.add("No1");
        minhaListaCircular.add("No2");
        minhaListaCircular.add("No3");
        System.out.println(minhaListaCircular);
    
        System.out.println("Get(0) " + minhaListaCircular.get(0));
        System.out.println("Get(1) " + minhaListaCircular.get(1));
        System.out.println("Get(2) " + minhaListaCircular.get(2));
        System.out.println("Get(3) " + minhaListaCircular.get(3));
        System.out.println("Get(4) " + minhaListaCircular.get(4));
        System.out.println("Get(5) " + minhaListaCircular.get(5));
        System.out.println(minhaListaCircular.get(100));
    }
}
