import  pandas

Dataframe=pandas.read_csv('../resource/employee.csv')
print(Dataframe["Name"][1])