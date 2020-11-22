package com.company;

import com.sun.deploy.net.MessageHeader;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    private MessageHeader strings;

    public static void main(String[] args) {
        Main main = new Main(); main.loadStrings("Mamberroi", "Azul", "Verde", "Blanco", "Rosa", "Comedor", "JohnMayer", "Escritorio", "Requisitos", "TheLastOfUS");

        int menuInit = Integer.parseInt(JOptionPane.showInputDialog("\t Welcome" + "\n Select an option"+"\n 1- Organize list by Alphabetic Order"+ "\n 2- Organize list by length"));
        if (menuInit == 1){
            String sortAlphabeticByAnonymousClass =main.sortAlphabeticAnonymousClass();
            String sortAlphabeticByLamda = main.sortAlphabeticLamdaFunction();
            String sortAlphabeticByReference = main.sortAlphabeticReference();
            main.alphabeticAnonymousClass();
            main.Div();
            main.showList(sortAlphabeticByAnonymousClass);
            main.Div();
            main.AlphabeticLamda();
            main.showList(sortAlphabeticByLamda);
            main.Div();
            main.alphabeticReference();
            main.showList(sortAlphabeticByReference);
        }
        else if(menuInit == 2){
            String sortLengthAnonymousClass = main.sortLengthAnonymousClass();
            String sortLengthLamdaFunction= main.sortLengthLamdaFunction();
            String sortLengthReference = main.sortLengthReference();
            main.Div();
            main.lengthAnonymousClass();
            main.showList(sortLengthAnonymousClass);
            main.Div();
            main.lengthLamda();
            main.showList(sortLengthLamdaFunction);
            main.Div();
            main.lengthReference();

        }
        else if(menuInit >= 3){
            JOptionPane.showMessageDialog(null,"We are sorry, this option does not exist. ");
        }
    }

    private void AlphabeticLamda() {
    }


}

    private String sortAlphabeticLamdaFunction() {
    }
    public void alphabeticAnonymousClass() {
    System.out.println("Alphabetic Order: Anonymous Class");
}
public void alphabeticLamda() {
    System.out.println("Alphabetic Order: Lamda expression")
}
public void alphabeticReference() {
    System.out.println("Alphabetic Order: Reference Method");
}
public void Div() {
    System.out.println("----------");
}
public void lengthAnonymousClass() {
    System.out.println("Length: Anonymous Class");
}
public void lengthLamda() {
    System.out.println("Length: Lamda expression");
}
public void lengthReference(){
    System.out.println("Length: Reference method");
}
public void loadStrings(String...strings) { for (String string : strings) this.strings.add(string);}
    public List<String> sortAlphabeticAnonymousClass(){
        List<String> strings = this.strings;
        Collections.sort(strings ,new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return str1.compareToIgnoreCase(str2);
            }
        });
        return strings;
    }

    public List<String> sortAlphabeticLamdaFunction(){
        List<String> strings = this.strings;
        strings.sort((str1,str2) -> str1.compareToIgnoreCase(str2));
        return  strings;
    }

    public List<String> sortAlphabeticReference(){
        List<String> strings = this.strings;
        SortAlphabetic sortAlphabetic = new SortAlphabetic();
        Collections.sort(strings,sortAlphabetic::compare);
        return  strings;
    }

    public List<String> sortLengthAnonymousClass(){
        List<String> strings = this.strings;
        strings.sort( new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                return str1.length() - str2.length();
            }
        });
        return strings;
    }
    public List<String> sortLengthLamdaFunction(){
        List<String> strings = this.strings;
        Collections.sort(strings,(str1,str2) ->  str1.length() - str2.length());
        return  strings;
    }
    public List<String> sortLengthReference(){
        List<String> strings = this.strings;
        SortLength sortLength = new SortLenght();
        strings.sort(sortLength::compare);
        return  strings;
    }
    
    public void showList(List<String> list){
        list.forEach(System.out::println);
    }
}
class SortAlphabetic implements Comparator{
    public static int sort(Object o, Object o1) {
        return o.toString().compareToIgnoreCase(o1.toString());
    }
    @Override
    public int compare(Object o1, Object o2) {
        return o1.toString().compareToIgnoreCase(o2.toString());
    }
}
class SortLenght implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        return o1.toString().length() - o2.toString().length();
    }
}
