package com.coding;

import java.util.*;

public class Day1 {

    // smallest and largest

    public  void smallestLargest(int [] arr){

        int smallest= Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<smallest)
                smallest=arr[i];
            if(arr[i]>largest)
                largest=arr[i];

        }
        System.out.println("smallest number is: "+smallest+" & largest number is: "+ largest);
    }

    // LinkedHashmap iterate over it

    public void linkedHashMap(){
        LinkedHashMap<Integer, String> linkedHashMap= new LinkedHashMap<>();
        linkedHashMap.put(1,"deepak");
        linkedHashMap.put(2,"shukla");
        linkedHashMap.put(3,"shaikh");
        linkedHashMap.put(4,"puna");

        for(Iterator itr= linkedHashMap.entrySet().iterator(); itr.hasNext();)
            System.out.println(itr.next());

    }

    // reverse a string

        public void reverseString( String str){
            String res="";
            for (int i = 0; i < str.length(); i++)
                res=str.charAt(i)+res;
            System.out.println(res);
        }

    // occurance of character in string

    public void occuranceOfCharacter(String str){
        HashMap<Character, Integer> hm= new HashMap<>();
        for (int i=0;i<str.length();i++){
            if (hm.containsKey(str.charAt(i))){
                int count= hm.get(str.charAt(i));
                //System.out.println(count);
                hm.put(str.charAt(i),++count);
            }
            else
            hm.put(str.charAt(i),1);
        }
        System.out.println(hm);

//        int maxValue= Collections.max(hm.values());
//        System.out.println(maxValue);
//
//        for(Iterator itr=hm.values().iterator(); itr.hasNext();){
//            if(itr.equals(maxValue))
//            System.out.println(itr);
//        }
    }

    // reverse an array
    public void reverseArray(int [] arr){
        int i=0;
        int j= arr.length-1;
        while (i<j){
            int temp;
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
//        for (int k = 0; k <arr.length ; k++) {
//            System.out.println(arr[k]);
//
//        }
        System.out.println(Arrays.toString(arr));
    }

    public  void twoSum1(int [] arr, int  k){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]+arr[j]==k){
                    System.out.println(arr[i]+" ,"+ arr[j] );
                }
            }

        }
    }

    // 2 sum problem by o(n) TC
    public void twoSum2(int [] arr,int k){
        HashSet<Integer> hs= new HashSet<>();
        for (int i = 0; i <arr.length ; i++) {
            if(hs.contains(k-arr[i]))
                System.out.println(arr[i]+" "+(k-arr[i]));
            else
                hs.add(arr[i]);
        }
    }


    //  linear search
    public boolean linearSearch(int[] arr,int k){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==k)
                return true;
        }
        return false;
    }

    public boolean binarySearchAscendingOrder(int [] arr, int k){
        int l=0;
        int r=arr.length-1;
        while (l<r){
            int mid=(l+r)/2;

            if(arr[mid]==k)
                 return true;
            else if(arr[mid]<k)
                l=mid+1;
            else
                r=mid-1;
        }
        return false;

    }

    public boolean binarySearchDescendingOrder(int []arr, int k){
        int l=0;
        int r=arr.length-1;
        while (l<r){
            int mid=(l+r)/2;

            if(arr[mid]==k)
                return true;
            else if(arr[mid]>k)
                l=mid+1;
            else
                r=mid-1;
        }
        return false;
    }

    public void findnumberUnknownOrder(int [] arr,int k){

        if(arr[0]<arr[1]){
            System.out.println(binarySearchAscendingOrder(arr,k));
        }

        else{
            System.out.println(binarySearchDescendingOrder(arr,k));

        }

    }

}
