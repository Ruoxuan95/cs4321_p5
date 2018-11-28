package data;

import java.util.List;
import java.util.Set;

public class PlanCostInfo {
	public int cost;
	public int outputSize;
	public String bestOrder;
	public Set<String> allTables;//All the joined tables (aliases);
	
	public PlanCostInfo(int c, int o, String order, Set<String> tableAliases) {
		this.cost = c;
		this.outputSize = o;
		this.bestOrder = order;
		this.allTables = tableAliases;
	}

}