%include "io.inc"
SECTION .data
        MINHAMATRIZ: dd 100, 320, 400, 500     
                     dd 600, 700, 800, 900
                       
        COMP_MEUVETOR: equ ($- MINHAMATRIZ) / 8  ;constante do tamanho
        formatout:db "%d",10 ,0 ;formato de saida
        
section .text
global CMAIN
CMAIN:
  mov ebx, 0 ;ebx como contador comeca em 0
  mov ecx, 4
LOOP1:  
  mov eax, [MINHAMATRIZ+4*ebx] ; 64/4 = 16 || ebx = 0 || 16 + (4 * 0) = 0
  push eax 
  
     LOOP2:
      mov ecx, [MINHAMATRIZ+4*ecx]
      push ecx
      push formatout
      call printf
      add esp, 8  ; limpa pilha formatout = 4 || printf = 4
      inc ecx
      cmp ecx, ebx
      JL LOOP2
 
  inc ebx   
  cmp ebx, COMP_MEUVETOR 
  JL LOOP1




ret