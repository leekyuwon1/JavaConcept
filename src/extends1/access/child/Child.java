package extends1.access.child;

import extends1.access.parent.Parent;

public class Child extends Parent {

    public void call() {
        publicValue = 1;
        protectedValue = 1; // 상속 관계 / 같은 패키지 안
//        defaultValue = 1; // 다른 패키지에서는 접근 불가
//        privateValue = 1; // 같은 클래스 외 접근 불가.

        publicMethod();
        protectedMethod(); // 상속관계 / 같은 패키지 안
//        defaultMethod(); // 같은 패키지만 가능
//        privateMethod(); // 같은 클래스만 가능

    }

}
