friends = ['Andrew','Barker','Charlee','David','Eric'] #initialize the friends list

def check_friend():
    name = str(input("Enter a name:"))
    if name in friends:
        print("%s is your friend"%name)
    else:
        print(f"{name} is not your friend")

check_friend()