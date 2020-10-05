import numpy as np

distance = []
time = []

def getDistanceTime():
    """reads in the distance ran in meters and
    time taken in seconds for a particular trial session. """
    distanceTime = [] # initialize the empty list for distance and time
    while True:
        distance = int(input('Enter distance ran in meters(m) [-1 to end]:'))
        if distance != -1:
            time = float(input('Enter time taken in seconds(s):'))
            distanceTime.append(distance)
            distanceTime.append(time)
        else:
            break
    return distanceTime # [dis,time,dis,time,dis,time]

def calculateSpeed(distanceTime):
    """accepts the distanceTime list and calculate the speed 
    for each pair of distance and time for all the trial sessions. """
    global distance
    global time

    distance = [i for i in distanceTime if distanceTime.index(i) % 2 == 0] # extract the distance to form a list from the distanceTime list
    time = [i for i in distanceTime if distanceTime.index(i) % 2 != 0]  # extract the time value to form a list from the distanceTime list
    dis_array = np.array(distance)
    time_array = np.array(time)
    speed = dis_array/time_array
    speed = list(speed) # initialize the empty list for speed calculation
    return speed

def trialRecord():
    """calls the getDistanceTime and calculateSpeed functions.
    then record all details in “Trial_Record.txt” file"""
    distanceTime = getDistanceTime()
    speed = calculateSpeed(distanceTime)
    
    DTS_list = zip(distance,time,speed) #create a zip object consist of 3 list

    with open('“Trial_Record.txt','w') as f:
        f.writelines("Distance(m)    Time(s)     Speed(m/s)")
        
        for line in DTS_list:
            str_line = str(line) #convert tuple to string data type
            f.writelines('\n')
            f.writelines(str_line)
    return None

trialRecord()