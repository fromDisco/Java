package sealedClasses;

public class SealedClasses {
    public static void main(String[] args) {
        Parent parent = new Parent("Mumins", "mumu");
        Children child = new Children("Mumins", "mima");
        System.out.println(parent);
    }
}
