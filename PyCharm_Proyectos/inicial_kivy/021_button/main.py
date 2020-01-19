# coding: utf-8
from kivy.app import App
from kivy.uix.stacklayout import StackLayout

"""
ESTE CODIGO ESTA AUN EN CONSTRUCCION, SE QUIERE AGREGAR DINAMICAMENTE BOTONES Y AGREGAR ACCIONES A ELLOS
ES POSIBLE QUE SE REQUIERA IMPLEMENTAR EL CODIGO KIVY DIRECTAMENTE EN EL ARCHIVO PYTHON 
DE IGUAL FORMA CREAR BOTONES QUE HAGAN LO MISMO NO TIENE LOGICA, NO TIENE SENTIDO CREAR BOTONES DINAMICOS QUE HAGAN LO
MISMO.
"""


class VentanaInicial(StackLayout):

    def click(self):
        print(self)
        print(self.ids)

    def fin_click(self):
        pass


class ElBotonazo(App):
    pass


ventana = ElBotonazo()
ventana.run()
