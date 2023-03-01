package org.example.Generics.Auto;

public class ShowInfo {
    public ShowInfo() {
    }
    public static void main(String[] args) {
        Model BMW3 = new Model();
        Model BMW5 = new Model();

        Cabriolet cabriolet = new Cabriolet();
        Sedan sedan = new Sedan();
        Wagon wagon = new Wagon();

        Auto<Cabriolet> auto1 = new Auto<Cabriolet>(BMW3, cabriolet);
        Auto<Sedan> auto2 = new Auto<Sedan>(BMW3,sedan);
        Auto<Wagon> auto3 = new Auto<Wagon>(BMW3, wagon);
        Auto<Wagon> auto4 = new Auto<Wagon>(BMW5, wagon);

        auto1.getCarVariant().methodCabriolet();
        auto2.getCarVariant().methodSedan();
        auto3.getCarVariant().methodWagon();
    }
}