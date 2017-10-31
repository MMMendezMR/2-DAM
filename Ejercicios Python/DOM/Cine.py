# -*- coding: utf-8 -*-

class Cine (object):
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
