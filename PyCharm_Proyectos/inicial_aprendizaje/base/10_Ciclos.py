# coding: utf-8
# Uso de Ciclos


# se selecciona una buena papa
# ciclo While
def seleccionar_papa(seleccion):
    compra_papas = 0
    while seleccion > 0:
        compra_papas += 1
        seleccion -= 1
    return compra_papas


def pagar_papas(seleccion):
    valor_papas = 200
    valor_papas *= seleccion
    return valor_papas


# Ciclo For
def comprar_mas_cosas(cosas):
    print("Se van a comprar", cosas)
    contador_cosas = 0
    for cosa in cosas:
        print("Tambien quiero comprar: ", cosa)
        if "porno" in cosa.lower():
            print("Lo siento Joven, no vendo eso...")
            continue
        if "droga" in cosa.lower():
            print("Llamare a la Policia! Vete...")
            contador_cosas = -1
            break
        contador_cosas += 1
    return contador_cosas


def main():
    seleccion = 10  # Numero de Papas a Seleccionar y Comprar
    papas = seleccionar_papa(seleccion)
    valor_papas = pagar_papas(seleccionar_papa(seleccion))
    print("Se compraron ", papas, " papas Con valor de: ", valor_papas)
    mas_cosas = ['Chicle', 'Fresas', "Papel", "Revista Porno", "Condones", "Droga", "Robar al tendero"]
    cuantas_cosas = comprar_mas_cosas(mas_cosas)
    if cuantas_cosas != -1:
        print("Se compraron: ", cuantas_cosas, " cosas demas")
    else:
        print("Se Huye por que El tendero llamo a la Policia!!! D:!")


print("*** Comprar papas ***")
main()
