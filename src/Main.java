import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("== 명언 앱 실행 ==");
		int lastid = 0;
		while (true) {
			System.out.print("명령어 ) ");
			String cmd = sc.nextLine();
			if (cmd.equals("등록")) {
				System.out.print("명언: ");
				String wisesaying = sc.nextLine();
				System.out.print("작가: ");
				String writer = sc.nextLine();
				int id = lastid + 1;
				System.out.printf("%d번 명언이 등록되었습니다.\n", id);
				WiseSaying ws = new WiseSaying(id, wisesaying, writer);

				lastid++;
			} else if (cmd.equals("목록")) {

				System.out.println("번호 / 작가 / 명언");
				System.out.println("=".repeat(20));

			}

		}

	}
}

class WiseSaying {
	int id;
	String wisesaying;
	String writer;

	public WiseSaying(int id, String wisesaying, String writer) {
		this.id = id;
		this.wisesaying = wisesaying;
		this.writer = writer;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWisesaying() {
		return wisesaying;
	}

	public void setWisesaying(String wisesaying) {
		this.wisesaying = wisesaying;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

}
