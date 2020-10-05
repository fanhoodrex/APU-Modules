# Q1
# first solution, and i think this is the fastest, most efficient, pythonic way 
for i in range(1,21):
    print(i,end=' ')

# second solution using while loop
num = 1
while num <= 20:
    print(num,end=" ")
    num += 1 # this is equal to num = num + 1

# third solution using while loop and if condition checking
num = 1
while True:
    print(num,end=" ")
    if num < 20:
        num += 1
    else:
        break

# Q2
# First solution using for loop and if condition checking
num = 0
times = 20 # desire first 20 even number starting from 
for num in range(times*2):
    if num % 2 == 0: # is even number if it is divisible by 2 
        print(num,end=" ")
        num += 1

# Second solution using while/else clause and if condition checking
num = 0 # starting display number from integer 0
times = 1 # displaying times count
while times <= 20:
    if num % 2 != 0: # if the numebr is not even
        times += 1
        num += 1
    else:
        print(num,end=" ")
        num += 1
else:
    pass

# Q3
for i in range(15):# read fahrenheit temperature 15 time
    try:
        tem_data= float(input("Enter the temperatures in degree fahrenheit:"))
        Celsius = (tem_data - 32)*5/9 # convert the degree fahrenheit to degree celsius using formula
        print(Celsius)
    except ValueError:
        print("Pls enter float value:")
        
print("All temperatures processed")

# Q4
for i in range(10):
    print(f"7 * {i+1} = {7*(i+1)}")  

