package com.my;

public class Exemple4 {

    public static void main(String[] args) {

    StringBuilder builder = new StringBuilder();
    builder.append("test").append("hello").append(56);
        System.out.println(builder);

        System.out.println("777-00-00".matches("\\d\\d\\d-\\d\\d-\\d\\d"));
    }

}
