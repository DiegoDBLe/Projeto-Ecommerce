package models.usuarios.service.pagamentos;

public class PagamentoCartaoCredito implements FormasDePagamento{

    @Override
    public boolean pagar(double valor) {
        boolean aprovado = false;
        if(valor >= 2_000.0){
            System.out.println("\033[1;31mPagamentos via CARTÃO DE CRÉDITO maiores  ou igual a R$ 2.000,00 devem ser rejeitados\033[m");
            aprovado = false;
        }else{
            aprovado = true;
            System.out.println("\033[32mPagamento autorizado com sucesso!\033[m");
            return aprovado;
        }
        return  aprovado;
    }
}
