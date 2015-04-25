public class Teste_strings {
	public static void main (String[] args){
		String s1, s2;
		
		s1 = new String ("Juliana");
		s2 = new String ("Juliana");
		System.out.println((s1+s2).length());
		System.out.println(s1.equals(s2));
		System.out.println(s1 ==s2);

		s1 = "Juliana";
		s2 = "Juliana";
		System.out.println((s1+s2).length());
		System.out.println(s1.equals(s2));
		System.out.println(s1 ==s2);
	} 

	//Conclusao: quando as strings são inicializadas com construtores,
	//nunca referenciam o mesmo objeto. Já se as strings recebem 
	//atribuicoes diretas e iguais, estas estão referenciando o mesmo
	//objeto.

}