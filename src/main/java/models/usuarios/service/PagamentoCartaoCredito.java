package models.usuarios.service;

public class PagamentoCartaoCredito implements FormasDePagamento{

    @Override
    public boolean pagar(double valor) {
        boolean aprovado = false;
        if(valor >= 2_000.0){
            System.out.println("Pagamento realizado com sucesso!");
            aprovado = true;
        }
        return  aprovado;
    }
}
