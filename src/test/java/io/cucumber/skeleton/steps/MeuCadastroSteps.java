package io.cucumber.skeleton.steps;

import cucumber.api.CucumberOptions;
import cucumber.api.java.pt.E;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Mas;
import cucumber.api.java.pt.Quando;
import gherkin.events.CucumberEvent;
import io.cucumber.skeleton.pages.HamburguerMenu;
import io.cucumber.skeleton.pages.MeuCadastroPage;
import org.junit.Assert;

import java.util.List;
import java.util.Map;

public class MeuCadastroSteps {

    private MeuCadastroPage meuCadastro = new MeuCadastroPage();
    private HamburguerMenu hbgMenu = new HamburguerMenu();

    @E("selecionar a opção Meu Cadastro no Menu Lateral")
    public void selecionarAOpçãoMeuCadastroNoMenuLateral() {
        hbgMenu.openMeuCadastro();
    }

    @Quando("eu selecionar a opção Usuário no menu superior")
    public void euSelecionarAOpçãoUsuárioNoMenuSuperior() {
        meuCadastro.clickBtnUsuario();
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

    @E("a tela Meu cadastro deve ser exibida")
    public void aTelaMeuCadastroDeveSerExibida() {
        aTelaComOsDadosDeUsuárioDeveSerExibida();
    }

    @Quando("eu estiver com a opção {string} selecionada")
    public void euEstiverComAOpçãoEstabelecimentoSelecionada(String option) {
        meuCadastro.clickUpperMenuOption(option);
        Assert.assertTrue("O menu " + option + " não está selecionado", meuCadastro.upperMenuIsSelected(option));
    }

    @E("a secção {string} estiver expandida")
    public void aSecçãoEstiverExpandida(String section) throws InterruptedException {
        meuCadastro.openSection(section);
    }

    @Então("os seguintes dados devem ser exibidos:$")
    public void osSeguintesDadosDevemSerExibidos(List<Map<String, String>> displayedValues) throws InterruptedException {
        for (int i = 0; i < displayedValues.size(); i++) {
            Map<String, String> displayedValue = displayedValues.get(i);
            Assert.assertEquals(displayedValue.get("Numero_ec"), meuCadastro.getEcNumber());
            Assert.assertEquals(displayedValue.get("Status"), meuCadastro.getStatus());
            Assert.assertEquals(displayedValue.get("Bloqueio"), meuCadastro.getBloqueio());
            Assert.assertEquals(displayedValue.get("Dt_abertura"), meuCadastro.getDtAbertura());
            Assert.assertEquals(displayedValue.get("Razao_social"), meuCadastro.getRazaoSocial());
            Assert.assertEquals(displayedValue.get("Cnpj"), meuCadastro.getCnpj());
            Assert.assertEquals(displayedValue.get("Ramo"), meuCadastro.getMcc());
        }
    }


    @Então("o endereço {string} deve ser exibido")
    public void oEndereçoDeveSerExibido(String address) {
        Assert.assertTrue("O endereço exibido não confere com o experado", (meuCadastro.getAddress()).contains(address));
    }

    @E("conter o CEP {string}")
    public void conterOCEP(String cep) {
        Assert.assertTrue("O CEP exibido não confere com o experado", (meuCadastro.getAddress()).contains(cep));
    }

    @Então("os dados  nome do proprietario (.*), CPF (.*), data de nascimento (.*), telefone (.*)")
    public void osDadosNomeDoProprietarioNome_proprietarioCPFCpfDataDeNascimentoDt_nascTelefoneTel(String name, String cpf, String date, String tel1) {
        Assert.assertEquals(name, meuCadastro.getProprietarioName());
        Assert.assertEquals(cpf, meuCadastro.getProprietarioCpf());
        Assert.assertEquals(date, meuCadastro.getProprietarioDate());
        Assert.assertEquals(tel1, meuCadastro.getProprietarioTel1());
    }

    @E("telefone (.*) devem ser exibidos")
    public void telefoneTelDevemSerExibidos(String tel2) throws InterruptedException {
        Assert.assertEquals(tel2, meuCadastro.getProprietarioTel2());
    }

    @Então("os dados nome do contato (.*), telefone (.*), telefone (.*)")
    public void osDadosNomeDoContatoNome_contatoTelefoneTelTelefoneTel(String name, String tel1, String tel2) {
        Assert.assertEquals(name, meuCadastro.getContatoName());
        Assert.assertEquals(tel1, meuCadastro.getContatoTel1());
        Assert.assertEquals(tel2, meuCadastro.getContatoTel2());
    }

    @E("email (.*) devem ser exibidos")
    public void emailEmailDevemSerExibidos(String email) {
        Assert.assertEquals(email, meuCadastro.getContatoEmail());
    }

    @Então("os dados nome (.*), CPF (.*), email (.*)")
    public void osDadosNomeNomeCPFCpfEmailEmail(String name, String cpf, String email) {
        Assert.assertEquals(name, meuCadastro.getUsuarioName());
        Assert.assertEquals(cpf, meuCadastro.getUsuarioCpf());
        Assert.assertEquals(email, meuCadastro.getUsuarioEmail());
    }

    @E("o card do banco exibir os dados, nome do banco (.*), numero do banco (.*), agencia (.*), e numero da conta (.*)")
    public void oCardDoBancoExibirOsDadosNomeDoBancoNomeNumeroDoBancoNumeroAgenciaAgenciaENumeroDaContaNum_conta(String name, String number, String agencia, String conta) {
        Assert.assertEquals(name, meuCadastro.getContaName());
        Assert.assertEquals(number, meuCadastro.getContaNumber());
        Assert.assertEquals(agencia, meuCadastro.getContaAgencia());
        Assert.assertEquals(conta, meuCadastro.getContaConta());
    }

    @Então("ao tocar no card ele deve ser expandido")
    public void aoTocarNoCardEleDeveSerExpandido() {
        meuCadastro.openBancoCard();
    }

    @E("exibir os dados, nome do banco (.*), numero do banco (.*), agencia (.*), e numero da conta (.*)")
    public void exibirOsDadosNomeDoBancoNomeNumeroDoBancoNumeroAgenciaAgenciaENumeroDaContaNum_conta(String name, String number, String agencia, String conta) {
        Assert.assertEquals(name, meuCadastro.getContaName());
        Assert.assertEquals(number, meuCadastro.getContaNumber());
        Assert.assertEquals(agencia, meuCadastro.getContaAgencia());
        Assert.assertEquals(conta, meuCadastro.getContaConta());
    }

    @E("ao pressionar o botão fechar a tela de contas deve ser exibida")
    public void aoPressionarOBotãoFecharATelaDeContasDeveSerExibida() {
        meuCadastro.closeDetalhesConta();
        Assert.assertTrue("A tela não foi exibida com sucesso", meuCadastro.checkMeuCadastroContas());
    }
}
