info = input("Cuantas horas has trabajado y cuanto cobras por ellas?\n")
horas_trabajadas, euros_por_hora = info.split(" ")

horas_trabajadas = float(horas_trabajadas)
euros_por_hora = float(euros_por_hora)

paga = horas_trabajadas*euros_por_hora
print(f'Tu salario es de {paga}$')