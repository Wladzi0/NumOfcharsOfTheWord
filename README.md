1. Napisać funkcję liczZnakiSlowa, która zlicza:  
• liczbę znaków w pliku,
• liczbę białych znaków w pliku (białe znaki to spacja, tabulator, znacznik końca wiersza), 
• liczbę słów w pliku.  
Wynikiem funkcji jest tablica złożona z 3 liczb całkowitych po jednej dla wymienionych podpunktów. 
 
2. Napisać funkcję:  
 
public static void szukaj(String nazwaPlikWe, String nazwaPlikWy, String słowo) 
 
której zadaniem jest znalezienie wszystkich wierszy w pliku, które zawierają szukane słowo. Wszystkie wiersze, które zawierają słowo powinny zostać zapisane w pliku wynikowym wraz z nr wiersza (z pierwszego pliku). Nazwa pierwszego pliku zapamiętana jest w parametrze nazwaPlikWe, nazwa pliku wynikowego podana jest w parametrze nazwaPlikWy, natomiast szukane słowo w parametrze słowo.  Przykład - plik wejściowy: 
 
 Ala ma jutro egzamin z biologii.  
 Jan myje auto. Eh, jutro kolejny egzamin.  
 Nie lubię polityki. 
 
Jeżeli szukanym słowem byłoby ”egzamin”, to plik wynikowy powinien wyglądać następująco:  
 
1: Ala ma jutro egzamin z biologii. 
3: Eh, jutro kolejny egzamin. 

 
