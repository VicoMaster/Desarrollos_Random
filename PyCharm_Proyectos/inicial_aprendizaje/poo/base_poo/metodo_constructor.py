# coding: utf-8
# Personalizando el metodo constructor


class A:
    def __init__(self, x, y):  # Constructor que pide valores por default
        self.alt = x
        self.lon = y
        print("CREE VARIABLES EN LA INSTANCIA CON LOS PARAMETROS: %s % s" % (x, y))

    def area(self):
        return self.alt * self.lon


objeto = A(5, 10)  # Si no se definen valores al inicializar el objeto de clase, genera suspenso
print(objeto.area())
