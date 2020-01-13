# coding: utf-8
# Pantalla hecha en kivy unicamente para mostrar nueva ventana
# para comparar con python
from kivy.app import App
from kivy.uix.boxlayout import BoxLayout
from kivy.config import Config
Config.set('kivy', 'exit_on_escape', '0')


class Telon1(BoxLayout):
    # Evento Click
    def on_press_bt(self):
        print("TELON1")
        self.clear_widgets()  # Se deja esta funcion por fallo en la del curso
        #  Para remover Widget en especifico self.remove_widget(self.bt1)
        self.add_widget(Telon2())


class Telon2(BoxLayout):
    def on_press_bt(self):
        print("TELON2")
        self.clear_widgets()  # Se deja esta funcion por fallo en la del curso
        self.add_widget(Telon1())


class KVvsPY(App):
    pass


ventana = KVvsPY()
ventana.run()
