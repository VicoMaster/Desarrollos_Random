# coding: utf-8
"""
button en kivy
"""
from builtins import print

from kivy.app import App
from kivy.uix.button import Button


def click():
    print("EL BOTON FUE PRESIONADO")


def build():
    bt = Button(text="Clic Aqui")
    bt.on_press = click
    return bt


ventana = App()
ventana.build = build
ventana.run()
