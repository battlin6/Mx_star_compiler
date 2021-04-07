	.text

	.globl  qpow
	.p2align	2
	.type   qpow, @function
qpow:
	sw      a0,0(t6)
	sw      a1,0(t6)
	sw      a2,0(t6)
	li      t1,1
	sw      t1,0(t6)
	lw      t1,0(t6)
	sw      t1,0(t6)
	j       qpow_whileCondBlock.0

qpow_whileCondBlock.0:
	lw      t1,0(t6)
	li      t5,0
	bgt     t1,t5,qpow_whileBodyBlock.0
	j       qpow_afterWhileBlock.0

qpow_whileBodyBlock.0:
	j       qpow_ifCondBlock.0

qpow_afterWhileBlock.0:
	lw      t1,0(t6)
	sw      t1,0(t6)
	j       qpow_returnBlock.0

qpow_ifCondBlock.0:
	lw      t1,0(t6)
	andi    t5,t1,1
	li      t1,1
	beq     t5,t1,qpow_thenBodyBlock.0
	j       qpow_afterIfBlock.0

qpow_thenBodyBlock.0:
	lw      t1,0(t6)
	lw      t1,0(t6)
	lw      t5,0(t6)
	mul     t1,t1,t5
	lw      t5,0(t6)
	rem     t1,t1,t5
	sw      t1,0(t6)
	j       qpow_afterIfBlock.0

qpow_afterIfBlock.0:
	lw      t1,0(t6)
	lw      t5,0(t6)
	lw      t1,0(t6)
	mul     t5,t5,t1
	lw      t1,0(t6)
	rem     t1,t5,t1
	sw      t1,0(t6)
	lw      t1,0(t6)
	lw      t5,0(t6)
	li      t1,2
	div     t1,t5,t1
	sw      t1,0(t6)
	j       qpow_whileCondBlock.0

qpow_returnBlock.0:
	lw      a0,0(t6)
	jr      ra


	.globl  main
	.p2align	2
	.type   main, @function
main:
	addi    sp,sp,-16
	sw      ra,12(sp)
	mv      t6,s0
	sw      t6,8(sp)
	call    __init__
	li      a0,2
	li      a1,10
	li      a2,10000
	call    qpow
	call    __toString
	call    __println
	li      t6,0
	sw      t6,0(s0)
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


