package com.coding;

import java.util.*;

public class Day3 {

    // union of 2 arrays

    public void unionOfArray(int [] a,int [] b){

        int [] union= new int [a.length+b.length];

        HashMap<Integer, Integer> hm= new HashMap<>();
        for (int i = 0; i <a.length ; i++) {
            hm.put(a[i],i);
        }

        System.out.println(hm);

        for (int i = 0; i <b.length ; i++) {
            if(hm.containsKey(b[i])){

            }
            else
            {
                hm.put(b[i],i);
            }

        }
        System.out.println(hm);
        Set s=hm.keySet();
        System.out.println(s);
    }

    //intersection of 2 arrays

    public void intersection(int [] a,int [] b){
        ArrayList<Integer> list= new ArrayList();

        HashMap<Integer, Integer> hm= new HashMap<>();
        for (int i = 0; i <a.length ; i++) {
            hm.put(a[i],i);
        }
        System.out.println(hm);
        for (int i = 0; i <b.length ; i++) {
            if(hm.containsKey(b[i])){
                list.add(b[i]);

            }

        }

        System.out.println((list));
    }

    // second and third largest

    public  void secondAndThirdLargest(int [] arr){
        int first,second,third;
         first=second=third=Integer.MIN_VALUE;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>first)
                first=arr[i];
        }

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>second && arr[i]<first)
                second=arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>third && arr[i]<first && arr[i]<second)
                third=arr[i];

        }
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
    }

    // anagram


    public boolean anagram(String str1,String str2){
        char [] s1= str1.toCharArray();
        char [] s2= str1.toCharArray();
        if(str1.length()!=str2.length())
            return false;

        Arrays.sort(s1);
        Arrays.sort(s2);

        for (int i = 0; i <s1.length ; i++) {
            if(s1[i]!=s2[i]){
                return false;

            }

        }
        return true;
    }

    // positive and side and negative one side

    public void arrangePositiveNegativeElement(int [] arr){

    }

    // first and last occurance of an element

    public void firstAndLastOccurance(int [] arr,int e){

    }

    // nth fibonacci number

    public void nthFibonacci(){

    }

    // bubble sort

    public void bubbleSort(int [] arr){

    }

    // insertion sort

    public void insertionSort(int [] arr){

    }

    // selection sort
    public void selectionSort(int [] arr){
      for(int i=0;i<arr.length-1;i++){
          int smallest=i;
          for(int j=i+1;j<arr.length;j++){
              if(arr[smallest]>arr[j]) smallest=j;
          }
          swap(arr,smallest,i);
      }
        System.out.println(Arrays.toString(arr));
    }

    public void swap(int []arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    // mergeSort

    public void mergeSort(int [] arr){
        int l=0;
        int r=arr.length-1;
        devideArray(arr,l,r);
        System.out.println(Arrays.toString(arr));
    }
    public  void devideArray(int [] arr, int l,int r){
        if(l>=r) return;
        int mid=l+(r-l)/2;
        devideArray(arr,l,mid);
        devideArray(arr,mid+1,r);
        mergeTwoArray(arr,l,mid,r);
    }

    public  void mergeTwoArray(int []arr,int l,int mid,int r){
        int resultArray []= new int[r-l+1];
        int i=l;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=r){
            if(arr[i]<=arr[j]){
                resultArray[k++]=arr[i++];
            }else{
                resultArray[k++]=arr[j++];
            }
        }

        while(i<=mid){
            resultArray[k++]=arr[i++];
        }
        while(j<=r){
            resultArray[k++]=arr[j++];
        }
        System.out.println("printing mergedArray="+ Arrays.toString(resultArray));


        for(int y=0,z=l;y<resultArray.length; y++,z++){
            arr[z]= resultArray[y];
        }
    }

    // quick sort

    public void quickSort(int[] arr){


    }

    // check prime number
     public boolean checlkPrime(int n){

        return true;
     }

     // check gcd and euclid algorithm.





}
