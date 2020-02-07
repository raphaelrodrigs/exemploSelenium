package pagina;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastroPagina {
    @FindBy(id = "Email")
    protected WebElement email;

    @FindBy(id = "FirstName")
    protected WebElement firstname;

    @FindBy(id = "LastName")
    protected WebElement lastname;
}
