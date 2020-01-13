# coding: utf-8
# implementacion pura de Kivy
# solo se creara clase inicial para ser llamada con python
import kivy
from kivy.app import App
from kivy.config import Config
from kivy.uix.boxlayout import BoxLayout
Config.set('kivy', 'exit_on_escape', '0')
kivy.require('1.9.1')


class Telon(BoxLayout):
    def click(self):
        boton_1 = str(self.ids.lb1.text).strip()
        boton_2 = str(self.ids.lb2.text).strip()
        if boton_1 == "" or boton_2 == "":
            if boton_1 == "":
                self.ids.lb1.text = "AHORA ESTOY VACIO"
                self.ids.lb2.text = ""
            else:
                self.ids.lb1.text = ""
                self.ids.lb2.text = "AHORA ESTOY VACIO"
        else:
            self.ids.lb1.text = ""


class Estudio(App):
    pass


ip = Estudio()
ip.run()
