import pandas
from pandas import ExcelWriter

Data={
    "Vechical type":['Car','BIke','truck'] ,
    "Manufacture_Data":['Murti','Totyata','skuki']

}

dataframe=pandas.DataFrame(Data)
Writer=ExcelWriter("../resource/vechical.xlsx")
dataframe.to_excel(Writer,sheet_name='Sheet1')
Writer.close()

