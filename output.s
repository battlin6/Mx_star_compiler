	.text

	.globl  main
	.p2align	2
	.type   main, @function
main:
	addi    sp,sp,-16
	sw      ra,12(sp)
	mv      a6,s0
	sw      a6,8(sp)
	call    __init__
	lw      a6,0(s0)
	addi    a6,a6,1
	sw      a6,0(s0)
	addi    a6,a6,1
	sw      a6,0(s0)
	li      a6,0
	sw      a6,0(s0)
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


