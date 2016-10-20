package Quizes;

public class FillInTheBlank extends Question{
	
	private String userInput;
	
	public FillInTheBlank(String questions, String answer1)
	{
		super(questions, answer1);
		this.userInput = null;
	}
	
	public boolean isCorrect()
	{
		if(this.userInput != this.answer1)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
