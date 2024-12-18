package org.example.StreamApiExercises;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class StreamMainExercises {

    private static List<Customer> getCustomerList() {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer(1L, "Edisson", 1));
        customerList.add(new Customer(2L, "Andres", 2));
        customerList.add(new Customer(3L, "Yesica", 3));
        customerList.add(new Customer(4L, "Felipe", 4));
        customerList.add(new Customer(5L, "Daniela", 3));
        customerList.add(new Customer(6L, "Adrian", 2));
        customerList.add(new Customer(7L, "Esneider", 2));
        customerList.add(new Customer(8L, "Mary", 1));
        customerList.add(new Customer(9L, "Paola", 3));
        customerList.add(new Customer(10L, "Yaneth", 4));

        return customerList;

    }

    public static List<Product> getProductList() {
        List<Product> productList = new ArrayList<>();
        Product p1 = new Product(1L, "Papas", "Mercado", 120.0);
        Product p2 = new Product(2L, "Book", "Books", 120.0);
        Product p3 = new Product(3L, "Yucas", "Mercado", 120.0);
        Product p4 = new Product(4L, "Newspaper", "Books", 110.0);
        Product p5 = new Product(5L, "Paper", "Books", 80.0);
        Product p6 = new Product(6L, "Bottle", "Baby", 110.0);
        Product p7 = new Product(7L, "Cradle", "Baby", 80.0);

        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);
        productList.add(p5);
        productList.add(p6);
        productList.add(p7);

        return productList;

    }


    private static List<Order> getOrderList() {

        List<Customer> customers = getCustomerList();
        List<Product> products = getProductList();

        Set<Product> productSet = new HashSet<>();
        productSet.addAll(products);
        Order o1 = new Order(1l, LocalDate.of(2020, 1, 8), LocalDate.of(2020, 1, 8), "Sent", customers.get(0), productSet);
        Order o2 = new Order(2l, LocalDate.of(2020, 1, 8), LocalDate.of(2020, 1, 8), "Sent", customers.get(0), null);

        List<Order> orderList = new ArrayList<>();
        orderList.add(o1);
        //orderList.add(o2);

        return orderList;

    }

    public static void main(String[] args) {

        System.out.println("Hola Mundo cruel");

        // Exercise 1 - Obtain a list of products belongs to category “Books” with price > 100
        List<Product> productList = getProductList();
        List<Product> productsFromBooks = productList.stream()
                                                     .filter(product -> product.getCategory().equalsIgnoreCase("Books"))
                                                     .filter(product -> product.getPrice() > 100)
                                                     .collect(Collectors.toList());

        productsFromBooks.forEach(product -> System.out.println(product.getName() + " - " + product.getPrice()));

        //Exercise 2 — Obtain a list of order with products belong to category “Baby”
        List<Order> orderList = getOrderList();
        List<Order> orderWithProdcutForBaby = orderList.stream()
                                                       .filter(order -> order.getProducts().stream()
                                                                                           .anyMatch(product -> product.getCategory().equalsIgnoreCase("Baby")))
                                                       .collect(Collectors.toList());

        orderList.forEach(order -> System.out.println("Order " + order.getId()));
        orderWithProdcutForBaby.forEach(order -> System.out.println("Order with Baby " + order.getId()));

        // Exercise 3 — Obtain a list of product with category = “Toys” and then apply 10% discount
        List<Product> productWithDiscount = productList.stream()
                                                       .filter(product -> product.getCategory().equalsIgnoreCase("Toys"))
                                                       //.map(p -> p.setPrice(0.5))
                                                       .collect(Collectors.toList());

    }
}
