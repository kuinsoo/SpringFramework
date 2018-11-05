package kr.or.ddit.lotto;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class LottoTest {
	
	@Test
	public void test() {
		/***Given***/
		/***When***/
		Lotto lotto = new Lotto("한국",6);
		int[] lottoNumbers = lotto.getNumbers(); //배열값
		/***Then***/
		System.out.println(lotto.toString() + "\n");

		//50회차 결과 조회
		for (int i = 1; i < 51; i++) {
			int[] lottoNumber = lotto.getNumbers();
			System.out.println(i+"회차: " + Arrays.toString(lottoNumber));
		}

		assertEquals(6, lottoNumbers.length);
	}

}
