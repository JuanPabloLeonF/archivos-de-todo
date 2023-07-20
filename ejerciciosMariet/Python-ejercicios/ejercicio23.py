N1 = int(input("Ingrese un número: "))
divisible = N1 % 14 == 0

print(N1, "es", "Divisible" if divisible else "No divisible", "entre 14")
