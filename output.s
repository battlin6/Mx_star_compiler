	.data

	.globl  .str.0
.str.0:
	.asciz  "("

	.globl  .str.1
.str.1:
	.asciz  ", "

	.globl  .str.2
.str.2:
	.asciz  ")"


	.text

	.globl  point.point
	.p2align	2
	.type   point.point, @function
point.point:
	sw      a0,0(t5)
	lw      a2,0(t5)
	li      t0,0
	lw      t2,0(a2)
	sw      t0,0(a2)
	lw      a2,0(t5)
	li      t0,0
	lw      t2,4(a2)
	sw      t0,4(a2)
	lw      t5,0(t5)
	li      t0,0
	lw      t2,8(t5)
	sw      t0,8(t5)
	j       point.point_returnBlock.0

point.point_returnBlock.0:
	jr      ra


	.globl  point.set
	.p2align	2
	.type   point.set, @function
point.set:
	sw      a0,0(t5)
	sw      a1,0(t5)
	sw      a2,0(t5)
	sw      a3,0(t5)
	lw      t0,0(t5)
	lw      t2,0(t0)
	lw      t2,0(t5)
	sw      t2,0(t0)
	lw      t0,0(t5)
	lw      t2,4(t0)
	lw      t2,0(t5)
	sw      t2,4(t0)
	lw      t2,0(t5)
	lw      t0,8(t2)
	lw      t0,0(t5)
	sw      t0,8(t2)
	j       point.set_returnBlock.0

point.set_returnBlock.0:
	jr      ra


	.globl  point.sqrLen
	.p2align	2
	.type   point.sqrLen, @function
point.sqrLen:
	sw      a0,0(t2)
	lw      t0,0(t2)
	lw      t5,0(t0)
	lw      t0,0(t2)
	lw      t0,0(t0)
	mul     t5,t5,t0
	lw      t0,0(t2)
	lw      t0,4(t0)
	lw      a2,0(t2)
	lw      a2,4(a2)
	mul     t0,t0,a2
	add     a2,t5,t0
	lw      t0,0(t2)
	lw      t0,8(t0)
	lw      t5,0(t2)
	lw      t5,8(t5)
	mul     t0,t0,t5
	add     t0,a2,t0
	sw      t0,0(t2)
	j       point.sqrLen_returnBlock.0

point.sqrLen_returnBlock.0:
	lw      a0,0(t2)
	jr      ra


	.globl  point.sqrDis
	.p2align	2
	.type   point.sqrDis, @function
point.sqrDis:
	sw      a0,0(t2)
	sw      a1,0(t2)
	lw      t0,0(t2)
	lw      t0,0(t0)
	lw      t5,0(t2)
	lw      t5,0(t5)
	sub     t5,t0,t5
	lw      t0,0(t2)
	lw      a2,0(t0)
	lw      t0,0(t2)
	lw      t0,0(t0)
	sub     t0,a2,t0
	mul     t0,t5,t0
	lw      t5,0(t2)
	lw      a2,4(t5)
	lw      t5,0(t2)
	lw      t5,4(t5)
	sub     t5,a2,t5
	lw      a2,0(t2)
	lw      a0,4(a2)
	lw      a2,0(t2)
	lw      a2,4(a2)
	sub     a2,a0,a2
	mul     t5,t5,a2
	add     t0,t0,t5
	lw      t5,0(t2)
	lw      t5,8(t5)
	lw      a2,0(t2)
	lw      a2,8(a2)
	sub     a2,t5,a2
	lw      t5,0(t2)
	lw      a0,8(t5)
	lw      t5,0(t2)
	lw      t5,8(t5)
	sub     t5,a0,t5
	mul     t5,a2,t5
	add     t0,t0,t5
	sw      t0,0(t2)
	j       point.sqrDis_returnBlock.0

point.sqrDis_returnBlock.0:
	lw      a0,0(t2)
	jr      ra


	.globl  point.dot
	.p2align	2
	.type   point.dot, @function
point.dot:
	sw      a0,0(t2)
	sw      a1,0(t2)
	lw      t0,0(t2)
	lw      t5,0(t0)
	lw      t0,0(t2)
	lw      t0,0(t0)
	mul     t5,t5,t0
	lw      t0,0(t2)
	lw      a2,4(t0)
	lw      t0,0(t2)
	lw      t0,4(t0)
	mul     t0,a2,t0
	add     t5,t5,t0
	lw      t0,0(t2)
	lw      a2,8(t0)
	lw      t0,0(t2)
	lw      t0,8(t0)
	mul     t0,a2,t0
	add     t0,t5,t0
	sw      t0,0(t2)
	j       point.dot_returnBlock.0

point.dot_returnBlock.0:
	lw      a0,0(t2)
	jr      ra


	.globl  point.cross
	.p2align	2
	.type   point.cross, @function
