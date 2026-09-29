info = input("Introduce: inversión, interés porcentual anual y número de años\n>>")
inversion, interes, años = info.split()

inversion = float(inversion)
interes = float(interes)
años = float(años)

capital = inversion*(1+interes*años)
print(round(capital, 2))