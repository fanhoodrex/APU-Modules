# Q1
def sum_two():
    """a program to find sum of two numbers using functions and calculate their average."""
    num1 = int(input("Enter first number:"))
    num2 = int(input("Enter second number:"))
    total = sum([num1,num2])
    avg = total/2
    print("Sum of the given two numbers is %s:"%total)
    print("Average of the given numbers is:",avg)
    return None

sum_two()

# Q2

def main():
    """a program to enter students’ data by defining a “register” function 
    and passing students’ details as arguments to the function. 
    Display student’s name and TP along with a message 
    that you have passed if marks are greater than or equal to 50 else failed.  """
    
    name = input("Enter your name:") # user input
    tp = input("Enter your tp number:")
    marks = int(input("Enter your marks:"))

    def register(name,tp,marks):
        """Inner function"""
        if marks >= 50:
            print(f"{name} {tp} you have passed the module")
        else:
            print(f"Student registered successfully")
        return None

    register(name,tp,marks) # call for the inner function in the main function
    return None

main()

# Q3

def add(a,b):
    return (a+b)
def sub(a,b):
    return (a-b)
def mul(a,b):
    return (a*b)
def div(a,b):
    return (a/b)

while True:
    print("""\ncalculator program
    1.ADD
    2.SUBSTRACT
    3.MULTIPLY
    4.DIVIDE
    """)
    a = int(input("Enter first number:")) # user input
    b = int(input("Enter second number:"))

    selection = int(input("choose any of the given options:"))
    if selection == 1:
        print(f"product of the two number is {add(a,b)}")
    elif selection == 2:
        print(f"product of the two number is {sub(a,b)}")
    elif selection == 3:
        print(f"product of the two number is {mul(a,b)}")
    elif selection == 4:
        print(f"product of the two number is {div(a,b)}")
    else:
        print("Invalid input, pls try again...")


