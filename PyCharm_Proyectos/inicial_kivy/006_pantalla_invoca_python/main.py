# coding: utf-8
# Pantalla hecha en Python unicamente para mostrar nueva ventana
# para comparar con Kivy

from kivy.app import App
from kivy.uix.button import Button
from kivy.uix.boxlayout import BoxLayout
from kivy.config import Config
Config.set('kivy', 'exit_on_escape', '0')


class Telon1(BoxLayout):

    def __init__(self, **kwargs):
        super(Telon1, self).__init__(**kwargs)
        self.orientation = "vertical"
        self.bt1 = Button(text="Clíck")
        self.bt1.on_press = self.on_press_bt
        self.add_widget(self.bt1)
        self.add_widget(Button(text="bt2"))
        self.add_widget(Button(text="bt3"))

    # Evento Click
    def on_press_bt(self):
        print("TELON1")
        self.clear_widgets()  # Se deja esta funcion por fallo en la del curso
        #  Para remover Widget en especifico self.remove_widget(self.bt1)
        self.add_widget(Telon2())


class Telon2(BoxLayout):

    def __init__(self, **kwargs):
        super(Telon2, self).__init__(**kwargs)
        self.orientation = "vertical"
        bt = Button(text="Click Here")
        bt.on_press = self.on_press_bt
        self.add_widget(bt)

    def on_press_bt(self):
        print("TELON2")
        self.clear_widgets()  # Se deja esta funcion por fallo en la del curso
        self.add_widget(Telon1())


class KVvsPY(App):
    def build(self):
        return Telon1()


ventana = KVvsPY()
ventana.run()
