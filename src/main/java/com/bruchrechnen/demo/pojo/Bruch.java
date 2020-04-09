package com.bruchrechnen.demo.pojo;

public class Bruch {

    private int zaehler;
    private  int nenner;


    public static int kgv(int number1, int number2){

        return (number1*number2)/Bruch.ggt(number1, number2);
    }


    public static int ggt(int number1 , int number2){
        number1=Math.abs(number1);
        number2=Math.abs(number2);

        if (number2==0){
            return number1;
        } else {
            if (number1 == 0) {
                return number2;
            }   else {
                if (number1>number2) {
                    return ggt(number1-number2, number2);
                }else{
                    return ggt(number1,number2-number1);
                 }
                }
          }
    }


    public void expand(int exp){
        this.setZaehler(this.getZaehler()*exp);
        this.setNenner(this.getNenner()*exp);

    }

    public void reduce() {
        int ggt =Bruch.ggt(this.zaehler,this.nenner);
        this.setZaehler(this.zaehler/ggt);
        this.setNenner(this.nenner/ggt);
    }

    public void anzeigen(){
        System.out.println(this.zaehler+"/"+this.nenner);
    }

    public Bruch mul(Bruch factor){
        Bruch result = new Bruch(this.zaehler*factor.zaehler,this.nenner*factor.nenner);
        result.reduce();
        return result;
    }

    public Bruch div(Bruch divisor){
        return mul(divisor.exchangeValues());
    }

    public Bruch exchangeValues(){
        Bruch changed = new Bruch(this.nenner,this.zaehler);
        return changed;
    }

    //addiert einen Bruch zu einem anderen
    public Bruch add(Bruch additor){
        Bruch result= new Bruch(this.zaehler,this.nenner);
        int kgv = kgv(result.nenner,additor.nenner);

        result.expand(kgv/result.nenner);
        additor.expand(kgv/additor.nenner);
        result.setZaehler(result.zaehler+additor.zaehler);
        result.reduce();
       return result;
    }



    public Bruch substract(Bruch sub){

       return add(sub.negative());
    }

    public Bruch negative(){
        Bruch neg =new Bruch(-1*this.zaehler, this.nenner);
        return neg;
    }

    public void initialize(){
        int z=this.getZaehler();
        int n=this.getNenner();

        if ((z<0 && n<0)){
            this.setZaehler(Math.abs(this.zaehler));
            this.setNenner(Math.abs(this.nenner));
        } else {
            if (n<0 && z>0){
                this.setZaehler(this.zaehler*(-1));
                this.setNenner(Math.abs(this.nenner));
            }
        }
    }

    @Override
    public String toString() {
        String erg="";

        if (Math.abs(this.zaehler)>Math.abs(this.nenner)){
            return erg+=this.zaehler/this.nenner+" "+Math.abs(this.zaehler % this.nenner)+"/"+Math.abs(this.nenner);

        }else{
            return erg=this.zaehler+"/"+this.nenner;
        }
    }

    public int getZaehler() {
        return zaehler;
    }

    public void setZaehler(int zaehler) {
        this.zaehler = zaehler;
    }

    public int getNenner() {
        return nenner;
    }

    public void setNenner(int nenner) {
        this.nenner = nenner;
    }

    public Bruch() {
        this.zaehler = 0;
        this.nenner = 1;
    }

    public Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
        this.initialize();
    }
}
