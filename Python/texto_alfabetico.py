import os

pontuacao = '''!()-[]{};:''"\,<>./?@#$%^&*_~'''
gA = {"á","à","ã","â"}
gE = {"é","è","ê"}
gI = {"í","ì","î"}
gO = {"ó","ò","õ","ô"}
gU = {"ú","ù","û"}
numb={"0","1","2","3","4","5","6","7","8","9"}

sem_p=""
#Abrir arquivo
arquivo = input("Digite nome do aqruivo txt: ")
file = arquivo +".txt"
a = open(file, 'r+')

#Ler conteudo
conteudoArquivo = a.read()

for char in conteudoArquivo: 
  if char in gA:
    char = "a"
  if char in gE:
    char = "e"
  if char in gI:
    char = "i"
  if char in gO:
    char = "o"
  if char in gU:
    char = "u" 
  if char in numb:
    char = ""
  if char not in pontuacao: 
    sem_p = (sem_p+char)


res = input("Digite nome para o aqruivo txt: ")
file = res +".txt"

with open(file, "w") as a: 
  for word in sorted(sem_p.lower().split()):  
      a.write(word + " ")
