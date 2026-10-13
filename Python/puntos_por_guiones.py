fecha = input("Pon una fecha con barras o puntos (ej. 13/10/2026 o 13.10.2026)\n> ")
fecha = fecha.replace("/", "-")
fecha = fecha.replace(".", "-")
print(fecha)