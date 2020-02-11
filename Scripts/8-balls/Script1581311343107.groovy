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

WebUI.navigateToUrl('https://games.cdn.famobi.com/html5games/0/8-ball-billiards-classic/v120/?fg_domain=play.famobi.com&fg_aid=A1000-1&fg_uid=82038e98-d4e1-46dd-8de9-1460d1395eab&fg_pid=4638e320-4444-4514-81c4-d80a8c662371&fg_beat=246&original_ref=https%3A%2F%2Fhtml5games.com%2FGame%2F8-Ball-Billiards-Classic%2F82038e98-d4e1-46dd-8de9-1460d1395eab')

WebUI.waitForPageLoad(300)

WebUI.maximizeWindow(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Page_8 Ball Billiards Classic/div_Data Privacy Information_btn-play loading'))

Thread.sleep(5000)

WebUI.click(findTestObject('Page_8 Ball Billiards Classic/div_'))

Thread.sleep(10000)

WebUI.clickOffset(findTestObject('Page_8 Ball Billiards Classic/canvas'), 0, 360)

Thread.sleep(5000)

WebUI.clickOffset(findTestObject('Page_8 Ball Billiards Classic/canvas'), 0, 70)

Thread.sleep(40000)

WebUI.clickOffset(findTestObject('Page_8 Ball Billiards Classic/canvas'), 0, 70)
WebUI.clickOffset(findTestObject('Page_8 Ball Billiards Classic/canvas'), 0, 70)
WebUI.dragAndDropByOffset(findTestObject('Page_8 Ball Billiards Classic/canvas'), -40, 70)

Thread.sleep(5000)
