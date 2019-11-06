# coding: utf-8
"""
Metodo __str__ sirve para especificar a python que queremos que nuestro objeto o clase imprima cuando sea usado en print
En esta clase se construiran los metodos necesarios para que un personaje sea creado
"""


class Personaje:
    def __init__(self, **kwargs):
        self.name = input("DIGITE EL NOMBRE DEL NUEVO PERSONAJE: ")
        self.genero = kwargs.get("genero", False)
        self.genero = {True: "Masculino", False: "Femenino"}[self.genero]
        self.clase = kwargs.get("clase", "NINGUNA")
        self.hechizo = kwargs.get("hechizo", "PFFFFF")
        self.prof1 = kwargs.get("prof1", "NINGUNA")
        self.prof2 = kwargs.get("prof2", "NINGUNA")

    def __str__(self):
        return "PERSONAJE: {} DE CLASE: {} CON GENERO: {}" \
               "\nHECHIZO PRINCIPAL: {}" \
               "\nPROFESION 1: {}" \
               "\nPROFESION 2: {}" \
            .format(self.name, self.clase, self.genero, self.lanzar_hechizo(), self.prof1, self.prof2)

    def lanzar_hechizo(self):
        return self.hechizo
