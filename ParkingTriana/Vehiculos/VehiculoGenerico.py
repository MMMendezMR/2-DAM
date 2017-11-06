# -*- coding: utf-8 -*-
class VehiculoGenerico(object):
    def __init__(self, matricula, marca, tiempo):
        self.__matricula = matricula
        self.__marca = marca
        self.__tiempo = tiempo



    def get_Matricula(self):
        return self.__matricula
    def set_Matricula(self, matricula):
        self.__matricula

    def get_Marca(self):
        return self.__marca
    def set_Marca(self, marca):
        self.__marca

    def get_Tiempo(self):
        return self.__tiempo
    def set_Tiempo(self, tiempo):
        self.__tiempo



    def precioAPagar(self,tiempo):
        precioAPagar = tiempo * 0.04
        return 'El precio a pagar es de: %s €'+ precioAPagar