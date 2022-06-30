import java.util.Locale;
import java.util.Scanner;

public class Atletas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, totalHomem, totalMulher;
		char sexo;
		String nome, nomeAlturaMaior;
		double altura, peso, totalPeso, pesoMedio, alturaMaior,alturaMediaMulher, pHomem;
		double alturaMulher;
		
		System.out.print("Qual a quantidade de Atletas? ");
		n = sc.nextInt();
		
		totalPeso =0;
		alturaMaior =0;
		totalHomem = 0;
		totalMulher = 0;
		alturaMulher = 0;
		alturaMediaMulher =0;
		nomeAlturaMaior = "";
		
		for(int i=1; i<=n; i++) {
			System.out.println("Digite os dados do Atleta número: "+i);
			System.out.print("Nome: ");
			nome = sc.next();
			sc.nextLine();
			System.out.print("Sexo (M/F): ");
			sexo = sc.next().charAt(0);
			
			while(sexo !='F' && sexo !='M') {
				System.out.println("Sexo Inválido! Digite o Sexo (M/F):");
				sexo = sc.next().charAt(0);
			}
			
			System.out.print("Altura: ");
			altura = sc.nextDouble();
			while(altura <=0) {
				System.out.print("Altura Inválida! Digite um valor Positivo: ");
				altura = sc.nextDouble();
			}
			
			System.out.print("Peso: ");
			peso = sc.nextDouble();
			while(peso <=0) {
				System.out.print("Peso Inválido! Digite um Valor Positivo: ");
				peso = sc.nextDouble();
			}
			
			totalPeso += peso;
			if(altura > alturaMaior) {
				alturaMaior = altura;
				nomeAlturaMaior = nome;
			}
			if(sexo =='M') {
				totalHomem +=1;
			}else {
				totalMulher +=1;
				alturaMulher += altura;
			}
			
		}
		pesoMedio = totalPeso /n;
		pHomem = ((double) totalHomem / n) * 100.0;
		if(totalMulher > 0) {
			alturaMediaMulher = alturaMulher / totalMulher;
		}
		
		System.out.println("RELATÓRIO");
		System.out.printf("Peso Médio dos Atlhetas: %.2f%n",pesoMedio);
		System.out.println("Atleta mais Alto: " + nomeAlturaMaior);
		System.out.printf("Percentual de Homens: %.2f %%%n",pHomem);
		if(alturaMediaMulher > 0) {
			System.out.printf("Altura Média das Mulheres: %.2f\n",alturaMediaMulher);
		}else {
			System.out.println("Não há mulheres Cadastradas!");
		}
		
		sc.close();

	}

}
