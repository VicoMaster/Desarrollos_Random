class Personaje:

    def __init__(self, level=0, clase="Ninguna", raza="Ninguna", sexo="Ninguno", hechizo="PUFF"):
        self.level = level
        self.clase = clase
        self.raza = raza
        self.sexo = sexo
        self.hechizo = hechizo

    def lanzar_hechizo(self):
        pass
        return self.hechizo
