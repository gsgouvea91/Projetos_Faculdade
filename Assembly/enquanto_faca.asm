%include "io.inc"
SECTION .data
    msg: db "%d" ,10 , 0
SECTION .text
extern scanf
extern printf
global CMAIN
CMAIN:

    mov ebx , 0
    enquanto:

        ;enquanto valor for menor q 11
        cmp ebx , 11
        je fim_enquanto
        
        ;faça
        push ebx
        push msg
        call printf
        add esp ,8
        add ebx , 1

        jmp enquanto
    fim_enquanto:
    xor eax , eax
    ret