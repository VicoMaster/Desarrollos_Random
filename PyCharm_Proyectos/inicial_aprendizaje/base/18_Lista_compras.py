# coding: utf-8
# Lista de Compras
# AndresR.Dev

# Dinero Disponiblea para hacer la compra
from builtins import print

mi_dinero = float
# Listado de Objetos a comprar
listado_compras = []
# Data de Compras
data_super = {
    "Lacteos": [("Leche", 3000), ("Yogurt", 2000), ("Kumis", 1500), ("Queso", 4500), ("Leche Descremada", 3500)],
    "Harinas": [("Pan", 200), ("Galletas", 1000), ("Harina", 1800), ("Ponques", 4000), ("Levadura", 10000)],
    "Tuberculos": [("Papa", 800), ("Yuca", 500), ("Criollla", 600), ("Cubios", 400)],
    "Gaseosas": [("Coca", 2000), ("Pepsi", 1800), ("Naranja", 1600), ("Uva", 1600), ("Limonada", 1600)]
}


def eliminar_compra():
    ejecucion = True
    tamanno_buy = len(listado_compras)
    if tamanno_buy > 0:
        while ejecucion:
            eleccion = input("Su Compra sera - Eliminada -\nDesea Continuar? S/N\n-> ")
            eleccion = eleccion.lower()
            if eleccion == "s" or eleccion == "n":
                return eleccion
            else:
                print("Opcion no Valida...")
    else:
        print("No hay Ninguna Compra...")
    return None


def verificar_activo():
    pass


#  Este sera el metodo Main
def hacer_compra():
    ejecucion = True
    while ejecucion:
        print("Bienvenido a ShopShop")
        print(menu_tienda("", ""))
        categoria = input("Que desea Adquirir: ")
        if categoria.lower() != "x" and categoria.lower() != "c":
            stock = menu_tienda(categoria.lower().capitalize(), "")
            print(stock)
            if len(stock) >= 1:
                producto = input("Que producto desea: ")
                confirmacion = menu_tienda(categoria.lower().capitalize(), producto.lower().capitalize())
                print(confirmacion)
        elif categoria.lower() == "x":
            ejecucion = False
            print("Gracias, Que vuelva...")
        elif categoria.lower() == "c":  # Clave para hacer el calculo de los precios
            print("EN EL CARRITO -> ", listado_compras)
            compra = 0.0
            for item in listado_compras:
                compra += float(item[1])
            print("Su compra tiene el valor de: $", compra)
        print("*** Presione X para Salir ***")


def menu_tienda(categoria, producto):
    oferta = []
    try:
        if categoria == "":
            for categoria in data_super:
                oferta.append(categoria)
        elif categoria in data_super.keys() and producto == "":
            oferta = data_super[categoria]
        elif producto != "":
            lista_producto = data_super[categoria]
            for stock in lista_producto:
                coincidencia = producto in stock
                if coincidencia:
                    oferta = producto+" Ha sido agregado al Carrito"
                    listado_compras.append(stock)
                    break
                oferta = "Item no encontrado..."
        else:
            print("NO SE ENCONTRO CATEGORIA...")
    except KeyError:
        print("No se encuentra en Stock...")
    return oferta


def quickly_menu():
    numero = True
    while numero:
        opcion = input("OPCIONES:\n1.Hacer una Compra.\n2.Eliminar una venta\n3.Salir\n-> ")
        if opcion == "1":
            numero = 1
            break
        elif opcion == "2":
            numero = 2
            break
        elif opcion == "3":
            numero = 3
            break
        else:
            print("Opcion no Valida.")
    return numero


def exit_menu():
    print("Gracias por Venir...")


funciones = {'1': hacer_compra, '2': eliminar_compra, '3': exit_menu}
opcion_m = quickly_menu()
borrar = funciones[str(opcion_m)]()
if borrar == "s":
    listado_compras = []
    print("SU COMPRA HA SIDO ANULADA... Hasta Pronto.")
else:
    print("Buen dia.")

# Este programa nunca Eliminara una compra porque esta mal diseñado, de igual manera, se aprecia como seria.
