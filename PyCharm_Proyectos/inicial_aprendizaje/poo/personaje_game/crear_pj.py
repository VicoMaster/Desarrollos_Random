# Este es el Metodo Main

from poo.personaje_game.pj_base import Personaje

guerrero = Personaje()


maga = Personaje()

guerrero.level = 1
guerrero.clase = "Guerrero"
guerrero.raza = "Gnomo"
guerrero.sexo = "M"
guerrero.hechizo = "GRITO DE BATALLA"

maga.level = 1
maga.clase = "Maga"
maga.raza = "Enana"
maga.sexo = "F"
maga.hechizo = "DESCARGA DE ESCARCHA"

print("Nuevo personaje: " + guerrero.clase +
      " de raza "+guerrero.raza+" de Nivel "+str(guerrero.level)+" del Sexo "+guerrero.sexo +
      " Lanzo el Hechizo: "+guerrero.lanzar_hechizo())
print("Nuevo personaje: " + maga.clase +
      " de raza "+maga.raza+" de Nivel "+str(maga.level)+" del Sexo "+maga.sexo +
      " Lanzo el Hechizo: "+maga.lanzar_hechizo())
print(Personaje)
