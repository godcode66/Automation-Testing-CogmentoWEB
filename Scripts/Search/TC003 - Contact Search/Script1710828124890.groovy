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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ui.cogmento.com/')

WebUI.setText(findTestObject('Object Repository/Login/Page_Cogmento CRM/input_Login_email'), 'frutaman21@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Cogmento CRM/input_Login_password'), 'A7XJPV0S6sHhhsKzpg571w==')

WebUI.click(findTestObject('Object Repository/Login/Page_Cogmento CRM/div_Login'))

WebUI.setText(findTestObject('Dash/Page_Cogmento CRM/input_text'), 'farhan')

WebUI.sendKeys(findTestObject('Dash/Page_Cogmento CRM/input_text'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Dash/Page_Cogmento CRM/a_Farhan Ananda Windi'))

WebUI.verifyElementText(findTestObject('Dash/Page_Cogmento CRM/span_Farhan Windi'), 'Farhan Windi')

WebUI.takeScreenshot()

WebUI.closeBrowser()

