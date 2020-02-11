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
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.common.WebUiCommonHelper


WebUI.openBrowser('')

WebUI.navigateToUrl('https://rg-play.com/SlotGame/PNG')

Thread.sleep(2000)

WebUI.mouseOver(findTestObject('Object Repository/Page_Royal Gclub/select_games')) 
WebUI.click(findTestObject('Object Repository/Page_Royal Gclub/play_game'))

Thread.sleep(2000)

WebUI.switchToWindowTitle('PNG')

WebUI.maximizeWindow()

int x =  WebUI.getElementWidth(findTestObject('Object Repository/Page_PNG/canvas'))/2  
int y =  WebUI.getElementHeight(findTestObject('Object Repository/Page_PNG/canvas'))/2


Thread.sleep(6000)
//WebUI.clickOffset(findTestObject('Object Repository/Page_PNG/canvas'), 260 , 310 ) //不再顯示
WebUI.clickOffset(findTestObject('Object Repository/Page_PNG/canvas'), 0 , 310 )      //繼續

Thread.sleep(2000)

WebUI.clickOffset(findTestObject('Object Repository/Page_PNG/canvas'), 493 , 413 )      

Thread.sleep(4000)

WebUI.clickOffset(findTestObject('Object Repository/Page_PNG/canvas'), 493 , 413 )      

Thread.sleep(4000)

WebUI.clickOffset(findTestObject('Object Repository/Page_PNG/canvas'), 493 , 413 )      

Thread.sleep(4000)

WebUI.clickOffset(findTestObject('Object Repository/Page_PNG/canvas'), 580 , 430 )
Thread.sleep(2000)
WebUI.clickOffset(findTestObject('Object Repository/Page_PNG/canvas'), 170 , -280 )
Thread.sleep(3000)
WebUI.clickOffset(findTestObject('Object Repository/Page_PNG/canvas'), 160 , 380 )
Thread.sleep(2000)
WebUI.clickOffset(findTestObject('Object Repository/Page_PNG/canvas'), 170 , 380 )
Thread.sleep(2000)
WebUI.clickOffset(findTestObject('Object Repository/Page_PNG/canvas'), 180 , 380 )
Thread.sleep(2000)
WebUI.clickOffset(findTestObject('Object Repository/Page_PNG/canvas'), 190 , 380 )
Thread.sleep(2000)
WebUI.clickOffset(findTestObject('Object Repository/Page_PNG/canvas'), 200 , 380 )
Thread.sleep(2000)
WebUI.clickOffset(findTestObject('Object Repository/Page_PNG/canvas'), 230 , 380 )
Thread.sleep(2000)
WebUI.clickOffset(findTestObject('Object Repository/Page_PNG/canvas'), 240 , 380 )
Thread.sleep(2000)
WebUI.clickOffset(findTestObject('Object Repository/Page_PNG/canvas'), 250 , 380 )
Thread.sleep(2000)
WebUI.clickOffset(findTestObject('Object Repository/Page_PNG/canvas'), 260 , 380 )
Thread.sleep(2000)



//Thread.sleep(10000)
//WebUI.closeBrowser()

