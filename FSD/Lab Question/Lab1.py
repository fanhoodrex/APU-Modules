# Q1
print("""Welcome to student registration system\n1.Register\n2.Update\n3.Delete\n4.Exit """)

# Q2
a = int(input("Enter first number:"))
b = int(input("Enter second number:"))
c = int(input("Enter third number:"))

sum_abc = a + b + c
print(sum_abc)

# Q3
a = int(input("Enter first number:"))
b = int(input("Enter second number:"))
c = float(input("Enter third number:"))
d = float(input("Enter second number:"))
e = str(input("Enter third number:"))

num = (a + b + c + d + e) / 5
print(num)

# TypeError: unsupported operand type(s) for +: 'float' and 'str'