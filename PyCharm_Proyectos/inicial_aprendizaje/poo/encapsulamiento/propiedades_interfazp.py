# coding: utf-8
"""
* Interfaz publica de acceso
property(fget, fset, fdel, doc)
"""


class A:
    def __init__(self):
        self._var = 0

    def _get_var(self):
        print("INGRESO AL METODO GET_VAR")
        return self._var

    def _set_var(self, x):
        print("INGRESO AL METODO SET_VAR")
        self._var = x

    variable_propiedad = property(fget=_get_var, fset=_set_var)


a = A()
print(a.variable_propiedad)
a.variable_propiedad = 10
print(a.variable_propiedad)