point.cross:
	addi    sp,sp,-16
	sw      ra,12(sp)
	mv      t2,s0
	sw      t2,8(sp)
	mv      t2,s1
	sw      t2,4(sp)
	sw      a0,0(s0)
	sw      a1,0(s0)
	li      a0,12
	call    __malloc
	mv      s1,a0
	mv      a0,s1
	call    point.point
	sw      s1,0(s0)
	lw      a0,0(s0)
	lw      t2,0(s0)
	lw      t2,4(t2)
	lw      t0,0(s0)
	lw      t0,8(t0)
	mul     t2,t2,t0
	lw      t0,0(s0)
	lw      t5,8(t0)
	lw      t0,0(s0)
	lw      t0,4(t0)
	mul     t0,t5,t0
	sub     a1,t2,t0
	lw      t2,0(s0)
	lw      t0,8(t2)
	lw      t2,0(s0)
	lw      t2,0(t2)
	mul     t2,t0,t2
	lw      t0,0(s0)
	lw      t5,0(t0)
	lw      t0,0(s0)
	lw      t0,8(t0)
	mul     t0,t5,t0
	sub     a2,t2,t0
	lw      t2,0(s0)
	lw      t0,0(t2)
	lw      t2,0(s0)
	lw      t2,4(t2)
	mul     t5,t0,t2
	lw      t2,0(s0)
	lw      t0,4(t2)
	lw      t2,0(s0)
	lw      t2,0(t2)
	mul     t2,t0,t2
	sub     a3,t5,t2
	call    point.set
	lw      t2,0(s0)
	sw      t2,0(s0)
	j       point.cross_returnBlock.0

point.cross_returnBlock.0:
	lw      a0,0(s0)
	lw      s1,4(sp)
	lw      s0,8(sp)
	lw      ra,12(sp)
	addi    sp,sp,16
	jr      ra


	.globl  point.add
	.p2align	2
	.type   point.add, @function
point.add:
	sw      a0,0(t2)
	sw      a1,0(t2)
	lw      t0,0(t2)
	lw      t5,0(t0)
	lw      t5,0(t2)
	lw      t5,0(t5)
	lw      a2,0(t2)
	lw      a2,0(a2)
	add     t5,t5,a2
	sw      t5,0(t0)
	lw      t5,0(t2)
	lw      t0,4(t5)
	lw      t0,0(t2)
	lw      t0,4(t0)
	lw      a2,0(t2)
	lw      a2,4(a2)
	add     t0,t0,a2
	sw      t0,4(t5)
	lw      a2,0(t2)
	lw      t0,8(a2)
	lw      t0,0(t2)
	lw      t5,8(t0)
	lw      t0,0(t2)
	lw      t0,8(t0)
	add     t0,t5,t0
	sw      t0,8(a2)
	lw      t0,0(t2)
	sw      t0,0(t2)
	j       point.add_returnBlock.0

point.add_returnBlock.0:
	lw      a0,0(t2)
	jr      ra


	.globl  point.sub
	.p2align	2
	.type   point.sub, @function
point.sub:
	sw      a0,0(t2)
	sw      a1,0(t2)
	lw      t5,0(t2)
	lw      t0,0(t5)
	lw      t0,0(t2)
	lw      a2,0(t0)
	lw      t0,0(t2)
	lw      t0,0(t0)
	sub     t0,a2,t0
	sw      t0,0(t5)
	lw      t0,0(t2)
	lw      t5,4(t0)
	lw      t5,0(t2)
	lw      t5,4(t5)
	lw      a2,0(t2)
	lw      a2,4(a2)
	sub     t5,t5,a2
	sw      t5,4(t0)
	lw      t0,0(t2)
	lw      t5,8(t0)
	lw      t5,0(t2)
	lw      a2,8(t5)
	lw      t5,0(t2)
	lw      t5,8(t5)
	sub     t5,a2,t5
	sw      t5,8(t0)
	lw      t0,0(t2)
	sw      t0,0(t2)
	j       point.sub_returnBlock.0

point.sub_returnBlock.0:
	lw      a0,0(t2)
	jr      ra


	.globl  point.printPoint
	.p2align	2
	.type   point.printPoint, @function
