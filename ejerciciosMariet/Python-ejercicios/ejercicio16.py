v1 = float(input("Velocidad en Km/h del vehículo 1 (más lento): "))
v2 = float(input("Velocidad en Km/h del vehículo 2 (más rápido): "))
distancia = float(input("Introduce la distancia a la que se encuentran situados ambos vehículos: "))

print("Este programa calcula el tiempo que tardan en encontrarse dos vehículos que circulan a distinta velocidad y parten desde una distancia inicial.")

diferenciaVelocidad = v2 - v1
tiempo = distancia / diferenciaVelocidad  # resultado de tiempo en horas

tiempo = tiempo * 60  # convertimos tiempo a minutos

print("Ambos vehículos coincidirán una vez transcurridos", int(tiempo), "minutos.")