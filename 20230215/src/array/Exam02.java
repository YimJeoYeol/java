package array;

public class Exam02 {

	public static void main(String[] args) {
		int score1=10, score2=50, score3=30, score4=100, score5=80;
		int sum =0;
		double avg=0.0;
		
		sum=score1+score2+score3+score4+score5;
		avg= sum/5.0;
		
		System.out.printf("합은  : %d%n",sum);
		System.out.printf("평균은 : %f%n ",avg);
		
		int[] score = {100, 50, 60, 88, 99};
		sum = 0;
		avg = 0.0;
		
		//sum = score[0]+score[1]+score[2]+score[3]+score[4];
		for(int i=0; i<score.length; i++) { //알아서 카운트해서 돌려준다
			sum =sum+score[i];
		}
		avg=sum/(double)score.length;
		System.out.printf("합은  : %d%n",sum);
		System.out.printf("평균은 : %f%n ",avg);
	}

}
