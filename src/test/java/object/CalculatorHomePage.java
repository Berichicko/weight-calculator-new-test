package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CalculatorHomePage {

    private final WebDriver driver;

    public CalculatorHomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void setUserName(String name) {

        driver.findElement(By.xpath("//input[@name=\"name\"]")).sendKeys(name);
    }

    public void setUserHeight(String height) {
        driver.findElement(By.xpath("//input[@name=\"height\"]")).sendKeys(height);
    }

    public void setUserWeight(String weight) {
        driver.findElement(By.xpath("//input[@name=\"weight\"]")).sendKeys(weight);
    }

    public void setUserGender() {
        driver.findElement(By.xpath("//input[@name='gender'][@value=\"m\"]")).click();// and
    }

    public void submitForm() {
        driver.findElement(By.xpath("//input[@value= \"Рассчитать\"]")).click();
    }

    public boolean resultPositiveCalculator() {
        return driver.findElement(By.xpath("//td[text() = 'Идеальная масса тела']"))
                .getText().equals("Идеальная масса тела");// убрать
    }

    public boolean resultNegativeNameCalculator() {
        return driver.findElement(By.xpath("//b[text()=\"Не указано имя.\"]"))
                .getText().equals("Не указано имя.");
    }


    public boolean resultNegativeHeightCalculator() {
        return driver.findElement(By.xpath("//b[text()=\"Рост должен быть в диапазоне 50-300 см.\"]"))
                .getText().equals("Рост должен быть в диапазоне 50-300 см.");
    }

    public boolean testNegativeWeightCalculator() {
        return driver.findElement(By.xpath("//b[text()=\"Вес должен быть в диапазоне 3-500 кг.\"]"))
                .getText().equals("Вес должен быть в диапазоне 3-500 кг.");
    }
}

