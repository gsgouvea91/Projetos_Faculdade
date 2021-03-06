import numpy as np
from scipy.stats import mode
import cv2
import os
import csv
import time

class Controle:
    path = 'C:/Users/breno/Documents/Python Codes/reconheceObjetosIA'
    os.chdir(path)
    titulo = time.strftime("%Y-%m-%d") + '_' + time.strftime("%H-%M-%S")
    saida = open('face_recon_'+titulo+'.csv', 'w')
    export = csv.writer(saida, quoting=csv.QUOTE_NONNUMERIC) 
    file_list = []

    for file in os.listdir(path):
        if file.endswith(".jpg"):
            file_list.append(file)
    
    def menu(self):
        txt = """
        Opções:
            1-Reconhecimento por camera;
            2-Reconhecimento por foto;
            3-<alguma coisa>
            4-sair;
        Digite a sua opção:1
        """
        opcao = int(input(txt))
        return opcao

    def main(self):
        opcoes = {1:self.opcao1, 2:self.opcao2, 3:self.opcao3}
        while True:
            opcao = self.menu()
            if opcao in opcoes:
                opcoes[opcao]()
            else:
                if opcao == 4:
                  break
                else:
                  print("Opção inválida")
                  
    def opcao1(self):
        #carrega um classificador de um arquivo
        aux = 0
        aux1= 1
        #Para cada arquivo na lista faça:
        #Estabelece os classificadores de face
        face_cascade = cv2.CascadeClassifier('C:/Users/breno/Documents/Python Codes/reconheceObjetosIA/haarcascades/haarcascade_frontalface_default.xml')
        face_alt_cascade = cv2.CascadeClassifier('C:/Users/breno/Documents/Python Codes/reconheceObjetosIA/haarcascades/haarcascade_frontalface_alt.xml')
        face_alt2_cascade = cv2.CascadeClassifier('C:/Users/breno/Documents/Python Codes/reconheceObjetosIA/haarcascades/haarcascade_frontalface_alt2.xml')
        face_alt_tree_cascade = cv2.CascadeClassifier('C:/Users/breno/Documents/Python Codes/reconheceObjetosIA/haarcascades/haarcascade_frontalface_alt_tree.xml')

        #carrega um vídeo
        print("[INFO] Inicializando webcam... ")
        cap = cv2.VideoCapture(0)
        cap.set(3, 800) # Set largura
        cap.set(4, 600) # Set altura

        while(not cv2.waitKey(1) & 0xFF == ord('q')):
            #carrega o frame de vídeo
            frameExiste, frame = cap.read()
            
            #chegou ao último frame ou houve erro? então sair!
            if(frameExiste == False):
                print("Algo de errado não está certo com a câmera!!!")
                cap.release()
                return
            
            #somente funciona com tons de cinza
            gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
            #Faz as classificações
            faces = face_cascade.detectMultiScale(gray, 1.1, 5, minSize=(50,50))
            faces2 = face_alt_cascade.detectMultiScale(gray, 1.1, 5, minSize=(50,50))
            faces3 = face_alt2_cascade.detectMultiScale(gray, 1.1, 5, minSize=(50,50))
            faces4 = face_alt_tree_cascade.detectMultiScale(gray, 1.1, 5, minSize=(50,50))

            #Organiza numa as classificações numa lista para loop
            classifiers = [faces, faces2, faces3, faces4]

            for (classifier) in classifiers:
                test = format(len(classifier))
                aux1 = int(test)
                print("Faces:",test)
                if aux1 > aux:
                   aux = aux1
                   print ("Melhor Resultado:",aux)
                   maior = (classifier)
				   
                       
            #para cada face detectada
            for (x, y, w, h) in faces:
                #desenhe um retângulo (imagem, posição inicial, final, cor, espessura)
                frame = cv2.rectangle(frame,(x,y),(x+w,y+h),(255,0,0), 2)
                #time.sleep(0.3)
            #visualizar o detectado: 
            cv2.imshow("deteccao", frame)
            
        #Desliga webcam
        cap.release()
        #Destroi janela
        cv2.destroyAllWindows()

    def opcao2(self):    
        for file in controle.file_list:
            print("[INFO] Lendo as imagens na pasta padrão... ")
            aux = 0
            aux1= 1
            #Para cada arquivo na lista faça:
            #Estabelece os classificadores de face
            face_cascade = cv2.CascadeClassifier('C:/Users/breno/Documents/Python Codes/reconheceObjetosIA/haarcascades/haarcascade_frontalface_default.xml')
            face_alt_cascade = cv2.CascadeClassifier('C:/Users/breno/Documents/Python Codes/reconheceObjetosIA/haarcascades/haarcascade_frontalface_alt.xml')
            face_alt2_cascade = cv2.CascadeClassifier('C:/Users/breno/Documents/Python Codes/reconheceObjetosIA/haarcascades/haarcascade_frontalface_alt2.xml')
            face_alt_tree_cascade = cv2.CascadeClassifier('C:/Users/breno/Documents/Python Codes/reconheceObjetosIA/haarcascades/haarcascade_frontalface_alt_tree.xml')

            #Lê a imagem e converte para escala de cinza
            img = cv2.imread(file)
            gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
			
            #Faz as classificações
            faces = face_cascade.detectMultiScale(gray, 1.1, 5, minSize=(30,30))
            faces2 = face_alt_cascade.detectMultiScale(gray, 1.1, 5, minSize=(30,30))
            faces3 = face_alt2_cascade.detectMultiScale(gray, 1.1, 5, minSize=(30,30))
            faces4 = face_alt_tree_cascade.detectMultiScale(gray, 1.1, 5, minSize=(30,30))

            faces5 = face_cascade.detectMultiScale(gray, 1.1, 5, minSize=(20,20))
            faces6 = face_alt_cascade.detectMultiScale(gray, 1.1, 5, minSize=(20,20))
            faces7 = face_alt2_cascade.detectMultiScale(gray, 1.1, 5, minSize=(20,20))
            faces8 = face_alt_tree_cascade.detectMultiScale(gray, 1.1, 5, minSize=(20,20))

            #Organiza numa as classificações numa lista para loop
            classifiers = [faces, faces2, faces3, faces4,faces5, faces6, faces7, faces8]

            for (classifier) in classifiers:
                test = format(len(classifier))
                aux1 = int(test)
                print("Faces:",test)
                if aux1 > aux:
                   aux = aux1
                   print ("Melhor Resultado:",aux)
                   maior = (classifier)
                   
            # Coloca os quadrados nas faces
            for (x,y,w,h) in maior:
                cv2.rectangle(img,(x,y),(x+w,y+h),(255,0,0),2)
                roi_gray = gray[y:y+h, x:x+w]
                roi_color = img[y:y+h, x:x+w]
                          
            #Exibe as imagens com retangulos. Para exibir, descomente as três linhas abaixo
            cv2.imshow('img',img)
            print("Para a imagem "+file+", foram encontradas {0} faces!".format(len(maior)))
            cv2.waitKey(0)
            cv2.destroyAllWindows()

            # Exibe a média, variância e moda de cada classificador
            encontrados = []

            for (classifier) in classifiers:
                x = format(len(classifier))
                encontrados.append(x)

            encontrados = np.asarray(encontrados, dtype = np.float16)
            media = np.mean(encontrados)
            variancia = np.var(encontrados)
            moda = float(mode(encontrados)[0])

            if file == controle.file_list[0]:
                controle.export.writerow(["imagem","media","variancia","moda"])
                controle.export.writerow([file, media, variancia, moda])
            else:
                controle.export.writerow([file, media, variancia, moda])

        cv2.destroyAllWindows()
        controle.saida.close()
        
    def opcao3(self):
        pic_num=0
         """
        #Tratamento imagens negativas:
        for file in controle.file_list:
            img = cv2.imread(file)
            gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
            resized_img = cv2.resize(gray, (400, 400))
            cv2.imwrite("negative" + str(pic_num)+ ".jpg", resized_img)
            print("Echo!")
            pic_num+=1
        """
        
        for file in controle.file_list:
            print("[INFO] Lendo as imagens na pasta padrão... ")
            aux = 0
            aux1= 1
                 
            #Para cada arquivo na lista faça:
            #Estabelece os classificadores de face
            face_cascade = cv2.CascadeClassifier('C:/Users/breno/Documents/Python Codes/reconheceObjetosIA/haarcascades/haarcascade_frontalface_default.xml')
            face_alt_cascade = cv2.CascadeClassifier('C:/Users/breno/Documents/Python Codes/reconheceObjetosIA/haarcascades/haarcascade_frontalface_alt.xml')
            face_alt2_cascade = cv2.CascadeClassifier('C:/Users/breno/Documents/Python Codes/reconheceObjetosIA/haarcascades/haarcascade_frontalface_alt2.xml')
            face_alt_tree_cascade = cv2.CascadeClassifier('C:/Users/breno/Documents/Python Codes/reconheceObjetosIA/haarcascades/haarcascade_frontalface_alt_tree.xml')

            #Lê a imagem e converte para escala de cinza
            img = cv2.imread(file)
            gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)

            #Faz as classificações
            faces = face_cascade.detectMultiScale(gray, 1.1, 5, minSize=(30,30))
            faces2 = face_alt_cascade.detectMultiScale(gray, 1.1, 5, minSize=(30,30))
            faces3 = face_alt2_cascade.detectMultiScale(gray, 1.1, 5, minSize=(30,30))
            faces4 = face_alt_tree_cascade.detectMultiScale(gray, 1.1, 5, minSize=(30,30))

            #Organiza numa as classificações numa lista para loop
            classifiers = [faces, faces2, faces3, faces4]

            for (classifier) in classifiers:
                test = format(len(classifier))
                aux1 = int(test)
                print("Faces:",test)
                if aux1 > aux:
                   aux = aux1
                   print ("Melhor Resultado:",aux)
                   maior = (classifier)

            # Coloca os quadrados nas faces
            for (x,y,w,h) in maior:
                cv2.rectangle(img,(x,y),(x+w,y+h),(255,0,0),2)
                roi_gray = gray[y:y+h, x:x+w]
                roi_color = img[y:y+h, x:x+w]
            """
            #Tratamento para imagens positivas:
            for (x,y,w,h) in maior:
                temp = cv2.rectangle(img,(x,y),(x+w,y+h),(255,0,0),2)
                roi_gray = gray[y:y+h, x:x+w]
				roi_color = temp[y:y+h, x:x+w]
				print("Para a imagem "+file+", foram encontradas {0} faces!".format(len(maior)))
				cv2.resize(roi_gray, (150,150))
				cv2.imwrite("saida" + str(pic_num)+ ".jpg", roi_gray)
				print("Echo! ")
				cv2.imshow('img',roi_gray)
				pic_num += 1
            """
            
            #Exibe as imagens com retangulos. Para exibir, descomente as três linhas abaixo
            cv2.imshow('img',img)
            print("Para a imagem "+file+", foram encontradas {0} faces!".format(len(maior)))
            cv2.waitKey(0)
            cv2.destroyAllWindows()

            # Exibe a média, variância e moda de cada classificador
            encontrados = []

            for (classifier) in classifiers:
                x = format(len(classifier))
                encontrados.append(x)
            
            encontrados = np.asarray(encontrados, dtype = np.float16)
            media = np.mean(encontrados)
            variancia = np.var(encontrados)
            moda = float(mode(encontrados)[0])

            if file == controle.file_list[0]:
                controle.export.writerow(["imagem","media","variancia","moda"])
                controle.export.writerow([file, media, variancia, moda])
            else:
                controle.export.writerow([file, media, variancia, moda])

        cv2.destroyAllWindows()
       
controle = Controle()
controle.main()
