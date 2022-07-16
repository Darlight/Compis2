"""
Universidad del Valle de Guatemala
Seccion 10
Ing. Carlos
Mario Perdomo Carnet 18029
Laboratorio 0
"""
import sys
import os
from antlr4 import *
#antlr -Dlanguage=Python 3  [grammarfile.g4] -o newGrammar
#pip install antlr4-python3-runtime
# | ----- How to create a env ----- |
# python -m venv  path
# ./scripts/activate 
# | ----- ==================== ----- |

print("test")


def get_username():
    from winpwd import getpwuid
    from os import getuid
    return getpwuid(getuid())[ 0 ]

  
class MyVisitor(grammarTestVisitor):
    def visitNumberExpr(self, ctx):
        value = ctx.getText()
        return int(value)

    def visitParenExpr(self, ctx):
        return self.visit(ctx.expr())

    def visitInfixExpr(self, ctx):
        l = self.visit(ctx.left)
        r = self.visit(ctx.right)

        op = ctx.op.text
        operation =  {
        '+': lambda: l + r,
        '-': lambda: l - r,
        '*': lambda: l * r,
        '/': lambda: l / r,
        }
        return operation.get(op, lambda: None)()

    def visitByeExpr(self, ctx):
        print(f"goodbye {get_username()}")
        sys.exit(0)

    def visitHelloExpr(self, ctx):
        return (f"{ctx.getText()} {get_username()}")


if __name__ == "__main__":
    while 1:
        data =  InputStream(input(">>> "))
        # lexer
        lexer = grammarTestLexer(data)
        stream = CommonTokenStream(lexer)
        # parser
        parser = grammarTestParser(stream)
        tree = parser.expr()
        # evaluator
        visitor = MyVisitor()
        output = visitor.visit(tree)
        print(output)

