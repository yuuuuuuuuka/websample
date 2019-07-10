package member;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class memberWIterJava {
	public static void main(String[] args) {

//		try {
//			// FileWriterクラスのオブジェクトを生成する
//			FileWriter file = new FileWriter("memver.csv", true);
//			// PrintWriterクラスのオブジェクトを生成する
//			PrintWriter pw = new PrintWriter(new BufferedWriter(file));
//
//			//ファイルに追記する
//			pw.println("鹿島" + "," + 5 + "第五システム統括部" + "," + 1);
//			//	            pw.println("banana");
//
//			//ファイルを閉じる
//			pw.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}

//	    try {
//
//	      File csv = new File("member.csv"); // CSVデータファイル
//	      // 追記モード
//	      BufferedWriter bw
//	        = new BufferedWriter(new FileWriter(csv, true));
//	      // 新たなデータ行の追加
//	      bw.write("鹿島" + "," + "5" + "," + "第五システム統括部" + "," + "1");
//	      bw.newLine();
//	      bw.close();
//
//	    } catch (FileNotFoundException e) {
//	      // Fileオブジェクト生成時の例外捕捉
//	      e.printStackTrace();
//	    } catch (IOException e) {
//	      // BufferedWriterオブジェクトのクローズ時の例外捕捉
//	      e.printStackTrace();
//	    }
//	}
		try {
			File f = new File("memver.csv");
			BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));

			bw.write("鹿島" + "," + 5 + "," + "第五システム統括部" + "," + 1);
			bw.newLine();

			bw.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}
