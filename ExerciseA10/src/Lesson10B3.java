import java.time.LocalDateTime;

public class Lesson10B3 {
	public static void main(String[] arg) {
		LocalDateTime today = LocalDateTime.now();
		int year = today.getYear();
		int month = today.getMonthValue();
		int date = today.getDayOfMonth();
		int int_day = today.getDayOfWeek().getValue();
		int hour = today.getHour();
		int minute = today.getMinute();
		int second = today.getSecond();
		String day = "";
		switch (int_day) {
		case 1:
			day = "月";
			break;
		case 2:
			day = "火";
			break;
		case 3:
			day = "水";
			break;
		case 4:
			day = "木";
			break;
		case 5:
			day = "金";
			break;
		case 6:
			day = "土";
			break;
		case 7:
			day = "日";
			break;
		default:
			break;
		}

		System.out.printf("%d年%d月%d日(%s)%d時%d分%d秒%n",
				year, month, date, day, hour, minute, second);
	}
}
