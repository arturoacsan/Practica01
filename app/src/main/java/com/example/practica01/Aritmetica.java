package com.example.practica01;

public class Aritmetica {
    private int n1;
    private int n2;
    /*public Aritmetica(){
        n1 = 0;
        n2 = 0;
    }
    public Aritmetica(int n_1, int n_2){
        n1 = n1;
        n2 = n2;
    }
    public Aritmetica(final Aritmetica a){
        n1 = a.n1;
        n2 = a.n2;
    }
    public int suma(){
        return n1+n2;
    }
    public int resta(){
        return n1-n2;
    }
    public int multi(){
        return n1*n2;
    }
    public int div(){
        return n1/n2;
    }*/

    public Aritmetica() {
        this.n1 = 0;
        this.n2 = 0;
    }
    public Aritmetica(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    public Aritmetica(Aritmetica objeto) {
        this.n1 = objeto.n1;
        this.n2 = objeto.n1;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    @Override
    public String toString() {
        return "Aritmetica{" +
                "n1=" + n1 +
                ", n2=" + n2 +
                '}';
    }

    public int suma(){
        return n1+n2;
    }
    public int resta(){
        return n1-n2;
    }
    public int multi(){
        return n1*n2;
    }
    public int div() {
        return n1 / n2;
    }

}
