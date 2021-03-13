r1=0
r2=0

Pc = int(input("Entre com Potencia contida (kW): "))
M = int(input("Entre com Modulacao (%): "))


r1 = M/100
r2 = Pc*1000
Pb = ((r1**2)*r2)/4
PT = r2 + (Pb*2)

print("Pc= {}".format(Pc))
print("M= {} %".format(M))
print("m= {} ".format(r1))
print("Pbls= {} W".format(Pb))
print("PblI= {} W".format(Pb))
print("Pt= {} W".format(PT))

