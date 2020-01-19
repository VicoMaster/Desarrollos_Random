# coding: utf-8
"""
* Interfaz publica de acceso
Para evitar usar la funcion builtins propertyse usa el decorador
variable_propiedad = property(fget=_get_var, fset=_set_var) se remplaza por lo siguiente:


******   hasattr, setattr, getattr ******
Las funciones anteriores sirven para saber si un atributo hace parte de la lista de nombres, modificar un atributo o obtener.
"""


class A:
    def __init__(self):
        self._var = 0

    # Tiene que ser publico el nombre de la funcion del decorador - como si fuera una variable
    @property
    def var(self):
        print("INGRESO AL METODO GET_VAR")
        return self._var

    @var.setter
    def var(self, x):
        print("INGRESO AL METODO SET_VAR")
        self._var = x


a = A()
print(a.var)
a.var = 10
print(a.var)

