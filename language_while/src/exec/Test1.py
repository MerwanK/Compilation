import BinTrees 

def f0(var0, var1):
	var2 = BinTree.BinTree()
	R0 = BinTrees.BinTrees()
	var0 = R0
	return var2

def f1(var0, var1):
	var2 = BinTree.BinTree()
	var3 = BinTree.BinTree()
	R0 = BinTrees.BinTrees("cons", var0, BinTrees.BinTrees("cons", var1, BinTrees.BinTrees("cons", var2, var3)))
	var0 = R0
	return var2

def f2(var0, var1):
	var2 = BinTree.BinTree()
	var3 = BinTree.BinTree()
	R0 = BinTrees.BinTrees("cons", var0, BinTrees.BinTrees("cons", var1, BinTrees.BinTrees("cons", var2, var3))).getRightChild()
	var0 = R0
	return var2

def f3(var0, var1):
	var2 = BinTree.BinTree()
	R0 = BinTrees.BinTrees("cons", var0, BinTrees.BinTrees("cons", var1, BinTrees.BinTrees("cons", var2, BinTrees.BinTrees())))
	var0 = R0
	return var2

def f4(var0, var1):
	var2 = BinTree.BinTree()
	var3 = BinTree.BinTree()
	R0 = BinTrees.BinTrees("cons", var0, BinTrees.BinTrees("cons", var1, BinTrees.BinTrees("cons", BinTrees.BinTrees("cons", var2, var3), BinTrees.BinTrees())))
	var0 = R0
	return var2

def f5(var0):
	R0 = var0
	while R0.isNotNil():
		pass
	return var0

def f6(var0):
	var1 = BinTree.BinTree()
	var2 = BinTree.BinTree()
	R1 = var0
	while R1.isNotNil():
		R2 = var1
		for i0 in range(0, R2.countFor()):
			R3 = var2
			for i1 in range(0, R3.countFor()):
				pass
	return var0

def f7(var0):
	R4 = var0
	while R4.isNotNil():
		R5 = BinTrees.BinTrees("cons", BinTrees.BinTrees(), BinTrees.BinTrees())
		if R5.isNotNil():
			pass
		else:
			pass
	return var0
