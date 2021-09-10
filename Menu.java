/* <UNIME>
* <BSI>
* <PROGAMA��O ORIENTADA A OBJETO 2>
* <PABLO ROXO>
* <LUIS RICARDO SOUSA BORGES>
*/


package parcial2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;


public class Menu {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		ArrayList<Usuario> usuarios = new ArrayList();
		
		boolean rodando = true;
		while(rodando) {
			System.out.println("[1] Cadastrar usuario");
			System.out.println("[2] Remover por posi��o");
			System.out.println("[3] Remover por nome");
			System.out.println("[4] Listar Participantes");
			System.out.println("[5] Remover usuario");
			System.out.println("[6] Limpar Lista");
			System.out.println("[7] Encerrar");
			System.out.print("Digite a op��o: ");
			String opcao = scanner.nextLine();
			
			switch(opcao) {
			    
			   case "1":{
				   System.out.println("=== CADASTRO DE USUARIO ===");
				   System.out.println("Digite seu nome: ");
				   String nome = scanner.nextLine();
				   Usuario u = new Usuario();
				   u.setNome(nome);
				   
				   usuarios.add(u);
				   break;   
			   }
			   case "2":{
				   System.out.println("=== REMOVER USUARIO NA POSI��O ===");
				   for (int i = 0; i< usuarios.size(); i++) {
					   
					   Usuario uTemp = usuarios.get(i);
					   System.out.println("[" + i + "]" + uTemp.getNome());			   
				   }
				   
				   System.out.println("Digite o valor de referencia: ");
				   int referencia = scanner.nextInt();
				   scanner.nextLine();
				   
				   usuarios.remove(referencia);
				   System.out.println("Usuario removido com sucesso !");
				   
				   break;
			   }
			   case "3":{
				   System.out.println("=== REMOVER USUARIO PELO NOME ===");
				   for (int i = 0; i< usuarios.size(); i++) {
					   
					   Usuario uTemp = usuarios.get(i);
					   System.out.println("[" + i + "]" + uTemp.getNome());			   
				   }
				   
				   System.out.println("Digite o nome: ");
				   String referencia = scanner.nextLine();
				   scanner.nextLine();
				   
				   usuarios.remove(referencia);
				   System.out.println("Usuario removido com sucesso !");
				   
				   break;   
			   }
			   case "4":{
				   System.out.println("=== LISTA DE PARTICIPANTES ===");
				   for (int i = 0; i< usuarios.size(); i++) {
					   Usuario uTemp = usuarios.get(i);
					   System.out.println("Participantes: " + i);
					   System.out.println("\tNome: " + usuarios.get(i).getNome());
				   }
				      
				   break;
			   }
			   case "5":{
				   System.out.println("=== PROCURAR PARTICIPANTE ===");
				   System.out.println("Digite o nome: ");
				   String nome = scanner.nextLine();
				   
				   boolean encontrado = false;
				   for (int i = 0; i< usuarios.size(); i++) {
					   Usuario uTemp = usuarios.get(i);
					   if (nome.equals(uTemp.getNome())) {
						   System.out.println("Usuario encontrado");
						   System.out.println("\tNome: " + uTemp.getNome());
						   encontrado = true;
						   break;
					      }
				   }
				   if (!encontrado);{
					   System.out.println("Usuario n�o encontrado");
				   }
				   break;    
			   }
			   case "6":{
				   usuarios.clear();
				   System.out.println("Lista Limpada !");
				   break;   
			   }
			   case "7":{
				   rodando = false;
				   System.out.println("Progama finalizado !");
				   break;   
			   }
			   case "8":{
				  
				   break;   
			   }
			
			}
			
		}
		
		
		 }
		
	}


