/* Generated By:JJTree: Do not edit this line. OInstanceofCondition.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=true,NODE_PREFIX=O,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.orientechnologies.orient.core.sql.parser;

import com.orientechnologies.orient.core.db.record.OIdentifiable;

public
class OInstanceofCondition extends OBooleanExpression {
  public OInstanceofCondition(int id) {
    super(id);
  }

  public OInstanceofCondition(OrientSql p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(OrientSqlVisitor visitor, Object data) {
    return visitor.visit(this, data);
  }

  @Override public boolean evaluate(OIdentifiable currentRecord) {
    return false;
  }
}
/* JavaCC - OriginalChecksum=0b5eb529744f307228faa6b26f0592dc (do not edit this line) */
