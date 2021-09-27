package com.digitalhouse.exercicios.playground.introductionToPoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class IntroductionToPoo {
    static List<Product> availableProducts = new ArrayList<>();
    static ShoppingCart cart = new ShoppingCart();
    static Scanner sc = new Scanner(System.in);




    public static void main(String[] args) {
//        Costumer newCostumer = new Costumer("Igor", "Aguiar");
//        Account newAccount = new Account("1234", 100.0, newCostumer);
//
//        newAccount.deposit(100.0);
//        newAccount.withdraw(100.0);
//        newAccount.withdraw(200.0);
//
//        Employee employee = new Employee("Igor", "Aguiar");
//        employee.calcWage(10, 8.0);
//        System.out.println(employee.getWage());
//        employee.raiseSalary(20.0);
//        System.out.println(employee.getWage());
//        Manager manager = new Manager("Lala", "Sousa");
//        manager.calcWage(10, 8.0);
//        manager.raiseSalary(20.0);
        boolean selectOption = true;

        while (selectOption){
            System.out.println("Select what your want:");
            System.out.print("1. Create bundle \n2. New order \n3. New item\n4. Finish Application\nOption: ");

            String option = sc.next();
            switch (option){
                case "1":
                    int j = 0;
                    Bundle bundle = new Bundle(0.1);
                    for (Product item: availableProducts) {
                        System.out.println(++j +" "+ item.toString());
                    }
                    for (int i = 0; i < 3; i++) {
                        int addItemToBundle;
                        System.out.print("Select one item from the list: ");
                        addItemToBundle = sc.nextInt();
                        bundle.addItem(availableProducts.get(--addItemToBundle));
                    }
                    bundle.apllyDiscount();
                    availableProducts.add(bundle);
                    break;
                case "2":
                    makeOrder();
                    break;
                case "3":
                    String name;
                    String size;
                    Double value;
                    System.out.print("Product name: ");
                    name = sc.next();
                    System.out.print("Product size [LARGE, MEDIUM, SMALL]: ");
                    size = sc.next();
                    System.out.print("Product value: ");
                    value = sc.nextDouble();
                    Product newProduct = new Product(name,ProductSize.valueOf(size.toUpperCase()), value);
                    availableProducts.add(newProduct);
                    break;
                case "4":
                    selectOption = false;
                    break;


            }


        }

    }

    private static void makeOrder() {
        boolean notFinished = true;
        String finished;
        for (Product item: availableProducts) {
            System.out.print(item + "\n");
        }
        System.out.println("Select the request item: ");
        while (notFinished) {
            int addItemToBundle;
            System.out.print("Select one item from the list: ");
            addItemToBundle = sc.nextInt();
            cart.addItem(availableProducts.get(--addItemToBundle));
            System.out.println(cart.getTotalValue());
            System.out.print("Want to finish the order[Y/S]: ");
            finished = sc.next();
            if (finished.equals("Y")){
                notFinished = false;
            }
        }
    }
}
