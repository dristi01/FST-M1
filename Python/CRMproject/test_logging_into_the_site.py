import time
import pytest
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.chrome.service import Service as Chromeservice
from webdrivermanager.chrome import ChromeDriverManager
from selenium.webdriver.edge.service import Service as EdgeService


def test_logging_Site():
    broweser='chrome'
    if broweser=='chrome':
        driver=webdriver.Chrome(service=Chromeservice(ChromeDriverManager().install()))
        driver.get("http://alchemy.hguy.co/crm")
        driver.maximize_window()
        time.sleep(5)
        driver.find_element(By.ID,"user_name").send_keys("admin")
        time.sleep(2)
        driver.find_element(By.ID,"username_password").send_keys("pa$$w0rd")
        time.sleep(2)
        driver.find_element(By.ID,"bigbutton").click()
        time.sleep(2)
        title=driver.title
        print(title)
        assert title,'SuiteCRM'
        driver.quit()