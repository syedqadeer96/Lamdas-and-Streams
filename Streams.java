package com.company;
import java.util.List;
import java.util.Arrays;
import java.util.function.BinaryOperator;
import  java.util.stream.Stream;
import java.util.function.Function;
public class Streams
{

    public static void main(String[] args) {
        // write your code here
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);
  /* Function<Integer,Integer> f=new Function<Integer,Integer>()
   {
     public Integer apply(Integer i){
         return i*2;
     }
   };

   BinaryOperator<Integer> b=new   BinaryOperator<Integer>(){
       public Integer apply(Integer i,Integer j){
           return i+j;
       }
   };
    Stream s=values.stream();
   Stream s1=s.map(f);
   Integer res=(Integer)s1.reduce(0,b);
   System.out.println(res);*/
//
        Stream s=values.stream();

        Stream s1=s.map(new Function<Integer,Integer>()
        {
            public Integer apply(Integer i){
                return i*2;
            }
        });


        Integer res=(Integer)s1.reduce(0,new   BinaryOperator<Integer>(){
            public Integer apply(Integer i,Integer j){
                return i+j;
            }
        });
        System.out.println(res);
        //
      /*
        Stream<Integer> s=values.stream();
        Stream<Integer> s1=s.map(i->i*2);
        Integer res=(Integer)s1.reduce(0,(c,e)->c+e);
        System.out.println(res); */
        //
        System.out.println(values.stream().map(i->i*2).reduce(0,(c,e)->c+e));


    }

}
