	.text

	.globl  qpow
	.p2align	2
	.type   qpow, @function
qpow:
	sw      a0,0(a5)
	sw      a1,0(a5)
	sw      a2,0(a5)
	li      a2,1
	sw      a2,0(a5)
	lw      a2,0(a5)
	sw      a2,0(a5)
	j       qpow_whileCondBlock.0

qpow_whileCondBlock.0:
	lw      a4,0(a5)
	li      a2,0
	bgt     a4,a2,qpow_whileBodyBlock.0
	j       qpow_afterWhileBlock.0

qpow_whileBodyBlock.0:
	j       qpow_ifCondBlock.0

qpow_afterWhileBlock.0:
	lw      a2,0(a5)
	sw      a2,0(a5)
	j       qpow_returnBlock.0

qpow_ifCondBlock.0:
	lw      a2,0(a5)
	andi    a2,a2,1
	li      a4,1
	beq     a2,a4,qpow_thenBodyBlock.0
	j       qpow_afterIfBlock.0

qpow_thenBodyBlock.0:
	lw      a2,0(a5)
	lw      a2,0(a5)
	lw      a4,0(a5)
	mul     a2,a2,a4
	lw      a4,0(a5)
	rem     a2,a2,a4
	sw      a2,0(a5)
	j       qpow_afterIfBlock.0

qpow_afterIfBlock.0:
	lw      a2,0(a5)
	lw      a4,0(a5)
	lw      a2,0(a5)
	mul     a2,a4,a2
	lw      a4,0(a5)
	rem     a2,a2,a4
	sw      a2,0(a5)
	lw      a2,0(a5)
	lw      a4,0(a5)
	li      a2,2
	div     a2,a4,a2
	sw      a2,0(a5)
	j       qpow_whileCondBlock.0

qpow_returnBlock.0:
	lw      a0,0(a5)
	jr      ra


	.globl  main
	.p2align	2
	.type   main, @function
main:
	addi    sp,sp,-16
	sw      ra,12(sp)
	mv      a5,s0
	sw      a5,8(sp)
	call    __init__
	li      a0,2
	li      a1,10
	li      a2,10000
	call    qpow
	call    __toString
	call    __println
	li      a5,0
	sw      a5,0(s0)
	j       main_returnBlock.0

main_returnBlock.0:
	lw      a0,0(s0)
	lw      s0,8(sp)
	lw      ra,12(sp)
	addi    sp,sp,16
	jr      ra


	.globl  __init__
	.p2align	2
	.type   __init__, @function
__init__:
	j       __init___returnBlock.0

__init___returnBlock.0:
	jr      ra


