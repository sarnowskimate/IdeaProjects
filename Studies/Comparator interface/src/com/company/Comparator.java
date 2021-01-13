package com.company;

public interface Comparator {
    public int compare(Object left, Object right) throws ClassCastException;
} // generalized comparison operator

/* W algorytmach sortowania (ale nie tylko w nich) interfejs
Comparator wprowadza oddzieleniekryterium sortowania od samego algorytmu sortowania.
Płyną stąd różne korzyści, np.:
    - algorytm może być wyposażany (np. rozszerzany) w różne "wtyczki", określające różne kryteria sortowania,
    - różne algorytmy mogą być miarodajnie porównywane pod względem wydajności (przy tej samej złożoności
    operacji porównywania elementów w tych algorytmach).

    Możliwość definiowania różnychkomparatorów prowadzi do uproszczenia kodu aplikacji.
 */

