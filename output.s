	.text

	.globl  main
	.p2align	2
	.type   main, @function
main:
	addi    sp,sp,-16
	sw      ra,12(sp)
	mv      ra,s0
	sw      ra,8(sp)
	mv      ra,s1
	sw      ra,4(sp)
	mv      ra,s2
	sw      ra,0(sp)
	mv      s2,s3
	mv      s3,s5
	call    __init__
	li      ra,4
	li      s5,5
	mul     s5,ra,s5
	addi    a0,s5,4
	call    __malloc
	li      s5,5
	sw      s5,0(a0)
	addi    s5,a0,4
	addi    s0,s5,20
	j       main_creatorCondBlock.0

main_creatorCondBlock.0:
	bne     s1,s0,main_creatorBodyBlock.0
	j       main_afterCreatorBlock.0

main_creatorBodyBlock.0:
	li      a5,4
	li      ra,5
	mul     ra,a5,ra
	addi    a0,ra,4
	call    __malloc
	li      ra,5
	sw      ra,0(a0)
	addi    ra,a0,4
	sw      ra,0(s1)
	j       main_creatorStepBlock.0

main_creatorStepBlock.0:
	addi    ra,s1,4
	j       main_creatorCondBlock.0

main_afterCreatorBlock.0:
	sw      s5,0(s1)
	li      s5,4
	li      ra,5
	mul     s5,s5,ra
	addi    a0,s5,4
	call    __malloc
	li      s5,5
	sw      s5,0(a0)
	addi    s5,a0,4
	mv      s0,s5
	addi    s5,s0,20
	j       main_creatorCondBlock.1

main_creatorCondBlock.1:
	bne     s1,s5,main_creatorBodyBlock.1
	j       main_afterCreatorBlock.1

main_creatorBodyBlock.1:
	li      a5,4
	li      ra,5
	mul     ra,a5,ra
	addi    a0,ra,4
	call    __malloc
	li      ra,5
	sw      ra,0(a0)
	addi    ra,a0,4
	sw      ra,0(s1)
	j       main_creatorStepBlock.1

main_creatorStepBlock.1:
	addi    ra,s1,4
	j       main_creatorCondBlock.1

main_afterCreatorBlock.1:
	sw      s0,0(s1)
	li      ra,4
	li      s5,5
	mul     s5,ra,s5
	addi    a0,s5,4
	call    __malloc
	li      s5,5
	sw      s5,0(a0)
	addi    s5,a0,4
	addi    s0,s5,20
	j       main_creatorCondBlock.2

main_creatorCondBlock.2:
	bne     s1,s0,main_creatorBodyBlock.2
	j       main_afterCreatorBlock.2

main_creatorBodyBlock.2:
	li      ra,4
	li      a5,5
	mul     ra,ra,a5
	addi    a0,ra,4
	call    __malloc
	li      ra,5
	sw      ra,0(a0)
	addi    ra,a0,4
	sw      ra,0(s1)
	j       main_creatorStepBlock.2

main_creatorStepBlock.2:
	addi    ra,s1,4
	j       main_creatorCondBlock.2

