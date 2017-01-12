letras = 'TRWAGMYFPDXBNJZSQVHLCKE'

dni = int(input('Dame el numero de tu DNI:'))
resto = dni % 23

print ('La letra de tu DNI es: ' , (letras[resto]))
