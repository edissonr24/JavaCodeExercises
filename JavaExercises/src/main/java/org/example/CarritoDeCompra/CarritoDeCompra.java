package org.example.CarritoDeCompra;

import java.util.Collection;

public class CarritoDeCompra {

    private Collection<Integer> precios;

    public CarritoDeCompra(Collection<Integer> precios) {
        this.precios = precios;
    }

    public int CalcularPrecioTotal() {
        int precioTotal = 0;

        for (Integer precio: precios) {
            precioTotal += precio;
        }
        return precioTotal;
    }

    // Lambda y Stream
    public int contarNumeroProductos() {
        return precios.size();
    }

    public int CalcularPrecioTotalLambda() {
        int precioTotal = this.precios.stream().mapToInt(precio -> precio.intValue()).sum();
        return precioTotal;
    }

    public int CalcularPrecioTotalLambdaRef() {
        int precioTotal = this.precios.stream().mapToInt(Integer::intValue).sum();
        return precioTotal;
    }

    // Filter
    public long calcularDescuentoTotal(int cantidadConDescuento) {
        long descuentoTotal = 0;

        for (Integer precio: precios) {
            if (precio >= cantidadConDescuento) {
                descuentoTotal += (cantidadConDescuento*5)/100;
            }
        }
        return descuentoTotal;
    }

    public long calcularDescuentoTotalLambda(int cantidadConDescuento) {
        long descuentoTotal = 0;

        long numeroDescuentos = this.precios.stream()
                                            .filter(precio -> precio.intValue() >= cantidadConDescuento)
                                            .count();
        descuentoTotal = numeroDescuentos*(cantidadConDescuento*5/100);
        return descuentoTotal;
    }

    // anyMatch
    public boolean detectarError() {
        boolean negativeFind = false;

        for (Integer precio:precios) {
            if (precio < 0) {
                negativeFind = true;
            }
        }
        return negativeFind;
    }

    public boolean detectarErrorAnyMatch() {
        boolean negativeFind = false;

        negativeFind = this.precios.stream()
                                   .anyMatch(precio -> precio.intValue() < 0);
        return negativeFind;
    }

    // findAny() e isPresent()
    public boolean detectarErrorFindAny() {
        return this.precios.stream()
                           .filter(precio -> precio.intValue() < 0)
                           .findAny()
                           .isPresent();
    }

    public boolean detectarErrorFindFirst() {
        return this.precios.stream()
                .filter(precio -> precio.intValue() < 0)
                .findFirst()
                .isPresent();
    }

    // parallelStreams
    public boolean detectarErrorAnyMatchParallel() {
        return this.precios.parallelStream().anyMatch(precio -> precio.intValue() < 0);
    }

    public boolean detectarErrorFindAnyParallel() {
        return this.precios.parallelStream().filter(precio -> precio.intValue() < 0)
                                            .findAny()
                                            .isPresent();
    }

    public boolean detectarErrorFindFirstParallel() {
        return this.precios.parallelStream().filter(precio -> precio.intValue() < 0)
                                            .findFirst()
                                            .isPresent();
    }


}
