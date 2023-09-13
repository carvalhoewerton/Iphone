import java.util.Scanner;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico{
    public static void main(String[] args) {
            Iphone iphone = new Iphone();

            System.out.println("Funcoes do reprodutor: selecionar musica, tocar e pausar");
            iphone.selecionarMusica("Cocteau Twins - Heaven or Las Vegas");
            iphone.tocar();
            iphone.pausar();

            System.out.println("Funcoes do aparelho telefonico:");
            iphone.ligar();
            iphone.atender(); 
            iphone.iniciarCorreioVoz();

            System.out.println("Funcoes do navegador: ");
            iphone.exibirPagina();
            iphone.adicionarNovaAba(); 
            iphone.atualizarPagina();

       

}

        public void selecionarMusica(String musica){
            
            System.out.println("Tocando a musica: " + musica);
        }
        public void tocar(){
            System.out.print("A musica está sendo reproduzida!");


        }
        public void pausar(){
            System.out.println("A musica pausou!");

        }
        public void exibirPagina(){
            Scanner scanner = new Scanner(System.in);
            String url = scanner.nextLine();
            System.out.println("Exibindo a página...\n" + url);



        }
        public void adicionarNovaAba(){
            System.out.println("Nova aba em branco criad!");


        }
        public void atualizarPagina(){
            System.out.println("Página atualizada");

}
        public void ligar(){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o numero");
            String numero = scanner.nextLine();
            System.out.println("Ligando para " + numero);
        }
        public void atender(){
            System.out.println("Pressione o botão verde para antender a ligacao!");
        }
        public void iniciarCorreioVoz(){
            System.out.println("Deseja iniciar um correio de voz?");

        }
}