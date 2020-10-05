import time,os
from functions import *

"""AssemblySections_CodeList = AssemblySections_CodeList() # call for assembly function and assign returned value to variable in local scope

print(AssemblySections_CodeList)

part_details = Part()
"""

while True:
    PartList = [] # the part list in local scope

    menu() # call for menu function
    choice = str(input("Select your choice:"))
    if choice == str(1):
            while True
                sel = input("1.Create Warehouses\n2.Create Assembly Sections\n3.Create part's detail\n)
                if sel in [1,2,3]:

                else:
                    print("Pls enter integer within the range of 1,2,3")
                    time.sleep(1)
                    continue

            Warehouses_CodeList = Warehouses_CodeList() # call for warehouse function and return the warehouses code list
            while True:
                single_part = Part() # call for Part function to create individual part
                PartList.append(single_part) # append the single part detail to PartList
                
            pass # Parts Inventory Creation in Warehouses
    elif choice == str(2):
        pass
    elif choice == str(3):
        pass # Parts Inventory Tracking
    elif choice == str(4):
        pass # Searching Functionalities
    else:
        print("Pls enter ingeter between 1 and 4")
    os.system('cls')
    