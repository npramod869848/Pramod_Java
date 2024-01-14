package Oops_Java;

public class Polymorphism_Methodoverloading {
    
    void show(int a,String b) //int a,int b(No.of Args)  and int a,String b (Seq.of Args)
    {
        System.out.print("1");
    }
    
    void show(int a) // This is a different method with a different parameter
    {
        System.out.print("2");
    }

    public static void main(String[] args) {
        Polymorphism_Methodoverloading t = new Polymorphism_Methodoverloading();
        t.show(12,"pramod"); 
    }
}
