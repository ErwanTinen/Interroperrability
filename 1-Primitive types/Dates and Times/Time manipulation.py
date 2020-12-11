

## TIME MANIPULATION

#Erwan TINEN TOUOLAC

import calendar ;
import time ;
import datetime ;

#on peut calculer la durée d'execution du programme

début = time.time()


#Ici on transforme un string en objet datetime
print("Rentrer une date au format YYYY-MM-JJ HH:MM");
time_string = input();

true_time = datetime.datetime.strptime(time_string, "%Y-%m-%d %H:%M");

print("vous avez rentrer");
print(true_time);

print(time.gmtime()); #temps écoulé depuis l'epoch
print("Voici un autre format");
print(time.strftime('%Y-%m-%dT%H:%M:%SZ', time.gmtime()));

#on peut aussi connaitre notre siècle

print(time.strftime("%C"));

print("il est ",time.strftime(" %R "));

fin = time.time()
print("la durée d'éxecution en seconde : ",fin-début);