%include "io.inc"
section .data
    msg: db "%d",10,0
section .text
    extern printf
global CMAIN
CMAIN:

    mov ebx, 5
     while:
        cmp ebx ,101
        je end_while
      
            push ebx
            push msg
            call printf
            add esp, 8
            inc ebx
            jmp while
            
        end_while:               
    ;write your code here
    xor eax, eax
    ret