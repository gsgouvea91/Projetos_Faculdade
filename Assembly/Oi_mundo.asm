%include "io.inc"
SECTION .data

fmt: db "Oi Mundo", 10 , 0

SECTION .text
global CMAIN
extern printf
CMAIN:
    push ebp
    mov ebp ,esp
    push dword fmt
    call printf
    add esp , 8
    mov esp , ebp
    pop ebp
    mov eax ,0
    ret

