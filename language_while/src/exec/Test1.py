import BinTrees,os,sys 

nbarg = 3

narg = []

for index in range(len(sys.argv)-1):
	narg.append(BinTrees.BinTrees.stringToTree(sys.argv[index]))

while(len(narg) < nbarg):
	narg.append(BinTrees.BinTrees())

def p (var0, var1) :
	pass
	return var1

def d (var0, var1, var2) :
	pass
	BinTrees.printTree(var1)

if __name__ == '__main__':
	d(narg[0], narg[1], narg[2])