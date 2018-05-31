import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class breadthFirstSearch {
Node startnode;
Node goalnode;

public breadthFirstSearch(Node start,Node goal)
	{this.startnode=start;
	 this.goalnode=goal;	
	}
public boolean compute()
	{if(this.startnode.equals(goalnode))
		{System.out.println("Goal Node Found!");
		 System.out.println(startnode);
		}
Queue<Node>queue=new LinkedList<>();
ArrayList<Node>explored=new ArrayList<>();
queue.add(this.startnode);
explored.add(startnode);
      while(!queue.isEmpty() )
      {
    	  
      }
	
}
}
