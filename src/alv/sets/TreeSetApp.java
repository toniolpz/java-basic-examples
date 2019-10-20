package alv.sets;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetApp {
    public static void main(String[] args) {
        treeSetArticulos();
        treeSetStringExample();
    }

    private static void treeSetStringExample() {
        TreeSet<String> ordenaPersonas = new TreeSet<String>();
        ordenaPersonas.add("Sandra");
        ordenaPersonas.add("Amanda");
        ordenaPersonas.add("Diana");

        System.out.printf("%s ", ordenaPersonas.descendingSet());
        System.out.println();
    }

    private static void treeSetArticulos() {
        Set<Articulo> ordenaArticulos = new TreeSet<Articulo>();
        ordenaArticulos.add(new Articulo(2, "Segundo"));
        ordenaArticulos.add(new Articulo(4, "Cuarto"));
        ordenaArticulos.add(new Articulo(5, "Quinto"));
        ordenaArticulos.add(new Articulo(1, "Primero"));

        for (Articulo articulo : ordenaArticulos) {
            System.out.println(articulo.getDescripcion());
        }
        System.out.println();
    }
}

class Articulo implements Comparable<Articulo> {
    public Articulo(int num, String desc) {
        numero_articulo = num;
        descripcion = desc;
    }

    @Override
    public int compareTo(Articulo o) {
        return numero_articulo - o.numero_articulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    private int numero_articulo;
    private String descripcion;
}