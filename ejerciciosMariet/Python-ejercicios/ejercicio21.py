Modelo = input("Introduzca el Modelo: ")
Marca = input("Introduzca la Marca: ")

print("Antes del intercambio, Modelo es igual a", Modelo, "y Marca es igual a", Marca)

X = Modelo
Modelo = Marca
Marca = X

print("Después del intercambio, Marca es igual a", Marca, "y Modelo es igual a", Modelo)