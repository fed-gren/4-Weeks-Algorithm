# 입출력 정리

입출력 문제 풀며 공부한 내용 정리.

**Scanner sc = new Scanner(System.in);**

---

## sc.next(); VS sc.nextLine();
- sc.next() : 개행 문자('\n'), 공백('\0') 무시하고 입력받는다.
- sc.nextLine() : 개행 문자, 공백 포함 한 줄 단위로 입력받는다.(개행문자('\n')도 한 줄)

---

## sc.hasNext(); VS sc.hasNextLine();
- sc.hasNext() : 토큰이 있는지 확인하고 있으면 true, 없으면 false 반환.
- sc.hasNextLine() : 행이 있는지 확인하고 개행이 있으면 true, 없으면 false 반환.

sc.next()를 쓰는 상황에서는 sc.hasNext()로 판단.
sc.nextLine()을 쓰는 상황에서는 sc.hasNextLine()으로 판단.

---

## 타입변환

- ### char -> int

```java
int num = Character.getNumericValue('9');
//char 타입인 '9'를 integer 9로 변경.
```

---