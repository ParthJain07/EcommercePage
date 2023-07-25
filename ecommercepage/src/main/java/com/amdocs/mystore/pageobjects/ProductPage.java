package com.amdocs.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.mystore.actiondriver.Action;
import com.amdocs.mystore.base.BaseClass;

public class ProductPage extends BaseClass {

	@FindBy(xpath = "//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")
	WebElement CartButton;

	Action action = new Action();

	public ProductPage()
	{
		PageFactory.initElements(driver, this);
	}

	public CartPage goToCart()
	{
		action.waitForElement(100, CartButton);
		action.click(CartButton);
		return new CartPage();
	}
}


////*[@id="add-to-cart-button"]
//*[@id="attach-sidesheet-view-cart-button"]/span/input