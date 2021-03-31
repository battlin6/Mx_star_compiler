; ModuleID = 'test.txt'
source_filename = "test.txt"
target datalayout = "e-m:e-i64:64-f80:128-n8:16:32:64-S128"
target triple = "x86_64-unknown-linux-gnu"

declare i8* @__malloc(i32 %n)
declare void @__print(i8* %str)
declare void @__println(i8* %str)
declare void @__printInt(i32 %n)
declare void @__printlnInt(i32 %n)
declare i8* @__getString()
declare i32 @__getInt()
declare i8* @__toString(i32 %i)
declare i32 @__stringLength(i8* %str)
declare i8* @__stringSubstring(i8* %str, i32 %l, i32 %r)
declare i32 @__stringParseInt(i8* %str)
declare i32 @__stringOrd(i8* %str, i32 %pos)
declare i8* @__stringAdd(i8* %str1, i8* %str2)
declare i1 @__stringEqual(i8* %str1, i8* %str2)
declare i1 @__stringNotEqual(i8* %str1, i8* %str2)
declare i1 @__stringLess(i8* %str1, i8* %str2)
declare i1 @__stringLessEqual(i8* %str1, i8* %str2)
declare i1 @__stringGreater(i8* %str1, i8* %str2)
declare i1 @__stringGreaterEqual(i8* %str1, i8* %str2)

