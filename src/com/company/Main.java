package com.company;

public class Main {

    public static void main(String[] args) {
	    extendedClass ex1=new extendedClass((byte) 1,2,2.2,"hi");
	    String s= ex1.toString();
        System.out.println(s);
        int hash=ex1.hashCode();
        System.out.println(hash);
        extendedClass ex2= new extendedClass((byte) 1,2,2.2,"hi");
        boolean result1=ex1.equals(ex2);
        System.out.println("ex1 and ex2 "+result1);
        extendedClass ex3=new extendedClass((byte) 4,2,2.2,"bye");
        boolean result2=ex1.equals(ex3);
        System.out.println("ex1 and ex3 "+result2);
    }
}
