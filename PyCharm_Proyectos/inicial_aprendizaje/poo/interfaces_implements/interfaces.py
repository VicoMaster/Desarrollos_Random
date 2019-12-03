# coding: utf-8
# Interfaces en Python
# AndresR.Dev

"""
Interfaces.
Una interfaz define las reglas a partir de las cuales un método puede comunicarse con los métodos de otros objetos.

En Python, una interfaz se crea tan sólo con definir un método que indica los parámetros que utiliza.

Ejemplo:

La clase Dispositivo define una interfaz simple para el parámetro consumo en el método __init__(),
la cual debe aceptar un argumento que pueda ser convertido en un objeto de tipo float y cuyo valor por definición es 50.
Por otra parte, la clase Dispositivo define una interfaz más compleja para el parámetro energia en el método duracion(). 
En caso de que el parámetro ingresado no cumpla con la definición de la interfaz, se levantará una excepción de tipo ValueError.
"""
class Dispositivo:
    '''Clase que define un una interfaz en el método __init__.'''
    
    def __init__(self, consumo=50):
        self.consumo = float(consumo) 
        
    def duracion(self, energia):
        '''El argumento para el parámetro energía debe de ser una lista o tulpa con 2 elementos 
        en los que el primer elemento debe de ser un número real y el segundo elemento debe 
        de ser la cadena de caracteres "watts/hr". '''  
        if  type(energia) in (tuple, list) and len(energia) == 2 and type(energia[0]) in (int, float) \
        and energia[1].casefold() == "watts/hr":
            return energia[0] / self.consumo
        else:
            raise ValueError('Interfaz incorrecta.')    




"""
Implementaciones.
Una implementación es la manera en la que un método realiza las operaciones necesarias para regresar la información
que será entregada bajo la especificación de una interfaz.

Pueden haber múltiples implementaciones para una interfaz específica. De hecho, 
las implementaciones pueden ser modificadas en el tiempo o incluso sustituida por completo, 
pero la entrega de la información está garantizada por la interfaz.
"""
