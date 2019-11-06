# coding utf-8
"""
Manejo de Hilos en Python
Pausas
Hora
"""
import threading
import time
import datetime
import logging

logging.basicConfig(level=logging.INFO, format='[%(levelname)s] (%(threadName)-s) %(message)s')


def consultar(id_persona):
    logging.info("CONSULTANDO PARA EL ID: " + str(id_persona))
    print("ENTRO AL METODO CONSULTAR")
    contador = 0
    while contador < 4:
        print("Esperando... CONSULTA")
        time.sleep(1)
        contador += 1


def guardar(id_persona, data):
    logging.info("CONSULTANDO PARA EL ID: " + str(id_persona) + " CON DATA: " + str(data))
    print("ENTRO AL METODO GUARDAR")
    contador = 0
    while contador < 4:
        print("Esperando... GUARDADO")
        time.sleep(1)
        contador += 1


tiempo_inicio = datetime.datetime.now()
t1 = threading.Thread(name="hilo_1", target=consultar, args=(1, ))
t2 = threading.Thread(name="hilo_2", target=guardar, args=(1, "ESTE ES EL CONTENIDO DEL ARGUMENTO 1"))

t1.start()
t2.start()
t1.join()

t2.join()
tiempo_fin = datetime.datetime.now()

print("Tiempo transcurrido: {} - {}".format(str(tiempo_inicio.second), str(tiempo_fin.second)))
