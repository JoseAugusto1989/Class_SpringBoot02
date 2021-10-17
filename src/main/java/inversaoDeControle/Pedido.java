package inversaoDeControle;

public class Pedido {

    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        pedido.gravar();
    }

    private EnviarEmail enviar = EnviarEmail.obterDadosEmail();

    public void gravar() {
        this.enviar = new EnviarEmail("stmp", "contato@gmail.com", "senha");
        this.enviar.retornar("inversaoDeControle.Pedido Criado!");
    }
}
