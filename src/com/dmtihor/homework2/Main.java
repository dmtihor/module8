package com.dmtihor.homework2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flower> flowers = new ArrayList<>();
        flowers.add(new Tulip("red"));
        flowers.add(new Aster("blue"));
        flowers.add(new Aster("white"));
        flowers.add(new Chamomile("white"));
        flowers.add(new Rose("red"));
        flowers.add(new Rose("white"));
        flowers.add(new Tulip("yellow"));

        Collections.sort(flowers);

        flowers.stream().forEach(f -> System.out.println(f));
    }
}
