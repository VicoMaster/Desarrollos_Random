# coding: utf-8
from kivy.app import App
from kivy.uix.boxlayout import BoxLayout


class VentanaInicial(BoxLayout):
    def contenido(self):
        if self.orientation == "vertical":
            self.orientation = "horizontal"
        else:
            self.orientation = "vertical"


class BoxWidLayout(App):
    def funcion_inicial(self):
        pass


ventana = BoxWidLayout()
ventana.run()
