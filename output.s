    .text

    .globl    main                    # -- Begin function main
    .p2align    2
main:                           # @main
.ASMBlock1_0:                           # initBlock.0
	addi	a1, zero, 1
	addi	a2, zero, 1
	addi	a0, zero, 0
	addi	a3, zero, 0
	j	.ASMBlock1_1
.ASMBlock1_1:                           # forCond.0
	addi	a4, zero, 10
	bge	a1, a4, .ASMBlock1_3
	j	.ASMBlock1_2
.ASMBlock1_2:                           # forBody.0
	add	a0, a3, a2
	addi	a1, a1, 1
	mv	a3, a2
	mv	a2, a0
	j	.ASMBlock1_1
.ASMBlock1_3:                           # forMerge.0
	ret
                                        # -- End function

    .globl    __init__                # -- Begin function __init__
    .p2align    2
__init__:                       # @__init__
.ASMBlock2_0:                           # initBlock.0
	ret
                                        # -- End function


    .section	.sdata,"aw",@progbits
