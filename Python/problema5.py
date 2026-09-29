info = input("Introduce tu peso y estatura (kg m)\n")
peso, altura = info.split(" ")

peso = float(peso)
altura = float(altura)
masa_corporal = peso/(altura**2)
masa_redondeada = round(masa_corporal, 2)

print(f'Tu índice de masa corporal es de {masa_redondeada}')