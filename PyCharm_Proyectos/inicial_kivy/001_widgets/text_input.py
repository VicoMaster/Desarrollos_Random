# coding: utf-8
"""
Ingreso de datos en kivy
"""

from kivy.app import App
from kivy.uix.textinput import TextInput


def build():
    return TextInput(text="DIGITE CUALQUIER COSA JOVEN")


ventana = App()
ventana.build = build
ventana.run()

