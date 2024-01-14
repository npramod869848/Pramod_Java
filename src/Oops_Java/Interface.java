package Oops_Java;

interface I1 {
    void show();
}

interface I2 {
    void display();
}

public class Interface implements I1, I2 {
    public void show() {
        System.out.println("1");
    }

    public void display() {
        System.out.println("2");
    }

    public static void main(String[] args) {
        Interface t = new Interface();
        t.show();
        t.display();
    }
}
