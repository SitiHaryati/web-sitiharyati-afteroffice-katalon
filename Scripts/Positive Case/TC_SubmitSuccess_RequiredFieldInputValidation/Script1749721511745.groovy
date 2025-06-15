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

// OPEN BROWSER//
WebUI.openBrowser('')
WebUI.navigateToUrl('https://demoqa.com/automation-practice-form')
WebUI.maximizeWindow()

// Scroll Down the Page
WebUI.scrollToElement(findTestObject('Object Repository/FormSubmit/Input_firstName'), 3)

// Input First Name and Last Name
WebUI.setText(findTestObject('Object Repository/FormSubmit/Input_firstName'), 'John')
WebUI.setText(findTestObject('Object Repository/FormSubmit/Input_lastName'), 'Doe')
// Input Email Address
WebUI.setText(findTestObject('Object Repository/FormSubmit/Input_Email'), 'John@gmail.com')
// Input Gender
WebUI.click(findTestObject('Object Repository/FormSubmit/radio_Male'))
// Input Phone Number
WebUI.setText(findTestObject('Object Repository/FormSubmit/Input_Mobile'), '0812345345')
// Input Date Of Birthday
WebUI.click(findTestObject('Object Repository/FormSubmit/Input_Birthday'))
WebUI.sendKeys(findTestObject('Object Repository/FormSubmit/Input_Birthday'), Keys.chord(Keys.CONTROL, 'a'))
WebUI.sendKeys(findTestObject('Object Repository/FormSubmit/Input_Birthday'), '1998 January 20' + Keys.ENTER)

// Empty For Field Options 
   // Input Subject (Options)
   // Input Hobies (Options)
   // Upload Pictures  (Options)
   // Input Address  (Options)
   // Choose The State (Options)
   // Choose The City (Options)

// Scroll Down Page
WebUI.scrollToElement(findTestObject('Object Repository/FormSubmit/button_Submit'), 4)
// Click Submit
WebUI.click(findTestObject('Object Repository/FormSubmit/button_Submit'))
// Showing PopUP Submission
WebUI.verifyElementPresent(findTestObject('Object Repository/FormSubmit/modal_Success'), 5)
// Close Browser
WebUI.closeBrowser()
