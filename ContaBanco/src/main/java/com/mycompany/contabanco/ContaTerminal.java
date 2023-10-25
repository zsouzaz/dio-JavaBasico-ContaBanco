/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.contabanco;

import java.util.Scanner;

/**
 *
 * @author Lucas.Almeida
 */
public class ContaTerminal {
    
    public static void main(String[] args) {
        /*Fazer utilização da classe Scanner
        * Exibir as mensagens, receber falores e exibir texto formatado com a conta.
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe o nome do cliente: ");
        String nome = scanner.next();
        System.out.print("Informe a agencia: ");
        int agencia = scanner.nextInt();
        System.out.print("Informe numero da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.print("Informe o saldo: ");
        float saldoConta = scanner.nextFloat();
        
        System.out.println("Ola " + nome + ", obrigado por criar uma conta em nosso banco, sua agencia eh: " + agencia + ", conta " + numeroConta + " e seu saldo R$" + saldoConta + " ja esta disponivel para saque.");
    }
}
