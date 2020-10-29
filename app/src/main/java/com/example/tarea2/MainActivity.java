package com.cbellmont;

import java.util.ArrayList;

public class Main {

    public static final ArrayList<String> list = new ArrayList<>();

    public static void main(String[] args) {

        try{

            Cliente cliente = new Cliente();
            Camarero camarero = new Camarero();
            Camarero.start();
            Cliente.join();
            camarero.start();
            cliente.join();
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}