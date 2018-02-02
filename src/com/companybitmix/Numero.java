package com.companybitmix;

public class Numero {
    int num;
    public Numero (int num) {
        this.num = num;
    }
    public boolean esPar(){
        return num%2 == 0;
    }
    public boolean primo(int a){
        num = a;
        int cont = 0;
        for(int i = 1 ; i<=a; i++){
            if (a%i==0){
                cont = cont+1;
            }
        }
        return cont == 2 ;
    }
}
