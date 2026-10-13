info = input("Escribe dos puntos del espacio separando los mismos con (|) y sus coordenadas con (,) (ej. 2,5|3,4) \n> ")

pto1, pto2 = info.split("|")
x1, y1 = pto1.split(",")
x2, y2 = pto2.split(",")

x1 = float(x1)
y1 = float(y1)
x2 = float(x2)
y2 = float(y2)

d = ((x2-x1)**2+(y2-y1)**2)**(1/2)
print(f"La distancia entre ellos es de {round(d, 2)}u")