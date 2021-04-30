package com.company.java;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
    	float B;
	    float H;
	    System.out.println("Digite a base do triângulo:");
	    B = scan.nextFloat();
	    System.out.println("Digite a altura do triangulo:");
	    H = scan.nextFloat();
	     float area = B*H/2;
	     System.out.println("a area do triangulo é: "+ area+"cm²");



    }
}

