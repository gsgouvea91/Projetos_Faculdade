%include "io.inc"
section .data
    valor: dq 4.0
    potc:  dd 2
    resultado: dd 0
    resRetangulo: db "O resultado é %f" ,10 ,0.

section .text
global CMAIN
CMAIN:
    
    CALL POTENCIA
    
    push dword [resultado+4]
    push dword [resultado] 
    push dword resRetangulo
    call printf
    add esp, 12
    
    xor eax, eax
    ret
    
POTENCIA:
    mov ecx, [valor]
    mov eax, [valor]
    mov ebx, 1
    while:
        cmp ebx, [potc]
        je end_while
        mul ecx
        inc ebx
        jmp while
    end_while:
    
    mov [resultado], eax
    ret 