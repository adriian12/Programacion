numero_uno = int(input("Introduce el primer numero: "))
numero_dos = int(input("Introduce el segundo numero: "))

if (numero_uno == numero_dos):
    pint ("Los numeros", numero_uno + numero_dos, "son iguales")

else:
    if (numero_uno > numero_dos):
        print ("El numero", numero_uno, "es mayor que", numero_dos)
    
    else:
            print ("El numero", numero_uno, "es menor que", numero_dos)