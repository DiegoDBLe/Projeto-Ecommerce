package models.usuarios.service.pagamentos;

import models.usuarios.ClientePessoaJuridica;

public class PagamentoFaturamentoPJ implements FormasDePagamento{

    private ClientePessoaJuridica  pessoaJuridica;
    @Override
    public boolean pagar(double valor) {
        boolean aprovado = false;

        if(this.pessoaJuridica != pessoaJuridica){
            System.out.println("\033[1;31mForma de pagamento somente para CLientes Pessoa Juridica.\033[m");
        }else {
            System.out.println("\033[32mPagamento Aprovado com sucesso!\033[m");
            aprovado = true;
        }
        return aprovado;
    }
}
