# Esta es la clase inicial
class ClaseInicial:
    def __init__(self):
        self.a = 5
        self.b = 10
        print("ME EJECUTE")

    def area(self):
        return self.a * self.b


obj = ClaseInicial()
print(obj.area())


# Creamos nueva funcion y la asignamos a la instancia o contexto
def nueva_funcion():
    print("NUEVA FUNCION EJECUTANDOSE")


obj.nw_func = nueva_funcion
obj.nw_func()
