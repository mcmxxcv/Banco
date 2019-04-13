package Aplicativo;

import entidade.Conta;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Conta c1;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe nome: ");
        String nome = sc.nextLine();
        System.out.print("Informe conta: ");
        int numConta = sc.nextInt();
        System.out.print("Deseja abrir conta com saldo? s ou n: ");
        String op = sc.next();
        if(op.equals("s")){
            System.out.print("Informe valor: R$");
            double valor = sc.nextDouble();
            c1 = new Conta(numConta,nome,valor);
        }else{
            c1 = new Conta(numConta,nome);
        }
        
        System.out.print("Informe valor para depósito: R$");
        double deposito = sc.nextDouble();
        c1.depositar(deposito);
        System.out.println("Seu saldo: R$"+c1.getSaldo());
        
        System.out.print("Informe valor para sacar: R$");
        double saque = sc.nextDouble();
        c1.sacar(saque);
        System.out.println("Seu saldo: R$"+c1.getSaldo());
        
        System.out.println("Conta: "+c1.getNumConta());
        System.out.println("Titular: "+c1.getNomeTitular());
        System.out.printf("Saldo: R$%.2f%n",c1.getSaldo());
    }
}
