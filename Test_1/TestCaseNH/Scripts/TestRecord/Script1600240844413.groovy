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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://dev-front.niagahoster.co.id/')

WebUI.click(findTestObject('Page_/a_Login'))

WebUI.setText(findTestObject('Page_Login Akun  Hosting, Domain dan Websit_aef54c/input_Alamat Email_email'), 'danny.krestianto@hostinger.com')

WebUI.setEncryptedText(findTestObject('Page_Login Akun  Hosting, Domain dan Websit_aef54c/input_Password_password'), 'JaobsbVDc5MtEDhB7FSlLg==')

WebUI.click(findTestObject('Page_Login Akun  Hosting, Domain dan Websit_aef54c/input_Password_Send'))

WebUI.navigateToUrl('https://dev-front.niagahoster.co.id/')

WebUI.click(findTestObject('Page_/a_Hosting'))

WebUI.click(findTestObject('Page_/a_Unlimited Hosting        Shared hosting t_85b3b7'))

WebUI.click(findTestObject('Page_/a_Pilih Sekarang'))

WebUI.scrollToElement(findTestObject('Page_/a_Pilih Sekarang_1'), 2)

WebUI.click(findTestObject('Page_/a_Pilih Sekarang_1'))

WebUI.click(findTestObject('Object Repository/Page_Order Hosting  Web Hosting Indonesia G_0117f5/s_Rp. 1.483.200,00'))

WebUI.scrollToElement(findTestObject('Page_Order Hosting  Web Hosting Indonesia G_0117f5/input_Saya Sudah Punya Domain_register_sld'), 
    3)

WebUI.waitForElementClickable(findTestObject('Page_Order Hosting  Web Hosting Indonesia G_0117f5/input_Saya Sudah Punya Domain_register_sld'), 
    0)

WebUI.setText(findTestObject('Page_Order Hosting  Web Hosting Indonesia G_0117f5/input_Saya Sudah Punya Domain_register_sld'), 
    'loremipsum')

WebUI.waitForElementClickable(findTestObject('Page_Order Hosting  Web Hosting Indonesia G_0117f5/a_Cek Domain'), 0)

WebUI.waitForElementClickable(findTestObject('Page_Order Hosting  Web Hosting Indonesia G_0117f5/a_Tambahkan ke Cart'), 
    0)

WebUI.waitForElementClickable(findTestObject('Page_Order Hosting  Web Hosting Indonesia G_0117f5/a_Lanjutkan'), 0)

WebUI.waitForElementClickable(findTestObject('Page_Order Hosting  Web Hosting Indonesia G_0117f5/div_Rekomendasi Fitur Tambahan_additional-f_897c80'), 
    0)

WebUI.click(findTestObject('Page_Order Hosting  Web Hosting Indonesia G_0117f5/div_mulai dari Rp 125rbdomain per tahun_add_68c100'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Page_Order Hosting  Web Hosting Indonesia G_0117f5/div_Rp 45rbdomain per tahun_additional-feat_0e602b'), 
    0)

WebUI.click(findTestObject('Page_Order Hosting  Web Hosting Indonesia G_0117f5/a_Lanjutkan'))

WebUI.click(findTestObject('Page_Order Hosting  Web Hosting Indonesia G_0117f5/a_Konfirmasi Manual'))

WebUI.click(findTestObject('Page_Order Hosting  Web Hosting Indonesia G_0117f5/a_Checkout Sekarang'))

WebUI.click(findTestObject('Page_Order Hosting  Web Hosting Indonesia G_0117f5/a_Konfirmasi Pembayaran di Member Area'))

WebUI.click(findTestObject('Object Repository/Page_Tagihan/li_New Order Pelajar for loremipsum.com'))

WebUI.closeBrowser()

