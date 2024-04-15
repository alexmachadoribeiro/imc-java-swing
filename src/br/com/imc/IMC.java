package br.com.imc;

import javax.swing.JOptionPane;

public class IMC {

	public static void main(String[] args) {
		
		Pessoa usuario = new Pessoa();
		CalculadoraIMC calculo = new CalculadoraIMC();
		
		double imc;
		
		Object opcao;
		String opcoes[] = {"Calcular IMC", "Sair"};
		
		do {
			
			opcao = JOptionPane.showInputDialog(null, "Selecione uma opção:", "IMC", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
			
			if (opcao == "Calcular IMC") {
				
				usuario.setNome(JOptionPane.showInputDialog("Informe seu nome:"));
				usuario.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso em kg:").replace(",", ".")));
				usuario.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura em metros:").replace(",", ".")));
				
				imc = calculo.calcularIMC(usuario.getPeso(), usuario.getAltura());
				
				JOptionPane.showMessageDialog(null, "IMC: " + String.format("%.2f", imc) + ".\n" + usuario.getNome() + calculo.informarDiagnostico(imc));
				
			}
			else JOptionPane.showMessageDialog(null, "Programa encerrado.");
			
		} while (opcao != "Sair");

	}

}
