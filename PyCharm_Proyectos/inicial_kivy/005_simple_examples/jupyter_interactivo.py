# coding: utf-8
# Uso rapido del InteractiveLauncher, ejecucion interactiva que sirve para ejecucion en Jupyter
# Al parecer el modulo InteractiveLauncher no sirve en esta version?

from kivy.app import App
from kivy.uix.widget import Widget
from kivy.interactive import InteractiveLauncher
from kivy.config import Config
from kivy.uix.button import Button

Config.set('graphics', 'fullscreen', '0')


class EstudiosoApp(App):
    def build(self):
        return Widget()


e = EstudiosoApp()
ji = InteractiveLauncher(e)
ji.run()

bt = Button(text="BOTON 1")
#  ji.root.add_widget( bt )
bt.text = "123"


def bt_click():
    print("EJECUTADO")


bt.on_press = bt_click
