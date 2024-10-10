/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package figura;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class Figura {
    int lados;
    Double base, altura,area;
       
    public Figura(int lados,Double base,Double altura){
        this.lados = lados;
        this.base = base;
        this.altura = altura;
    }
    public Double area(){
        if(lados==3){
            area = (base*altura/2);
        } else if(lados==4){
            area = (base*altura);
        }
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Desea: \n1. TRIANGULO\t2. RECTANGULO");
        int opp = sc.nextInt();
        Double tempb,tempa;
        switch(opp){
            case 1:
                System.out.print("Ponga la longitud de la base: ");
                tempb = sc.nextDouble();
                System.out.print("Ponga la altura: ");
                tempa = sc.nextDouble();
                Figura triangulo = new Figura(3, tempb, tempa);
                System.out.print("\nEl area es: "+triangulo.area());
                break;
            case 2:
                System.out.print("Ponga la longitud de la base: ");
                tempb = sc.nextDouble();
                System.out.print("Ponga la altura: ");
                tempa = sc.nextDouble();
                Figura rectangulo = new Figura(4, tempb, tempa);
                System.out.print("\nEl area es: "+rectangulo.area());
                break;
        }
    }
}