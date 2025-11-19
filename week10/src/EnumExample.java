enum Color {
    RED, GREEN, BLUE
}

enum Day {
    MONDAY("월요일", 1),
    TUESDAY("화요일", 2),
    WEDNESDAY("수요일", 3),
    THURSDAY("목요일", 4),
    FRIDAY("금요일", 5),
    SATURDAY("토요일", 6),
    SUNDAY("일요일", 7);

    private String korean;
    private int order;

    // 생성자
    Day(String korean, int order) {
        this.korean = korean;
        this.order = order;
    }

    // 메서드
    public String getKorean() {
        return korean;
    }

    public int getOrder() {
        return order;
    }
}

enum Operation {
    PLUS {
        @Override
        public int calculate(int a, int b) {
            return a + b;
        }
    },
    MINUS {
        @Override
        public int calculate(int a, int b) {
            return a - b;
        }
    },
    MULTIPLY {
        @Override
        public int calculate(int a, int b) {
            return a * b;
        }
    },
    DIVIDE {
        @Override
        public int calculate(int a, int b) {
            return a / b;
        }
    };

    public abstract int calculate(int a, int b);
}

// 메인 클래스
public class EnumExample {
    public static void main(String[] args) {
        System.out.println("=== 1. 기본 열거형 ===");
        Color color = Color.RED;
        System.out.println("색상: " + color);
        System.out.println("색상 이름: " + color.name());
        System.out.println("색상 순서: " + color.ordinal());

        System.out.println("\n=== 2. 모든 열거형 상수 순회 ===");
        for (Color c : Color.values()) {
            System.out.println(c);
        }

        System.out.println("\n=== 3. 필드와 메서드가 있는 열거형 ===");
        Day today = Day.FRIDAY;
        System.out.println("요일: " + today);
        System.out.println("한글: " + today.getKorean());
        System.out.println("순서: " + today.getOrder());

        System.out.println("\n=== 4. 열거형 비교 ===");
        Day day1 = Day.MONDAY;
        Day day2 = Day.MONDAY;
        System.out.println("day1 == day2: " + (day1 == day2)); // true
        System.out.println("day1.equals(day2): " + day1.equals(day2)); // true

        System.out.println("\n=== 5. 문자열로 열거형 찾기 ===");
        String dayName = "WEDNESDAY";
        Day day = Day.valueOf(dayName);
        System.out.println(dayName + " -> " + day.getKorean());

        System.out.println("\n=== 6. Switch 문과 열거형 ===");
        switch (today) {
            case MONDAY:
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("평일입니다");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("주말입니다");
                break;
        }

        System.out.println("\n=== 7. 추상 메서드가 있는 열거형 ===");
        Operation op1 = Operation.PLUS;
        Operation op2 = Operation.MULTIPLY;

        System.out.println("10 + 5 = " + op1.calculate(10, 5));
        System.out.println("10 * 5 = " + op2.calculate(10, 5));
    }
}