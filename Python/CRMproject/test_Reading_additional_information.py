import time
import pytest
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.chrome.service import Service as Chromeservice
from webdrivermanager.chrome import ChromeDriverManager
from selenium.webdriver.edge.service import Service as EdgeService


def test_peading_additional_information():
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
        driver.find_element(By.ID,"grouptab_0").click()

        driver.find_element(By.XPATH,'//*[@id="moduleTab_9_Leads"]').click()
        time.sleep(3)
        driver.find_element(By.XPATH,'//*[@id="MassUpdate"]/div[3]/table').click()
        time.sleep(2)
        driver.find_element(By.XPATH,'//*[@id="adspan_6af2edb0-bc40-46d1-7837-5fdc647a1061"]/span').click()
        time.sleep(2)
        phone=driver.find_element(By.XPATH,'//*[@class="phone"]').text
        print(phone)






