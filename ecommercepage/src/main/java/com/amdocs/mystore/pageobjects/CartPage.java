package com.amdocs.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.mystore.actiondriver.Action;
import com.amdocs.mystore.base.BaseClass;

public class CartPage extends BaseClass {

	@FindBy(xpath = "//*[@id=\"sc-buy-box-ptc-button\"]/span/input")
	WebElement ProceedToBuyButton;

	Action action = new Action();

	public CartPage()
	{
		PageFactory.initElements(driver, this);
	}

	public CheckOutPage proceedToBuy()
	{
		action.waitForElement(100, ProceedToBuyButton);
		action.click(ProceedToBuyButton);
		return new CheckOutPage();
	}
}


//   

//*[@id="attach-sidesheet-view-cart-button"]/span/input