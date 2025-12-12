package NinjaOOPTraining;

public class NinjaBasico implements Ninja{

    String nome;
    int idade;
    String habilidade;

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("=====Informações do Ninja=====");
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
        System.out.println("Habilidade do Ninja: "+habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Meu nome é "+nome+" e a minha habilidade é "+habilidade);
    }
}
