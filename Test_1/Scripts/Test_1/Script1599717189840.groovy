import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demo.nopcommerce.com/')

WebUI.setText(findTestObject('Page_nopCommerce demo store/input_You have no items in your shopping cart._q'), 'mac')

WebUI.click(findTestObject('Page_nopCommerce demo store/input_You have no items in your shopping ca_b9bc7f'))

WebUI.click(findTestObject('Page_nopCommerce demo store. Search/a_Apple MacBook Pro 13-inch'))

WebUI.click(findTestObject('Page_nopCommerce demo store. Apple MacBook _575512/span_shopping cart_close'))

WebUI.click(findTestObject('Page_nopCommerce demo store. Apple MacBook _575512/span_Shopping cart'))

WebUI.verifyTextPresent('', false)

WebUI.closeBrowser()

