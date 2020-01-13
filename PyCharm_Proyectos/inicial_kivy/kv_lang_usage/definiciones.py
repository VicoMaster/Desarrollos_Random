# coding: utf-8
"""
Es un lenguaje de marcación definido por el grupo responsable del framework kivy
Se usa para la Construcción de interfaces Graficas
Es muy similar a lenguajes de marcación como QML, XML, JSON

Objetivo:
Separar el codigo de interface visual del codigo de logica de negocio "python"


Estructura:

<ClassName>:
    LayoutType:
        WidgetType:
            pos: 10, 10
            size: .5, .5

    LayoutType2:
        font_size: 70
        center_x: root.width
        top: root.top -5
        text: "0"


"""
# Mas definiciones Basicas:
"""
1. El codigo JV puede ser abierto y ejecutado automaticamente, el archivo python buscara el archivo kivy
    con el nombre de la clase ejecutada. Lo convertira en minuscula.
        Los archivos kivy deben ir en minuscula:
            Clase Python  ||  Clase Kivy
            MyLittleApp   ||  mylittle.kv
            Principal     ||  principal.kv
2. El codigo KV puede tener solamente una root (raiz)
"""


