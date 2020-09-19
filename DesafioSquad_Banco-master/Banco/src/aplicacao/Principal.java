package aplicacao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.Scanner;
import entidades.ContaCorrente;
import entidades.ContaEmpresa;
import entidades.ContaPoupanca;

public class Principal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		int tipoConta, tipoOperacao;
		double depositar, sacar;
		
		//Contas de exemplo
		ContaPoupanca clientePoupanca = new ContaPoupanca(000001, 0.02, 0.03, 10);
		ContaCorrente clienteCorrente = new ContaCorrente(000002, 10);
		ContaEmpresa clienteEmpresa = new ContaEmpresa(000003, 50000);		
		Collection<ContaPoupanca> extrato = new ArrayList();
		
		//Teste do programa
		System.out.println("Informe o tipo de conta: ");
		System.out.printf("(1) - Poupança\n(2) - Corrente\n(3) - Empresa\nDigite a opção desejada: ");
		tipoConta = leia.nextInt();
		System.out.println();
		if(tipoConta == 1) {
			System.out.printf("Informe a operação desejada: \n(1)- Emitir extrato\n(2) - Depositar\n(3) - Sacar\nDigite sua opção: ");
			tipoOperacao = leia.nextInt();
			System.out.println();
			if(tipoOperacao == 1) {
				clientePoupanca.emiteExtrato();
			}
			else if(tipoOperacao == 2) {
				System.out.println("Qual valor você deseja depositar :");
				depositar = leia.nextDouble();
				clientePoupanca.credite(depositar);
			}
			else if(tipoOperacao == 3) {
				clientePoupanca.credite(500);
				System.out.print("Seu saldo é: ");
				clientePoupanca.emiteExtrato();
				System.out.println("Qual valor você deseja sacar :");
				sacar = leia.nextDouble();
				if(clientePoupanca.getSaldo() >= sacar ) {
					clientePoupanca.debite(sacar);
				}
				else {
					System.out.println("Você não tem saldo suficiente para efetuar esse saque");
				}
			}
			System.out.print("Seu saldo é: ");
			clientePoupanca.emiteExtrato();
		}
		leia.close();
	}
}