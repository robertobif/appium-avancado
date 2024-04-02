package com.test.steps;

import com.test.screen.*;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.remote.RemoteWebElement;

public class PedidoSteps {
    ScreenHome home= new ScreenHome();
    ScreenRestaurante restaurante = new ScreenRestaurante();
    ScreenPedido pedido = new ScreenPedido();
    ScreenPagamento pagamento = new ScreenPagamento();
    ScreenCarrinho carrinho = new ScreenCarrinho();

    Utils utils = new Utils();

    @Dado("^eu adicione um produto no carrinho")
    public void eu_adicione_um_produto_no_carrinho()  {
        home.selecionEnd.click();
        home.popupPermitir.click();
        home.restaurante.click();
        restaurante.addItem.click();
        restaurante.irAoCarrinho.click();
    }

    @Quando("^eu preencher as informações do pedido$")
    public void eu_preencher_as_informações_do_pedido() {
        carrinho.botaoAcessarPagamento.click();

        String platform = "";
        platform = System.getProperty("plataforma");
        System.out.println("Sua plataforma é: " + platform);

        if(platform.equals("android")) {
            return;
        } else if (platform.equals("ios")) {
            utils.scrollIos(pagamento.dinheiro);
        }
        pagamento.dinheiro.click();
        pagamento.botaoFazerPedido.click();
    }

    @Então("^devo ser redirecionado para a tela de confirmação de pedido$")
    public void devo_ser_redirecionado_para_a_tela_de_confirmação_do_pedido()  {
        pedido.txtPedidoRealizado.isDisplayed();


    }
}
