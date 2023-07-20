parcial1 = float(input("Ingrese la calificación del primer parcial: "))
parcial2 = float(input("Ingrese la calificación del segundo parcial: "))
parcial3 = float(input("Ingrese la calificación del tercer parcial: "))
examenFinal = float(input("Ingrese la calificación del examen final: "))
proyectoFinal = float(input("Ingrese la calificación del proyecto final: "))

calificacionFinal = (parcial1 + parcial2 + parcial3) / 3 * 0.55 + examenFinal * 0.3 + proyectoFinal * 0.15

print("La calificación final es:", calificacionFinal)