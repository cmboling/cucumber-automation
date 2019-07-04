package fox.Page;

import fox.helpers.NavigationHelper;
import org.openqa.selenium.By;


public class GoogleHomePage {
    public NavigationHelper navigationHelper = new NavigationHelper();

    public void goTo(String url){
        navigationHelper.goTo(url);
        //navigationHelper.isElementPresent(UserIconAccount_Button_Xpath);
    }

    public void search(String searchTerm) {
        By searchInputField = By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input");
        By searchInputSearchButton = By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]");

        navigationHelper.input(searchInputField,searchTerm);
        navigationHelper.clickElement(searchInputSearchButton);
    }

}
