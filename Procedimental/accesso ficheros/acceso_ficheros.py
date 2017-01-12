'''myfile = open('datos_prototipo.txt')				# Open for text input: 'r' is default
linea = myfile.readline()
linea = linea.rstrip()  # quita \n
linea = linea.split()
print(linea)
lineas = myfile.readlines()'''


def toInt(lista):
	listaConvertida = []
	for item in lista:
		if item.isdigit():
			listaConvertida.append( int(item) )
		else:
			listaConvertida.append( item )
	return listaConvertida

listaRegistros = [ linea.rstrip().split() for linea in open('datos_prototipo.txt') ]

 #coleccionPargs = [ int(item) for registro in listaRegistros[1:] for item in registro if item.isdigit()  ]
 #print( coleccionPargs )


listaRegistrosConvertida = list( map(toInt, listaRegistros ) )

print( listaRegistrosConvertida )

listaTuplas = [ tuple(item) for item in listaRegistrosConvertida[1:] ]

print( listaTuplas )
