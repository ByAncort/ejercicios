package main;


import java.util.Scanner;

public class Main{

public static void main(String[] args){
Scanner in = new Scanner(System.in);
System.out.println("ingrese su salario");
int sueldo = in.nextInt();
System.out.println("ingrese los meses a ahorrar");
int t_ahorro =in.nextInt();
System.out.println("precio del producto");
int P_producto =in.nextInt();

int ahorro =(int)(sueldo*t_ahorro);
if (ahorro<=P_producto){
System.out.println("le alcanza para comprar su producto");
}else{
System.out.println("no  le alcanza para este producto");
}

}
}