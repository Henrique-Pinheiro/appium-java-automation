package io.cucumber.skeleton.steps;

import cucumber.api.java.hu.Ha;
import cucumber.api.java.pt.*;
import io.cucumber.skeleton.pages.CentralDeAjudaPage;
import io.cucumber.skeleton.pages.ChatPage;
import io.cucumber.skeleton.pages.HamburguerMenu;
import io.cucumber.skeleton.pages.PergutasFrequentesPage;
import org.junit.Assert;

import java.util.List;

public class CentralDeAjudaSteps {

    private HamburguerMenu hbgMenu = new HamburguerMenu();
    private CentralDeAjudaPage centralDeAjuda = new CentralDeAjudaPage();
    private PergutasFrequentesPage perguntasFrequentes = new PergutasFrequentesPage();
    private ChatPage chat = new ChatPage();


    @E("acessar a opção Central de Ajuda no menu lateral")
    public void acessarAOpçãoCentralDeAjudaNoMenuLateral() {
        hbgMenu.openCentralAjuda();
    }

    @Então("a Tela da Central de Ajuda deve ser exibido")
    public void aTelaDaCentralDeAjudaDeveSerExibido() {
        Assert.assertTrue("A Pagina Central de Ajuda não foi exibida com sucesso.", centralDeAjuda.checkCentralDeAjuda());
    }

    @Dado("que eu esteja visualizando a secção {string}")
    public void queEuEstejaVisualizandoASecção(String section) throws InterruptedException {
        Assert.assertTrue("A secção Categorias não foi exibida.", centralDeAjuda.goToSection(section));
    }

    @E("ao selecionar as categorias as sub-categorias deve ser exibidas, com o titulo da pagina sendo a categoria escolhida:$")
    public void aoSelecionarAsCategoriasAsSubCategoriasDeveSerExibidasComOTituloDaPaginaSendoACategoriaEscolhida(List<String> categories) {
        for (int i = 0; i < categories.size(); i++) {
            String category =  categories.get(i);
            TBD
        }
    }

    @Quando("eu selecionar uma sub-categoria")
    public void euSelecionarUmaSubCategoria() {
      //  centralDeAjuda.selectDisplayedSubCategory();
    }

    @E("o titulo da pagina for a sub-categoria selecionada")
    public void oTituloDaPaginaForASubCategoriaSelecionada() {
//        Assert.assertTrue("A pagina exibida não possui o titulo igual ao nome da sub-categoria selecionada", centralDeAjuda.checkSubCategoryTitle(););
    }

    @E("as perguntas forem exibidas")
    public void asPerguntasForemExibidas() {
//        Assert.assertTrue("As perguntas não foram exibidas", centralDeAjuda.questionIsDisplayed());
    }

    @Então("ao Selecionar uma Pergunta, a pagina de resposta deve ser exibida")
    public void aoSelecionarUmaPergunta() {
//        centralDeAjuda.selectQuesiton();
//        Assert.assertTrue("A Pagina de resposta não foi exibida", centralDeAjuda.answerIsDisplayed());
    }

    @Quando("eu selecionar uma pergunta frequente")
    public void euSelecionarUmaPerguntaFrequente() {
//        centralDeAjuda.selectFaq();
    }

    @Então("a pagina exibida deve possuir a resposta e o titulo exibido deve ser {string}")
    public void aPaginaExibidaDevePossuirARespostaEOTituloDevecSerAPerguntaSelecionada(String title) {
//        Assert.assertTrue(title, centralDeAjuda.getFaqTitle());
    }

    @Quando("eu selecionar o canal de atendimento (.*)")
    public void euSelecionarOCanalDeAtendimentoCanal_atendimento(String channel) {
        centralDeAjuda.selectCommunicationChannel(channel);
    }

    @Então("a pagina (.*) deve ser exibida")
    public void aPaginaPaginaDeveSerExibida(String page) {
        Assert.assertTrue("A Pagina não foi exbiida com sucesso", centralDeAjuda.communicationChannelIsDisplayed(page));
    }

    @Quando("eu passar os card para o lado")
    public void euPassarOsCardParaOLado() {
//        centralDeAjuda.swippeCards();
    }

    @Então("multiplos Cards de Contato devem ser exibidos")
    public void multiplosCardsDeContatoDevemSerExibidos() {
//        centralDeAjuda.contactCardIsDisplayed();
    }

    @E("eu abrir uma pergunta")
    public void euAbrirUmaPergunta() throws InterruptedException {
        queEuEstejaVisualizandoASecção("Perguntas Frequentes");
        centralDeAjuda.openFaq();

    }

    @Quando("a resposta for exibida")
    public void aRespostaForExibida() {
        Assert.assertTrue("A pagina de resposta não foi exibida", perguntasFrequentes.faqAnswerIsDisplayed());
    }

    @E("a avalição da resposta for exibida")
    public void aAvaliçãoDaRespostaForExibida() {
        Assert.assertTrue("A avalição da pergunta não foi exbiida", perguntasFrequentes.answerRatingIsDisplayed());
    }

    @Então("ao selecionar a avaliação {string} a mensagem {string} deve ser exibida")
    public void aoSelecionarAAvaliaçãoAMensagemDeveSerExibida(String rating, String msg) {
        perguntasFrequentes.selectAnswerRating(rating);
        Assert.assertEquals(msg, perguntasFrequentes.getDisplayedMsg(msg));
    }

    @E("ao clicar nela o chat deve ser exibido")
    public void aoClicarNelaOChatDeveSerExibido() {
        centralDeAjuda.openChatRating();
        Assert.assertTrue("O Chat não foi exibido", chat.chatTitleIsDisplayed());
    }
}
