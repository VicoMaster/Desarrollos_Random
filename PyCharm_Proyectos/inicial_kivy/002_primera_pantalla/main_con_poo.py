# coding: utf-8
"""
Primera Pantalla usando Kivy con POO
"""
from kivy.app import App
from kivy.uix.floatlayout import FloatLayout
from kivy.uix.textinput import TextInput
from kivy.uix.button import Button
from kivy.config import Config


class MenuPrograma(App):

    @staticmethod
    def click():
        print(ingreso.text)

    def build(self):
        layaout = FloatLayout()
        global ingreso
        ingreso = TextInput(text="PRIMER TEXTO")
        ingreso.size_hint = None, None
        ingreso.height = 300
        ingreso.width = 400
        ingreso.x = 60
        ingreso.y = 200

        boton = Button(text="Click Aquí")
        boton.size_hint = None, None
        boton.height = 50
        boton.width = 200
        boton.y = 130
        boton.x = 170
        boton.on_press = self.click

        layaout.add_widget(ingreso)
        layaout.add_widget(boton)

        return layaout


MenuPrograma.title = "PRIMERA VENTANA!!!"
Config.set('graphics', 'width', '500')
Config.set('graphics', 'height', '550')
# Window.size = (300, 100)
global ingreso
MenuPrograma().run()
