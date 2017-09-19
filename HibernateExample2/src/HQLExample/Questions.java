package HQLExample;

import javax.persistence.Entity;   
import javax.persistence.Id;
import javax.persistence.OneToOne;
//import javax.persistence.GeneratedValue;

@Entity
public class Questions 
{
	@Id 
	int quesno=0;
	String question;
	@OneToOne
	Answers answer;
	
	public int getQuesno() {
		return quesno;
	}
	public void setQuesno(int quesno) {
		this.quesno=quesno;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Answers getAnswer() {
		return answer;
	}
	public void setAnswer(Answers answer) {
		this.answer = answer;
	}
	
}
