def finder (w):
        c=0
        lib={"a":1,"e":2,"i":3,"o":4,"u":5}
        for letter in w:
                if letter in lib:
                        print(letter)
                        c=c+1
                        
        print("Há",c,"vogais nesta palavra")
                                     
finder("Pedro Miguel Da Silva Joaquim")
