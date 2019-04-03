# -*- coding: utf-8 -*-
'''
Created on 3 abr. 2019
Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
y 20 elementos ambos inclusive.

@author: Álvaro Leiva Toledano
@version: 1.0
'''

from random import randint

numeros = []

for i in range(randint(10, 20)):  # randint: número aleatorio entre 10 y 20
    numeros.append(randint(0, 100))

print("La lista de números es la siguiente:")
print(numeros)

print ("Suma " + str(sum(numeros)))
print ("Maximo " + str(max(numeros)))
print ("Minimo " + str(min(numeros)))
print ("Media " + str(sum(numeros) // len(numeros)))
