r1=0
r2=0

B = int(input("Entre com B(Amplitude Portadora): "))
A = int(input("Entre com A(Amplitude Audio): "))
print("\n===VERIFIQUE SE FREQUENCIA Fa É A MESMA QUE Fc (Hz=Hz,MHz=MHz e etc)===")
print("==================E FACA CONVERSAO SE FOR PRECISO======================")
Fa = float(input("Entre com Fa Audio: "))
Fc = float(input("Entre com Fc Portadora: "))
Fq = input("Qual a unidade de Fc? (Hz,Mhz,Khz): ")

m = B/A
M = m * 100
r1 = Fc - Fa
r2 = Fc + Fa

print("m = {}".format(m))
print("M = {} %".format(M))
print("Fc - Fa: {}{}".format(r1,Fq))
print("FP: {}{}".format(Fc,Fq))
print("Fc + Fa: {}{}".format(r2,Fq))

