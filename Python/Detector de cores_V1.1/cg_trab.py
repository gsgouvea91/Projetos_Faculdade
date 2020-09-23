import cv2
imagem = cv2.imread("lampada.png")
cv2.imshow("Original", imagem);
cv2.waitKey(0)

cv2.destroyAllWindows()

gray = cv2.cvtColor(imagem,cv2.COLOR_BGR2GRAY)

cv2.imwrite('graytest.png',gray)
