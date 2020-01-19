# coding: utf-8
from kivy.app import App
from kivy.uix.stacklayout import StackLayout
from kivy.uix.label import Label
"""
BBCode
TAGS: [size=50][/size], [/sup], [color=ff3333][/color], [/sub], [/b]
"""


class VentanaInicial(StackLayout):

    def __init__(self):
        super(VentanaInicial, self).__init__()
        for a in range(0, 3):
            self.contenido(markup=True, text="ESTUDIANDO A LA [b]CLASE[/b] LABEL ")

    def contenido(self, **kwargs):
        lb = Label(size_hint_y=None,
                   height=50,
                   **kwargs)
        self.add_widget(lb)


class StackWidLayout(App):
    def build(self):
        return VentanaInicial()


ventana = StackWidLayout()
ventana.run()
