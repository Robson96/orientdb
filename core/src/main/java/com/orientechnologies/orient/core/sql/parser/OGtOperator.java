/* Generated By:JJTree: Do not edit this line. OGtOperator.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

public
class OGtOperator extends SimpleNode  implements OBinaryCompareOperator{
  public OGtOperator(int id) {
    super(id);
  }

  public OGtOperator(OrientSql p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(OrientSqlVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }

  @Override public boolean execute(Object left, Object right) {
    return false;
  }
}
/* JavaCC - OriginalChecksum=4b96739fc6e9ae496916d542db361376 (do not edit this line) */
