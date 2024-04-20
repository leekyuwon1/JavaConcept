package access;

public class SpeakerMain {

    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);

        speaker.showVolume();
        speaker.volumeUp();

        speaker.showVolume();
        speaker.volumeUp();

        speaker.volumeDown();
        speaker.showVolume();

        // 필드에 직접 접근(다른 개발자가 볼륨 100 이상 더 올릴려고 가정을 했다.)
        System.out.println("volume 필드 직접 접근 수정");
//        speaker.volume = 200; // volume 필드를 private로 막아서 직접 접근을 할 수 없다.
        speaker.showVolume();

    }
}
