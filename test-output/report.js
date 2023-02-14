$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/TC_Login_Functionality_With_positive_and_negative_scenarios.feature");
formatter.feature({
  "name": "Login Functionalities",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login with valid Id and password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Reg"
    }
  ]
});
formatter.step({
  "name": "I enter User Id and Password from sheetname \"\u003cSheetName\u003e\" and rownumber \u003cRowNumber\u003e",
  "keyword": "Then "
});
formatter.step({
  "name": "Click on Login Button",
  "keyword": "And "
});
formatter.step({
  "name": "the Home Page will appear",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "SheetName",
        "RowNumber"
      ]
    },
    {
      "cells": [
        "loginAuth",
        "0"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am in Chrome Browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.TC_Login_Functionality_With_positive_and_negative_scenarios.i_am_in_Chrome_Browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to microtech site",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.TC_Login_Functionality_With_positive_and_negative_scenarios.i_navigate_to_microtech_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Landing Page will appear",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.TC_Login_Functionality_With_positive_and_negative_scenarios.landing_Page_will_appear()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on Login Button",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.TC_Login_Functionality_With_positive_and_negative_scenarios.i_click_on_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with valid Id and password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Reg"
    }
  ]
});
formatter.step({
  "name": "I enter User Id and Password from sheetname \"loginAuth\" and rownumber 0",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.TC_Login_Functionality_With_positive_and_negative_scenarios.i_enter_User_Id_and_Password_from_sheetname_and_rownumber(java.lang.String,java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.TC_Login_Functionality_With_positive_and_negative_scenarios.click_on_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the Home Page will appear",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinitions.TC_Login_Functionality_With_positive_and_negative_scenarios.the_Home_Page_will_appear()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: target window already closed\nfrom unknown error: web view not found\n  (Session info: chrome\u003d108.0.5359.100)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027SKYSCHOOLING\u0027, ip: \u0027192.168.254.124\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.7\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 108.0.5359.100, chrome: {chromedriverVersion: 108.0.5359.71 (1e0e3868ee06..., userDataDir: C:\\Users\\belal\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:49716}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 029da7e5557eeef9b7822483ec52e270\n*** Element info: {Using\u003dxpath, value\u003d//h2[text()\u003d\u0027Welcome Test \u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat pages.DashboardPage.getHeading(DashboardPage.java:25)\r\n\tat stepDefinitions.TC_Login_Functionality_With_positive_and_negative_scenarios.the_Home_Page_will_appear(TC_Login_Functionality_With_positive_and_negative_scenarios.java:72)\r\n\tat ✽.the Home Page will appear(file:///C:/java/WorkSpaceSDET/skySchoolingPOM/src/test/resources/features/TC_Login_Functionality_With_positive_and_negative_scenarios.feature:13)\r\n",
  "status": "failed"
});
formatter.write("this is my failure message");
formatter.after({
  "status": "passed"
});
});