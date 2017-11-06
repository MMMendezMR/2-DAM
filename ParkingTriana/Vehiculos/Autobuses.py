# -*- coding: utf-8 -*-
from Vehiculos import VehiculoGenerico

class Autobus (VehiculoGenerico):
    def __init__(self,numAsientos):
        self.__numAsientos = numAsientos



    def get_NumAsientos(self):
        return self.__numAsientos
    def set_NumAsientos(self, numAsientos):
        self.__numAsientos