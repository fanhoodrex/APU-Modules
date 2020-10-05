# Q1
print(list(range(10)))

# Q2

marks = []
for i in range(3):
    mark = int(input(f"Please enter marks of student {i+1}:"))
    marks.append(mark)

for num in marks:
    print(num)

# Q3
array = [1,99,34,2,35,76,-5]
search_key = int(input("Enter the search key:"))
location = array.index(search_key) # find the location
print(location)