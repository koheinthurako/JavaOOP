package OOPProject;

public class Alphabatic_Game implements Game_Control {
	
	int start;
	int skip;
	String question;
	
	public Alphabatic_Game() {
		start = Constant.random.nextInt(Constant.Initial_Number_Range);
		skip = Constant.random.nextInt(Constant.SKIP_COUNT+2);
	}

	@Override
	public String generateQuestion() {
		question = (char) (start + Constant.CONVERT_CHAR) + Constant.SPACING;
		for(int i = 1; i < Constant.LOOP_COUNT; i++) {
			start += skip;
			if(start > 25) start -= Constant.SKIP_COUNT;
			question += (char) (start + Constant.CONVERT_CHAR) + Constant.SPACING;
		}
		start += skip;
		return question;
	}

	@Override
	public void displayQuestion() {
		System.out.println(generateQuestion() + Constant.BLANK);
		
	}

	@Override
	public boolean checkAnswer() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getCor_ans() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
