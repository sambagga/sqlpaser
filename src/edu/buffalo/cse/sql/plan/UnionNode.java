/**
 * A concrete implementation of a relational plan operator representing a union
 * operator.
 *
 **********************************************************
 * You should not need to modify this file for Project 1. *
 **********************************************************
 */

package edu.buffalo.cse.sql.plan;

import java.util.List;
import java.util.ArrayList;

import edu.buffalo.cse.sql.Schema;

public class UnionNode extends PlanNode.Binary {
  
  public UnionNode(){ super(PlanNode.Type.UNION); }
  
  public List<Schema.Var> getSchemaVars()
  {
    //This is unsafe.  You should have a typechecking step to validate that
    //the union's input schemas are alike.
    return getLHS().getSchemaVars();
  }
    
  public static UnionNode make(PlanNode lhs, PlanNode rhs){
    UnionNode u = new UnionNode();
    u.setLHS(lhs); u.setRHS(rhs);
    return u;
  }
}
