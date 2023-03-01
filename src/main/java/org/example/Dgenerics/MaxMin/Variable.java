package org.example.Dgenerics.MaxMin;

public class Variable<T> {

    private T methodsVariant;

    public T getMethodsVariant() {
        return methodsVariant;
    }

    public void setMethodsVariant(T methodsVariant) {
        this.methodsVariant = methodsVariant;
    }

    public Variable(T methodsVariant) {
        this.methodsVariant = methodsVariant;

    }
}