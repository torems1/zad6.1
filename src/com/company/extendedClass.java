package com.company;

import java.util.Objects;

public class extendedClass {
    private byte b;
    private int i;
    private double d;
    private String s;
    extendedClass(byte b,int i,double d,String s){
        this.b=b;
        this.i=i;
        this.d=d;
        this.s=s;
    }

    @Override
    public boolean equals(Object anObject) {
        if (this == anObject)
            return true;
        if (anObject == null || getClass() != anObject.getClass())
            return false;
        extendedClass ext = (extendedClass) anObject;
        if (b != ext.b) {
            return false;
        }
        if (i != ext.i) {
            return false;
        }
        if (d != ext.d){
            return false;
        }
        if (s != ext.s) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result=(int)b*s.length()+i*(int)d;
        return result;
    }
    @Override
    public String toString(){
        return "b= "+b+" ,i= "+i+" ,d="+d+" ,s="+s;
    }
}
