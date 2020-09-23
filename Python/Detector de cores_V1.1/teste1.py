import numpy as np
import tkinter
import cv2
import os

class Display:

    def __init__(self, window, window_title):
        self.window = window
        self.window.title = (window_title)
        self.window.mainloop()

        self.canvas = tkinter.Canvas(window)

    def showRes(self,title,cont):
        return cv2.imshow(title, cont)

class ulColor(object):

    global img1
    global hsv
    global res

    def __init__(self, img):
        self.file = os.path.realpath(img)
        self.img1 = cv2.imread(self.file)
        self.hsv = cv2.cvtColor(img1, cv2.COLOR_BGR2HSV)

    # Range de detecão de Cor
    def rColor(self, h, s, v):
        self.rangeUL = np.array([h, s, v], np.uint8)
        return self.rangeUL

    # Gera a mascara, pede 2 instancias da classe para usar método acima
    def maskRes(self, ulCor, ulCor1):
        mask = cv2.inRange(hsv, ulCor, ulCor1)
        res = cv2.bitwise_and(img1, img1, mask=mask)

ulCor = ulColor('A.jpg')
display = Display(tkinter.Tk(),"Tkinter and OpenCV")