package models.usuarios.service.pagamentos;

public class PagamentoBoleto implements FormasDePagamento{
    @Override
    public boolean pagar(double valor) {

        boolean aprovado = false;

        if (valor > 0.0) {
            System.out.println("\033[32mPagamento Aprovado!\033[m");
            aprovado = true;
        }
        return aprovado;
    }
}
