# Agregar contacto
# Remover contacto
# Actualizar contacto
# Ver contacto
# Ver todos
# coding: utf-8


agenda_telefonica = dict()


def banco_mensajes(clave):
    mensajes = {
        "AGREGADO": "*** CONTACTO AGREGADO ***",
        "ELIMINADO": "*** CONTACTO ELIMINADO ***",
        "ACTUALIZADO": "*** CONTACTO ACTUALIZADO ***",
        "NO_EXISTE": "*** CONTACTO NO EXISTE ***",
        "NO_CONTACTOS": "*** NO HAY CONTACTOS ***",
        "IN_NOMBRE": "Ingrese Nombre del Nuevo Contacto: ",
        "IN_NOMBRE_UPD": "Ingrese Nombre del Contacto a Actualizar: ",
        "IN_NOM_REV": "Ingrese Nombre del Contacto a Revisar: ",
        "IN_TEL": "Ingrese Telefono del Nuevo Contacto: ",
        "IN_NOM_DEL": "Ingrese Nombre del Contacto a Eliminar: ",
        "BYE": "Hasta la Proxima...",
        "NO_VAL": "...OPCION INVALIDA...",
        "LINE": "_____________________________________",
        "MENU": "Bienvenido a su Agenda de Contactos"
               "\n1. Agregar Contacto"
               "\n2. Remover Contacto"
               "\n3. Actualizar Contacto"
               "\n4. Ver Contacto"
               "\n5. Ver todos"
               "\n6. Salir",
        "OPC": "Digite Opción -> "
    }
    if clave in mensajes:
        mensaje = mensajes[clave]
    else:
        mensaje = "-> SIN MSG <-"
    return mensaje


def agregar_contacto():
    nombre = input(banco_mensajes("IN_NOMBRE"))
    numero = input(banco_mensajes("IN_TEL"))
    agenda_telefonica[nombre] = numero
    print(banco_mensajes("AGREGADO"))


def remover_contacto():
    nombre = input(banco_mensajes("IN_NOM_DEL"))
    if nombre in agenda_telefonica:
        del agenda_telefonica[nombre]
        print(banco_mensajes("ELIMINADO"))
    else:
        print(banco_mensajes("NO_EXISTE"))


def actualizar_contacto():
    nombre = input(banco_mensajes("IN_NOMBRE_UPD"))
    if nombre in agenda_telefonica:
        numero = input(banco_mensajes("IN_TEL"))
        agenda_telefonica[nombre] = numero
        print(banco_mensajes("ACTUALIZADO"))
    else:
        print(banco_mensajes("NO_EXISTE"))


def ver_contacto():
    nombre = input(banco_mensajes("IN_NOMBRE_REV"))
    if nombre in agenda_telefonica:
        print("{} - {}".format(nombre, agenda_telefonica[nombre]))
    else:
        print(banco_mensajes("NO_EXISTE"))


def ver_todos():
    if len(agenda_telefonica) > 0:
        for nombres in agenda_telefonica:
            print("{} - {}".format(nombres, agenda_telefonica[nombres]))
    else:
        print(banco_mensajes("NO_EXISTE"))


def menu_agenda():
    print(banco_mensajes("MENU"))
    opcion = input(banco_mensajes("OPC"))
    return opcion


funciones = {
    "1": agregar_contacto,
    "2": remover_contacto,
    "3": actualizar_contacto,
    "4": ver_contacto,
    "5": ver_todos
}
while True:
    eleccion = menu_agenda()
    if eleccion == "6":
        print(banco_mensajes("BYE"))
        break
    else:
        if eleccion in funciones:
            funciones[eleccion]()
        else:
            print(banco_mensajes("NO_VAL"))
    print(banco_mensajes("LINE"))
