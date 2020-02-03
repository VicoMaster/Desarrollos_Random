# coding: utf-8
"""
Aprendizaje de control de sentencias SQL Y conexiones con
DB Sql-Lite desde Python.

Python tiene integrado en sus modulos base el drive y sintaxys de conexion
con SQL-Lite por tratarse de un motor de base de datos que permite el control
de variables dinamicas, por lo que se pueden insertar en campos donde no se requiere especificar un tipo
de variable como otros motores de bases de datos.
"""
import _sqlite3
import os
from pprint import pprint

ruta = os.path.abspath("../chinook.db")
pprint(ruta)
conn = _sqlite3.connect(ruta)
cursor = conn.execute('SELECT * FROM employees')
rows = cursor.fetchall()
pprint(rows)
