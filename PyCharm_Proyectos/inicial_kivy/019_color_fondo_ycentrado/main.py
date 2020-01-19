# coding: utf-8
from kivy.app import App
from kivy.uix.anchorlayout import AnchorLayout
# from kivy.utils import get_color_from_hex as c
# from kivy.core.window import Window as Wind
# Wind.clearcolor = [1, 1, 1, 1]  # opcion no tan recomendada -andresr.dev
# Wind.clearcolor = c("#FFFFFF")  # tampoco es tan recomendada
# Cambiar el color de fondo de la forma anterior podria presentar una forma rapida pero no ordenada.


class VentanaInicial(AnchorLayout):
    def contenido(self):
        pass


class Pintor(App):
    def build(self):
        return VentanaInicial()


ventana = Pintor()
ventana.run()
