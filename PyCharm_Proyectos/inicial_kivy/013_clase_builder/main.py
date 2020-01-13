# coding: utf-8
# implementacion pura de Kivy
# solo se creara clase inicial para ser llamada con python
import kivy
from kivy.app import App
from kivy.config import Config
from kivy.lang import Builder
Config.set('kivy', 'exit_on_escape', '0')
kivy.require('1.9.1')

code = """
BoxLayout:
    Button:
        text: "1"
    Button:
        text: "2"

"""


class InicialPython(App):
    def build(self):
        return Builder.load_string(code)


ip = InicialPython()
ip.run()
