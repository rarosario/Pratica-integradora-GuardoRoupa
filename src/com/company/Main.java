package com.company;

import com.company.model.GuardaRoupa;
import com.company.model.Roupa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        GuardaRoupa guardaRoupa = new GuardaRoupa(0, new HashMap<>());

        for (int i = 0; i < 1; ++i) {
            String marca, roupa;

            List<Roupa> roupas = new ArrayList<>(1);

            roupas.add(new Roupa("adidas", "camisa"));
            roupas.add(new Roupa("nike", "calça"));

//            Scanner tecladoMarca = new Scanner(System.in);
//            System.out.println("Qual a marca da roupa ? ");
//            marca = tecladoMarca.next();
//
//            Scanner tecladoModelo = new Scanner(System.in);
//            System.out.println("Qual a peça da roupa ? ");
//            roupa = tecladoModelo.next();

//            roupas.add(new Roupa(marca,roupa));

            guardaRoupa.guardarRoupas(roupas);
        }
        for (int i = 0; i < 1; ++i) {
            String marca, roupa;

            List<Roupa> roupas = new ArrayList<>(2);

            roupas.add(new Roupa("polo", "camisa"));
            roupas.add(new Roupa("nike", "short"));

            guardaRoupa.guardarRoupas(roupas);

        }

            guardaRoupa.devolverRoupas(1);

            guardaRoupa.mostrarRoupas();


        List<Roupa> devolucao = guardaRoupa.devolverRoupas(1);
        for (Roupa item: devolucao) {
            System.out.println("Retirada de itens do guarda-roupa: "+ "Marca " + item.getMarca()+" Peça " +item.getModelo());
        }
    }
}

