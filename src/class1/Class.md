### _클래스( Class )_
* * *
<br>

#### **클래스가 필요한 이유**
* * *

``` java
public class ClassStart {

    public static void main(String[] args) {
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;

        System.out.println("이름: " + student1Name + " 나이: " + student1Age + " 성적: " + student1Grade);
    }
}
```
위 예시처럼 배열을 사용하면 한계를 부딪힌다.<br>하나의 데이터를 삭제 및 수정을 거치는데 매우 조심해야하며 실수할 가능성이 농후하다.
**관리하기가 매우 어렵다는 것이다.** 대책방법은 학생이라는 개념을 하나로 묶는 것이다.
* * *
<br>

#### **클래스 도입**
* * *

```java
public class Student{
 String name;
 int age;
 int grade;
}
```
이렇게 **클래스에 정의한 변수들을 멤버 변수 혹은 필드**라 한다.
* 멤버 변수( Member Variable) : 특정 클래스의 소속 멤버이기 때문에 멤버 변수라 칭한다.
* 필드( Field ) : 데이터 항목을 가르키는 전통적인 용어이다. 데이터베이스, 엑셀 등에서 데이터 각각의 항목을 필드라 칭한다.
    <br> 자바에서 멤버 변수, 필드는 같은 뜻
*  *  *
<br>

#### **클래스, 객체, 인스턴스란?**
*  *  *

클래스는 **설계도**
```java
public class Example{
    String car;
    int age;
    int speed;
}
```
<br>

객체 혹은 인스턴스는 설계도를 기반으로 만든 실체화( 실제 메모리에 만들어진 )를 의미한다.
```java
public class Different{
    
    public static void main(String[] args) {
        Example example = new Example(); // new Example();이 과정을 '인스턴스화'라 한다.
    }
}
```
* `Example example` Example 타입을 받을수 있는 **변수를 선언**.
* `Example example = new Example();` 이 부분이 객체 혹은 인스턴스라 한다.
> 이 부분은 "example에 new Example()로 생성한 객체의 참조값을 담는다." 라고 생각하자.

<br>

#### 참조값을 변수에 보관해야 하는 이유 ?
객체를 생성하는 `new Example()` 코드 자체에는 아무런 이름이 없다. 단순히 `Example` 클래스를 기반으로 메모리에 실제 객체를 만드는 것이다.
따라서 생성한 객체에 접근할 수 있는 방법이 필요한게 그게 변수를 생성하는 것이다.

