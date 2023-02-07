import models.usuarios.Login;
import models.usuarios.service.PagamentoBoleto;

public class Main {

    public static void main(String[] args) {
//        Login.login();

        PagamentoBoleto pagamentoBoleto = new PagamentoBoleto();
        boolean aprovado = pagamentoBoleto.pagar(1000.0);
        System.out.println(aprovado);

    }
}
