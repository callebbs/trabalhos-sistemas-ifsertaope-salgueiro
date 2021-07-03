
package exemplo.interfaces;

import impressao.impressoras.ImpressoraEpson;
import pagamento.operadoras.Cielo;
import caixa.Checkout;
import caixa.Compra;
import impressao.Impressora;
import impressao.impressoras.ImpressoraHP;
import pagamento.Cartao;
import pagamento.Operadora;
import pagamento.operadoras.Redecard;


public class ExemploInterfaces {


    public static void main(String[] args) {
        Operadora operadora = new Redecard();
        Impressora impressora = new ImpressoraHP();
        
        Cartao cartao = new Cartao();
        cartao.setNomeTitular("João M Couves");
        cartao.setNumeroCartao("456");
        
        Compra compra = new Compra();
        compra.setNomeCliente("João Mendonça Couves");
        compra.setProduto("Sabonete");
        compra.setValorTotal(500);
        
        Checkout checkout = new Checkout(operadora, impressora);
        checkout.fecharCompra(compra, cartao);
    }
    
}
