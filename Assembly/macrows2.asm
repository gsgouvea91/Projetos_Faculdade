%include "io.inc"

%macro string_num 2
    mov eax , [%2] ;passando dado, sem [] passo o endereco
    push eax
    push %1
    call printf
    add esp , 8
%endmacro

section .data

NUM: dd  5
MSG: db "Qualquer cosia é = %d", 10 , 0

section .text
    extern scanf
    extern printf
global CMAIN
CMAIN:

    string_num MSG,NUM
    ret