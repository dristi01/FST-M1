import time
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.chrome.service import Service as Chromeservice
from webdrivermanager.chrome import ChromeDriverManager
import pytest
from selenium.webdriver.edge.service import Service as EdgeService


def test():
    broweser='firefox'
    if broweser=='firefox':
        driver=webdriver.Chrome(service=Chromeservice(ChromeDriverManager().install()))
        driver.get("https://v1.training-support.net/selenium/tab-opener")
        time.sleep(2)
        driver.find_element(By.ID,'launcher').click()
        time.sleep(5)
        driver.switch_to.window(driver.window_handles[1])
        driver.get("https://v1.training-support.net/selenium/newtab2")



