
import java.util.Scanner;


public class Main {
    // Adicionado modificador de acesso private com tipo static
    private static BancoSecomp banco = new BancoSecomp();
    private static String x = "";

    // Criado metodo Menu
    private static void Menu(){
        System.out.println("1 - Incluir um nome");
        System.out.println("2 - Listar nomes");
        System.out.println("0 - Sair\n");
        Scanner leitor = new Scanner(System.in);
        x = leitor.nextLine();
    }

    //Criado metodo Selecionar
    private static void Selecionar(){
        while(!x.equalsIgnoreCase("0")){
            // Adicionado metodo Menu
            Menu();
            switch(x){
                case "1":
                    String nome;
                    nome = banco.leitura();
                    banco.cadastro(nome);
                    break;

                case "2":
                    banco.imprimirLista();
                    break;

                default:
                    System.out.println("Valor inválido");
                    break;
            }
        }
    }


    public static void main(String[] args) {
        //BancoSecomp banco = new BancoSecomp(); // Instanciação da classe Banco
        //Secomp
        //String x = new String(); // Variável para armazenar leitura da opção no
        // menu.
        
         /*while(true){

           System.out.println("1 - Incluir um nome");
            System.out.println("2 - Listar nomes\n");
            Scanner leitor = new Scanner(System.in);

            x = leitor.nextLine();

            switch(x){
                
                case "1":
                    String nome;
                    nome = banco.leitura();
                    banco.cadastro(nome);
                    break;
                
                case "2":
                    banco.imprimirLista();
                    break;
                
                default:
                    System.out.println("Valor inválido");
                    break;
            }     
        }   */
         //Adiconado metodo selecionar
        Selecionar();
    }

}
