package io.cucumber.skeleton.steps;

import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Mas;
import cucumber.api.java.pt.Quando;
import io.cucumber.skeleton.pages.HamburguerMenu;
import io.cucumber.skeleton.pages.MeuCadastroPage;
import org.junit.Assert;

public class AlterarSenhaSteps {

    private MeuCadastroPage meuCadastro = new MeuCadastroPage();
    private HamburguerMenu hbgMenu = new HamburguerMenu();

    @E("selecionar a opção Meu Cadastro no Menu Lateral")
    public void selecionarAOpçãoMeuCadastroNoMenuLateral() {
        hbgMenu.openMeuCadastro();
    }

    @Quando("eu selecionar a opção Usuário no menu superior")
    public void euSelecionarAOpçãoUsuárioNoMenuSuperior() {
//Ainda não tem
    }

    @Então("a tela com os dados de usuário for exibida")
    public void aTelaComOsDadosDeUsuárioDeveSerExibida() {
        Assert.assertTrue("A tela não foi exibida", meuCadastro.checkMeuCadastro());
    }

    @Mas("o botão Alterar Senha não")
    public void oBotãoAlterarSenhaNão() throws InterruptedException {
        Assert.assertFalse("O Botão foi exibido", meuCadastro.btnAlterarSenhaIsDisplayed());
    }

    @E("eu pressionar o botão Alterar senha")
    public void aoPressionarOBotãoAlterarSenha() throws InterruptedException {
        meuCadastro.clickBtnAlterarSenha();
    }

    @E("preencher os campos senha atual (.*), os campos nova senha com (.*)")
    public void preencherOsCamposSenhaAtualSenhaOsCamposNovaSenhaComNova_senha(String actualPass, String newPass) {
        meuCadastro.fillPasswords(actualPass, newPass);
    }

    @E("pressionar o botão Salvar")
    public void pressionarOBotãoSalvar() throws InterruptedException {
        meuCadastro.clickBtnSalvar();
    }

    @Então("o PopUp com a mensagem de alteração com sucesso deve ser exibida")
    public void oPopUpComAMensagemDeAlteraçãoComSucessoDeveSerExibida() {
        Assert.assertTrue("A mensagem exibida foi: " + meuCadastro.getPopUpMsgText(), meuCadastro.getPopUpMsgText().contains("sucesso"));
    }

    @Então("o PopUp com a mensagem de alteração sem sucesso deve ser exibida")
    public void oPopUpComAMensagemDeAlteraçãoSemSucessoDeveSerExibida() {
        Assert.assertFalse("A mensagem exibida foi: " + meuCadastro.getPopUpMsgText(), meuCadastro.getPopUpMsgText().contains("sucesso"));
    }
}
