"""
Python SETS!
* Cada elemento puede ingresar al conjunto solo una vez.
  set('Hello') devuelve el conjunto de cuatro elementos: {'H', 'e', 'l', 'o'}
* No tienen orden definido, cada dato se guarda en un orden Random
  - Metodos para Eliminar elementos del conjunto:
     - discard : En caso de no encontrar el elemento no hara nada
     - remove : En caso de no encontrar el elemento devuelve la excepcion Keyerror
     - pop    : Elimina un elemento aleatorio del conjunto y devuelve su valor, si esta vacio el conjunto,
                devolvera excepcion KeyError.
* Se puede transformar el conjunto usando list()

OPERACIONES:
    * A | B -> A.union (B) : Devuelve un conjunto que es la unión de los conjuntos A y B
    * A | = B -> A. actualización (B) : Agrega todos los elementos de la matriz B al conjunto A
    * A.intersección (B) : Devuelve un conjunto que es la intersección de los conjuntos A y B
    * A & = B -> A.intersection_update (B) : Deja en el conjunto A solo los elementos que pertenecen al conjunto B
    * A - B -> A.diferencia (B) : Devuelve la diferencia establecida de A y B (los elementos incluidos en A ,
                                                                                            pero no incluidos en B ).
    * A - = B -> A.difference_update (B) : Elimina todos los elementos de B del conjunto A
    * A ^ B  -> A.symmetric_di fference (B) : Devuelve la diferencia simétrica de los conjuntos A y B
                                    (los elementos que pertenecen a A o B , pero no a ambos conjuntos simultáneamente).
    * A ^ = B -> A.symmetric_difference_update (B) : Escribe en A la diferencia simétrica de los conjuntos A y B
    * A <= B  -> A.issubset (B) : Devuelve true si A es un subconjunto de B
    * A> = B  -> A.Superset (B) : Devuelve true si B es un subconjunto de A
    * A <B : Equivalente a A <= B and A != B
    * A> B : Equivalente a A >= B and A != B
"""

# coding: utf-8

# Recordaos reglas de Conjuntos "Matematica Basica".
# Las reglas de Operaciones  de conjuntos permitiran tener una variedad de comprobaciones en la informacion obtenida.

conjunto_a = set(input("DIGITE EL CONJUNTO 'A' SEPARADO POR ESPACIOS\nEj: 1 4 6 8\n-> ").split())
print(conjunto_a)
conjunto_b = set(input("DIGITE EL CONJUNTO 'B' -> ").split())
print(conjunto_b)
conjunto_union = conjunto_a.union(conjunto_b)
print("Conjunto Unido: "+str(conjunto_union))
