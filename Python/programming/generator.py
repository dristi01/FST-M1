def count_up_to(n):
    i=1
    while i<=n:
         yield i
         i+=1
    print("count on number"+str(i))

for num in count_up_to(9):
    print(num)
