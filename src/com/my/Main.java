package com.my;

import java.util.List;
import java.util.Objects;

public class Main {

        String str = "Hello Vanya 3";


    public boolean isEmptyString(String str){
        if(str.isEmpty()) {
            return true;

        }
    }

    public boolean isThereFigureInSring(String str){
        if(str.contains("\\d")){
            return true;
        }
    }

    public boolean isStringMachesPatern(String str){
        if(str.matches("Hello Vanya 3")){
            return true;
        }
    }
    public void removeAllCharacters(String str){
        removeAllCharacters(str);
    }
    public List<String> createListSring(String str){

    }
    public int howManyWordInString(String str){
        String[] array = str.split(" ");
        System.out.println(array.length);
    }

}


//��������: � ��� ������ ���� 10 �������.
//public boolean ��������������(String toCheck)
//public boolean ������������������(String toCheck)
//public boolean ����������������������������(String toCheck, String matcher)
//public void �����������������(String toWork, String charToDelete)
//public List<String> ������������������(String toWork, String delimiter)
//public int �����������������������(String toCheck)
//public String �������������������(String toCheck)
//public boolean �����������������������(String toCheck1, String toCheck2)
//public boolean �����������������������(String toCheck)
//public String �����������������(String toCheck)