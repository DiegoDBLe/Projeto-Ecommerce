package models.usuarios.service;

public class PagamentoPix implements FormasDePagamento{
    @Override
    public boolean pagar(double valor) {
        boolean aprovado = false;

        if (valor >= 1_000.0){
            System.out.println("Pagamento Rejeitado!!");
            aprovado = true;
        }

        return aprovado;
    }
}
