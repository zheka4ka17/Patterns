package com.company;
//шаблоны : пораждающие, поведеньчиские, структурные
//одиночка
public class WiseOwl {
    public static void main(String[] args) {
        Singleton owl= Singleton.gerInstance();
        System.out.println(owl);

    }

}

class Singleton{
    private static Singleton instance= new Singleton();



    private int wisdom =0;

   private Singleton(){
        System.out.println("There was an old owl");
    }

    public static Singleton gerInstance(){
       return instance;

    }

    public void incWisdom(){
       wisdom++;
    }


    public int getWisdom() {
        return wisdom;
    }
}
