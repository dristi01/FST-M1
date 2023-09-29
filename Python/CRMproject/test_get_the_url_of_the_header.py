import time
import pytest
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.chrome.service import Service as Chromeservice
from webdrivermanager.chrome import ChromeDriverManager
from selenium.webdriver.edge.service import Service as EdgeService


def test_verify_tittle():
    broweser='chrome'
    if broweser=='chrome':
        driver=webdriver.Chrome(service=Chromeservice(ChromeDriverManager().install()))
        driver.get("http://alchemy.hguy.co/crm")
        driver.maximize_window()
        url=driver.current_url
        print(url)
        driver.quit()