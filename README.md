# java-calculator
문자열을 입력받아 사칙연산이 가능한 계산기를 개발합니다. 

- 본 저장소는 [우아한 테크캠프 저장소](https://github.com/woowacourse/java-calculator)를 참고했으며, 개인 공부 용도로 사용합니다. 



### 목표

- Java 기본 문법 사용을 습득한다.
- JUnit 사용법을 익혀 테스트 코드를 작성한다.



### 기능 요구사항

- 사용자가 입력한 문자열 값에 따라 사칙연산을 수행할 수 있는 계산기를 구현해야 한다.

- 입력 문자열의 숫자와 사칙 연산 사이에는 반드시 빈 공백 문자열이 있다고 가정한다.

- 나눗셈의 경우 결과 값을 정수로 떨어지는 값으로 한정한다.

- 문자열 계산기는 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다. 즉, 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하지만 이를 무시한다. 예를 들어 2 + 3 * 4 / 2와 같은 문자열을 입력할 경우 2 + 3 * 4 / 2 실행 결과인 10을 출력해야 한다.

  

### 실행 결과

```
연산식을 입력합니다.
2 + 3 * 4 / 2

>> 10
```



### 구현할 기능 목록

- [ ] 사용자는 문자열(식)을 입력한다. 
- [ ] 공백 기준으로 숫자와 연산자를 구분한다.
- [ ] 사용자 입력을 예외처리한다. 
  - [ ] 연산자(`+`, `-`, `/`,  `*`,`=`  )를 제외한 기호를 사용한 경우
  - [ ] 숫자나 기호를 연속으로 입력한 경우
  - [ ] 공백만 입력한 경우
  - [ ] 공백을 연속으로 입력한 경우
  - [ ] 0으로 나누는 경우
  - [ ] 범위(double) 이상의 숫자를 입력한 경우
- [ ] 사칙 연산한다.
- [ ] 연산 결과를 출력한다.







