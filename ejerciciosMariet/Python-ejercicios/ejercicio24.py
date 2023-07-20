N1 = int(input("Ingrese un número: "))
multiplo = N1 % 6 == 0

print(N1, "es", "Multiplo" if multiplo else "No Multiplo", "de 6")