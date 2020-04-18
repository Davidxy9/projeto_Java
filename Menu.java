//Menu responsável por acessar cada lista/pilha da atividade

import java.util.Scanner;

class Menu {
    
    
    
    //Instanciamos a classe Scanner para usa-la nas classes
    static Scanner entrada = new Scanner(System.in);

    //Aqui colocamos as Classes das listas e pilhas que criamos
    static Principal listaSE = new Principal();
    static PrincipalE listaE = new PrincipalE();
    static PrincipalPS pilhaSE = new PrincipalPS();
    static PrincipalPE pilhaE = new PrincipalPE();

    public static void main(String[] args) {
        //iniciamos no main a operação do menu principal  
        Listas();
    }

    
    public static void Listas(){

        int saida = 0;
        System.out.println("Bem-vindo ao programa de listas e pilhas!\n");
        
        do{
            
                        
        	System.out.println("\nSelecione uma lista para começar:\n"
            + "1 - Lista Sequencial\n"
            + "2 - Lista Encadeada\n"
            + "3 - Pilha Sequencial\n"
            + "4 - Pilha Encadeada\n"
            + "Ou digite 0 para Sair do programa\n");
            
        	System.out.println("Opção:");
            String menu_principal; 
            menu_principal = entrada.nextLine(); 
            
            switch(menu_principal){
                case "1": //Lista Sequencial
                    listaSE.Inicializar(entrada);
                    break;
    
                case "2": //Lista Encadeada
                    listaE.Inicializar(entrada);
                    break;
    
                case "3": //Pilha Sequencial
                    pilhaSE.Inicializar(entrada);
                    break;
    
                case "4": //Pilha Encadeada
                    pilhaE.Inicializar(entrada);
                    break;

                case "0": //sair do programa
                    saida = 1;
                    System.out.println("Fechando o programa...");
                    break;
                    
                default: System.out.println("Opção inválida!"); 
            }
            
        } while (saida == 0); 
    }
}