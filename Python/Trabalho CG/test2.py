import numpy as np
import cv2

# load image and set the bounds
img = cv2.imread('A.jpg')
lower =(255, 55, 0) # lower bound for each channel
upper = (255, 255, 10) # upper bound for each channel

# create the mask and use it to change the colors
mask = cv2.inRange(img, lower, upper)
img[mask != 0] = [0,0,255]

# display it
cv2.imshow("frame", img)
cv2.waitKey(0)
