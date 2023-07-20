N1 = int(input("Ingrese un número: "))
N2 = int(input("Ingrese otro número: "))

suma = N1 + N2

if suma == 0:
    print("La suma es igual a 0")
elif suma > 0:
    print("La suma:", suma, "es positiva")
else:
    print("La suma:", suma, "es negativa")