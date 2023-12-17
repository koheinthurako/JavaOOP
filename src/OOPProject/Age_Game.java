package OOPProject;

public class Age_Game implements Game_Control {
	
	int age;
	int dif_age;
	int cor_ans;
	String question;
	
	public Age_Game() {
		age = Constant.random.nextInt(100);
		do {
			dif_age = Constant.random.nextInt(Constant.Initial_Number_Range) + 1;
		} while (dif_age%2!=0);
		this.cor_ans = age + (dif_age/2);
	}
	
	
	public int getCor_ans() {
		return cor_ans;
	}


	public void setCor_ans(int cor_ans) {
		this.cor_ans = cor_ans;
	}



	@Override
	public String generateQuestion() {
		question = "I am currently "+ age +" years old, and my age is exactly half of my brother's age when he was " + dif_age + " years old. How old is my brother?";
		return question;
	}

	@Override
	public void displayQuestion() {
		System.out.println(generateQuestion());
	}

	@Override
	public boolean checkAnswer() {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
