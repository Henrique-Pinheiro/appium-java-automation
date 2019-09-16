package io.cucumber.skeleton.steps;

import cucumber.api.java.pt.*;
import io.cucumber.skeleton.pages.HamburguerMenu;
import io.cucumber.skeleton.pages.PagamentoPorLinkPage;
import io.cucumber.skeleton.support.ApiController;
import org.junit.Assert;

import java.util.List;

public class PagamentoPorLinkSteps {

    private BaseStepdefs baseSteps = new BaseStepdefs();
    private LoginSteps loginSteps = new LoginSteps();
    private HamburguerMenu hbgMenu = new HamburguerMenu();
    private PagamentoPorLinkPage pagamentoLink = new PagamentoPorLinkPage();
    private ApiController api = new ApiController();

    @Dado("que eu realize login informando o Ec (.*), o usuário, (.*) e a senha (.*)")
    public void euEstiverLogadoNaTelaHomeComOsDadosECUsuárioESenha(String ec, String user, String pass) {
        api.setToken(ec, user, pass);
        api.deleteAllLinks();
        baseSteps.queEuEstouNaTelaDeLogin();
        loginSteps.euRealizarLoginInformandoOEcOuCPFOuEmailEcCpfEmailOUsuárioOpcionalUsuarioEASenhaSenha(ec, user, pass);
        loginSteps.aoPressionarOBotãoEntrarATelaHomeDeveSerExibida();
    }

    @Quando("eu selecionar a opção Pagamento por Link no Menu Lateral")
    public void euSelecionarAOpçãoPagamentoPorLinkNoMenuLateral() {
        hbgMenu.openPagamentoPorLink();
    }

    @Então("a tela de aviso de não eligibilidade deve ser exibida contendo o numero para contato {string}")
    public void aTelaDeAvisoDeNãoEligibilidadeDeveSerExibidaContendoONumeroParaContato(String phoneNumber) {
        Assert.assertEquals(phoneNumber, pagamentoLink.getPhoneNumber());
    }

    @E("o email {string}")
    public void oEmail(String email) {
        Assert.assertEquals(email, pagamentoLink.getEmail());
    }

    @Quando("a tela Pagamento por Link for exibida")
    public void aTelaPagamentoPorLinkForExibida() {
        Assert.assertTrue("A Tela pagamento por Link não foi exibida", pagamentoLink.checkPage());
    }

    @E("a opção criar novo link for exibida na area Novo pagamento")
    public void aOpçãoCriarNovoLinkForExibidaNaAreaNovoPagamento() {
        Assert.assertTrue("A opção criar novo Link não foi exibida", pagamentoLink.checkNovoLink());
    }

    @Então("na area Últimos links ativos a mensagem {string} deve ser exibida")
    public void naAreaÚltimosLinksAtivosAMensagem(String noLinksMsg) {
        Assert.assertEquals(noLinksMsg, pagamentoLink.getNoLinksMsg());
    }

    @Quando("eu clicar na opção Criar novo link")
    public void euClicarNaOpçãoCriarNovoLink() {
        pagamentoLink.clickCriarNovoLink();
    }

    @E("preencher o Nome do produto com {string}")
    public void preencherONomeDoProdutoCom(String nomeProduto) {
        pagamentoLink.fillNomeProduto(nomeProduto);
    }

    @E("o campo valor desejado com os seguintes valores:$")
    public void oCampoValorDesejadoComOsSeguintesValores(List<String> valores) {
        for (int i = 0; i < valores.size(); i++) {
            String valor = valores.get(i);
            pagamentoLink.fillValorProduto(valor);
            pagamentoLink.checkAndSumBtnGerarLink();
        }
    }

    @Então("o botão Gerar link só deve ser habilitado {int} vezes")
    public void oBotãoGerarLinkSóDeveSerHabilitadoVezes(int n) {
        Assert.assertEquals(n, pagamentoLink.getTimesEnable());
    }

    @E("selecionar todos os botões de valores")
    public void selecionarTodosOsBotõesDeValores() {
        pagamentoLink.ClickAllValuesBtn();
    }

    @E("clicar no botão Gerar link")
    public void clicarNoBotãoGerarLink() {
        pagamentoLink.clickGerarLinkBtn();
        pagamentoLink.clickCloseLink();
    }

