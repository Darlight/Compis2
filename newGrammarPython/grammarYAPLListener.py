# Generated from .\grammarYAPL.g4 by ANTLR 4.10.1
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .grammarYAPLParser import grammarYAPLParser
else:
    from grammarYAPLParser import grammarYAPLParser

# This class defines a complete listener for a parse tree produced by grammarYAPLParser.
class grammarYAPLListener(ParseTreeListener):

    # Enter a parse tree produced by grammarYAPLParser#program.
    def enterProgram(self, ctx:grammarYAPLParser.ProgramContext):
        print('Program Class Entered:  %s' %ctx.getText())

    # Exit a parse tree produced by grammarYAPLParser#program.
    def exitProgram(self, ctx:grammarYAPLParser.ProgramContext):
        pass


    # Enter a parse tree produced by grammarYAPLParser#create_class.
    def enterCreate_class(self, ctx:grammarYAPLParser.Create_classContext):
        pass

    # Exit a parse tree produced by grammarYAPLParser#create_class.
    def exitCreate_class(self, ctx:grammarYAPLParser.Create_classContext):
        pass


    # Enter a parse tree produced by grammarYAPLParser#feature.
    def enterFeature(self, ctx:grammarYAPLParser.FeatureContext):
        pass

    # Exit a parse tree produced by grammarYAPLParser#feature.
    def exitFeature(self, ctx:grammarYAPLParser.FeatureContext):
        pass


    # Enter a parse tree produced by grammarYAPLParser#formal.
    def enterFormal(self, ctx:grammarYAPLParser.FormalContext):
        pass

    # Exit a parse tree produced by grammarYAPLParser#formal.
    def exitFormal(self, ctx:grammarYAPLParser.FormalContext):
        pass


    # Enter a parse tree produced by grammarYAPLParser#dispatch.
    def enterDispatch(self, ctx:grammarYAPLParser.DispatchContext):
        pass

    # Exit a parse tree produced by grammarYAPLParser#dispatch.
    def exitDispatch(self, ctx:grammarYAPLParser.DispatchContext):
        pass


    # Enter a parse tree produced by grammarYAPLParser#Paranthesis.
    def enterParanthesis(self, ctx:grammarYAPLParser.ParanthesisContext):
        pass

    # Exit a parse tree produced by grammarYAPLParser#Paranthesis.
    def exitParanthesis(self, ctx:grammarYAPLParser.ParanthesisContext):
        pass


    # Enter a parse tree produced by grammarYAPLParser#SumandMinus.
    def enterSumandMinus(self, ctx:grammarYAPLParser.SumandMinusContext):
        pass

    # Exit a parse tree produced by grammarYAPLParser#SumandMinus.
    def exitSumandMinus(self, ctx:grammarYAPLParser.SumandMinusContext):
        pass


    # Enter a parse tree produced by grammarYAPLParser#Loops.
    def enterLoops(self, ctx:grammarYAPLParser.LoopsContext):
        pass

    # Exit a parse tree produced by grammarYAPLParser#Loops.
    def exitLoops(self, ctx:grammarYAPLParser.LoopsContext):
        pass


    # Enter a parse tree produced by grammarYAPLParser#InverseBits.
    def enterInverseBits(self, ctx:grammarYAPLParser.InverseBitsContext):
        pass

    # Exit a parse tree produced by grammarYAPLParser#InverseBits.
    def exitInverseBits(self, ctx:grammarYAPLParser.InverseBitsContext):
        pass


    # Enter a parse tree produced by grammarYAPLParser#NewType.
    def enterNewType(self, ctx:grammarYAPLParser.NewTypeContext):
        pass

    # Exit a parse tree produced by grammarYAPLParser#NewType.
    def exitNewType(self, ctx:grammarYAPLParser.NewTypeContext):
        pass


    # Enter a parse tree produced by grammarYAPLParser#INT.
    def enterINT(self, ctx:grammarYAPLParser.INTContext):
        pass

    # Exit a parse tree produced by grammarYAPLParser#INT.
    def exitINT(self, ctx:grammarYAPLParser.INTContext):
        pass


    # Enter a parse tree produced by grammarYAPLParser#Not.
    def enterNot(self, ctx:grammarYAPLParser.NotContext):
        pass

    # Exit a parse tree produced by grammarYAPLParser#Not.
    def exitNot(self, ctx:grammarYAPLParser.NotContext):
        pass


    # Enter a parse tree produced by grammarYAPLParser#GreaterThanorEqual.
    def enterGreaterThanorEqual(self, ctx:grammarYAPLParser.GreaterThanorEqualContext):
        pass

    # Exit a parse tree produced by grammarYAPLParser#GreaterThanorEqual.
    def exitGreaterThanorEqual(self, ctx:grammarYAPLParser.GreaterThanorEqualContext):
        pass


    # Enter a parse tree produced by grammarYAPLParser#BoolFal.
    def enterBoolFal(self, ctx:grammarYAPLParser.BoolFalContext):
        pass

    # Exit a parse tree produced by grammarYAPLParser#BoolFal.
    def exitBoolFal(self, ctx:grammarYAPLParser.BoolFalContext):
        pass


    # Enter a parse tree produced by grammarYAPLParser#GreaterThan.
    def enterGreaterThan(self, ctx:grammarYAPLParser.GreaterThanContext):
        pass

    # Exit a parse tree produced by grammarYAPLParser#GreaterThan.
    def exitGreaterThan(self, ctx:grammarYAPLParser.GreaterThanContext):
        pass


    # Enter a parse tree produced by grammarYAPLParser#Equal.
    def enterEqual(self, ctx:grammarYAPLParser.EqualContext):
        pass

    # Exit a parse tree produced by grammarYAPLParser#Equal.
    def exitEqual(self, ctx:grammarYAPLParser.EqualContext):
        pass


    # Enter a parse tree produced by grammarYAPLParser#Content.
    def enterContent(self, ctx:grammarYAPLParser.ContentContext):
        pass

    # Exit a parse tree produced by grammarYAPLParser#Content.
    def exitContent(self, ctx:grammarYAPLParser.ContentContext):
        pass


    # Enter a parse tree produced by grammarYAPLParser#IFs.
    def enterIFs(self, ctx:grammarYAPLParser.IFsContext):
        pass

    # Exit a parse tree produced by grammarYAPLParser#IFs.
    def exitIFs(self, ctx:grammarYAPLParser.IFsContext):
        pass


    # Enter a parse tree produced by grammarYAPLParser#CreateVar.
    def enterCreateVar(self, ctx:grammarYAPLParser.CreateVarContext):
        pass

    # Exit a parse tree produced by grammarYAPLParser#CreateVar.
    def exitCreateVar(self, ctx:grammarYAPLParser.CreateVarContext):
        pass


    # Enter a parse tree produced by grammarYAPLParser#MultandDiv.
    def enterMultandDiv(self, ctx:grammarYAPLParser.MultandDivContext):
        pass

    # Exit a parse tree produced by grammarYAPLParser#MultandDiv.
    def exitMultandDiv(self, ctx:grammarYAPLParser.MultandDivContext):
        pass


    # Enter a parse tree produced by grammarYAPLParser#STRING.
    def enterSTRING(self, ctx:grammarYAPLParser.STRINGContext):
        pass

    # Exit a parse tree produced by grammarYAPLParser#STRING.
    def exitSTRING(self, ctx:grammarYAPLParser.STRINGContext):
        pass


    # Enter a parse tree produced by grammarYAPLParser#self.
    def enterSelf(self, ctx:grammarYAPLParser.SelfContext):
        pass

    # Exit a parse tree produced by grammarYAPLParser#self.
    def exitSelf(self, ctx:grammarYAPLParser.SelfContext):
        pass


    # Enter a parse tree produced by grammarYAPLParser#Assign.
    def enterAssign(self, ctx:grammarYAPLParser.AssignContext):
        pass

    # Exit a parse tree produced by grammarYAPLParser#Assign.
    def exitAssign(self, ctx:grammarYAPLParser.AssignContext):
        pass


    # Enter a parse tree produced by grammarYAPLParser#ID.
    def enterID(self, ctx:grammarYAPLParser.IDContext):
        pass

    # Exit a parse tree produced by grammarYAPLParser#ID.
    def exitID(self, ctx:grammarYAPLParser.IDContext):
        pass


    # Enter a parse tree produced by grammarYAPLParser#Void.
    def enterVoid(self, ctx:grammarYAPLParser.VoidContext):
        pass

    # Exit a parse tree produced by grammarYAPLParser#Void.
    def exitVoid(self, ctx:grammarYAPLParser.VoidContext):
        pass


    # Enter a parse tree produced by grammarYAPLParser#BoolTru.
    def enterBoolTru(self, ctx:grammarYAPLParser.BoolTruContext):
        pass

    # Exit a parse tree produced by grammarYAPLParser#BoolTru.
    def exitBoolTru(self, ctx:grammarYAPLParser.BoolTruContext):
        pass



del grammarYAPLParser