main_afterCreatorBlock.2:
	sw      s5,0(s1)
	lw      s5,0(s1)
	lw      s5,4(s5)
	li      a5,1
	lw      ra,4(s5)
	sw      a5,4(s5)
	lw      s5,0(s1)
	lw      s5,4(s5)
	li      ra,1
	lw      a5,8(s5)
	sw      ra,8(s5)
	lw      s5,0(s1)
	lw      ra,4(s5)
	li      a5,1
	lw      s5,12(ra)
	sw      a5,12(ra)
	lw      s5,0(s1)
	lw      ra,4(s5)
	li      s5,1
	lw      a5,16(ra)
	sw      s5,16(ra)
	lw      s5,0(s1)
	lw      ra,8(s5)
	li      a5,0
	lw      s5,4(ra)
	sw      a5,4(ra)
	lw      s5,0(s1)
	lw      s5,8(s5)
	li      a5,1
	lw      ra,8(s5)
	sw      a5,8(s5)
	lw      s5,0(s1)
	lw      a5,8(s5)
	li      s5,3
	lw      ra,12(a5)
	sw      s5,12(a5)
	lw      s5,0(s1)
	lw      a5,8(s5)
	li      ra,6
	lw      s5,16(a5)
	sw      ra,16(a5)
	lw      s5,0(s1)
	lw      ra,12(s5)
	li      a5,0
	lw      s5,4(ra)
	sw      a5,4(ra)
	lw      s5,0(s1)
	lw      s5,12(s5)
	li      a5,0
	lw      ra,8(s5)
	sw      a5,8(s5)
	lw      s5,0(s1)
	lw      ra,12(s5)
	li      s5,1
	lw      a5,12(ra)
	sw      s5,12(ra)
	lw      s5,0(s1)
	lw      s5,12(s5)
	li      ra,7
	lw      a5,16(s5)
	sw      ra,16(s5)
	lw      s5,0(s1)
	lw      s5,16(s5)
	li      a5,0
	lw      ra,4(s5)
	sw      a5,4(s5)
	lw      s5,0(s1)
	lw      a5,16(s5)
	li      ra,0
	lw      s5,8(a5)
	sw      ra,8(a5)
	lw      s5,0(s1)
	lw      a5,16(s5)
	li      ra,0
	lw      s5,12(a5)
	sw      ra,12(a5)
	lw      s5,0(s1)
	lw      ra,16(s5)
	li      s5,1
	lw      a5,16(ra)
	sw      s5,16(ra)
	lw      s5,0(s1)
	lw      ra,4(s5)
	li      s5,1
	lw      a5,4(ra)
	sw      s5,4(ra)
	lw      s5,0(s1)
	lw      a5,4(s5)
	li      s5,1
	lw      ra,8(a5)
	sw      s5,8(a5)
	lw      s5,0(s1)
	lw      s5,4(s5)
	li      a5,1
	lw      ra,12(s5)
	sw      a5,12(s5)
	lw      s5,0(s1)
	lw      ra,4(s5)
	li      s5,1
	lw      a5,16(ra)
	sw      s5,16(ra)
	lw      s5,0(s1)
	lw      s5,8(s5)
	li      ra,0
	lw      a5,4(s5)
	sw      ra,4(s5)
	lw      s5,0(s1)
	lw      ra,8(s5)
	lw      s5,8(ra)
	li      s5,0
	addi    s5,s5,-1
	sw      s5,8(ra)
	lw      s5,0(s1)
	lw      s5,8(s5)
	li      a5,3
	lw      ra,12(s5)
	sw      a5,12(s5)
	lw      s5,0(s1)
	lw      ra,8(s5)
	lw      s5,16(ra)
	li      s5,0
	addi    s5,s5,-6
	sw      s5,16(ra)
	lw      s5,0(s1)
	lw      s5,12(s5)
	li      a5,0
	lw      ra,4(s5)
	sw      a5,4(s5)
	lw      s5,0(s1)
	lw      ra,12(s5)
	li      a5,0
	lw      s5,8(ra)
	sw      a5,8(ra)
	lw      s5,0(s1)
	lw      ra,12(s5)
	li      s5,2
	lw      a5,12(ra)
	sw      s5,12(ra)
	lw      s5,0(s1)
	lw      a5,12(s5)
	li      ra,11
	lw      s5,16(a5)
	sw      ra,16(a5)
	lw      s5,0(s1)
	lw      s5,16(s5)
	li      ra,0
	lw      a5,4(s5)
	sw      ra,4(s5)
	lw      s5,0(s1)
	lw      s5,16(s5)
	li      ra,0
	lw      a5,8(s5)
	sw      ra,8(s5)
	lw      s5,0(s1)
	lw      a5,16(s5)
	li      s5,0
	lw      ra,12(a5)
	sw      s5,12(a5)
	lw      s5,0(s1)
	lw      ra,16(s5)
	lw      s5,16(ra)
	li      s5,0
	addi    s5,s5,-6
	sw      s5,16(ra)
	lw      s5,0(s1)
	li      s5,1
	sw      s5,0(s1)
	j       main_forCondBlock.0

