"""
    En Python, cada uno de nuestros archivos .py se denominan módulos.

    Nomenclatura Clases:
    CamelCase es la practica de escribir palabras o frases compuestas
    de tal forma que cada palabra comience con letra mayuscula
    * No iniciar con numeros, espacios o signos de puntuacion

    MiClase():
    ConexionBDMySQL():
    LeJSON()
    *Las abreviaciones se colocan en Mayuscula

    haz_esto()  <- funcion
    HazEsto() <- Clase

    * Instancia y Objetos son Sinonimos.
    Instancia: Es cada uno de los objetos creados en la ejecucion de un programa.


    Clase: es el proyecto de un objeto
    Objeto: es la ejecucion del codigo de una clase
    Instancia: es sinonimo de objeto

    * En python todoo objeto posee un ID compuesto por un numero entero no negativo
    para ser diferenciadas


    ***  MIEMBROS DE CLASE ***
    PROPIEDADES: Son variables que almacenan caracteristicas
    METODOS: son las funciones, las acciones que el proyecto pueda realizar.

    cuad = Cuadrado()
    cuad.l = 10
    cuad.a = 10
    area = cuad.area()

    METODO CONSTRUCTOR:   no es necesario declarar este metodo
    El parametro self recibe la instancia
    class Persona:
        def __init__(self):
            self.a = 0
            self.b = 0


    obj.miembro = 0  # Nuevo miembro


    ADICIONAR UNA NUEVA FUNCION A LA INSTANCIA:
    def funcion():
        pass

    obj.new_funcion = funcion  # Sin parentesis para manejar la funcion en memoria y no la ejecucion

    *** OBJETOS CLASE ***
    Clase.__clase__
    Clase.__name__
"""