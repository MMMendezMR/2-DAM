# -*- coding: utf-8 -*-
#Hacer un programa para gestionar un cine con una sola sala. Cada entrada de cine tendrá un número identificativo,
#  precio, número de la fila y de localidad.

#Se darán al usuario las siguientes opciones en un menu:
#- Ver cartelera que mostrará el título de la película proyectada ese día.
#- Comprar entrada (una o varias) comprobando si una localidad está vendida y si quedan localidades libres.
#- Mostrar precio total a pagar.
#- Calcular ganancias totales del día.

from DOM import Cine


"""class Cine (object):
    def __init__(self, nEntradas, precioEntrada, total, libre):
        self.__nEntradas = nEntradas
        self.__precioEntrada = precioEntrada
        self.__total = total
        self.__libre = libre

    def set_nEntradas(self, nEntradas):
        self.__nEntradas = nEntradas

    def set_precioEntrada(self, precioEntrada):
        self.__precioEntrada = precioEntrada

    def set_total(self, total):
        self.__total = total

    def set_libre(self, libre):
        self.__libre = libre

    def get_nEntradas(self):
        return self.__nEntradas

    def get_precioEntrada(self):
        return self.__precioEntrada

    def get_total(self):
        return self.__total

    def get_libre(self):
        return self.__libre

    def __str__(self):
        return "%s" % self.__precioEntrada



class Entrada(Cine):
    def __init__(self, id, precio, nFila, nLocalidad):
        self.__id = id
        self.__precio = precio
        self.__nFila = nFila
        self.__nLocalidad = nLocalidad



    def set_id(self, id):
        self.__id = id

    def set_precio(self, precio):
        self.__precio

    def set_nFila(self, nFila):
        self.__nFila

    def set_nLocalidad(self, nLocalidad):
        self.__nLocalidad

    def get_id(self):
        return self.__id

    def get_precio(self):
        return self.__precio

    def get_nFila(self):
        return self.__nFila

    def get_nLocalidad(self):
        return self.__nLocalidad
"""




#Por comodidad instanciaremos una sala de cine por defecto
cine = Cine(10,5,0,libre=bool)

#--------------Menú--------------
def imprimirMenu():
    print 'Ver cartelera----------1'
    print 'Comprar entrada(s)-----2'
    print 'Precio total-----------3'
    print 'Ganancias de hoy-------4'
#--------------Cartelera--------------
def verCartelera():
    print 'Hoy en proyección: Monster House'


#--------------Opciones usuario--------------
imprimirMenu()
eleccion = input('Elije una opción')
while eleccion == 1:
    print ''
    verCartelera()
    print ''
    imprimirMenu()
    eleccion = input('Elije una opción')

while eleccion == 2:
    print ''
    if cine.get_nEntradas() > 0:
        numEnt = input('¿Cúantas entradas desea?')
        cine.set_total(cine.get_total()+ (numEnt * cine.get_precioEntrada()))
        cine.set_nEntradas(cine.get_nEntradas() - numEnt)
    else:
        print 'Entradas agotadas'
    print 'Has comprado:'
    print numEnt
    print ''
    imprimirMenu()
    eleccion = input('Elije una opción')

while eleccion == 3:
    print ''
    print 'Precio de su compra:'
    print numEnt * cine.get_precioEntrada()
    print ''
    imprimirMenu()
    eleccion = input('Elije una opción')

while eleccion == 4:
    print ''
    print "Las ganancias de hoy son de:"
    print cine.get_total()
    print ''
    imprimirMenu()
    eleccion = input('Elije una opción')
