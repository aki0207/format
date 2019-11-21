package format;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Main {

	public static void main(String[] args) {
		// 独自にフォーマット形式を作成
		BigDecimal num = new BigDecimal("12345.0000");
		// #は数字。ゼロだと表示されない
		// 0は数字
		// 百の位にカンマを入れている
		// 小数点以下に0を4つ入れているがここは別に4つじゃなくて必要に応じて変更可能
		DecimalFormat decimalFormat = new DecimalFormat("#,##0.0000");
		System.out.println(decimalFormat.format(num));
		
		// 表示形式が既定のフォーマット
		// カンマ区切り
		NumberFormat nfNum = NumberFormat.getNumberInstance(); 
		System.out.println(nfNum.format(12345.6789));
		
		// 0埋め
		// 6の部分が全体の桁数を表していて第二引数の桁が6未満なら6桁まで0で埋める
		System.out.println(String.format("%06d", 12));
		

	}

}