    @E("acessar os detalhes do link na area de Últimos links ativos")
    public void acessarOsDetalhesDoLinkNaAreaDeÚltimosLinksAtivos() {
        pagamentoLink.openFirstUltimosLinks();
    }

    @Então("o valor do link gerado deve ser de {string}")
    public void oValorDoLinkGeradoDeveSerDe(String valorLink) {
        valorLink = valorLink.replaceAll("\\.\\d\\d", "");
        Assert.assertTrue("O Valor do link exibido: " + pagamentoLink.getLinkValue() + " não confere com o esperado: " + valorLink, pagamentoLink.getLinkValue().contains(valorLink));
    }

    @E("criar o link informando o nome do link (.*) e o valor do link (.*)")
    public void criarOLinkInformandoONomeDoLinkNome_linkEOValorDoLinkValor_link(String nomeLink, String valorLink) {
        pagamentoLink.fillLinkName(nomeLink);
        pagamentoLink.fillLinkValue(valorLink);
        pagamentoLink.clickGerarLinkBtn();
        pagamentoLink.clickCloseLink();
    }

    @Então("o link consultado deve possuir o nome (.*) e o valor (.*) e o link")
    public void oLinkConsultadoDevePossuirONomeNome_linkEOValorValor_link(String nomeLink, String valorLink) {
        Assert.assertEquals(nomeLink, pagamentoLink.getLinkName());
        oValorDoLinkGeradoDeveSerDe(valorLink);
        Assert.assertTrue("O Link não foi exibido", pagamentoLink.checkLink());
    }

    @E("acessar a tela de Todos os links ativos")
    public void acessarATelaDeTodosOsLinksAtivos() {
        pagamentoLink.openTodosOsLinks();
    }

    @E("acessar os detalhes do link")
    public void acessarOsDetalhesDoLink() {
        pagamentoLink.openLink();
    }

    @E("o usuário possua somente um link gerado")
    public void oUsuárioPossuaSomenteUmLinkGerado() {
        api.createLink("Link Generico", 5000);
    }

    @Quando("eu acessar os detalhes do link na area de Últimos links ativos")
    public void euAcessarOsDetalhesDoLinkNaAreaDeÚltimosLinksAtivos() {
        acessarOsDetalhesDoLinkNaAreaDeÚltimosLinksAtivos();
    }

    @E("pressionar o botão de fechar link")
    public void pressionarOBotãoDeFecharLink() {
        pagamentoLink.clickCloseLink();
    }

    @Então("a tela Pagamento por Link deve ser exibida")
    public void aTelaPagamentoPorLinkForDeveSerExibida() {
        aTelaPagamentoPorLinkForExibida();
    }

    @E("pressionar o botão de excluir o link")
    public void pressionarOBotãoDeExcluirOLink() {
        pagamentoLink.clickExcluirLink();
    }

    @E("pressionar o botão confirmar do PopUp exibido")
    public void pressionarOBotãoConfirmarDoPopUpExibido() {
        pagamentoLink.clickConfirmarPopUp();
    }

    @E("eu pressionar o Botão Central de Ajuda")
    public void euPressionarOBotãoCentralDeAjuada() {
        pagamentoLink.clickFaqBtn();
    }

    @Quando("{int} respostas forem exibidas")
    public void respostasForemExibidas(int questions) {
        Assert.assertEquals(questions, pagamentoLink.returnNumberOfQuestions());
    }

    @E("eu selecionar a resposta {int}")
    public void euSelecionarAResposta(int questionNumber) {

        pagamentoLink.openFaqQuestionNumber(questionNumber);
    }

    @E("os detalhes forem exibidos")
    public void osDetalhesForemExibidos() {
    Assert.assertTrue("Os detalhes da resposta não foram exibidos", pagamentoLink.checkQuestionDetail());
    }

    @Então("ao pressionar o botão fechar a tela pagamento por link deve ser exibida")
    public void aoPressionarOBotãoFecharATelaPagamentoPorLinkDeveSerExibida() {
        pagamentoLink.closeFaq();
        aTelaPagamentoPorLinkForExibida();
    }

}
