import time

from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.chrome.service import Service as Chromeservice
from webdrivermanager.chrome import ChromeDriverManager
from selenium.webdriver.edge.service import Service as EdgeService

broweser='chrome'
if broweser=='chrome':
    driver=webdriver.Chrome(service=Chromeservice(ChromeDriverManager().install()))
    driver.get("https://v1.training-support.net/selenium/tab-opener")
    time.sleep(2)
    driver.find_element(By.ID,'launcher').click()
    time.sleep(5)
    driver.switch_to.window(driver.window_handles[1])
    driver.get("https://v1.training-support.net/selenium/newtab2")

# Perform some actions in the new tab/window

# Switch back to the original tab/window
    driver.switch_to.window(driver.window_handles[0])

# Perform actions in the original tab/window

# Close the browser window
    driver.quit()
