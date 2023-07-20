minutos = int(input("Ingrese una cantidad de minutos: "))

horas = minutos // 60
minutosRestantes = minutos % 60

print(minutos, "minutos equivalen a", horas, "horas y", minutosRestantes, "minutos")