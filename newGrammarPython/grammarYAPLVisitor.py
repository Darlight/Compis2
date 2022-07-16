# Generated from .\grammarYAPL.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .grammarYAPLParser import grammarYAPLParser
else:
    from grammarYAPLParser import grammarYAPLParser

# This class defines a complete generic visitor for a parse tree produced by grammarYAPLParser.

class grammarYAPLVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by grammarYAPLParser#program.
    def visitProgram(self, ctx:grammarYAPLParser.ProgramContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by grammarYAPLParser#create_class.
    def visitCreate_class(self, ctx:grammarYAPLParser.Create_classContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by grammarYAPLParser#feature.
    def visitFeature(self, ctx:grammarYAPLParser.FeatureContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by grammarYAPLParser#formal.
    def visitFormal(self, ctx:grammarYAPLParser.FormalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by grammarYAPLParser#dispatch.
    def visitDispatch(self, ctx:grammarYAPLParser.DispatchContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by grammarYAPLParser#Paranthesis.
    def visitParanthesis(self, ctx:grammarYAPLParser.ParanthesisContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by grammarYAPLParser#SumandMinus.
    def visitSumandMinus(self, ctx:grammarYAPLParser.SumandMinusContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by grammarYAPLParser#Loops.
    def visitLoops(self, ctx:grammarYAPLParser.LoopsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by grammarYAPLParser#InverseBits.
    def visitInverseBits(self, ctx:grammarYAPLParser.InverseBitsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by grammarYAPLParser#NewType.
    def visitNewType(self, ctx:grammarYAPLParser.NewTypeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by grammarYAPLParser#INT.
    def visitINT(self, ctx:grammarYAPLParser.INTContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by grammarYAPLParser#Not.
    def visitNot(self, ctx:grammarYAPLParser.NotContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by grammarYAPLParser#GreaterThanorEqual.
    def visitGreaterThanorEqual(self, ctx:grammarYAPLParser.GreaterThanorEqualContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by grammarYAPLParser#BoolFal.
    def visitBoolFal(self, ctx:grammarYAPLParser.BoolFalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by grammarYAPLParser#GreaterThan.
    def visitGreaterThan(self, ctx:grammarYAPLParser.GreaterThanContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by grammarYAPLParser#Equal.
    def visitEqual(self, ctx:grammarYAPLParser.EqualContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by grammarYAPLParser#Content.
    def visitContent(self, ctx:grammarYAPLParser.ContentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by grammarYAPLParser#IFs.
    def visitIFs(self, ctx:grammarYAPLParser.IFsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by grammarYAPLParser#CreateVar.
    def visitCreateVar(self, ctx:grammarYAPLParser.CreateVarContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by grammarYAPLParser#MultandDiv.
    def visitMultandDiv(self, ctx:grammarYAPLParser.MultandDivContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by grammarYAPLParser#STRING.
    def visitSTRING(self, ctx:grammarYAPLParser.STRINGContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by grammarYAPLParser#self.
    def visitSelf(self, ctx:grammarYAPLParser.SelfContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by grammarYAPLParser#Assign.
    def visitAssign(self, ctx:grammarYAPLParser.AssignContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by grammarYAPLParser#ID.
    def visitID(self, ctx:grammarYAPLParser.IDContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by grammarYAPLParser#Void.
    def visitVoid(self, ctx:grammarYAPLParser.VoidContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by grammarYAPLParser#BoolTru.
    def visitBoolTru(self, ctx:grammarYAPLParser.BoolTruContext):
        return self.visitChildren(ctx)



del grammarYAPLParser