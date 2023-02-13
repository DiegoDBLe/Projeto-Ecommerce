import models.usuarios.Login;
import models.usuarios.service.pagamentos.PagamentoBoleto;
import models.usuarios.service.pagamentos.PagamentoCartaoCredito;
import models.usuarios.service.pagamentos.PagamentoFaturamentoPJ;
import models.usuarios.service.pagamentos.PagamentoPix;

public class Main {

    public static void main(String[] args) {

//        Login.login();

        PagamentoBoleto pagamentoBoleto = new PagamentoBoleto();
        pagamentoBoleto.pagar(1000.0);

        System.out.println();

        PagamentoCartaoCredito pagamentoCartaoCredito = new PagamentoCartaoCredito();
        pagamentoCartaoCredito.pagar(2000.0);

        System.out.println();

        PagamentoPix pagamentoPix = new PagamentoPix();
        pagamentoPix.pagar(2000.0);

        System.out.println();

        PagamentoFaturamentoPJ pagamentoFaturamentoPJ = new PagamentoFaturamentoPJ();
        pagamentoFaturamentoPJ.pagar(2000.0);

    }
}
