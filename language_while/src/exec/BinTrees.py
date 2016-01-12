# simple binary tree
# in this implementation, a node is inserted between an existing node and the root


class BinaryTree():

    def __init__(self,param = "nil", lc = None, rc = None):
        if param == "nil":
            self.left = None
            self.right = None
            self.rootid = param
        elif param == "cons":
            if lc is None:
                self.left = BinaryTree("nil")
            else:
                self.left = lc
            if rc is None:
                self.right = BinaryTree("nil")
            else:
                self.right = rc
            self.rootid = param
        elif param == "list":
            self.left = lc
            self.right = BinaryTree("cons",rc,BinaryTree())
            self.rootid = "cons"
        else:
            self.left = None
            self.right = None
            self.rootid = param

    def getLeftChild(self):
        return self.left
    def getRightChild(self):
        return self.right
    def setNodeValue(self,value):
        self.rootid = value
    def getNodeValue(self):
        return self.rootid

    def insertRight(self,newNode):
        if self.right == None:
            self.right = BinaryTree(newNode)
        else:
            tree = BinaryTree(newNode)
            tree.right = self.right
            self.right = tree

    def insertLeft(self,newNode):
        if self.left == None:
            self.left = BinaryTree(newNode)
        else:
            tree = BinaryTree(newNode)
            self.left = tree
            tree.left = self.left

    def countFor(self):
        v = self
        cnt = 0
        while v != None :
            cnt = cnt+1
            v = v.getRightChild()
        return cnt

def isEqual(tree1,tree2):
    if tree1==None and tree2==None:
        return True
    if tree1.getNodeValue() == tree2.getNodeValue():
        if(isEqual(tree1.getLeftChild,tree2.getLeftChild)) and isEqual(tree1.getRightChild,tree2.getRightChild):
            return True
        else:
            return False
    else:
        return False

def printTree(tree):
        if tree != None:
            printTree(tree.getLeftChild())
            print(tree.getNodeValue())
            printTree(tree.getRightChild())



# test tree

def testTree():
    myTree = BinaryTree("cons")
    printTree(myTree)

testTree()