point.printPoint:
	addi    sp,sp,-16
	sw      ra,12(sp)
	mv      t2,s0
	sw      t2,8(sp)
	mv      t2,s1
	sw      t2,4(sp)
	sw      a0,0(s1)
	lui     t2,%hi(.str.0)
	addi    s0,t2,%lo(.str.0)
	lw      t2,0(s1)
	lw      a0,0(t2)
	call    __toString
	mv      a1,a0
	mv      a0,s0
	call    __stringAdd
	lui     t2,%hi(.str.1)
	addi    a1,t2,%lo(.str.1)
	call    __stringAdd
	mv      s0,a0
	lw      t2,0(s1)
	lw      a0,4(t2)
	call    __toString
	mv      a1,a0
	mv      a0,s0
	call    __stringAdd
	lui     t2,%hi(.str.1)
	addi    a1,t2,%lo(.str.1)
	call    __stringAdd
	mv      s0,a0
	lw      t2,0(s1)
	lw      a0,8(t2)
	call    __toString
	mv      a1,a0
	mv      a0,s0
	call    __stringAdd
	lui     t2,%hi(.str.2)
	addi    a1,t2,%lo(.str.2)
	call    __stringAdd
	call    __println
	j       point.printPoint_returnBlock.0

point.printPoint_returnBlock.0:
	lw      s1,4(sp)
	lw      s0,8(sp)
	lw      ra,12(sp)
	addi    sp,sp,16
	jr      ra


	.globl  main
	.p2align	2
	.type   main, @function
main:
	addi    sp,sp,-16
	sw      ra,12(sp)
	mv      t2,s0
	sw      t2,8(sp)
	mv      t2,s1
	sw      t2,4(sp)
	mv      t2,s2
	sw      t2,0(sp)
	mv      s2,s3
	mv      s0,s4
	call    __init__
	li      a0,12
	call    __malloc
	mv      s3,a0
	mv      a0,s3
	call    point.point
	sw      s3,0(s1)
	li      a0,12
	call    __malloc
	mv      s3,a0
	mv      a0,s3
	call    point.point
	sw      s3,0(s1)
	li      a0,12
	call    __malloc
	mv      s3,a0
	mv      a0,s3
	call    point.point
	sw      s3,0(s1)
	li      a0,12
	call    __malloc
	mv      s3,a0
	mv      a0,s3
	call    point.point
	sw      s3,0(s1)
	lw      a0,0(s1)
	call    point.printPoint
	lw      a0,0(s1)
	li      t2,0
	addi    a2,t2,-463
	li      a1,849
	li      a3,480
	call    point.set
	lw      a0,0(s1)
	li      t2,0
	addi    a1,t2,-208
	li      t2,0
	addi    a3,t2,-150
	li      a2,585
	call    point.set
	lw      a0,0(s1)
	li      t2,0
	addi    a2,t2,-670
	li      t2,0
	addi    a3,t2,-742
	li      a1,360
	call    point.set
	lw      a0,0(s1)
	li      t2,0
	addi    a1,t2,-29
	li      t2,0
	addi    a2,t2,-591
	li      t2,0
	addi    a3,t2,-960
	call    point.set
	lw      a0,0(s1)
	lw      a1,0(s1)
	call    point.add
	lw      a0,0(s1)
	lw      a1,0(s1)
	call    point.add
	lw      a0,0(s1)
	lw      a1,0(s1)
	call    point.add
	lw      a0,0(s1)
	lw      a1,0(s1)
	call    point.sub
	lw      a0,0(s1)
	lw      a1,0(s1)
	call    point.sub
	lw      a0,0(s1)
	lw      a1,0(s1)
	call    point.sub
	lw      a0,0(s1)
	lw      a1,0(s1)
	call    point.add
	lw      a0,0(s1)
	lw      a1,0(s1)
	call    point.add
	lw      a0,0(s1)
	lw      a1,0(s1)
	call    point.add
	lw      a0,0(s1)
	lw      a1,0(s1)
	call    point.add
	lw      a0,0(s1)
	lw      a1,0(s1)
	call    point.sub
	lw      a0,0(s1)
	lw      a1,0(s1)
	call    point.add
	lw      a0,0(s1)
	lw      a1,0(s1)
	call    point.sub
	lw      a0,0(s1)
	call    point.sqrLen
	call    __toString
	call    __println
	lw      a0,0(s1)
	call    point.sqrLen
	call    __toString
	call    __println
	lw      a0,0(s1)
	lw      a1,0(s1)
	call    point.sqrDis
	call    __toString
	call    __println
	lw      a0,0(s1)
	lw      a1,0(s1)
	call    point.sqrDis
	call    __toString
	call    __println
	lw      a0,0(s1)
	lw      a1,0(s1)
	call    point.dot
	call    __toString
	call    __println
	lw      a0,0(s1)
	lw      a1,0(s1)
	call    point.cross
	call    point.printPoint
	lw      a0,0(s1)
	call    point.printPoint
	lw      a0,0(s1)
	call    point.printPoint
	lw      a0,0(s1)
	call    point.printPoint
	lw      a0,0(s1)
	call    point.printPoint
	li      t2,0
	sw      t2,0(s1)
	j       main_returnBlock.0

main_returnBlock.0:
	lw      a0,0(s1)
	mv      s4,s0
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


