package br.com.imc;

public class CalculadoraIMC {

	public CalculadoraIMC() {
		// TODO Auto-generated constructor stub
	}
	
	public double calcularIMC(double peso, double altura) {
		return peso / Math.pow(altura, 2);
	}
	
	public String informarDiagnostico(double imc) {
		
		if (imc < 16.9) return " está com anorexia. Procure um médico.";
		else if (imc < 18.5) return " está abaixo do peso ideal.";
		else if (imc < 25) return " está no peso ideal.";
		else if (imc < 30) return " está acima do peso.";
		else if (imc < 35) return " está com grau de obesidade I.";
		else if (imc < 40) return " está com grau de obesidade II.";
		else return " está com obesidade mórbida. Procure um médico.";
		
	}

}
