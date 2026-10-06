PESO_PAYASO = 112
PESO_MUNECA = 75 # en gramos

datos = input("Cuantos payasos y muñecas? ")
payasos, munecas = datos.split(" ")
payasos = int(payasos)
munecas = int(munecas)

peso_total = payasos*PESO_PAYASO + munecas*PESO_MUNECA
print(f"{peso_total}g")