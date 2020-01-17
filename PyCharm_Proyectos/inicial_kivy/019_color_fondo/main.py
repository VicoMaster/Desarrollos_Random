# coding: utf-8
from kivy.app import App
from kivy.uix.floatlayout import FloatLayout
from kivy.utils import get_color_from_hex as c
from kivy.core.window import Window as Wind
# Wind.clearcolor = [1, 1, 1, 1]  # opcion no tan recomendada -andresr.dev
Wind.clearcolor = c("#FFFFFF")  # tampoco es tan recomendada


class VentanaInicial(FloatLayout):
    def contenido(self):
        pass


class Pintor(App):
    def funcion_inicial(self):
        pass


ventana = Pintor()
ventana.run()
