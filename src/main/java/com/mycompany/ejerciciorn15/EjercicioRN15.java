package com.mycompany.ejerciciorn15;
import java.util.Scanner;
public class EjercicioRN15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el peso de la esfera A: ");
        double PESOA = scanner.nextDouble();
        System.out.print("Ingrese el peso de la esfera B: ");
        double PESOB = scanner.nextDouble();
        System.out.print("Ingrese el peso de la esfera C: ");
        double PESOC = scanner.nextDouble();
        System.out.print("Ingrese el peso de la esfera D: ");
        double PESOD = scanner.nextDouble();

        if (PESOA == PESOB && PESOA == PESOC) {
            if (PESOD > PESOA) {
                System.out.println("LA ESFERA D ES LA DIFERENTE");
            } else {
                System.out.println("LA ESFERA D ES LA DIFERENTE");
            }
        } else if (PESOA == PESOB && PESOA == PESOD) {
            System.out.println("LA ESFERA C ES LA DIFERENTE");
            if (PESOC > PESOA) {
                System.out.println("Y ES DE MAYOR PESO");
            } else {
                System.out.println("Y ES DE MENOR PESO");
            }
        } else if (PESOA == PESOC && PESOA == PESOD) {
            System.out.println("LA ESFERA B ES LA DIFERENTE");
            if (PESOB > PESOD) {
                System.out.println("Y ES DE MAYOR PESO");
            } else {
                System.out.println("Y ES DE MENOR PESO");
            }
        } else {
            System.out.println("LA ESFERA A ES LA DIFERENTE");
            if (PESOA > PESOB) {
                System.out.println("Y ES DE MAYOR PESO");
            } else {
                System.out.println("Y ES DE MENOR PESO");
            }
        }

        scanner.close();
    }
}
