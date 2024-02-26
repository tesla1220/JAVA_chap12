package com.ohgiraffers.section01.list.run;

import org.w3c.dom.DOMStringList;

import java.util.*;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표 : 컬렉션 프레임워크에 대한 이해 */
        /* 필기
        *   컬렉션 프레임워크 (Collection Framework)
        *   자바에서 컬렉션 프레임워크는 여러가지 다양한 데이터들을 쉽고 효과적으로 처리할 수 있도록 표준화된 방법을 제공하는 클래스들의 집합
        *   즉, 데이터는 효율적으로 저장하는 자료구조와 데이터를 처리하는 알고리즘을 미리 인도, 미국형들이 구현해둠  */

        /* 필기
        *   Collection Framework는 크게 3가지 인터페이스 중 한 가지를 상속받아 구현해둠
        *   1. List 인터페이스
        *   2. Set 인터페이스
        *   3. Map 인터페이스
        *
        *   필기
        *    List 인터페이스와 Set 인터페이스의 공통 부분을 Collection 인터페이스에서 정의하고 있음
        *    하지만 Map은 구조상의 차이로 Collection 인터페이스에서 정의하고 있지 않음
        *   */

        /* 필기
        *   각 인터페이스별 특징
        *   1. List 인터페이스
        *       - 순서있는 데이터 집합. 데이터 중복 저장 O
        *       - Vector, ArrayList, LinkedList, Stack, Queue 등
        *   2. Set 인터페이스
        *       - 순서가 없는 데이터 집합. 데이터 중복 허용 X
        *       - HashSet, TreeSet 등
        *   3. Map 인터페이스
        *       - 키와 값 한 쌍으로 이뤄지는 데이터 집합
        *       - Key를 set 방식으로 ㅛ관리하기 때문에 데이터 순서 관리X, 중복된 Key 허용 X
        *       - Hash, TreeMap, HashTable, Properties 등
        *   */

        /* 필기 -  ArrayList
        *   - 가장 많이 사용되는 컬렉션의 클래스 ( JDK 1.2 버전부터 제공)
        *   - 내부적으로 배열을 이용해 요소 관리
        *   - 인덱스를 이용해 배열 요소에 빠르게 접근 가능
        *   - 배열의 단점 보완을 위해 만들어짐 (배열의 단점: 크기 변경 불가, 요소의 추가 및 수정 삭제 정렬 등이 복잡함)
        *   - 크기변경(새로운 더 큰 배열 만들고 옮기기), 요소의 추가 수정 삭제 정렬 기능을 미리 메소드로 구현해 제공함 */


        ArrayList alist = new ArrayList();


        /* 필기
        *   다형성을 적용해 상위 레퍼런스로 ArrayList 객체를 만들 수 있음
        *   List 인터페이스 하위의 다양한 구현체들로 타입 변경이 가능하기 때문에
        *   레퍼런스 타입은 List로 해두는 게 더 유연한 코드를 작성하는 것 */

        List list = new ArrayList<>();

        alist.add("apple");
        alist.add(123);         // autoBoxing (값 -> 객체 / int -> Integer)
        alist.add(45.67);
        alist.add(new Date());

        System.out.println("alist = " + alist);

        /* 필기
        *   arrayList 의 크기는 size()로 확인 가능
        *   단, size() 는 배열의 크기가 아닌 요소의 개수를 반환함 */

        System.out.println("alist의 size: " + alist.size());

        for (int i = 0; i < alist.size(); i++) {

            System.out.println(i + " : " + alist.get(i));
        }

        /* 필기 - 데이터의 중복 판단 */
        alist.add("apple");
        System.out.println("alist = " + alist);

        /* 필기
        *   - 원하는 인덱스 위치에 값 추가 가능.
        *   - 새로운 값이 들어가는 인덱스 위치에 값을 넣고 이후 인덱스는 하나씩 뒤로 밀리게 됨 */

        alist.add(1,"banana");
        System.out.println("alist = " + alist);

        alist.remove(2);
        System.out.println("alist = " + alist);

        alist.set(1, true);
        System.out.println("alist = " + alist);

        List<String> stringList =  new ArrayList<>();
//        stringList.add(123);       <= 지정한 타입이 아닌 인스턴스는 저장 불가
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("orange");
        stringList.add("mango");
        stringList.add("grapes");

        System.out.println("stringList = " + stringList);

        Collections.sort(stringList);

        System.out.println("stringList = " + stringList);

        stringList = new LinkedList<>(stringList);
        
        /* 필기 
        *   Iterator 란? 
        *   Collection 인터페이스의 iterator() 메소드를 이용해서 인스터를 생성할 수 있다.
        *   hasNext() : 다음 요소를 가지고 있으면 true, 더 이상 요소가 없으면 false를 반환
        *   next() : 다음 요소(값)을 반환 
        *   */
        
        Iterator<String> dIter = ((LinkedList<String>)stringList).descendingIterator();
        
        /* 필기 - 역순으로 정렬된 결과를 저장하기 위해 새로운 ArrayList를 만들어서 저장 */
        List<String> descList = new ArrayList<>(); 
        
        while (dIter.hasNext()){
            descList.add(dIter.next());
        }

        System.out.println("descList = " + descList);
        

    }
}
