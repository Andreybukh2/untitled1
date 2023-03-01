package org.example.Dgenerics.MaxMin;

public class ShowValue {
    public ShowValue() {
    }
    public static void main(String[] args) {
        Max max = new Max();
        Min min = new Min();

        Variable<Max> variable1 = new Variable<Max>(max);
        Variable<Min> variable2 = new Variable<Min>(min);

        variable1.getMethodsVariant().methodMaxValue();
        variable2.getMethodsVariant().methodMinValue();
    }
}