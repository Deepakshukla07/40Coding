package com.coding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Day2 {

    public void re(int num){
        String str=String.valueOf(num);
        String res="";
        for (int i = 0; i <str.length() ; i++) {
            res=str.charAt(i)+res;
        }
        System.out.println(Integer.parseInt(res));
    }

    // maximum sum of subarray

    public void maximumSumSubarray( int arr[]){

        Map<String,Integer>hashMap= new HashMap();


    }

    //kth smallest   from an array

    public  void kthSmallestElement(int [] arr,int k){

    }

    //  kth largest number from an array

    public void kthLargestElement(int [] arr, int k){

    }

    // sort 0,1,2

    public void sort012(int [] arr){

    }

    // check  valid paranthesis
    public boolean isValidParenthesis(String str){

        Stack <Character> st= new Stack();

        for (int i = 0; i <str.length() ; i++) {
            char c= str.charAt(i);
            if(c=='(' || c=='{' || c=='[' ){
                st.push(c);
            }
            else if(c==')' && st.peek()=='(')
                st.pop();
            else if(c=='}' && st.peek()=='{')
                st.pop();
            else if(c==']' && st.peek()=='[')
                st.pop();
            else
                return false;

        }
        if (!st.isEmpty())
            return false;
       return true;

    }

    // find missing and repeating number from an array.

    public  void missingAndRepeatingElement(int [] arr){

    }

    // check palindrome
    public boolean isPalindrome(String str){

        int l=0;
        int r=str.length()-1;

        while (l<r){
            if(str.charAt(l)!=str.charAt(r))
                return false;
            l++;
            r--;
        }

        return true;
    }

    // majority element form an array
    public   int majority(int [] arr){

        HashMap<Integer, Integer> hm= new HashMap<>();

        for (int i = 0; i < arr.length ; i++) {

            if(hm.containsKey(arr[i])){
                int count = hm.get(arr[i])+1;
                if(count> arr.length/2)
                    return arr[i];
                else
                    hm.put(arr[i],count);

            }else
                hm.put(arr[i],1);
        }
        return -1;
    }

}
