/* Generated By:JJTree: Do not edit this line. ASTGroupCondition.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.bigdata.rdf.sail.sparql.ast;

import com.bigdata.rdf.sail.sparql.ast.ASTVar;
import com.bigdata.rdf.sail.sparql.ast.Node;
import com.bigdata.rdf.sail.sparql.ast.SimpleNode;
import com.bigdata.rdf.sail.sparql.ast.SyntaxTreeBuilder;
import com.bigdata.rdf.sail.sparql.ast.SyntaxTreeBuilderVisitor;
import com.bigdata.rdf.sail.sparql.ast.VisitorException;

public
class ASTGroupCondition extends SimpleNode {
  public ASTGroupCondition(int id) {
    super(id);
  }

  public ASTGroupCondition(SyntaxTreeBuilder p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SyntaxTreeBuilderVisitor visitor, Object data) throws VisitorException {
    return visitor.visit(this, data);
  }
  
  public String getName() {
	  // TODO does this make sense?
	  Node child = jjtGetChild(0);
	  if (child instanceof ASTVar) {
		  return ((ASTVar)child).getName();
	  }
	  else {
		  return child.toString();
	  }
  }
}
/* JavaCC - OriginalChecksum=3fe90d53e04abf41957a57903ffddb49 (do not edit this line) */