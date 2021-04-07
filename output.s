    .text

    .globl    qpow                    # -- Begin function qpow
    .p2align    2
qpow:                           # @qpow
.ASMBlock1_0:                           # initBlock.0
	addi	a3, zero, 1
	j	.ASMBlock1_1
.ASMBlock1_1:                           # while$cond.0
	ble	a1, zero, .ASMBlock1_6
	j	.ASMBlock1_2
.ASMBlock1_2:                           # while$body.0
	andi	a4, a1, 1
	addi	a5, zero, 1
	bne	a4, a5, .ASMBlock1_4
	j	.ASMBlock1_3
.ASMBlock1_3:                           # ifThenBlock.0
	mul	a3, a3, a0
	rem	a3, a3, a2
	j	.ASMBlock1_5
.ASMBlock1_4:                           # criticalBlock.0
	j	.ASMBlock1_5
.ASMBlock1_5:                           # ifMergeBlock.0
	mul	a0, a0, a0
	rem	a0, a0, a2
	addi	a4, zero, 2
	div	a1, a1, a4
	j	.ASMBlock1_1
.ASMBlock1_6:                           # while$merge.0
	mv	a0, a3
	ret
                                        # -- End function

    .globl    main                    # -- Begin function main
    .p2align    2
main:                           # @main
.ASMBlock2_0:                           # initBlock.0
	addi	sp, sp, -4
	sw	ra, 0(sp)
	addi	a0, zero, 2
	addi	a1, zero, 10
	li	a2, 10000
	call	qpow
	call	toString
	call	println
	mv	a0, zero
	lw	ra, 0(sp)
	addi	sp, sp, 4
	ret
                                        # -- End function

    .globl    __init__                # -- Begin function __init__
    .p2align    2
__init__:                       # @__init__
.ASMBlock3_0:                           # initBlock.0
	ret
                                        # -- End function


    .section	.sdata,"aw",@progbits
