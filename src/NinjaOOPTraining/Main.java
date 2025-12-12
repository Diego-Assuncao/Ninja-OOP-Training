package NinjaOOPTraining;

public class Main {
    public static void main(String[] args) {
        NinjaAvancado Sasuke = new NinjaAvancado("Sasuke Uchiha", 18, "Sharingan", "Saltar");
        Sasuke.mostrarInformacoes();
        Sasuke.executarHabilidade();
        System.out.println();

        NinjaBasico Naruto = new NinjaBasico("Naruto Uzumaki", 17, "Manipulação de Chakra");
        Naruto.mostrarInformacoes();
        Naruto.executarHabilidade();

    }
}
