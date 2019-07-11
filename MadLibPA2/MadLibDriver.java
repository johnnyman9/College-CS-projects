/************************************************************
 * MadLibDriver - Starts the process of playing the MadLib game
 *
 * @author johnny Haizel-Cobbina
 * @version V1 - 22 October 2015
 ************************************************************/
 public class MadLibDriver
 {
 	/*********************************************************
	 * main builds the MadLib object and starts the story
	 *
	 * @param args Command line arguments - unused in this application
	 *********************************************************/
	public static void main(String args[])
	{
		MadLib myStory;
		myStory = new MadLib();
     
		
		myStory.tellStory();
	}
}
