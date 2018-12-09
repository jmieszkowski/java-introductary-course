Zadanie 3
Klasa DepartamentBudget posiada atrybut zawierający mapę departamentów z listą pracowników ( jak w zadaniu drugim).
Każdy departament ma atrybut budget odpowiadający jego maksymalnemu budżetowi.
Jednocześnie, każdy z pracowników departamentu zarabia pieniążki określone w jego atrybucie salary.

Zadanie polega na wskazaniu departamentów, w których sumaryczna pensja pracowników przekracza budżet:
- metoda public List<Departament> getBudgetViolatingDepartaments() zwraca listę departamentów z przekroczonym budżetem;
W zadaniu "na szóstkę" dodatkowo należy zwrócić informację o kwocie przekroczenia (czyli suma zarobków pracowników - budżet):
- metoda public List<OrderedPair<Departament, Long>> getBudgetViolationsWithAmounts() zwraca listę typu generycznego OrderedPair
- typ generyczny OrderedPair<V,U> reprezentuję uporządkowaną parę wartości. posiada konstruktor przyjmujący parametry V i U, czyli w naszym przypadu Departament i Long.

