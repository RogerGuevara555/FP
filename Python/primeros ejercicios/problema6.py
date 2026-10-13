info = input("Introduce dos números enteros\n")
n, m = info.split(" ")
n = int(n)
m = int(m)

c = round(n/m, 2)
r = n%m

print(f"{n} entre {m} da un cociente {c} y un resto {r}")
