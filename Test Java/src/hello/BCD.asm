Data segment
    A dw 1234H
    b dw 5140H
    sum dw ?
    carry db 00H
Data ends

code segment
        assume cs:code,ds:Data

        mov ax,Data
        mov ds,ax

        mov ax,A 
        mov bx,b 
        add al,bl 
        Daa 
        mov al,ah
        adc al,bh
        Daa 
        jnc skp
        mov carry,01h

skip: mov sum,ax

code ends
ends