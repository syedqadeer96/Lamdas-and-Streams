package com.company;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.List;
public class Main {

    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);
       Consumer<Integer> c = new Consumer<Integer>(){
            @Override
            public void accept(Integer i) {
                System.out.println(i);
            }
        //values.forEach(i-> System.out.println(i));
        };

        values.forEach(c);
    }}
// Consumer<Integer> c=(Integer i)-> System.out.println(i);

// values.forEach(c);
//Functional Interface
    /*    values.forEach(new Consumer<Integer>() {
            public void accept(Integer i) {
                System.out.println(i);
            }
        });
    }
}*/