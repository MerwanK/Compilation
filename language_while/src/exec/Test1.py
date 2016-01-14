import BinTrees,os,sys 

nbarg = 3

narg = []

for index in range(len(sys.argv)-1):
	narg.append(translate(sys.argv[index]))

while(len(narg) < nbarg):
	narg.append()

def p (var0, var1) :
	pass
	return var1

def d (var0, var1, var2) :
	pass
	print var1

if __name__ == '__main__':
	d(narg[0], narg[1], narg[2])