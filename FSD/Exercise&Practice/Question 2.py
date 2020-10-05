def getDailySales(day):
    """reads in sales amount for some items sold in a grocery shop for a particular day. 
    The function should store the sales values in a list called sales and return it"""

    daily_sales = [] # initialize the empty list that consist of daily sale

    print(f"Finding average sales for day {day+1}")

    daily_sale = float(input("Enter sales amount for the first item [-1 to end]:")) # user's first input
    daily_sales.append(daily_sale)

    while True: # loop of user input
        daily_sale = float(input("Enter sales amount for the next item [-1 to end]:"))
        if daily_sale != -1:
            daily_sales.append(daily_sale)
        else:
            break
    return daily_sales

def totalDailySales(daily_sales):
    """calculate the total amount of particular day"""
    total = sum(daily_sales)
    return total

def avgDailySales(daily_sales):
    """calculate the average amount of particular day"""
    total = totalDailySales(daily_sales)
    average = total/len(daily_sales)
    return average

def avgWeeklySales ():
    """the main function that called for previous functions 
    to write the average sales for each day to the txt file"""
    Average_Sales = [] # initialize the list consist of average day sale in a week

    for day in range(7):
        daily_sales = getDailySales(day) # return the sales list for particular day
        print(daily_sales)
        total = totalDailySales(daily_sales)
        average = avgDailySales(total)
        Average_Sales.append(average)
    
    with open("Average_Sales.txt","w") as f: # create the file object 
        for sale in Average_Sales:
            f.write(sale)
    return None

avgWeeklySales()
