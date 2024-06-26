Task1
При доставяне на пратки е необходимо да се изчисли каква е цената на пратката. Всяка пратка може да бъде доставена до адреса на клиента, за което се добавя допълнителна стойност към цената. Освен това пратките могат да бъдат "документи" или "пратки с тегло". Цената на пратките с тегло зависи от теглото, цената на кг. и дали пратката е чуплива. Цената за доставяне на документа се определя от минимална цена за доставка. Да се реализират класовете, абстрактните класове и интерфейсите, които са описани по-долу:

Нещо, което може да се доставя (Deliverable) - обект, който може да се доставя и цената за доставката му трябва да се изчислява.
Пратка (DeliverableItem) се определя от член-данна, която показва дали пратката ще се доставя до адреса на клиента. Тук се пази допълнителна цена, която се добавя, ако пратката трябва да се достави до адреса на клиента. Тази допълнителна цена е една и съща за всички пратки.
Материал (Material) се определя от име и информация дали е чуплив.
Документ (Document) се определя от минимална цена, за която ще се извърши доставката на документа.
Пратка с тегло (WeightedItem) се определя от материала, от който е направена пратката, тегло в кг. и цена за доставка на кг.
Да се реализира интерфейс Deliverable с метод deliveryPrice().

В клас DeliverableItem да се създадат следните методи:

Конструктор с 1 параметър.
Метод deliveryPrice(), който връща колко е цената за доставка на пратката.
В клас Material да се реализират следните методи:

Конструктор с 2 параметъра.
Метод, който връща дали материалът е чуплив.
В клас Document да се реализират следните методи:

Конструктор с 2 параметъра.
Метод deliveryPrice(), който връща колко е цената за доставка на документ. Цената за доставка на един документ се определя като към минималната цена се добави допълнителната цена, ако документът трябва да се достави до адреса на клиента. Ако документът не се доставя до адреса на клиента, цената за доставката съвпада с минималната цена.
В клас WeightedItem да се реализират следните методи:

Конструктор с 4 параметъра.
Метод deliveryPrice(), който връща колко е цената за доставка на пратката. Цената за доставка на пратка с тегло се определя от цената за 1 кг. и теглото на пратката + допълнителната цена, ако пратката е до адреса на клиента. Получената цена се увеличава с 1%, ако пратката е чуплива.
Да се създаде референция от тип Deliverable, която да се използва за обект от тип документ. Да се отпечата на конзола колко е цената за доставката на този обект.

Референцията от тип Deliverable да се използва и за обект от тип пратка с тегло. Да се отпечата на конзола колко е цената за доставката на този обект.

Input Format

Glass    // name of the material
1        // (true) is fragile 
1        // (true) is the delivery to the client's address
5        // minPrice
10       // weight
1.2      // pricePerKg
2        // additionalPrice
Constraints

Допълнителната цена (за доставка до адреса на клиента), цената на килограм, минималната цена и теглото на пратката трябва да са положителни числа. Ако при задаване на стойностите на тези член-данни не се подава положително число, трябва тяхната стойност да бъде 1.

Output Format

7.0
14.14
Sample Input 0

Glass
1
1
5
10
1.2
2
Sample Output 0

7.0
14.14
Sample Input 1

Timber
0
1
5
10
1.2
2
Sample Output 1

7.0
14.0
Sample Input 2

Glass
1
0
5
10
1.5
2
Sample Output 2

5.0
15.15
Sample Input 3

Timber
0
0
5
10
1.5
2
Sample Output 3

5.0
15.0
Sample Input 4

Glass
1
1
0
0
-1
-2
Sample Output 4

2.0
2.02