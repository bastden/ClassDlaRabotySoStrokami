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


//строками: в нем должно быть 10 методов.
//public boolean пуста€Ћи—трока(String toCheck)
//public boolean естьЋи¬—троке÷ифры(String toCheck)
//public boolean соответствуетЋи—трокаЎаблону(String toCheck, String matcher)
//public void удалить¬се—имволы(String toWork, String charToDelete)
//public List<String> создать—писок—трок(String toWork, String delimiter)
//public int сколько—лов¬ѕредложении(String toCheck)
//public String добавить“екущуюƒату(String toCheck)
//public boolean проверитьЌа—оответствие(String toCheck1, String toCheck2)
//public boolean естьЋи¬—трокеѕовторени€(String toCheck)
//public String перевернуть—троку(String toCheck)