package kr.or.ddit.lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {
	private String country;
	private int balls;

	public Lotto(String country, int balls) {
		super();
		this.country = country;
		this.balls = balls;
	}


	public Lotto() {
		super();
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public int getBalls() {
		return balls;
	}


	public void setBalls(int balls) {
		this.balls = balls;
	}


	public int[] getNumbers() {
		int countryNum = 0 ;
		if(this.country.equals("한국")) {
			countryNum = 45;
		}else {
			countryNum = 55;
		}

		//원하는 공만큼 배열을 생성한다.
		int[] ballArr = new int[this.balls];

		//리스트에 공을 담는다.
		List<Integer> ballList = new ArrayList<>();
		for (int i = countryNum; i > 0; i--) {
			ballList.add(i);
		}
		//리스트를 섞는다.
		Collections.shuffle(ballList);

		//결과값에 넣어줄 String을 생성한다.
		StringBuffer lotto = new StringBuffer();

		//랜덤으로 섞인 리스트에서 원한 개수 만큼 배열에 담는다.
		for (int i = 0; i < ballArr.length; i++) {
			ballArr[i] = ballList.get(i);
			lotto.append(ballArr[i]+ " ");
		}
		return ballArr;
	}


	@Override
	public String toString() {
		//결과값에 넣어줄 String을 생성한다.
		StringBuffer lotto = new StringBuffer();
		int[] ballArr = this.getNumbers();
		for (int i = 0; i < ballArr.length; i++) {
			lotto.append(ballArr[i]+ " ");
		}
		return "Lotto [ " + country +"식" + "," + balls + "개 ] = " + lotto;
	}

}
