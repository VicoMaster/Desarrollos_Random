# coding: utf-8
"""
label en kivy
"""
from kivy.app import App
from kivy.uix.label import Label
app = App()


def build():
    lb = Label()
    lb.text = "Curso de Python y Kivy"
    lb.italic = True
    lb.font_size = 50
    # return Label(text="Curso de Python y Kivy", italic=True, font_size=50)
    return lb


"""
Las propiedades de los widgets pueden ser enviadas como argumentos como alterar sus propiedades en  tiempo de ejecucion
"""

app.build = build
app.run()
