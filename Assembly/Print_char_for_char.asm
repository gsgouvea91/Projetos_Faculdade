%include "io.inc"
SECTION .data
    TEXTO: db 'CARLOS SILVA'
    msglen: equ $-TEXTO
    MSG: db ''
    formatout: db "%", 10, 0
section .text
global CMAIN
extern scanf
extern printf

CMAIN:

    push ebx
    push ecx
    mov ebx, TEXTO

    LOOP:

    mov al, [ebx]          ;Pegue o dado do ebx e coloca em al
    mov [MSG], al          ;Pegue o dado em al e ecoloque no endere�o [ ] da variavel MSG
     
    push MSG               ;Coloca a Letra na mem�ria
    push formatout
    call printf      
    add esp, 8             ;limpa o Formatout e o Printf
    inc ebx                ;incrementa o endere�o de mem�ria
   
    CMP ebx,TEXTO+msglen   ;Contador vai at� o n de bytes da mensagem (total)
    JB LOOP                ;volte para o come�o
   
    pop ecx
    pop ebx
    mov eax, 0
    ret