# -*- coding: utf-8 -*-
'''
Created on 3 abr. 2019
Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
(con su correspondiente traducción). Utiliza un objeto de la clase HashMap para
almacenar las parejas de palabras. El programa pedirá una palabra en español
y dará la correspondiente traducción en inglés.

@author: Álvaro Leiva Toledano
@version: 1.0
'''

diccionario = {'gato':'cat',
               'perro':'dog',
               'casa':'house',
               'carta':'card',
               'arbol':'tree',
               'rojo':'red',
               'amarillo':'yellow',
               'verde':'green',
               'mesa':'table',
               'montaña':'mountain',
               'coche':'car'}

mensaje = (input("Introduce la palabra a traducir: "))

if(mensaje in diccionario):
    print(mensaje + " - " + diccionario.get(mensaje))
else:
    print("La palabra no se encuentra en el diccionario.")
