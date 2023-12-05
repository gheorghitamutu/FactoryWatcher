import os
import random
import uuid
import randomname

f = open("humidityDataSet.csv", "a")

if os.path.getsize(f.name) <= 0:
    f.write("id, sensorName, value, error\n")

normalHumid = [40.00, 60.00]
errorHumid1 = [0.00, 45.00]
errorHumid2 = [55.00, 100.00]

errorChance1 = 30
errorChance2 = 20

iterations = 1000

for i in range(0, iterations):
    chance = round(random.uniform(0.00, 100.00), 2)
    humid = 0
    error = 1
    if chance <= errorChance1:
        humid = round(random.uniform(errorHumid1[0], errorHumid1[1]), 2)
    elif chance >= 100 - errorChance2:
        humid = round(random.uniform(errorHumid2[0], errorHumid2[1]), 2)
    else:
        humid = round(random.uniform(normalHumid[0], normalHumid[1]), 2)
        error = 0

    f.write(str(uuid.uuid4()) + ", " + randomname.get_name() + ", " + str(humid) + ", " + str(error) + "\n")
