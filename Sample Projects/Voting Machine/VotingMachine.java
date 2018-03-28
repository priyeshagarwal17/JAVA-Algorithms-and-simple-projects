
public class VotingMachine {
//data field variables
	
private	int democrats,republican;
	
//constructor	
	/*
	 * name: Voting Machine
	 * input: int, int
	 * output:
	 */
		public VotingMachine(int democrats,int republican)
		{
			this.democrats	= democrats;
			this.republican	= republican;
			
		}

//methods
	/*
	 * name: setDemocrats
	 * input: 
	 * output:void
	 */
		public void setDemocrats()
			{
			democrats+=3;
			}
	/*
	 * name: setRepublican
	 * input: 
	 * output:void
	 */
		public void setRepublican()
			{
			republican+=1;
			}
	/*
	 * name: resetVotes
	 * input: 
	 * output:void
	 */
		public void resetVotes()
			{
			democrats=0;
			republican=0;
			}
	/*
	 * name: getDemocratsRatio
	 * input: 
	 * output:float
	 */
		public float getDemocrats()
			{ 
			float k=  democrats/(float)(democrats+republican); 
			return k*100;
			}
	/*
	 * name: getrepublicanRatio
	 * input: 
	 * output:float
	 */
		public float getRepublican()
			{
			float k=  republican/(float)(democrats+republican); 
			return k*100;
			}
	/*
	 * name: display
	 * input: 
	 * output:void
	 */
		public void display()
		{
			System.out.println("4 new vots has been casted: 1 vote for republican and 3 votes for democrats.");
			setDemocrats(); // function call
			setRepublican(); // function call
			System.out.println("Current turnout: ");
			System.out.println("Election Turnout Rates:");
			System.out.printf("%-15s %.1f %s \n","Republican",getRepublican(),"%");
			System.out.printf("%-15s %.1f %s \n","Democrat",getDemocrats(),"%");
			
		}
	
}