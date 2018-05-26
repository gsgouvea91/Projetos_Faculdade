%include "io.inc"
section .data
    buzz: db "Buzz" ,10 ,0
    fizz: db "Fizz" ,10 ,0
    fizzbuzz: db "FizzBuzz" ,10 ,0
    msg: db "%d",10,0
section .text
global CMAIN
extern printf
CMAIN:
    mov ebp, esp; for correct debugging

    mov ebx, 1
     while:
        cmp ebx ,101
        je end_while
        
        mov edx, 0      ;inicializo edx com 0 para dizer que edx guardará o resto da divisao
        mov ecx, 2
        mov eax, ebx    ;joga valor do ebx no eax pra fazer a divisao
        div ecx         ;eax = eax/ecx
        
        cmp edx,0
        je  printBuzz
        jmp printFizz       
            
            printBuzz:
                     mov edx, 0      ;inicializo edx com 0 para dizer que edx guardará o resto da divisao
                     mov ecx, 3
                     mov eax, ebx    ;joga valor do ebx no eax pra fazer a divisao
                     div ecx         ;eax = eax/ecx
                        
                     cmp edx,0
                     je  surefizzBuzz 
                     jmp sureBuzz
                     
              surefizzBuzz:         
                push fizzbuzz
                call printf
                add esp,4
                jmp end_print 
                   
              sureBuzz:        
                push buzz
                call printf
                add esp,4
                jmp end_print
            
            printFizz:
            
                     mov edx, 0      ;inicializo edx com 0 para dizer que edx guardará o resto da divisao
                     mov ecx, 3
                     mov eax, ebx    ;joga valor do ebx no eax pra fazer a divisao
                     div ecx         ;eax = eax/ecx
                     cmp edx,0
                     je  surefizz 
                     jmp sureNum   
                
                surefizz:       
                push ebx
                push fizz
                call printf
                add esp,8
                jmp end_print
                
                sureNum: 
                push ebx
                push msg
                call printf
                add esp,8
                jmp end_print
               
        end_print:               
        inc ebx
        jmp while
        
     end_while:
    
    xor eax , eax
    ret