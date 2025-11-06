#------------------------------------------------1 clase------------------------------------------------------

class candidato:
    def _init_(self,Nombre, Partido, Nacionalidad):
        self.Nombre=Nombre
        self.Partido=Partido
        self.nacionaliodad=Nacionalidad
        
    def mostrar_informacion(self):
        print(f"Candidato:{self.Nombre}\n Partido:{self.Partido}\n Nacionalidad:{self.nacionaliodad}")




#-----------------------------2 clase--------------------------------------------------------
class Votacion:
    def __init__(self, Nombre, Edad, Nacionalidad):
        self.Nombre = Nombre
        self.Edad = Edad
        self.Nacionalidad = Nacionalidad

    def mostar_info(self):
        print(f"Nombre: {self.Nombre}")
        print(f"Edad: {self.Edad}")
        print(f"Nacionalidad: {self.Nacionalidad}")

        if self.Edad >= 18 and "colombia" in self.Nacionalidad.lower():
            print("Puedes votar")
        else:
            print("No puedes votar")

#-----------------------------CANDIDATOS--------------------------------------------------------------------

A= {
    "Nombre": "javier",
    "Partido":"azul",
    "Nacionalidad":"Palmira"
} 
B= {
    "Nombre": "Tamayo",
    "Partido":"rojo",
    "Nacionalidad":"Cali"
} 

C= {
    "Nombre": "sergio",
    "Partido":"verde",
    "Nacionalidad":"Jamundi"
} 

#--------------------------------CODIGO CON INTERACION----------------------------------------------------

print("----------------------------------------------------------------------------")

print("-----------------------VIENVENIDO A TU VOTO DE CONFIANZA -----------------------------------------------------")

Nombre = input("Ingresa tu nombre: ")
Edad = int(input("Ingresa tu edad: "))
Nacionalidad = input("Ingresa tu nacionalidad: ")


print("----------------------------------------------------------------------------")

persona = Votacion(Nombre, Edad, Nacionalidad)
persona.mostar_info()

print("----------------------------------------------------------------------------")

while Edad >= 18 and Nacionalidad.lower() == "colombia":
    print(f"candidatos:\n A:{A}\n B:{B}\n C:{C}")

    voto = input("Por quién votarás: ")

    Historial=[Nombre, Edad, Nacionalidad, voto]
    print(Historial)


    print("----------------------------------------------------------------------------")


    if voto== "A".lower():
        print("votaste por")
        print(A["Nombre"] , A["Partido"], A["Nacionalidad"])
        break

    elif voto== "B".lower():
        print("Votaste por ")
        print(B["Nombre"], B["Partido"], B["Nacionalidad"])
        break
    elif voto== "C".lower():
        print("Votaste por ")
        print(C["Nombre"] , C["Partido"],C["Nacionalidad"])
        break
    else:
        print(f"Candidato no disponible Disponibles (Escribelo en minuscula ):\n {A}\n, {B}\n, {C}\n")
