package org.example.HW14;

public class Transport {
    private int id;
    private String name;
    public Transport(){}
    public Transport (int id, String name){
    this.id = id;
    this.name = name;
    }
    public void move (){
        System.out.println("Транспорт перемещается в пространстве -");
    }
    public String toString(){
        return String.valueOf(id + " - " + name);
    }
}