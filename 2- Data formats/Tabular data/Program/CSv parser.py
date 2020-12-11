
## Import csv

import os

import inspect


os.path.dirname(os.path.realpath(__file__));
#Parsing


l=0 ;
c=0;
with open('file.csv', newline='') as f:
    reader = csv.reader(f,delimiter=',')
    
    for row in reader :
        l =l+1;
        c = len(row);
        print(row);

print("Nombre de ligne " + str(l))
print("Nombre de colonne " + str(c))


#Generating