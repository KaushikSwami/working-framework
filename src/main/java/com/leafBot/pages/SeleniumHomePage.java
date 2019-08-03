package com.leafBot.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.leafBot.testng.api.base.Annotations;

public class SeleniumHomePage extends Annotations {
	
	public SeleniumHomePage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.CLASS_NAME, using="dropdown-toggle") WebElement input_DropDown;

	@FindBy(how=How.LINK_TEXT, using="Select Dropdown List") WebElement drop_down_select;
	
	@FindBy(how=How.LINK_TEXT, using="Input Form Submit") WebElement input_form_submit;
	
	@FindBy(how=How.LINK_TEXT, using="Checkbox Demo") WebElement checkbox_select;
	
	@FindBy(how=How.LINK_TEXT, using="Radio Buttons Demo") WebElement radio_button;



	


	public DropDownSelectPage selectDropDown()
	{
		click(input_DropDown);
		click(drop_down_select);
		return new DropDownSelectPage();

	}
	
	public InputFormPage select_input_form()
	{
		click(input_DropDown);
		click(input_form_submit);
		return new InputFormPage();
	}
	
	public CheckBoxPage check_box()
	{
		click(input_DropDown);
		click(checkbox_select);
		return new CheckBoxPage();

	}
	
	public RadioButtonPage radioButton()
	{
		click(input_DropDown);
		click(radio_button);
		return new RadioButtonPage();


		
	}
}