define i32 @main() {
entranceBlock.0:
    call void @__init__()
    %returnValue$.0 = alloca i32
    %a$.0 = alloca i32**
    %mul.0 = mul i32 8, 5
    %add.0 = add i32 %mul.0, 4
    %malloc8.0 = call i8* @__malloc(i32 %add.0)
    %malloc32.0 = bitcast i8* %malloc8.0 to i32*
    store i32 5, i32* %malloc32.0
    %arrayHead32.0 = getelementptr i32, i32* %malloc32.0, i32 1
    %arrayHead.0 = bitcast i32* %arrayHead32.0 to i32**
    %arrayTail.0 = getelementptr i32*, i32** %arrayHead.0, i32 5
    br label %creatorCondBlock.0

creatorCondBlock.0:
    %arrayNow.0 = phi i32**  [ %arrayHead.0, %entranceBlock.0 ],  [ %arrayNext.0, %creatorStepBlock.0 ]
    %ne.0 = icmp ne i32** %arrayNow.0, %arrayTail.0
    br i1 %ne.0, label %creatorBodyBlock.0, label %afterCreatorBlock.0

creatorBodyBlock.0:
    %mul.1 = mul i32 4, 5
    %add.1 = add i32 %mul.1, 4
    %malloc8.1 = call i8* @__malloc(i32 %add.1)
    %malloc32.1 = bitcast i8* %malloc8.1 to i32*
    store i32 5, i32* %malloc32.1
    %arrayHead32.1 = getelementptr i32, i32* %malloc32.1, i32 1
    store i32* %arrayHead32.1, i32** %arrayNow.0
    br label %creatorStepBlock.0

creatorStepBlock.0:
    %arrayNext.0 = getelementptr i32*, i32** %arrayNow.0, i32 1
    br label %creatorCondBlock.0

afterCreatorBlock.0:
    store i32** %arrayHead.0, i32*** %a$.0
    %b$.0 = alloca i32**
    %mul.2 = mul i32 8, 5
    %add.2 = add i32 %mul.2, 4
    %malloc8.2 = call i8* @__malloc(i32 %add.2)
    %malloc32.2 = bitcast i8* %malloc8.2 to i32*
    store i32 5, i32* %malloc32.2
    %arrayHead32.2 = getelementptr i32, i32* %malloc32.2, i32 1
    %arrayHead.1 = bitcast i32* %arrayHead32.2 to i32**
    %arrayTail.1 = getelementptr i32*, i32** %arrayHead.1, i32 5
    br label %creatorCondBlock.1

creatorCondBlock.1:
    %arrayNow.1 = phi i32**  [ %arrayHead.1, %afterCreatorBlock.0 ],  [ %arrayNext.1, %creatorStepBlock.1 ]
    %ne.1 = icmp ne i32** %arrayNow.1, %arrayTail.1
    br i1 %ne.1, label %creatorBodyBlock.1, label %afterCreatorBlock.1

creatorBodyBlock.1:
    %mul.3 = mul i32 4, 5
    %add.3 = add i32 %mul.3, 4
    %malloc8.3 = call i8* @__malloc(i32 %add.3)
    %malloc32.3 = bitcast i8* %malloc8.3 to i32*
    store i32 5, i32* %malloc32.3
    %arrayHead32.3 = getelementptr i32, i32* %malloc32.3, i32 1
    store i32* %arrayHead32.3, i32** %arrayNow.1
    br label %creatorStepBlock.1

creatorStepBlock.1:
    %arrayNext.1 = getelementptr i32*, i32** %arrayNow.1, i32 1
    br label %creatorCondBlock.1

afterCreatorBlock.1:
    store i32** %arrayHead.1, i32*** %b$.0
    %c$.0 = alloca i32**
    %mul.4 = mul i32 8, 5
    %add.4 = add i32 %mul.4, 4
    %malloc8.4 = call i8* @__malloc(i32 %add.4)
    %malloc32.4 = bitcast i8* %malloc8.4 to i32*
    store i32 5, i32* %malloc32.4
    %arrayHead32.4 = getelementptr i32, i32* %malloc32.4, i32 1
    %arrayHead.2 = bitcast i32* %arrayHead32.4 to i32**
    %arrayTail.2 = getelementptr i32*, i32** %arrayHead.2, i32 5
    br label %creatorCondBlock.2

creatorCondBlock.2:
    %arrayNow.2 = phi i32**  [ %arrayHead.2, %afterCreatorBlock.1 ],  [ %arrayNext.2, %creatorStepBlock.2 ]
    %ne.2 = icmp ne i32** %arrayNow.2, %arrayTail.2
    br i1 %ne.2, label %creatorBodyBlock.2, label %afterCreatorBlock.2

creatorBodyBlock.2:
    %mul.5 = mul i32 4, 5
    %add.5 = add i32 %mul.5, 4
    %malloc8.5 = call i8* @__malloc(i32 %add.5)
    %malloc32.5 = bitcast i8* %malloc8.5 to i32*
    store i32 5, i32* %malloc32.5
    %arrayHead32.5 = getelementptr i32, i32* %malloc32.5, i32 1
    store i32* %arrayHead32.5, i32** %arrayNow.2
    br label %creatorStepBlock.2

creatorStepBlock.2:
    %arrayNext.2 = getelementptr i32*, i32** %arrayNow.2, i32 1
    br label %creatorCondBlock.2

afterCreatorBlock.2:
    store i32** %arrayHead.2, i32*** %c$.0
    %a.0 = load i32**, i32*** %a$.0
    %element$.0 = getelementptr i32*, i32** %a.0, i32 1
    %element.0 = load i32*, i32** %element$.0
    %element$.1 = getelementptr i32, i32* %element.0, i32 1
    %element.1 = load i32, i32* %element$.1
    store i32 1, i32* %element$.1
    %a.1 = load i32**, i32*** %a$.0
    %element$.2 = getelementptr i32*, i32** %a.1, i32 1
    %element.2 = load i32*, i32** %element$.2
    %element$.3 = getelementptr i32, i32* %element.2, i32 2
    %element.3 = load i32, i32* %element$.3
    store i32 1, i32* %element$.3
    %a.2 = load i32**, i32*** %a$.0
    %element$.4 = getelementptr i32*, i32** %a.2, i32 1
    %element.4 = load i32*, i32** %element$.4
    %element$.5 = getelementptr i32, i32* %element.4, i32 3
    %element.5 = load i32, i32* %element$.5
    store i32 1, i32* %element$.5
    %a.3 = load i32**, i32*** %a$.0
    %element$.6 = getelementptr i32*, i32** %a.3, i32 1
    %element.6 = load i32*, i32** %element$.6
    %element$.7 = getelementptr i32, i32* %element.6, i32 4
    %element.7 = load i32, i32* %element$.7
    store i32 1, i32* %element$.7
    %a.4 = load i32**, i32*** %a$.0
    %element$.8 = getelementptr i32*, i32** %a.4, i32 2
    %element.8 = load i32*, i32** %element$.8
    %element$.9 = getelementptr i32, i32* %element.8, i32 1
    %element.9 = load i32, i32* %element$.9
    store i32 0, i32* %element$.9
    %a.5 = load i32**, i32*** %a$.0
    %element$.10 = getelementptr i32*, i32** %a.5, i32 2
    %element.10 = load i32*, i32** %element$.10
    %element$.11 = getelementptr i32, i32* %element.10, i32 2
    %element.11 = load i32, i32* %element$.11
    store i32 1, i32* %element$.11
    %a.6 = load i32**, i32*** %a$.0
    %element$.12 = getelementptr i32*, i32** %a.6, i32 2
    %element.12 = load i32*, i32** %element$.12
    %element$.13 = getelementptr i32, i32* %element.12, i32 3
    %element.13 = load i32, i32* %element$.13
    store i32 3, i32* %element$.13
    %a.7 = load i32**, i32*** %a$.0
    %element$.14 = getelementptr i32*, i32** %a.7, i32 2
    %element.14 = load i32*, i32** %element$.14
    %element$.15 = getelementptr i32, i32* %element.14, i32 4
    %element.15 = load i32, i32* %element$.15
    store i32 6, i32* %element$.15
    %a.8 = load i32**, i32*** %a$.0
    %element$.16 = getelementptr i32*, i32** %a.8, i32 3
    %element.16 = load i32*, i32** %element$.16
    %element$.17 = getelementptr i32, i32* %element.16, i32 1
    %element.17 = load i32, i32* %element$.17
    store i32 0, i32* %element$.17
    %a.9 = load i32**, i32*** %a$.0
    %element$.18 = getelementptr i32*, i32** %a.9, i32 3
    %element.18 = load i32*, i32** %element$.18
    %element$.19 = getelementptr i32, i32* %element.18, i32 2
    %element.19 = load i32, i32* %element$.19
    store i32 0, i32* %element$.19
    %a.10 = load i32**, i32*** %a$.0
    %element$.20 = getelementptr i32*, i32** %a.10, i32 3
    %element.20 = load i32*, i32** %element$.20
    %element$.21 = getelementptr i32, i32* %element.20, i32 3
    %element.21 = load i32, i32* %element$.21
    store i32 1, i32* %element$.21
    %a.11 = load i32**, i32*** %a$.0
    %element$.22 = getelementptr i32*, i32** %a.11, i32 3
    %element.22 = load i32*, i32** %element$.22
    %element$.23 = getelementptr i32, i32* %element.22, i32 4
    %element.23 = load i32, i32* %element$.23
    store i32 7, i32* %element$.23
    %a.12 = load i32**, i32*** %a$.0
    %element$.24 = getelementptr i32*, i32** %a.12, i32 4
    %element.24 = load i32*, i32** %element$.24
    %element$.25 = getelementptr i32, i32* %element.24, i32 1
    %element.25 = load i32, i32* %element$.25
    store i32 0, i32* %element$.25
    %a.13 = load i32**, i32*** %a$.0
    %element$.26 = getelementptr i32*, i32** %a.13, i32 4
    %element.26 = load i32*, i32** %element$.26
    %element$.27 = getelementptr i32, i32* %element.26, i32 2
    %element.27 = load i32, i32* %element$.27
    store i32 0, i32* %element$.27
    %a.14 = load i32**, i32*** %a$.0
    %element$.28 = getelementptr i32*, i32** %a.14, i32 4
    %element.28 = load i32*, i32** %element$.28
    %element$.29 = getelementptr i32, i32* %element.28, i32 3
    %element.29 = load i32, i32* %element$.29
    store i32 0, i32* %element$.29
    %a.15 = load i32**, i32*** %a$.0
    %element$.30 = getelementptr i32*, i32** %a.15, i32 4
    %element.30 = load i32*, i32** %element$.30
    %element$.31 = getelementptr i32, i32* %element.30, i32 4
    %element.31 = load i32, i32* %element$.31
    store i32 1, i32* %element$.31
    %b.0 = load i32**, i32*** %b$.0
    %element$.32 = getelementptr i32*, i32** %b.0, i32 1
    %element.32 = load i32*, i32** %element$.32
    %element$.33 = getelementptr i32, i32* %element.32, i32 1
    %element.33 = load i32, i32* %element$.33
    store i32 1, i32* %element$.33
    %b.1 = load i32**, i32*** %b$.0
    %element$.34 = getelementptr i32*, i32** %b.1, i32 1
    %element.34 = load i32*, i32** %element$.34
    %element$.35 = getelementptr i32, i32* %element.34, i32 2
    %element.35 = load i32, i32* %element$.35
    store i32 1, i32* %element$.35
    %b.2 = load i32**, i32*** %b$.0
    %element$.36 = getelementptr i32*, i32** %b.2, i32 1
    %element.36 = load i32*, i32** %element$.36
    %element$.37 = getelementptr i32, i32* %element.36, i32 3
    %element.37 = load i32, i32* %element$.37
    store i32 1, i32* %element$.37
    %b.3 = load i32**, i32*** %b$.0
    %element$.38 = getelementptr i32*, i32** %b.3, i32 1
    %element.38 = load i32*, i32** %element$.38
    %element$.39 = getelementptr i32, i32* %element.38, i32 4
    %element.39 = load i32, i32* %element$.39
    store i32 1, i32* %element$.39
    %b.4 = load i32**, i32*** %b$.0
    %element$.40 = getelementptr i32*, i32** %b.4, i32 2
    %element.40 = load i32*, i32** %element$.40
    %element$.41 = getelementptr i32, i32* %element.40, i32 1
    %element.41 = load i32, i32* %element$.41
    store i32 0, i32* %element$.41
    %b.5 = load i32**, i32*** %b$.0
    %element$.42 = getelementptr i32*, i32** %b.5, i32 2
    %element.42 = load i32*, i32** %element$.42
    %element$.43 = getelementptr i32, i32* %element.42, i32 2
    %element.43 = load i32, i32* %element$.43
    store i32 -1, i32* %element$.43
    %b.6 = load i32**, i32*** %b$.0
    %element$.44 = getelementptr i32*, i32** %b.6, i32 2
    %element.44 = load i32*, i32** %element$.44
    %element$.45 = getelementptr i32, i32* %element.44, i32 3
    %element.45 = load i32, i32* %element$.45
    store i32 3, i32* %element$.45
    %b.7 = load i32**, i32*** %b$.0
    %element$.46 = getelementptr i32*, i32** %b.7, i32 2
    %element.46 = load i32*, i32** %element$.46
    %element$.47 = getelementptr i32, i32* %element.46, i32 4
    %element.47 = load i32, i32* %element$.47
    store i32 -6, i32* %element$.47
    %b.8 = load i32**, i32*** %b$.0
    %element$.48 = getelementptr i32*, i32** %b.8, i32 3
    %element.48 = load i32*, i32** %element$.48
    %element$.49 = getelementptr i32, i32* %element.48, i32 1
    %element.49 = load i32, i32* %element$.49
    store i32 0, i32* %element$.49
    %b.9 = load i32**, i32*** %b$.0
    %element$.50 = getelementptr i32*, i32** %b.9, i32 3
    %element.50 = load i32*, i32** %element$.50
    %element$.51 = getelementptr i32, i32* %element.50, i32 2
    %element.51 = load i32, i32* %element$.51
    store i32 0, i32* %element$.51
    %b.10 = load i32**, i32*** %b$.0
    %element$.52 = getelementptr i32*, i32** %b.10, i32 3
    %element.52 = load i32*, i32** %element$.52
    %element$.53 = getelementptr i32, i32* %element.52, i32 3
    %element.53 = load i32, i32* %element$.53
    store i32 2, i32* %element$.53
    %b.11 = load i32**, i32*** %b$.0
    %element$.54 = getelementptr i32*, i32** %b.11, i32 3
    %element.54 = load i32*, i32** %element$.54
    %element$.55 = getelementptr i32, i32* %element.54, i32 4
    %element.55 = load i32, i32* %element$.55
    store i32 11, i32* %element$.55
    %b.12 = load i32**, i32*** %b$.0
    %element$.56 = getelementptr i32*, i32** %b.12, i32 4
    %element.56 = load i32*, i32** %element$.56
    %element$.57 = getelementptr i32, i32* %element.56, i32 1
    %element.57 = load i32, i32* %element$.57
    store i32 0, i32* %element$.57
    %b.13 = load i32**, i32*** %b$.0
    %element$.58 = getelementptr i32*, i32** %b.13, i32 4
    %element.58 = load i32*, i32** %element$.58
    %element$.59 = getelementptr i32, i32* %element.58, i32 2
    %element.59 = load i32, i32* %element$.59
    store i32 0, i32* %element$.59
    %b.14 = load i32**, i32*** %b$.0
    %element$.60 = getelementptr i32*, i32** %b.14, i32 4
    %element.60 = load i32*, i32** %element$.60
    %element$.61 = getelementptr i32, i32* %element.60, i32 3
    %element.61 = load i32, i32* %element$.61
    store i32 0, i32* %element$.61
    %b.15 = load i32**, i32*** %b$.0
    %element$.62 = getelementptr i32*, i32** %b.15, i32 4
    %element.62 = load i32*, i32** %element$.62
    %element$.63 = getelementptr i32, i32* %element.62, i32 4
    %element.63 = load i32, i32* %element$.63
    store i32 -6, i32* %element$.63
    %i$.0 = alloca i32
    %j$.0 = alloca i32
    %k$.0 = alloca i32
    %i.0 = load i32, i32* %i$.0
    store i32 1, i32* %i$.0
    br label %forCondBlock.0

forCondBlock.0:
    %i.1 = load i32, i32* %i$.0
    %sle.0 = icmp sle i32 %i.1, 4
    br i1 %sle.0, label %forBodyBlock.0, label %afterForBlock.0

forBodyBlock.0:
    %j.0 = load i32, i32* %j$.0
    store i32 1, i32* %j$.0
    br label %forCondBlock.1

forStepBlock.0:
    %i.6 = load i32, i32* %i$.0
    %suffixIncr.2 = add i32 %i.6, 1
    store i32 %suffixIncr.2, i32* %i$.0
    br label %forCondBlock.0

afterForBlock.0:
    %c.3 = load i32**, i32*** %c$.0
    %element$.74 = getelementptr i32*, i32** %c.3, i32 1
    %element.74 = load i32*, i32** %element$.74
    %element$.75 = getelementptr i32, i32* %element.74, i32 1
    %element.75 = load i32, i32* %element$.75
    %c.4 = load i32**, i32*** %c$.0
    %element$.76 = getelementptr i32*, i32** %c.4, i32 2
    %element.76 = load i32*, i32** %element$.76
    %element$.77 = getelementptr i32, i32* %element.76, i32 2
    %element.77 = load i32, i32* %element$.77
    %add.7 = add i32 %element.75, %element.77
    %c.5 = load i32**, i32*** %c$.0
    %element$.78 = getelementptr i32*, i32** %c.5, i32 3
    %element.78 = load i32*, i32** %element$.78
    %element$.79 = getelementptr i32, i32* %element.78, i32 3
    %element.79 = load i32, i32* %element$.79
    %add.8 = add i32 %add.7, %element.79
    %c.6 = load i32**, i32*** %c$.0
    %element$.80 = getelementptr i32*, i32** %c.6, i32 4
    %element.80 = load i32*, i32** %element$.80
    %element$.81 = getelementptr i32, i32* %element.80, i32 4
    %element.81 = load i32, i32* %element$.81
    %add.9 = add i32 %add.8, %element.81
    store i32 %add.9, i32* %returnValue$.0
    br label %returnBlock.0

forCondBlock.1:
    %j.1 = load i32, i32* %j$.0
    %sle.1 = icmp sle i32 %j.1, 4
    br i1 %sle.1, label %forBodyBlock.1, label %afterForBlock.1

forBodyBlock.1:
    %c.0 = load i32**, i32*** %c$.0
    %i.2 = load i32, i32* %i$.0
    %element$.64 = getelementptr i32*, i32** %c.0, i32 %i.2
    %element.64 = load i32*, i32** %element$.64
    %j.2 = load i32, i32* %j$.0
    %element$.65 = getelementptr i32, i32* %element.64, i32 %j.2
    %element.65 = load i32, i32* %element$.65
    store i32 0, i32* %element$.65
    %k.0 = load i32, i32* %k$.0
    store i32 1, i32* %k$.0
    br label %forCondBlock.2

forStepBlock.1:
    %j.6 = load i32, i32* %j$.0
    %suffixIncr.1 = add i32 %j.6, 1
    store i32 %suffixIncr.1, i32* %j$.0
    br label %forCondBlock.1

afterForBlock.1:
    br label %forStepBlock.0

forCondBlock.2:
    %k.1 = load i32, i32* %k$.0
    %sle.2 = icmp sle i32 %k.1, 4
    br i1 %sle.2, label %forBodyBlock.2, label %afterForBlock.2

forBodyBlock.2:
    %c.1 = load i32**, i32*** %c$.0
    %i.3 = load i32, i32* %i$.0
    %element$.66 = getelementptr i32*, i32** %c.1, i32 %i.3
    %element.66 = load i32*, i32** %element$.66
    %j.3 = load i32, i32* %j$.0
    %element$.67 = getelementptr i32, i32* %element.66, i32 %j.3
    %element.67 = load i32, i32* %element$.67
    %c.2 = load i32**, i32*** %c$.0
    %i.4 = load i32, i32* %i$.0
    %element$.68 = getelementptr i32*, i32** %c.2, i32 %i.4
    %element.68 = load i32*, i32** %element$.68
    %j.4 = load i32, i32* %j$.0
    %element$.69 = getelementptr i32, i32* %element.68, i32 %j.4
    %element.69 = load i32, i32* %element$.69
    %a.16 = load i32**, i32*** %a$.0
    %i.5 = load i32, i32* %i$.0
    %element$.70 = getelementptr i32*, i32** %a.16, i32 %i.5
    %element.70 = load i32*, i32** %element$.70
    %k.2 = load i32, i32* %k$.0
    %element$.71 = getelementptr i32, i32* %element.70, i32 %k.2
    %element.71 = load i32, i32* %element$.71
    %b.16 = load i32**, i32*** %b$.0
    %k.3 = load i32, i32* %k$.0
    %element$.72 = getelementptr i32*, i32** %b.16, i32 %k.3
    %element.72 = load i32*, i32** %element$.72
    %j.5 = load i32, i32* %j$.0
    %element$.73 = getelementptr i32, i32* %element.72, i32 %j.5
    %element.73 = load i32, i32* %element$.73
    %mul.6 = mul i32 %element.71, %element.73
    %add.6 = add i32 %element.69, %mul.6
    store i32 %add.6, i32* %element$.67
    br label %forStepBlock.2

forStepBlock.2:
    %k.4 = load i32, i32* %k$.0
    %suffixIncr.0 = add i32 %k.4, 1
    store i32 %suffixIncr.0, i32* %k$.0
    br label %forCondBlock.2

afterForBlock.2:
    br label %forStepBlock.1

returnBlock.0:
    %returnValue.0 = load i32, i32* %returnValue$.0
    ret i32 %returnValue.0

}

define void @__init__() {
entranceBlock.0:
    br label %returnBlock.0

returnBlock.0:
    ret void

}

