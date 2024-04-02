package com.test.steps;

import com.test.screen.ScreenHome;
import com.test.screen.ScreenLogin;
import com.test.screen.Utils;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class LoginSteps {

    ScreenLogin login = new ScreenLogin();
    ScreenHome home = new ScreenHome();
    Utils utils = new Utils();

    @Dado("^que estou na página de login$")
    public void que_estou_na_página_de_login() throws InterruptedException {
        login.botaoLogin.isDisplayed();
    }

    @Quando("^eu insiro meu nome de usuário \"([^\"]*)\" e minha senha \"([^\"]*)\"$")
    public void eu_insiro_meu_nome_de_usuário_e_minha_senha(String arg1, String arg2)  {
        login.campoEmail.sendKeys("teste@teste.com");
        login.campoSenha.sendKeys("123456");
    }

    @Quando("^eu clico no botão \"([^\"]*)\"$")
    public void eu_clico_no_botão(String arg1)  {
        login.botaoLogin.click();
    }

    @Então("^devo ser redirecionado para a página inicial$")
    public void devo_ser_redirecionado_para_a_página_inicial(){
        home.selecionEnd.isDisplayed();
    }

    @Então("^devo ver a mensagem \"([^\"]*)\"$")
    public void devo_ver_a_mensagem(String arg1){

    }


    @Dado("^que eu realize login com sucesso$")
    public void que_eu_realize_login_com_sucesso() {
        login.botaoLogin.isDisplayed();
        login.campoEmail.sendKeys("teste@teste.com");
        login.campoSenha.sendKeys("123456");
        login.botaoLogin.click();
        home.selecionEnd.isDisplayed();
    }

}