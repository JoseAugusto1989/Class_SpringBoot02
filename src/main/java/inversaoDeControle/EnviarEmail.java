package inversaoDeControle;

public class EnviarEmail {

    public EnviarEmail(String tipo, String endereco, String senha) {

    }

    public static EnviarEmail obterDadosEmail() {
        return new EnviarEmail("stmp", "contato@gmail.com", "senha");
    }

    public void retornar(String msg) {
        System.out.println("Email Enviado!");
    }

}
