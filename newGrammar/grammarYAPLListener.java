// Generated from .\grammarYAPL.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammarYAPLParser}.
 */
public interface grammarYAPLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammarYAPLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(grammarYAPLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarYAPLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(grammarYAPLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarYAPLParser#create_class}.
	 * @param ctx the parse tree
	 */
	void enterCreate_class(grammarYAPLParser.Create_classContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarYAPLParser#create_class}.
	 * @param ctx the parse tree
	 */
	void exitCreate_class(grammarYAPLParser.Create_classContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarYAPLParser#feature}.
	 * @param ctx the parse tree
	 */
	void enterFeature(grammarYAPLParser.FeatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarYAPLParser#feature}.
	 * @param ctx the parse tree
	 */
	void exitFeature(grammarYAPLParser.FeatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarYAPLParser#formal}.
	 * @param ctx the parse tree
	 */
	void enterFormal(grammarYAPLParser.FormalContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarYAPLParser#formal}.
	 * @param ctx the parse tree
	 */
	void exitFormal(grammarYAPLParser.FormalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dispatch}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDispatch(grammarYAPLParser.DispatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dispatch}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDispatch(grammarYAPLParser.DispatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Paranthesis}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParanthesis(grammarYAPLParser.ParanthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Paranthesis}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParanthesis(grammarYAPLParser.ParanthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SumandMinus}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSumandMinus(grammarYAPLParser.SumandMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SumandMinus}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSumandMinus(grammarYAPLParser.SumandMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Loops}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLoops(grammarYAPLParser.LoopsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Loops}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLoops(grammarYAPLParser.LoopsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code InverseBits}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterInverseBits(grammarYAPLParser.InverseBitsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code InverseBits}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitInverseBits(grammarYAPLParser.InverseBitsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewType}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNewType(grammarYAPLParser.NewTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewType}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNewType(grammarYAPLParser.NewTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code INT}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterINT(grammarYAPLParser.INTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code INT}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitINT(grammarYAPLParser.INTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(grammarYAPLParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(grammarYAPLParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThanorEqual}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanorEqual(grammarYAPLParser.GreaterThanorEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThanorEqual}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanorEqual(grammarYAPLParser.GreaterThanorEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolFal}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolFal(grammarYAPLParser.BoolFalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolFal}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolFal(grammarYAPLParser.BoolFalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(grammarYAPLParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(grammarYAPLParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqual(grammarYAPLParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqual(grammarYAPLParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Content}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterContent(grammarYAPLParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Content}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitContent(grammarYAPLParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IFs}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIFs(grammarYAPLParser.IFsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IFs}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIFs(grammarYAPLParser.IFsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CreateVar}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCreateVar(grammarYAPLParser.CreateVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CreateVar}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCreateVar(grammarYAPLParser.CreateVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MultandDiv}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMultandDiv(grammarYAPLParser.MultandDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MultandDiv}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMultandDiv(grammarYAPLParser.MultandDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STRING}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSTRING(grammarYAPLParser.STRINGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STRING}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSTRING(grammarYAPLParser.STRINGContext ctx);
	/**
	 * Enter a parse tree produced by the {@code self}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSelf(grammarYAPLParser.SelfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code self}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSelf(grammarYAPLParser.SelfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign(grammarYAPLParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assign}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign(grammarYAPLParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ID}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterID(grammarYAPLParser.IDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ID}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitID(grammarYAPLParser.IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Void}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVoid(grammarYAPLParser.VoidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Void}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVoid(grammarYAPLParser.VoidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BoolTru}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBoolTru(grammarYAPLParser.BoolTruContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BoolTru}
	 * labeled alternative in {@link grammarYAPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBoolTru(grammarYAPLParser.BoolTruContext ctx);
}