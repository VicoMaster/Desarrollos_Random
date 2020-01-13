# coding: utf-8
# implementacion pura de Kivy
# solo se creara clase inicial para ser llamada con python
import kivy
from kivy.app import App
from kivy.config import Config
from kivy.uix.boxlayout import BoxLayout
from kivy.uix.button import Button
Config.set('kivy', 'exit_on_escape', '0')
kivy.require('1.9.1')


# Es obligatorio añadir un parametro cuando se crea una funcion en contexto
def func_self(x=None):
    print("FUNCION SELF"+str(x))


Button.func_self = func_self


class Telon(BoxLayout):
    @staticmethod
    def func_root():
        print("FUNCION ROOT")


class Estudio(App):
    @staticmethod
    def funcion_app():
        print("FUNCION APP")


ip = Estudio()
ip.run()
