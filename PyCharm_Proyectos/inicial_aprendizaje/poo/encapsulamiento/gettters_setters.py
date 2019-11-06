# coding: utf-8
# Metodos getters y setters  - Metodos accesorios
# Son metodos utilizados para la construccion de la interfaz publica.
# "Interfaz de Acceso"
"""
    No es recomendada la utilizacion de metodos Getters y Setters por la comunidad Python
    ya que esto es una forma de trabajar que ademas de verbosa perjudica la lectura del codigo he implica algunas
    limitaciones.
"""


def valida_parametro(diccionario):
    """
        Metodo Estatico que valida si los parametros pasados son de tipo valido
        Recibe un diccionario con la variable como llave  y el tipo de dato como valor
    """
    if not(isinstance(diccionario, dict)):
        raise ValueError("Tipo de dato en parametro Invalido {}".format(diccionario))
    for tupla in diccionario.items():
        if not(isinstance(tupla[0], type(tupla[1]))):  # Si se manda un tipo numero vs boolean lo deja pasar.
            return [False, not(tupla[0])]
    return [True, None]


class ModificarTorta:
    def __init__(self, sabor="Neutra", crema=False, fruta="Fresa"):
        self.sabor = sabor
        self.crema = crema
        self.fruta = fruta
        # Se definen los valores que debe recibir este metodo
        v_parametros = {str(): self.sabor, bool(): self.crema, str(): self.fruta}
        validado = valida_parametro(v_parametros)
        if not (validado[0]):
            raise ValueError("Tipo de dato Invalido...{}".format(validado[1]))

    # GETTERS
    def get_sabor(self):
        return self.sabor

    def get_crema(self):
        return self.crema

    def get_fruta(self):
        return self.fruta

    # SETTERS

    def set_sabor(self, sabor):
        self.sabor = sabor

    def set_crema(self, crema):
        self.crema = crema

    def set_fruta(self, fruta):
        self.fruta = fruta

    def _funcion_secreta(self):
        pass


objeto = ModificarTorta("xxx", False, "asdasd")
