package com.addtocart.test
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class addtocart {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User menuju homepage")
	def User_menuju_homepage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://demo.nopcommerce.com/')
	}

	@When("User mencari item (.*)")
	def User_mencari_item_keyword(String keyword) {
		WebUI.setText(findTestObject('Object Repository/Page_nopCommerce demo store/input_You have no items in your shopping cart._q'), keyword)
		WebUI.waitForElementPresent(findTestObject('Object Repository/Page_nopCommerce demo store/span_Apple MacBook Pro 13-inch'), 10)
	}

	@And("User klik tombol search")
	def User_klik_item_di_list() {
		WebUI.waitForElementClickable(findTestObject('Object Repository/Page_nopCommerce demo store/input_You have no items in your shopping ca_b9bc7f'), 2)
	}

	@And("User klik item")
	def User_klik_item() {
		WebUI.waitForElementClickable(findTestObject('Page_nopCommerce demo store. Search/a_Apple MacBook Pro 13-inch'), 5)
	}

	@Then("User klik tombol add to cart")
	def User_klik_tombol_add_to_cart() {
		WebUI.waitForElementClickable(findTestObject('Page_nopCommerce demo store. Apple MacBook _575512/input_Qty_add-to-cart-button-4'), 3)
		WebUI.waitForElementClickable(findTestObject('Page_nopCommerce demo store. Apple MacBook _575512/span_shopping cart_close'), 5)
	}

	@And("User klik tombol shopping cart")
	def User_klik_tombol_shopping_cart() {
		WebUI.waitForElementClickable(findTestObject('Page_nopCommerce demo store. Apple MacBook _575512/span_shopping cart_close'), 5)
	}

	@And("User melihat item di shopping cart")
	def User_melihat_item_di_shopping_cart() {
		WebUI.verifyTextPresent('Apple MacBook Pro 13-inch', false)
		WebUI.closeBrowser()
	}
}