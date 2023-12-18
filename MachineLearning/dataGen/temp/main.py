import os
import random
import uuid
import randomname

f = open("temperatureDataSet.csv", "a")

if os.path.getsize(f.name) <= 0:
    f.write("id, sensorName, value, error\n")

normalTemp = [0.00, 70.00]
errorTemp1 = [-15.00, 5.00]
errorTemp2 = [60.00, 120.00]

errorChance1 = 20
errorChance2 = 30

iterations = 1000

for i in range(0, iterations):
    chance = round(random.uniform(0.00, 100.00), 2)
    temp = 0
    error = 1
    if chance <= errorChance1:
        temp = round(random.uniform(errorTemp1[0], errorTemp1[1]), 2)
    elif chance >= 100 - errorChance2:
        temp = round(random.uniform(errorTemp2[0], errorTemp2[1]), 2)
    else:
        temp = round(random.uniform(normalTemp[0], normalTemp[1]), 2)
        error = 0

    f.write(str(uuid.uuid4()) + ", " + randomname.get_name() + ", " + str(temp) + ", " + str(error) + "\n")
