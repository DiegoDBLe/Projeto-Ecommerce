package models.usuarios.service;

import models.usuarios.ClientePessoaJuridica;

public class PagamentoFaturamentoPJ implements FormasDePagamento{

    private ClientePessoaJuridica  pessoaJuridica;
    @Override
    public boolean pagar(double valor) {
        boolean aprovado = false;

        if(this.pessoaJuridica != pessoaJuridica){
            System.out.println("Forma de pagamento somente para CLientes Pessoa Juridica.");
        }else {
            System.out.println("Pagamento Aprovado com sucesso!");
            aprovado = true;
        }
        return aprovado;
    }
}
