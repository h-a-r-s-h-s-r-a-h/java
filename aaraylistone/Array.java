package aaraylistone;
import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    private int[] values;

    Array(int... values){
        this.values = values;
    }
    void aaylist(){
        ArrayList<Integer> my = new ArrayList<Integer>();
        int len = values.length;
        for(int i=0; i<len; i++){
            my.add(values[i]);
        }System.out.println(my);

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many no. do you want to you want to insert in list :- ");
        int no = input.nextInt();
        int[] aa = new int[no];
        for(int i=0;i<no;i++){
            int a = input.nextInt();
            aa[i] = a;
        }
        Array definite = new Array(aa);
        definite.aaylist();
        

    }
    
}
