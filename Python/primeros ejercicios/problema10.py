PRECIO_PAN = 3.49
DESCUENTO = 0.6

panes = int(input("Cuantos panes viejos compras?\n"))

precio = PRECIO_PAN * panes
precio_con_decuento = precio * DESCUENTO
print(f" Si fueran de hoy te cobraría {round(precio, 2)}$")
print(f"Pero como somos buenos y el pan es de ayer, \nsolo tienes que pagar {round(precio_con_decuento, 2)}$")