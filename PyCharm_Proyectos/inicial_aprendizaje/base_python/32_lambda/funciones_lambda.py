# coding: utf-8
"""
Funciones anonimas, on the go, on demand, online
"""
# Esta utilización no la acepta pep8
area_triangulo = lambda base, altura: (base * altura) / 2
triangulo1 = area_triangulo(7, 5)
# Esta utilización no la acepta pep8
destacar_valor = lambda comision: "¡{}! $".format(comision)
comision_ana = 15532
print(destacar_valor(comision_ana))


numeros = [14, 25, 36, 32, 52, 99]
print(list(filter(lambda numero_par: numero_par % 2 == 0, numeros)))


class Empleado:

    def __init__(self, nombre, cargo, salario):
        self.nombre = nombre
        self.cargo = cargo
        self.salario = salario

    def __str__(self):
        return "{} que trabaja como {} tiene un salario de ${} USD".format(self.nombre, self.cargo, self.salario)


lista_empleados = [
    Empleado("Juan", "Director", 750000),
    Empleado("Ana", "Presidenta", 850000),
    Empleado("Antonio", "Administrativo", 25000),
    Empleado("Sara", "Secretaria", 27000),
    Empleado("Mario", "Botones", 21000),
    Empleado("Rodrigo", "Conductor", 10000),
]

salarios_altos = filter(lambda empleado: empleado.salario > 50000, lista_empleados)

for empleado_salario in salarios_altos:
    print(empleado_salario)
