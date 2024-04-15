package oop1;

public class MusicPlayMain1 {

    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        //음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이어를 실행합니다.");

        //볼륨 증가
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);

        //볼륨 증가
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);

        //볼륨 감소
        volume--;
        System.out.println("음악 플레이어 볼륨: " + volume);

        //음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (isOn == true) {
            System.out.println("음악 플레이어 ON, 볼륨: " + volume);
        } else if( !isOn ) {
            System.out.println("음악 플레이어 꺼짐");
        }

        //음악 플레이어 끄기
        if (isOn == true) {
            isOn = false;
            System.out.println("음악 플레이어를 종료합니다. " );
        }


    }
}
