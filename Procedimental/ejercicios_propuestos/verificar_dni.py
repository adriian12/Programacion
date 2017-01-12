def dni():
    tabla = "TRWAGMYFPDXBNJZSQVHLCKE"
    numeros = "1234567890"
    dni = raw_input("Introduzca el DNI: ")
    respuesta = "No ha introducido un DNI valido"
    if (len(dni) == 9):
        letra = dni[8].upper()
        dni = dni[:8]
        if ( len(dni) == len( [n for n in dni if n in numeros] ) ):
            if tabla[int(dni)%23] == letra:
                respuesta="El DNI introducido es correcto"
    print respuesta
