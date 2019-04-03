# -*- coding: utf-8 -*-
'''
Created on 3 abr. 2019
Escribe un programa que ordene 10 números enteros introducidos por teclado
y almacenados en un objeto de la clase ArrayList.

@author: Álvaro Leiva Toledano
@version: 1.0
'''

numeros = []
for i in range(10):
    numeros.append(int(input("Introduzca el número " + str(i+1) + " de 10: ")))

print("\nLista sin ordenar: " + str(numeros))

numeros.sort()

print("Lista ordenada: " + str(numeros))
