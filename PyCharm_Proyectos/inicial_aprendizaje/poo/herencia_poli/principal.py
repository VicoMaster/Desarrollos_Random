# coding: utf-8
"""
Clase main de ejemplo de Herencia en Python
Y polimorfismo con sobreescritura de metodos en modulo guerrero
"""
from personaje import Personaje
from guerrero import Guerrero

# Se imprime el personaje BASE
jugador = Personaje()
print("*** ESTE EL PERSONAJE BASE ***\n{}".format(jugador))
guerrero = Guerrero()
print("*** ESTE EL GUERRERO ***\n{}".format(guerrero))
