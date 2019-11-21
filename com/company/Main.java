package com.company;

public class Main {

    public static  void main(String[] args) {

        Array arr = new Array(new int[]{1,2,3,4,5,6,7,8,9,10});

        System.out.println("Avarage = "+ arr.Avarage());
        System.out.println("Minium = "+ arr.Min());
        System.out.println("Maximum = "+ arr.Max());
        System.out.println("Even array:");
        arr.EvArray();
        System.out.println("Odd array:");
        arr.OddArray();
        System.out.println("Index of even numbers "+ arr.EvInd());
        System.out.println("Show array:");
        arr.ShowArray();






    }

}