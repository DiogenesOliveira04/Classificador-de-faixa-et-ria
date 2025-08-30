/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.faixaetaria;
    import java.util.Scanner;
/**
 *
 * @author Diogenes
 */
public class FaixaEtaria {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        int faixa = 0;

        if (idade >= 0 && idade <= 12) {
            faixa = 1;
        } else if (idade >= 13 && idade <= 17) {
            faixa = 2;
        } else if (idade >= 18 && idade <= 59) {
            faixa = 3;
        } else if (idade >= 60) {
            faixa = 4;
        } else {
            System.out.println("Idade inválida!");
            System.exit(0);
        }

        switch (faixa) {
            case 1:
                System.out.println("Criança (0–12 anos)");
                break;
            case 2:
                System.out.println("Adolescente (13–17 anos)");
                break;
            case 3:
                System.out.println("Adulto (18–59 anos)");
                break;
            case 4:
                System.out.println("Idoso (60+ anos)");
                break;
        }
        sc.close();
    }
}

    

