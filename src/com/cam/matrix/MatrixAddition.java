package com.cam.matrix;

import java.util.Scanner;

public class MatrixAddition {
    public static void print(int [][]a){
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                System.out.printf("%2d",a[i][j]);
            }
            System.out.println();
        }
    }

    public static void readD(int [][]a){
        Scanner scr = new Scanner(System.in);
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                a[i][j] = scr.nextInt();
            }
        }
    }

    public static void main(String args[]) {
        int a[][] = new int[10][10];
        int b[][] = new int[10][10];
        int c[][] = new int[10][10];
        System.out.println("Enter Data in Matrix a");
        readD(a);

        System.out.println("Enter Data in Matrix b");
        readD(b);

        System.out.println("Elements on Matrix A are");
        print(a);

        System.out.println("Elements on Matrix B are");
        print(b);


        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                c[i][j] = a[i][j] + b[i][j];
            }
            System.out.println();
        }

        System.out.println("Sum of two matrices (A and B)");
        print(c);
    }
    private class TrieNode{
        private TrieNode[] children = null;
        private boolean isLeafNode = false;
        public TrieNode(){
            children = new TrieNode[26];
        }
    }
}
