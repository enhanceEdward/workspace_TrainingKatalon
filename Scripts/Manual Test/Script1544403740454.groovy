import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('https://opensource-demo.orangehrmlive.com/')

WebUI.maximizeWindow()

WebUI.sendKeys(findTestObject('OrangeHRM_Site/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 'Admin')

WebUI.sendKeys(findTestObject('OrangeHRM_Site/Page_OrangeHRM/input_Username_txtPassword'), 'admin123')

WebUI.click(findTestObject('OrangeHRM_Site/Page_OrangeHRM/input_Password_Submit'))

WebUI.verifyElementPresent(findTestObject('OrangeHRM_Site/Page_OrangeHRM/a_Welcome Admin'), 2)

WebUI.verifyTextPresent('Welcome Admin', false)

WebUI.delay(2)

WebUI.waitForElementClickable(findTestObject('OrangeHRM_Site/Page_OrangeHRM/Timesheet Image'), 2)

WebUI.click(findTestObject('OrangeHRM_Site/Page_OrangeHRM/Timesheet Image'))

WebUI.click(findTestObject('OrangeHRM_Site/Page_OrangeHRM/input__btnView'))

WebUI.verifyElementPresent(findTestObject('OrangeHRM_Site/Page_OrangeHRM/span_Required'), 2)

WebUI.verifyTextPresent('Required', false)

WebUI.closeBrowser()

