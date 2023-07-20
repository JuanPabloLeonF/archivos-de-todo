sueldoBase = float(input("Ingrese el sueldo base del vendedor: "))
venta1 = float(input("Ingrese el valor de la primera venta: "))
venta2 = float(input("Ingrese el valor de la segunda venta: "))
venta3 = float(input("Ingrese el valor de la tercera venta: "))

comisionTotal = (venta1 + venta2 + venta3) * 0.1
totalRecibido = sueldoBase + comisionTotal

print("El dinero a obtener por comisiones es:", comisionTotal)
print("El total que recibió en el mes es:", totalRecibido)