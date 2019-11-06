# coding: utf-8
"""
Uso de metodo de clase
Se usa la funcion builtins:  classmethod()
Los miembros de clase se pueden acceder desde cualquier instancia
Se acceden con el nombre de la clase.
@classmethod
"""


class Bichos:
    cnt_bichos = 0

    def __init__(self):
        self.add_bicho()

    def __del__(self):
        self.del_bicho()
        if self.cnt_bichos == 0:
            print("TODOS LOS BICHOS FUERON ELIMINADOS")

    @classmethod
    def add_bicho(cls):
        cls.cnt_bichos += 1

    @classmethod
    def del_bicho(cls):
        cls.cnt_bichos -= 1

    # add_bicho = classmethod(add_bicho)
    # del_bicho = classmethod(del_bicho)


b1 = Bichos()
print(Bichos.cnt_bichos)
b2 = Bichos()
print(Bichos.cnt_bichos)
b3 = Bichos()
print(Bichos.cnt_bichos)
print("¡¡¡ PROCESO DE ELIMINADO DE BICHOS EN PROGRESO !!!!")
del b1
print(Bichos.cnt_bichos)
del b2
print(Bichos.cnt_bichos)
del b3
print(Bichos.cnt_bichos)
