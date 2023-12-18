import os
import random
import uuid
import randomname

f = open("pressureDataSet.csv", "a")

if os.path.getsize(f.name) <= 0:
    f.write("id, sensorName, value, error\n")

normalPress = [500.00, 1000.00]
errorPress1 = [14.00, 550.00]
errorPress2 = [1050.00, 1500.00]

errorChance1 = 30
errorChance2 = 20

iterations = 1000

for i in range(0, iterations):
    chance = round(random.uniform(0.00, 100.00), 2)
    press = 0
    error = 1
    if chance <= errorChance1:
        press = round(random.uniform(errorPress1[0], errorPress1[1]), 2)
    elif chance >= 100 - errorChance2:
        press = round(random.uniform(errorPress2[0], errorPress2[1]), 2)
    else:
        press = round(random.uniform(normalPress[0], normalPress[1]), 2)
        error = 0

    f.write(str(uuid.uuid4()) + ", " + randomname.get_name() + ", " + str(press) + ", " + str(error) + "\n")
