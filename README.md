# 섯다 게임
###### Member. 김정렬, 김재윤, 박미람, 소성민

<br/>
<br/>

### 섯다 흐름도
> [!TIP]
> 🟠 - start, end
>
> 🟩 - console 출력
> 
> 🟦 - 조건문
> 
> 🟨 - 실행

![Java-12](https://github.com/encore-full-stack-5/gambling-git/assets/125454927/06ca4a38-316f-4463-8ea8-dba1b3f12c2d)

<br/>

### 코드 간단설명

> **카드 분배**
> 
![Java-13 (2)](https://github.com/encore-full-stack-5/gambling-git/assets/125454927/a621febd-4e05-4c46-94fa-eb5b0b601371)
#### makeCard( ) - 카드 20장 만들기
#### draw( ) - List에 카드 4장 뽑기(랜덤, 중복제거)
#### pickMyCardList( ), pickComputerCardList( ) - 나/컴퓨터에게 draw()로 뽑은 카드 2장씩 분배

<br/>

> **점수 계산**
> 
![Java-13 (1)](https://github.com/encore-full-stack-5/gambling-git/assets/125454927/c255577b-2370-47d4-9b4f-1edfb7f905ed)
#### start( ) - 카드 조합 점수 (Integer)
#### startResult( ) - 카드 조합 결과 (String)

<br/>

> **점수**
> 
![Java-14 (1)](https://github.com/encore-full-stack-5/gambling-git/assets/125454927/1fdf1db2-92de-42c7-abf8-d93df397a9c9)

<br/>

> **특수 족보 조건**
> 
![Java-14 (2)](https://github.com/encore-full-stack-5/gambling-git/assets/125454927/74223093-b82a-4df2-a289-82cab0023416)

<br/>

**버그 모음**
<br/>
1️⃣ (나)삼팔광땡, (컴퓨터)아무거나 출력 -> 컴퓨터 값이 무조건 1끗으로 나오고, 패배했습니다!로 출력됨
<br/>
2️⃣ 멍구사/파토/무승부 -> 재경기 -> 결과 확인 -> 1. 게임 종료 선택 -> 종료되지 않음
<br/>
<br/>
**추후 하고 싶은 것**
<br/>
1️⃣ 위 버그들 수정
<br/>
2️⃣ 회원/로그인 만들기 (DB활용)
<br/>
3️⃣ 유저들에게 돈(게임머니) 지급 -> 게임을 통해 돈+-
<br/>
4️⃣ 유저VS컴퓨터가 아닌 PVP로 플레이 (PVP를 할 수 없어도 구현)
<br/>
5️⃣ 스레드 활용 (ex. (멍구사/파토/무승부) 재경기 시작 전 2~3초 대기)
