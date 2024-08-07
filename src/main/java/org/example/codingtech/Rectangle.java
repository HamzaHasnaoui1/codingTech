package org.example.codingtech;

public class Rectangle {
    private int a ;
    private int b ;

    Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int surface(){
        return a*b;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(5,5);
        System.out.println(r.surface());
    }
}
