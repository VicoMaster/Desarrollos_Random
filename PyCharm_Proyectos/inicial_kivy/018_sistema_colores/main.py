# coding: utf-8
from kivy.app import App
from kivy.uix.floatlayout import FloatLayout
from kivy.utils import get_color_from_hex as c
import os
import codecs


class VentanaInicial(FloatLayout):

    def contenido(self):
        num_digitos = 6
        mihex = "#"+str(codecs.encode(os.urandom(int(num_digitos / 2)), 'hex').decode())
        self.ids.boton1.background_color = c(mihex)


class Pintor(App):
    def funcion_inicial(self):
        pass


ventana = Pintor()
ventana.run()
