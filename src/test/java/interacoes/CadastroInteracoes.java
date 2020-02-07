package interacoes;

import pagina.CadastroPagina;

public class CadastroInteracoes extends CadastroPagina {

    public void preencherCampoEmail(String valor){
        email.sendKeys(valor);
    }

    public void preencherCampoFirstName(String valor){
        firstname.sendKeys(valor);
    }
    public void preencherCampoLastName(String valor){
        lastname.sendKeys(valor);
    }
}
