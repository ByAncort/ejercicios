package javaapplication18;

import java.util.Scanner;

public class JavaApplication18 {
    public static void main(String[] args) {
        // TODO code applation logic here
             Scanner myObj = new Scanner(System.in);
               System.out.println("monto a cancelar");
     int compra= myObj.nextInt();
     if(compra <19){
         System.out.println("seleccione una opcion");
         System.out.println("1 - productos de mascotas");
         System.out.println("2 - productos de ropa ");
     int opc= myObj.nextInt();
     switch(opc){
         case  1:
             System.out.println("No se pueden realizar el envio ");
             break;
             case  2:
             System.out.println("los gastos de envio son 9 dolares");
             break;
             default:
             System.out.println("opcion invalida");
     }
     }else if (compra>=19 &compra<=40){
             System.out.println("los gastos de envio son 9 dolares");
     
     }else if (compra>40){
             System.out.println("los gastos de envio son gratis");
     
     }else if (compra>200){
             System.out.println("codigo de descuento: CODIGODESC3E");
     
     }
     
     
    }
    
}
