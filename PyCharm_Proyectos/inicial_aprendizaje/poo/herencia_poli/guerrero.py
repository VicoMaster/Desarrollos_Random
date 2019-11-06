# coding: utf-8
"""
En este modulo se construira un Guerrero
"""
from personaje import Personaje


class Guerrero(Personaje):
    def __init__(self):
        super().__init__(clase="GUERRERO", hechizo="¡¡¡FILOTORMENTA!!!", genero=True)
        """Personaje.__init__(self)  # Es una forma de sobre escribir los atributos de otra clase para herencia multiple
        self.clase = "GUERRERO"
        self.hechizo = "¡¡¡FILOTORMENTA!!!"""

    def lanzar_hechizo(self):
        # Asi se sobrescribe una clase, python da prioridad a la de la clase en contexto
        return self.hechizo+" Y GENERO MUCHA IRA!!!!"
