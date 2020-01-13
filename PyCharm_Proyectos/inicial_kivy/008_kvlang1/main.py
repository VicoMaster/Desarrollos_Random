# coding: utf-8
# implementacion pura de Kivy
# solo se creara clase inicial para ser llamada con python
import kivy
from kivy.app import App
from kivy.config import Config
Config.set('kivy', 'exit_on_escape', '0')
kivy.require('1.9.1')


class InicialPython(App):
    pass


ip = InicialPython()
ip.run()
