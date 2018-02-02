package com.companybitmix;

public class Numero {
    int num;
    public Numero (int num) {
        this.num = num;
    }
    public boolean esPar(){
        return num%2 == 0;
    }
    public boolean primo(){

        int cont = 0;
        for(int i = 1 ; i<=num; i++){
            if (num%i==0){
                cont = cont+1;
            }
        }
        return cont == 2 ;
    }
    public int factorial (){
        int result = 1;
        for (int i = 1; i<=num ; i ++){
            result = result * i ;
        }
        return result ;
    }
}
