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