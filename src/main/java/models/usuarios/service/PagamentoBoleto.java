package models.usuarios.service;

public class PagamentoBoleto implements FormasDePagamento{
    @Override
    public boolean pagar(double valor) {

        boolean aprovado = false;

        if (valor > 0.0) {
            System.out.println("Pagamento Aprovado!");
            aprovado = true;
        }
        return aprovado;
    }
}
