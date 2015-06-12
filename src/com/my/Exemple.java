package com.my;

public class Exemple {

    public static void main(String[] args) {

        String test = "abc false";
        System.out.println(test);
//        "abc " + 'd' = "abc d"
//        "abc " +  6  = "abc 6"
//        "abc " + null = "abc null"
//        "abc " + new Person()  = "abc @897989"
//        "abc " + false = "abc false"

        System.out.println(test.substring(0,5));
        String withDelimiter = "acd,bes,csa,daf,efs";
        String[] array = withDelimiter.split(",");
        System.out.println(array.length);


    }

}
