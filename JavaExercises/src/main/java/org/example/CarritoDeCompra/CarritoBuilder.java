package org.example.CarritoDeCompra;

import java.util.ArrayList;

public class CarritoBuilder {

    ArrayList<Integer> precios = new ArrayList<Integer>();


    public CarritoBuilder(int size){

        for(int i = 0; i < size; i++){

            Double random = Math.random()*100+1;
            precios.add(random.intValue());
        }
    }

    public CarritoBuilder(int size, int value){

        for(int i = 0; i < size; i++){

            precios.add(value);
        }
    }

    public CarritoBuilder add(Integer nuevoValor){
        precios.add(nuevoValor);
        return this;
    }

    public CarritoDeCompra build() {
        return new CarritoDeCompra(this.precios);
    }

    public CarritoBuilder addMultiple(int size, int value) {
        for (int i = 0; i < size; i++) {
            precios.add(value);
        }
        return this;
    }

}
