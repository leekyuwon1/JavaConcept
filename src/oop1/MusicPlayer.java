package oop1;

public class MusicPlayer {

    int volume = 0;
    boolean isOn = false;

    void on() {
        isOn = true;
        System.out.println("음악 플레이어를 실행합니다.");
    }

    void off() {
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다. " );
    }

    void volumeUp() {
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("음악 플레이어 볼륨: " + volume);
    }

    void volumeState() {
        System.out.println("음악 플레이어 상태 확인");
        if (isOn == true) {
            System.out.println("음악 플레이어 ON, 볼륨: " + volume);
        } else if( isOn ) {
            System.out.println("음악 플레이어 꺼짐");
        }
    }
}
