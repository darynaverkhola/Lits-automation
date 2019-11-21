package com.company;
import java.util.Arrays;


public class Array {
    public  int[] arr;

    public Array() {}
    public Array(int[] arr) {
        this.arr=arr;
    }
    public static void main(String[] args) {
    }

    public double Avarage() {     //calculate avarage
        int sum = 0;
        double avarage = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        avarage = sum/arr.length;
        return avarage;
    }


    public int Min() {        //min value
        int min=0;
        Arrays.sort(arr);
                Arrays.toString(arr);
        min=arr[0];
        return min;
    }


    public int Max() {              //max value
        int max=0;
        Arrays.sort(arr);
        Arrays.toString(arr);
        max=arr[arr.length-1];
        return max;
    }

   public void EvArray() {                  //create array from even values

        int numbers = 0;
        int idex = 0;
        for(int i=0; i<=arr.length-1; i++) {
            if (arr[i]%2==0){
                numbers++;

            }
        }
      int [] EvArr = new int[numbers];

       for(int i=0; i<=arr.length-1; i++) {
           if (arr[i]%2==0){
               EvArr[idex] = arr[i];
               idex++;
           }
        }
       for(int i=0; i<=EvArr.length-1; i++) {
           System.out.println(EvArr[i]);
       }
        }


    public void OddArray() {              //create array from odd values

        int numbers = 0;
        int idex = 0;
        for(int i=0; i<=arr.length-1; i++) {
            if (arr[i]%2!=0){
                numbers++;

            }
        }
        int [] OddArr = new int[numbers];

        for(int i=0; i<=arr.length-1; i++) {
            if (arr[i]%2!=0){
                OddArr[idex] = arr[i];
                idex++;
            }
        }
        for(int i=0; i<=OddArr.length-1; i++) {
            System.out.println(OddArr[i]);
        }
    }



    public String EvInd(){                  //show index of even values
        String indexOfEven="";

        for(int i=0; i<=arr.length-1; i++) {
            if (arr[i]%2==0){
                indexOfEven+=i+", ";
            }
        }
         return indexOfEven;
    }
    public void ShowArray(){                  //show   array
        for(int i=0; i<=arr.length-1; i++ ){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
    }
        }
