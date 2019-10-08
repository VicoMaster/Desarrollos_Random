# Uso de Funcion Enumarate

lista = [20, 21, 22, 23, 24, 25, 26]
print(list(enumerate(lista)))

for idx, item in list(enumerate(lista)):
    print("Este es el Item: %s " % item)
    print(lista[idx])
