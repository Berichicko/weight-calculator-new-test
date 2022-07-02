package test;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest extends Base {

    @Test
    public void testPositivesResultCalculator() {
        homePage.setUserName("Саша Засинец");
        homePage.setUserHeight("190");
        homePage.setUserWeight("90");
        homePage.setUserGender();
        homePage.submitForm();
        Assert.assertTrue(homePage.resultPositiveCalculator());
        System.out.println("TEST CASE 1 - VALID VALUES - PASSED SUCCESSFULLY");
    }

    @Test
    public void testNegativeNameCalculator() {
        homePage.setUserName("");
        homePage.setUserHeight("190");
        homePage.setUserWeight("90");
        homePage.setUserGender();
        homePage.submitForm();
        Assert.assertTrue(homePage.resultNegativeNameCalculator());
        System.out.println("TEST CASE 2 - INVALID NAME -  PASSED SUCCESSFULLY");
    }

    @Test
    public void testNegativeHeightCalculator() {
        homePage.setUserName("Саша");
        homePage.setUserHeight("кккккккккк");
        homePage.setUserWeight("90");
        homePage.setUserGender();
        homePage.submitForm();
        Assert.assertTrue(homePage.resultNegativeHeightCalculator());
        System.out.println("TEST CASE 3 - INVALID HEIGHT -  PASSED SUCCESSFULLY");
    }

    @Test
    public void testNegativeWeightCalculator() {
        homePage.setUserName("Саша");
        homePage.setUserHeight("190");
        homePage.setUserWeight("@@@");
        homePage.setUserGender();
        homePage.submitForm();
        Assert.assertTrue(homePage.testNegativeWeightCalculator());
        System.out.println("TEST CASE 3 - INVALID WEIGHT -  PASSED SUCCESSFULLY");
    }
}
