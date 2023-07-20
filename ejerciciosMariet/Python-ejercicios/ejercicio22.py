num = int(input("Digite el primer número entero: "))
num2 = int(input("Digite el segundo número entero: "))
num3 = int(input("Digite el tercer número entero: "))
num4 = int(input("Digite el cuarto número entero: "))

if num > num2 and num2 > num3 and num3 > num4:
    print("El número mayor es:", num)
elif num < num2 and num2 > num3 and num3 > num4:
    print("El número mayor es:", num2)
elif num < num2 and num2 < num3 and num3 > num4:
    print("El número mayor es:", num3)
elif num2 > num and num > num3 and num3 < num4:
    print("El número mayor es:", num4)