
public class Grade2 {
	String[] subject;
	double[] score;

	Grade2(String[] subject, double[] score) {
		this.subject = subject;
		this.score = score;

	}

}

class testk {
	public static void main(String[] args) {

		String[] subject = { "��͊w�̕]�_:", "���`�㐔�w�̕]�_:", "Java�̕]�_:" };
		double[] score1 = { 3, 4, 2 };
		double[] score2 = { 4, 1, 5 };

		Grade2[] student = new Grade2[2];
		student[0] = new Grade2(subject, score1);
		student[1] = new Grade2(subject, score2);

		for (int j = 0; j < 2; j++) {
			if (j == 0) {
				System.out.println("A�N�̐���");
			} else {
				System.out.println("B�N�̐���");
			}
			for (int i = 0; i < 3; i++) {
				System.out.println(student[j].subject[i] + (int) student[j].score[i]);
			}
		}

	}

}