package com.company;

import org.omg.CORBA.WStringSeqHelper;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        //String A = scan.nextLine();
        //int n = scan.nextInt();
        //char x = A.charAt(n-1);
        //System.out.println(x);
        //for (int i=0;i<n;i+=2){
        //    char c = A.charAt(i);
        //    System.out.println(c);
        //}
        ///String s1 = scan.nextLine();
        ///int c = s1.charAt(0);
        ///System.out.println(c);
        ////String s1 = scan.nextLine();
        ////String s2 = scan.nextLine();
        ////String s3 = s1.concat(s2);
        ////System.out.println(s3);
        ////System.out.println(s1+s2);
        ////boolean check = s1.equals(s2);
        ////if(s1.equalsIgnoreCase(s2)){//ไม่สนตัวพิมพ์เล็กพิมพ์ใหญ่
        ////    System.out.printf("same");
        ////}
        ////else {
        ////    System.out.printf("different");
        ////}
        String s1 = scan.nextLine();
        String s2 = scan.nextLine();
        int index = scan.nextInt();
        int x = s1.indexOf(s2,index);
    }
}
