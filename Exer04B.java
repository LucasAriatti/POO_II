package exer04b;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Exer04B {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        Map<String, String> ListaContatos = new HashMap<>();
        String nome,
                telefone,
                nomebusca;
        int escolha = 0;

        while (true) {
            if (escolha != 1) {
                System.out.println("");
                System.out.println("===========================");
                System.out.println("Faça sua escolha:\n"
                        + " 0 - sair\n"
                        + " 1 - adicionar contato\n"
                        + " 2 - Buscar contato \n"
                        + " 3 - Mostrar todos os contatos ");

                System.out.print("Sua escolha => ");
                escolha = sc.nextInt();
            }
            

            switch (escolha) {
//-----------------------------------SAIR-----------------------------------------------------                
                case (0):
                    System.exit(0);
                    break;
                //-----------------------------------ADICIONA-----------------------------------------------------                
                case (1):
                    
                    System.out.print("Digite um nome => ");
                    nome = sc2.nextLine();
                    System.out.print("Digite um telefone => ");
                    telefone = sc2.nextLine();
                    
                    if("".equals(nome) || ("".equals(telefone))){
                        throw new Exception("Nome e Telefone obrigatorios");
                    }else{
                    
                    ListaContatos.put(Capitalizar(nome), telefone);
                    System.out.println("O " + Capitalizar(nome) + " foi adicionado com sucesso com o numero => " + telefone + "\n");
                    System.out.println("===========================");
                    escolha = 0;
                    }
                    break;
                //---------------------------------------BUSCA-----------------------------------------------------                
                case (2):
                    //-----------------------------------NOME DA BUSCA-----------------------------------------------------                
                    System.out.print("Digite um nome para buscar => ");
                    nomebusca = sc2.nextLine();

                    if("".equals(nomebusca)) {
                        throw new Exception("Nome obrigatorios");
                    }else{
                    
                    //-----------------------------------LOCALIZOU O NOME-----------------------------------------------------                
                    if (ListaContatos.get(Capitalizar(nomebusca)) != null) {
                        System.out.print("O numero de " + nomebusca + " ë " + ListaContatos.get(Capitalizar(nomebusca)) + "\n");
                        System.out.println("===========================");
                    //-----------------------------------NAO LOCALIZOU O NOME-----------------------------------------------------                
                    } else {
                        System.out.println("===========================");
                        System.out.print(Capitalizar(nomebusca) + " nao encontrado gostaria de adiciona-lo S | N  => ");
                        String escolha2 = sc2.nextLine();
                                //-----------------------------------ACEITOU A ADICAO----------------------------------------
                                   if ("s".equals(escolha2.toLowerCase())) {
                                        System.out.println("_______________________________");
                                        System.out.print("Digite o telefone de " + Capitalizar(nomebusca) + " => ");
                                        telefone = sc2.nextLine();
                                        
                                        if("".equals(telefone)){
                                            throw new Exception("Telefone obrigatorios");
                                        }else{
                                        ListaContatos.put(Capitalizar(nomebusca), telefone);
                                        System.out.println("O " + Capitalizar(nomebusca) + " foi adicionado com sucesso com o numero => " + telefone + "\n");
                                        System.out.println("===========================");
                                        } 

                                    }else if("n".equals(escolha2.toLowerCase())){
                                        escolha = 0;
                                    }else{
                                        throw new Exception("gostaria de adicionar o contato nao encontyrado? S | N");  
                                    }
                                   
                                   
                        
                        
                        }
                    }    
                    
                    escolha = 0;
                    break;
                //-----------------------------------MOSTRA CONTATOS-----------------------------------------------------                
                case (3):
                    System.out.println("Lista de contatos: \n");

                    if (null == ListaContatos || ListaContatos.isEmpty()) {
                        System.out.println("===========================");
                        System.out.print("Voce ainda nao possui contatos! gostaria de adicionar alguem ? S | N  =>  ");
                        String escolha3 = sc2.nextLine();

                        if ("s".equals(escolha3.toLowerCase())) {
                            escolha = 1;
                            
                        } else if ("n".equals(escolha3.toLowerCase()))  {
                            escolha = 0;
                        }else{
                            throw new Exception("Voce ainda nao possui contatos! gostaria de adicionar alguem ? S | N ");
                        }
                        
                        
                    } else {
                        for (Map.Entry<String, String> entry : ListaContatos.entrySet()) {
                            System.out.println(entry.getKey() + " - " + entry.getValue());
                        }
                    }
                     break;
                default:
                    System.out.println("===========================");
                    System.err.println("Escolha uma das quatro opçoes ");
                    System.out.println("===========================");
                    break;
            }
                



        }

    }

    
    
    public static String Capitalizar(String nome) {
        String saida = nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase();

        return saida;
    }

}
