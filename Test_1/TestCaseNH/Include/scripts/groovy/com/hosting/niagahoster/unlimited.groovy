package com.hosting.niagahoster
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



class unlimited {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User menuju website Niagahoster")
	def User_menuju_website_Niagahoster() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('https://dev-front.niagahoster.co.id/')
		
	}
	
	@And("User login")
	def User_login() {
		WebUI.click(findTestObject('Page_/a_Login'))
		
	}
	
	@And("User memasukkan (.*) dan (.*)")
	def User_memasukkan_username_dan_password(String username, String password) {
		WebUI.setText(findTestObject('Page_Login Akun  Hosting, Domain dan Websit_aef54c/input_Alamat Email_email'), username)
		WebUI.setEncryptedText(findTestObject('Page_Login Akun  Hosting, Domain dan Websit_aef54c/input_Password_password'), password)
		WebUI.click(findTestObject('Page_Login Akun  Hosting, Domain dan Websit_aef54c/input_Password_Send'))
		
	}
	
	@When("User kembali ke halaman utama")
	def User_kembali_ke_halaman_utama() {
		WebUI.navigateToUrl('https://dev-front.niagahoster.co.id/')
		
	}
	
	@And("User memilih menu Hosting Unlimited")
	def User_memilih_menu_Hosting_Unlimited() {
		WebUI.click(findTestObject('Page_/a_Hosting'))
		WebUI.click(findTestObject('Object Repository/Page_/a_Unlimited Hosting        Shared hosting t_85b3b7'))		
		WebUI.click(findTestObject('Page_/a_Pilih Sekarang'))
		
	}
	
	@And("User memilih paket")
	def User_memilih_paket() {
		WebUI.waitForElementClickable(findTestObject('Page_/a_Pilih Sekarang_1'), 5)
		
	}
	
	@And("User pilih jangka waktu berlangganan")
	def And_User_pilih_jangka_waktu_berlangganan() {
		WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Order Hosting  Web Hosting Indonesia G_0117f5/s_Rp. 1.483.200,00'), 5)
		
	}
	

	@Then("User registrasi (.*)")
	def User_registrasi_domainnya(String domain) {
		//WebUI.waitForElementPresent(findTestObject('Page_Order Hosting  Web Hosting Indonesia G_0117f5/input_Saya Sudah Punya Domain_register_sld'), 30)
		WebUI.scrollToElement(findTestObject('Page_Order Hosting  Web Hosting Indonesia G_0117f5/input_Saya Sudah Punya Domain_register_sld'), 3)
		WebUI.setText(findTestObject('Page_Order Hosting  Web Hosting Indonesia G_0117f5/input_Saya Sudah Punya Domain_register_sld'), domain)
		
	}
	
	@And ("User melanjutkan setelah domain tersedia")
	def User_melanjutkan_setelah_order_domain() {
		WebUI.waitForElementClickable(findTestObject('Page_Order Hosting  Web Hosting Indonesia G_0117f5/a_Cek Domain'), 0)
		WebUI.waitForElementClickable(findTestObject('Page_Order Hosting  Web Hosting Indonesia G_0117f5/a_Tambahkan ke Cart'), 5)
		WebUI.click(findTestObject('Page_Order Hosting  Web Hosting Indonesia G_0117f5/a_Lanjutkan'), FailureHandling.STOP_ON_FAILURE)
		
	}
	
	@And("User menambah fitur paket")
	def User_menambah_fitur_paket() {
		WebUI.click(findTestObject('Page_Order Hosting  Web Hosting Indonesia G_0117f5/div_Rekomendasi Fitur Tambahan_additional-f_897c80'))
		WebUI.click(findTestObject('Page_Order Hosting  Web Hosting Indonesia G_0117f5/div_mulai dari Rp 125rbdomain per tahun_add_68c100'))
		WebUI.click(findTestObject('Page_Order Hosting  Web Hosting Indonesia G_0117f5/div_Rp 45rbdomain per tahun_additional-feat_0e602b'))
		
	}
	
	@And("User lanjut")
	def User_lanjut() {
		WebUI.waitForElementClickable(findTestObject('Page_Order Hosting  Web Hosting Indonesia G_0117f5/a_Lanjutkan'), 3)
		
	}
	@And("User checkout")
	def User_checkout() {
		WebUI.waitForElementClickable(findTestObject('Page_Order Hosting  Web Hosting Indonesia G_0117f5/a_Konfirmasi Manual'), FailureHandling.STOP_ON_FAILURE)
		WebUI.waitForElementClickable(findTestObject('Page_Order Hosting  Web Hosting Indonesia G_0117f5/a_Checkout Sekarang'), 0)
		
	}
	
	@And("User konfirmasi")
	def User_konfirmasi() {
		WebUI.waitForElementClickable(findTestObject('Page_Order Hosting  Web Hosting Indonesia G_0117f5/a_Konfirmasi Pembayaran di Member Area'), 0)
		
	}
	
	@And("User tergistrasi dengan paket yang dipilih")
	def User_tergistrasi_dengan_paket_yang_dipilih() {
		WebUI.verifyTextPresent('loremipsumdolorsitamet.com', false)
		WebUI.closeBrowser()
		
	}
}