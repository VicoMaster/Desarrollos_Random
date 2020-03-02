# coding: utf-8
"""

Implementando una calculadora usando solo lenguaje Kivy
"""
from kivy.app import App
from kivy.uix.gridlayout import GridLayout


class VentanaInicial(GridLayout):
    def calcular(self, valores):
        if valores:
            try:
                self.display.text = str(eval(valores))
            except ZeroDivisionError:
                self.display.text = "Impossible to divide by zero..."
            except SyntaxError:
                pass
            except OverflowError:
                self.display.text = "DESBORDAMIENTO"

    def borrar_c(self, valores):
        nuevo = valores[:len(valores)-1]
        self.display.text = nuevo


class Calculadora(App):
    def build(self):
        return VentanaInicial()


ventana = Calculadora()
ventana.run()
