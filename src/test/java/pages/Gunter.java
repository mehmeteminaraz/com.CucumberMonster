package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class Gunter {

    public Gunter(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
}
