# Q1
Sell_Price = float(input("Enter selling price:"))
Buy_Price = float(input("Enter buying price:"))
profit = Sell_Price - Buy_Price

if profit > 0:
    print("You have profit in trading of this item ")
else:
    print("You don't have profit in trading of this item ")

# Q2 
name = input("Please enter your name:")
mark2 = int(input("Please enter your marks:"))

if mark2 >= 60:
    print(f"{name}, you have passed the module")


# Q3
while True:
    mark3 = int(input("Please enter your marks:"))
    if 80 <= mark3 <=100 :
        print(f"Your grade is A")
    elif 70 <= mark3 <= 79:
        print(f"Your grade is:B")
    elif 60 <= mark3 <= 69:
        print(f"Your grade is:C")
    elif 50 <= mark3 <= 59:
        print(f"Your grade is:D")
    elif 0 <= mark3 <= 49:
        print(f"Your grade is:F")
    else:
        print("invalid entry")