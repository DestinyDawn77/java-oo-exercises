package Quizes;

public class MultipleChoice extends Question{
	
	private int choice;
	private String answer2;
	private String answer3;
	private int correctAnswer;
	
	public MultipleChoice(String questions, String answer1, String answer2, String answer3, int correctAnswer){
		super(questions, answer1);
		this.answer2 = answer2;
		this.answer3 = answer3;
		this.correctAnswer = correctAnswer;
			
	}
	
	public boolean isCorrect()
	{
		if (choice !=correctAnswer)
			return false;
		else
			return true;
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
