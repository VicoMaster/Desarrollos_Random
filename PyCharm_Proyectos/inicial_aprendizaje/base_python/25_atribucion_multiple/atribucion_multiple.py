# Atribucion multiple
# coding: utf-8

a = 10
b = 5
print(a, b)
a, b = b, a
print(a, b)
print("################")
a, b, c = 3, 4, 6
print(a, b, c)
a, b, c = a*2, a+b+c, a*b*c
print(a, b, c)


# Atribucion Condicional
val = False
var = 10 if val else 20
print(var)

num = int(input("Digite un Numero: "))
texto = "PAR" if num % 2 == 0 else "IMPAR"
print(texto)

a, *b, c = 1, 2, 3, 4, 5
print(a, b, c)

# Guiones para Legibilidad
a = 10_000_000
b = 10000000
print(a == b)
