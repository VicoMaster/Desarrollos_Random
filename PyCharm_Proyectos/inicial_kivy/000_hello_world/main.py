# coding: utf-8
"""
Primer Hola mundo desde Kivy
"""
from kivy.app import App
from kivy.uix.label import Label
hello_world = App()


def build():
    return Label(text="Hello World desde Kivy")


hello_world.build = build
hello_world.run()
