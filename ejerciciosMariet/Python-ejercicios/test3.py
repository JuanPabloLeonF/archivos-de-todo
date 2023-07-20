def nombre_apellido():
    truco = input("Truco: ")
    nombre = input("Ingrese nombre: ")
    apellido = input("Ingrese apellido: ")

def correo_contraseña():
    truco = input("Truco: ")
    email = input("Ingrese email: ")
    contraseña = input("Ingrese contraseña: ")

def usuario():
    tipo_usuario = int(input("Ingrese el tipo de usuario (1 para administrador, 2 para cliente): "))
    if tipo_usuario == 1:
        print("Eres administrador")
    elif tipo_usuario == 2:
        print("Eres cliente")
    else:
        print("Inválido")

opciones = 0

while opciones != 4:
    print("Ingrese una opción del 1 al 4")
    opciones = int(input())
    
    if opciones == 1:
        nombre_apellido()
    elif opciones == 2:
        correo_contraseña()
    elif opciones == 3:
        usuario()
    elif opciones == 4:
        print("Bye bye sapo")
    else:
        print("ERROR, prueba con otra opción")