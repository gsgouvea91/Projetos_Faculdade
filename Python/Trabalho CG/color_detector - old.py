import tkinter as tk
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

#////////////////FUNÇÃO MAIN PEDE///////////////////////
#////////////////O NOME DA IMAGEM E/////////////////////
#////////////////CONVERTE PARA HSV//////////////////////
    

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

            
#////////////////MENU/////////////////////
                
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
                    

#////////////////DETECÇÃO DE CORES E GERAÇÃO DO RESULTADO/////////////////////
    
    def opcao1(self):  #Detecta VERMELHO
        while(True):
           ulCor.maskRes(ulCor.rColor(0,50,50),ulCor1.rColor(10,255,255))

    def opcao2(self): #Detecta VERDE

        def nothing(x):
            pass
        # Create a black image, a window
        img = np.zeros((300,512,3), np.uint8)
        cv2.namedWindow('image')

        # create trackbars for color change
        cv2.createTrackbar('R','image',0,255,nothing)
        cv2.createTrackbar('G','image',0,255,nothing)
        cv2.createTrackbar('B','image',0,255,nothing)

        # create switch for ON/OFF functionality
        switch = '0 : OFF \n1 : ON'
        cv2.createTrackbar(switch, 'image',0,1,nothing)

        while(1):
            cv2.imshow('image',img)
            k = cv2.waitKey(1) & 0xFF
            if k == 27:
                break

            # get current positions of four trackbars
            r = cv2.getTrackbarPos('R','image')
            g = cv2.getTrackbarPos('G','image')
            b = cv2.getTrackbarPos('B','image')
            s = cv2.getTrackbarPos(switch,'image')
            ulCor.maskRes(ulCor.rColor(20,20,20),ulCor1.rColor(r,g,b))
            
            if s == 0:
                img[:] = 0
            else:
                img[:] = [b,g,r]

            cv2.destroyAllWindows()
            

    def opcao3(self): #Detecta AZUL

        ulCor.maskRes(ulCor.rColor(75,100,100),ulCor1.rColor(150,255,255))


#Classe que trata o processamento da máscara e o resultado
class ulColor(object):

    #Range de detecão de Cor
    def rColor(self, h, s, v):
        self.rangeUL=np.array([h,s,v],np.uint8)
        return self.rangeUL

    #Gera a mascara, pede 2 instancias da classe para usar método acima
    def maskRes(self, ulCor, ulCor1):
          
        mask = cv2.inRange(hsv, ulCor, ulCor1)
        res = cv2.bitwise_and(imagem,imagem, mask=mask)

        cv2.imshow('imagem',imagem) 
        cv2.imshow('mask',mask)
        cv2.imshow('RED',res)

        cv2.waitKey(0)
        cv2.destroyAllWindows
        

     

#Instâncias
ulCor = ulColor()
ulCor1 = ulColor()
controle = Controle()
controle.main()
