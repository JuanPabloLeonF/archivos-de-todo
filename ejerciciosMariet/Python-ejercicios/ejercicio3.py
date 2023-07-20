import math

cateto1 = float(input("Ingrese la longitud del primer cateto: "))
cateto2 = float(input("Ingrese la longitud del segundo cateto: "))

hipotenusa = math.sqrt(cateto1 * cateto1 + cateto2 * cateto2)

print("La hipotenusa es:", hipotenusa)