num1 = int(input("Introduzca el número de al menos 2 cifras: "))

invertido = 0

while num1 > 0:
    resto = num1 % 10
    invertido = invertido * 10 + resto
    num1 //= 10

print("El número invertido es", invertido)