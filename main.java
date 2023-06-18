import conicas1.Hiperbole;
import conicas1.Parabola;
import conicas1.elipse;
import conicas1.circunferencia;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op;


        System.out.println("Menu de figuras: ");
        System.out.println("1) Circunferencia...");
        System.out.println("2) Elipse...");
        System.out.println("3) Hiperbole...");
        System.out.println("4) Parabola...");
        System.out.println("Seleccione la figura que desee: ");
        op = entrada.nextInt();

        if(op == 1){


            circunferencia c1 = new circunferencia(10.4F,5.7F,3.6F,5.7F,2.54F,5.2F);
            System.out.println("El radio es: " +c1.getRadio());
            System.out.println("La semi circunferencia es: "+c1.getA_semicircunferencia());
            System.out.println("El diametro es: "+c1.getDiametro());
            System.out.println("La longitud es: "+c1.getLongitud());
            System.out.println("El area es: "+c1.getArea());

        } else if (op ==2) {
            elipse e1=new elipse(124F,7.9F,4.5F,12F,4.54F,9.9F);

            System.out.println("La distancia entre los semi ejes son: "+e1.distanciaSemiejes());
            System.out.println("El perimetro de la Elipse es: "+e1.perimetroElipse());
            System.out.println("El area es: "+e1.area(12.4F,10.23F));
            System.out.println("El foco es: "+e1.fococ());

        } else if (op ==3) {

            Hiperbole h1=new Hiperbole(12.4F,10.4F,4.3F,9.9F,2.4F,9.2F,7.4F);
            System.out.println("El centro de la hiperbole esta: "+h1.hallar_C());
            System.out.println("Los vertices de hiperbole son: " ); h1.hallar_vertices();

        } else if (op ==4) {

            Parabola p1 = new Parabola(12.7F,3.78F,12.3F,9.9F);
            System.out.println("El calculo del eje horizontal es: "+p1.calculo_eje_horizontal());
            System.out.println(p1.imprimirDatos());

        } else{
            System.out.println("Opcion incorrecta...");
        }







    }





}