main_forCondBlock.0:
	lw      s5,0(s1)
	li      ra,4
	ble     s5,ra,main_forBodyBlock.0
	j       main_afterForBlock.0

main_forBodyBlock.0:
	lw      s5,0(s1)
	li      s5,1
	sw      s5,0(s1)
	j       main_forCondBlock.1

main_forStepBlock.0:
	lw      s5,0(s1)
	addi    s5,s5,1
	sw      s5,0(s1)
	j       main_forCondBlock.0

main_afterForBlock.0:
	lw      s5,0(s1)
	lw      s5,4(s5)
	lw      s5,4(s5)
	lw      ra,0(s1)
	lw      ra,8(ra)
	lw      ra,8(ra)
	add     ra,s5,ra
	lw      s5,0(s1)
	lw      s5,12(s5)
	lw      s5,12(s5)
	add     ra,ra,s5
	lw      s5,0(s1)
	lw      s5,16(s5)
	lw      s5,16(s5)
	add     s5,ra,s5
	sw      s5,0(s1)
	j       main_returnBlock.0

main_forCondBlock.1:
	lw      s5,0(s1)
	li      ra,4
	ble     s5,ra,main_forBodyBlock.1
	j       main_afterForBlock.1

main_forBodyBlock.1:
	lw      s5,0(s1)
	lw      ra,0(s1)
	slli    ra,ra,2
	add     s5,s5,ra
	lw      s5,0(s5)
	lw      ra,0(s1)
	slli    ra,ra,2
	add     s5,s5,ra
	lw      ra,0(s5)
	li      ra,0
	sw      ra,0(s5)
	lw      s5,0(s1)
	li      s5,1
	sw      s5,0(s1)
	j       main_forCondBlock.2

main_forStepBlock.1:
	lw      s5,0(s1)
	addi    s5,s5,1
	sw      s5,0(s1)
	j       main_forCondBlock.1

main_afterForBlock.1:
	j       main_forStepBlock.0

main_forCondBlock.2:
	lw      s5,0(s1)
	li      ra,4
	ble     s5,ra,main_forBodyBlock.2
	j       main_afterForBlock.2

main_forBodyBlock.2:
	lw      ra,0(s1)
	lw      s5,0(s1)
	slli    s5,s5,2
	add     s5,ra,s5
	lw      ra,0(s5)
	lw      s5,0(s1)
	slli    s5,s5,2
	add     s5,ra,s5
	lw      ra,0(s5)
	lw      ra,0(s1)
	lw      a5,0(s1)
	slli    a5,a5,2
	add     ra,ra,a5
	lw      a5,0(ra)
	lw      ra,0(s1)
	slli    ra,ra,2
	add     ra,a5,ra
	lw      ra,0(ra)
	lw      t0,0(s1)
	lw      a5,0(s1)
	slli    a5,a5,2
	add     a5,t0,a5
	lw      t0,0(a5)
	lw      a5,0(s1)
	slli    a5,a5,2
	add     a5,t0,a5
	lw      a5,0(a5)
	lw      a1,0(s1)
	lw      t0,0(s1)
	slli    t0,t0,2
	add     t0,a1,t0
	lw      a1,0(t0)
	lw      t0,0(s1)
	slli    t0,t0,2
	add     t0,a1,t0
	lw      t0,0(t0)
	mul     a5,a5,t0
	add     ra,ra,a5
	sw      ra,0(s5)
	j       main_forStepBlock.2

main_forStepBlock.2:
	lw      s5,0(s1)
	addi    s5,s5,1
	sw      s5,0(s1)
	j       main_forCondBlock.2

main_afterForBlock.2:
	j       main_forStepBlock.1

main_returnBlock.0:
	lw      a0,0(s1)
	mv      s5,s3
	mv      s3,s2
	lw      s2,0(sp)
	lw      s1,4(sp)
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


