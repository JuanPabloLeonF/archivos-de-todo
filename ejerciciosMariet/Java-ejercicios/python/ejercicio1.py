# la aerolinea Avianca requiere crear un programa donde se guarden los datos, de los pasajeros
# indicando nombre,cedula, y destino, utilizando tuplas, ademas que en otra tupla se guardaran los
# datos de ciudad y pais, se debe mostrar un menu que tenga las siguientes opciones:
# 1.adicionar pasajeros a la lista de viajeros
# 2.adicionar ciudades en la lista de ciudades
# 3.consultar el documento de identifdad del pasajero y mostrar la ciudad a la que viaja
# 4. consultar el destino y la cantidad de pasejors que viajan a ese destino
# 5. consultar un pais y mostrar cuantos pasajeros viajan a ese pais

nombre = ""
apellido = ""
cedula = ""
destino = ""

ciudad = ""
pais = ""
contadorPasajeros = 0

inputMenu = 0

correrMenu = True

pasajero = []
ciudades = []
paises = []
guardarCiudad = (ciudades)
guardarPasajerosList = (pasajero)




##################MENU#######################
while (correrMenu == True):

    print("##################MENU#######################")
    print("1.Agregar pasajero")
    print("2.Agregar ciudades")
    print("3.Consultar la CC y ciudad a la que viaja")
    print("4.Consultar destino y cantidad de pasajeros hacia el destino que se dirigen alli")
    print("5.consultar un pais y el numero de pasajeros que se dirigen alli")
    inputMenu = int(input("Digite la opcion que desee: "))


    if(inputMenu == 1):
        nombre = str(input("Digite el nombre: "))
        apellido = str(input("Digite el apellido: "))
        cedula = str(input("Digite el numero de identidad: "))
        destino = str(input("Digite el destino: "))
        pasajero.append(nombre)
        pasajero.append(apellido)
        pasajero.append(cedula)
        pasajero.append(destino)
        guardarPasajerosList.append(pasajero)
        print("Se ha aregado un pasajero exitosamente")
        print(guardarPasajerosList)

    elif(inputMenu == 2):
        ciudad = str(input("Digite la ciudad: "))
        ciudades.append(ciudad)
        print("Se ha aregado una ciudad exitosamente")
        print(ciudades)
    elif(inputMenu == 3):

        buscar = str(input("nombre del pasajero que desea buscar: "))
        i = 0
    elif(inputMenu == 4):
        buscarDestino = str(input("Digite nombre del destino al que deseas consultar: "))
        
        for i  in range(len(guardarPasajerosList)):
        
            print(guardarPasajerosList[i])
            if(buscarDestino):
                contadorPasajeros += 1

        print(f"El destino es: {buscarDestino} y la Cantidad de pasajeros {contadorPasajeros}")
    else: 
        print("No proporcionaste un valor adecuado de los disponibles en el menu")