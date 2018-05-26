%include "io.inc"
SECTION .data
    message: db "Digite um Numero: ", 0
    formatin: db "%d", 0
    formatout: db "%d", 10, 0
    integer: times 4 db 0

section .text
global CMAIN
extern scanf
extern printf

CMAIN:
  push ebx      ;reserva o espaco inical
  push ecx      ;reserva o espaco final
  push message  ;joga o label "mensagem" na memoria
  call printf   ;chama o print("Digite um Numero: ")
  
  add esp, 4     ;limpa memoria
  push integer   ;joga label integer na memoria
  push formatin  ;chama o formato de entrada da label formatin
  call scanf     ;chama o scanf e pega o valor no "input"

  add esp, 8   ;limpa memoria
  mov eax, 1   ; coloca o menor numero do fatorial "1"
  mov ebx, dword [integer] ;pega o integer e transforma em texto
  
  ;inicio loop
  LOOP:
    mul ebx    ; reaiza eax = eax * ebx
    DEC ebx    ; ebx -1
    cmp ebx, 1 ; compara ebx >= 1?
    JG LOOP    
  ;fim loop 
   
  push eax        ;joga o resultado na memoria 
  push formatout  ;Joga o formato de saida
  call printf     ;Chama o printf para escrever o resultado
  
  add esp, 8 ;limpa memoria
  pop ecx    ;retira o espaco inicial
  pop ebx    ;retiro o espaco final
  mov eax, 0 ;dou return na memoria
  ret
  