INTERES = 0.04 # 4%

deposito = float(input("Cuanto añades? "))
ahorros_ano1 = deposito + deposito*INTERES
ahorros_ano2 = ahorros_ano1 + ahorros_ano1*INTERES
ahorros_ano3 = ahorros_ano2 + ahorros_ano2*INTERES

print(f"Ahorras el primer ano: {round(ahorros_ano1, 2)}$")
print(f"Ahorras el segundo ano: {round(ahorros_ano2, 2)}$")
print(f"Ahorras el tercer ano: {round(ahorros_ano3, 2)}$")