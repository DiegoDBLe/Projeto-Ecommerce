package models.usuarios.service.pagamentos;

public class PagamentoPix implements FormasDePagamento{
    @Override
    public boolean pagar(double valor) {
        boolean aprovado = false;

        if (valor >= 1_000.0){
            System.out.println("\033[1;31mPagamentos via PIX maiores ou igual a R$ 1.000,00 devem ser rejeitados\033[m");
            aprovado = false;
        }else {
            System.out.println("\033[32mPagamentos via PIX autorizsado com sucesso!\033[m");
            aprovado = true;
            return aprovado;
        }

        return aprovado;
    }
}
