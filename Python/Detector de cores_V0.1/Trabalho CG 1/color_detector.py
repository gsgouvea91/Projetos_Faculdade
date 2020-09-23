import os
import numpy as np
import cv2

class Controle:
    
    def menu(self):
        txt = """
        ESCOLHA A COR A SER DETECTADA:
            1-Vermelho
            2-Verde
            3-Azul
            4-sair
        Digite a sua opção
        """
        opcao = int(input(txt))
        return opcao

    def main(self):
        while True:  #Input e procura do nome da imagem (precisa estar na mesa pasta que o .py)
            img = input("Digite o nome da imagem com a extensao EX: img.ext : ")
            file = os.path.realpath(img)
            
            global imagem #variável GLOBAL
            imagem = cv2.imread(file) #Lê A imagem
            
            #Converte de BGR para HSV
            try:
                global hsv #variável GLOBAL
                hsv = cv2.cvtColor(imagem,cv2.COLOR_BGR2HSV) #Conversão BGR para HSV
                break
            except:
                print("Imagem nao encontrada")
                
        #Menu de escolha de cor pra achar
        opcoes = {1:self.opcao1, 2:self.opcao2, 3:self.opcao3}
        while True:
            opcao = self.menu()
            if opcao in opcoes:
                opcoes[opcao]()
                break
            else:
                if opcao == 4:
                    break
                else:
                    print("Opção inválida")



    def opcao1(self):  #Detecta VERMELHO

        #Ranges de detecão Vermelho
        lower_red = np.array([0,50,50],np.uint8)
        upper_red = np.array([10,255,255],np.uint8)

        #Gera a mascara
        mask = cv2.inRange(hsv, lower_red, upper_red)
        res = cv2.bitwise_and(imagem,imagem, mask=mask)
            
        cv2.imshow('imagem',imagem) 
        cv2.imshow('mask',mask)
        cv2.imshow('RED',res)

        cv2.waitKey(0)
        cv2.destroyAllWindows


    def opcao2(self): #Detecta VERDE

        #Ranges de detecão Verde
        lower_green=np.array([20,20,20],np.uint8)             
        upper_green=np.array([80,255,255],np.uint8)


        #Gera a mascara
        mask = cv2.inRange(hsv, lower_green, upper_green)
        res = cv2.bitwise_and(imagem,imagem, mask=mask)

        cv2.imshow('imagem',imagem) 
        cv2.imshow('mask',mask)
        cv2.imshow('RED',res)
        
        cv2.waitKey(0)
        cv2.destroyAllWindows

    def opcao3(self): #Detecta AZUL
        
        #Ranges de detecão Azul
        lower_blue = np.array([75,100,100],np.uint8)
        upper_blue = np.array([150,255,255],np.uint8)

        #Gera a mascara
        mask = cv2.inRange(hsv, lower_blue, upper_blue)
        res = cv2.bitwise_and(imagem,imagem, mask=mask)

        cv2.imshow('imagem',imagem) 
        cv2.imshow('mask',mask)
        cv2.imshow('RED',res)

        cv2.waitKey(0)
        cv2.destroyAllWindows


controle = Controle()
controle.main()
