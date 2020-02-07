package testes;

import interacoes.CadastroInteracoes;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;
import utils.DriverInstance;


public class CadastroTeste extends DriverInstance{
    CadastroInteracoes cadastro = PageFactory.initElements(driver, CadastroInteracoes.class);

    @Test
    public void validarObrigatoriedadeCampoPosition(){
        cadastro.preencherCampoEmail("teste@teste.com");
        cadastro.preencherCampoFirstName("Nome");
        cadastro.preencherCampoLastName("Joecy");
    }
}
