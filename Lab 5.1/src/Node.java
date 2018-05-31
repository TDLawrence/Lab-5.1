
import java.util.ArrayList;
public class Node {
ArrayList<Node>children;
//Node class
public Node()
{this.children=children;
}

public ArrayList<Node> getChildren()
{ArrayList<Node>childNodes=new ArrayList<Node>();
 int x=children.size();
 for (int y=0;y<x;y++)
  {if(this.children.get(y)!=null)
   {childNodes.add(this.children.get(y));  
   }	 
  }
	return childNodes;
}
 
 public boolean removeChild (Node n)
 {return false;
	 
 }
}
