public class DataType {
    public static void main(String[] args) {
        // 충돌해결하는법
        // 데이터 타입과 형변환
        int score = 71;
        float gpa = 4.13F;
        System.out.println(score);
        //콘솔에 내용 찍고 줄바꿈 해주는 메소드
        //score = 99.9;
        score = (int)99.9;
        System.out.println(score);
        System.out.println(gpa);
        //score = gpa;
        score = (int)gpa;
        System.out.println(score);
        System.out.println(gpa);
        //gpa = score; //묵시적 형변환
        gpa = (float)score;  //묵시적 형변환
        System.out.println(gpa);
    }
}
