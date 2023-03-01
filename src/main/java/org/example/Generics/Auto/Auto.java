package org.example.Generics.Auto;

public class Auto<T> {
    private Model model;
    private T carVariant;

    public Auto(Model model, T carVariant) {
        this.model = model;
        this.carVariant = carVariant;
    }

    public Model getBody() {
        return model;
    }

    public void setBody(Model model) {
        this.model = model;
    }

    public T getCarVariant() {
        return carVariant;
    }

    public void setCarVariant(T carVariant) {
        this.carVariant = carVariant;
    }
}