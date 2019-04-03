# -*- coding: utf-8 -*-
'''
Created on 3 abr. 2019
Realiza un programa que escoja al azar 5 palabras en español del minidiccionario del
ejercicio anterior. El programa irá pidiendo que el usuario
teclee la traducción al inglés de cada una de las palabras y comprobará si
son correctas. Al final, el programa deberá mostrar cuántas respuestas son
válidas y cuántas erróneas.

@author: Álvaro Leiva Toledano
@version: 1.0
'''

import random

diccionario = {'gato':'cat',
               'perro':'dog',
               'casa':'house',
               'carta':'card',
               'árbol':'tree',
               'rojo':'red',
               'amarillo':'yellow',
               'verde':'green',
               'mesa':'table',
               'montaña':'mountain',
               'coche':'car'}

#Este array almacenará las palabras aleatorias que tendrá que elegir el programa.
palabrasAleatorias = []

#Este array almacenará cada valor del diccionario.
arrayDiccionario = []

for i in diccionario:
    arrayDiccionario.append(i)
    
    random.shuffle(arrayDiccionario) #randomiza el orden del contenido del array.

#Añado contenido a palabrasAleatorias
for i in range(5):
    palabrasAleatorias.append(arrayDiccionario.pop(0))#pop coge el primer indice.
    
aciertos = 0
fallos = 0    
    
for i in palabrasAleatorias:
    mensaje = input("Introduce la traduccion de "+ i +": ")
    
    if(mensaje == diccionario.get(i)):
        aciertos = aciertos + 1
    else:
        fallos = fallos +1

print("\nAciertos: " + str(aciertos)+ "\nFallos:"+str(fallos))