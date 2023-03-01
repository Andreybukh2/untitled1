package org.example.Test;

public class Animal {
    protected String Type;
    protected String Name;
    protected byte weigth;
    protected Animal(String Type, String name){
        this.Type = "Кошка";
        this.Name = "Вася";
    }
    protected void voice(){
        System.out.println("Животное говорит");
    }
    public void setWeigth (byte weigth){
        this.weigth = weigth;
    }
}