%include "io.inc"
SECTION .data
     message1: db "Digite um Numero: ", 0
     formatin: db "%d", 0
     formatout: db "%d", 10 , 0
     integer: times 4 db 0
SECTION .text
global CMAIN
extern scanf
extern printf

CMAIN:
    mov ebp, esp; for correct debugging

main:
     push ebx
     push ecx
     push message1
     call printf
     add esp , 4
     push integer
     push formatin
    call scanf
     add esp , 8
     mov eax , 1
     mov ebx , dword [integer]
     
     LOOP:
         mul ebx
         DEC ebx
         cmp ebx , 1
     JG LOOP
     
     push eax
     push formatout
     call printf
     add esp , 8
     pop ecx
     pop ebx
     mov eax , 0
     ret