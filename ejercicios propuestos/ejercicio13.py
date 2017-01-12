precio = int(input("Introduce el precio: "))
if (precio <=20):
    print ("El precio final es: ",precio,"€")
elif (precio >=20 and precio <=100):
    print("El precio final es: ",precio *95 /100,"€")
elif (precio >100):
    print ("El precio final es: ",precio *90 /100,"€")
