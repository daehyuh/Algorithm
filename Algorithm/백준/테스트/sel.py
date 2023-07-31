
from selenium import webdriver
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.common.action_chains import  ActionChains
from selenium.webdriver.chrome.options import Options
from selenium.webdriver.chrome.options import Options

options = Options()
options.binary_location= 'C:/Users/daehy/PycharmProjects/Algorithm2/Algorithm/백준/테스트/chromedriver.exe'

driver = webdriver.Chrome()
url = 'https://www.inflearn.com/course/lecture?courseSlug=aws-%EC%9E%85%EB%AC%B8&unitId=43733&tab=curriculum'
driver.get(url)            # url 오픈해라
driver.maximize_window()   #창 크게 만들기
action= ActionChains(driver)
