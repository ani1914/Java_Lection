Task1_h2
Създайте клас Управител (Manager), който се определя от две член-данни: име и дата на наемане на работа. Реализирайте следните методи на класа:

Конструктор с един параметър: името на управителя
get методите за двете член-данни на класа
set метод за промяна на датата на наемане на работа
метод, който връща колко години работи управителят във фирмата до определена дата, която се подава като параметър на метода (numberOfYearsInCompanyTill())
Важно!!! Клас Manager трябва да бъде с default спецификатор да достъп и да се създаде преди клас Solution. Клас Solution е класът, в който е main() метода. Той се създава автоматично. Импортирайте допълнителни класове, ако е необходимо. Например: import java.time.LocalDate; import java.time.temporal.ChronoUnit;

Input Format

Ivan  // name of the manager
2018  // year of hiring
3     // month of hiring
1     // day of hiring
2021  // cuurent year
3     // cuurent month
1     // cuurent day
Constraints

Датата на наемане на работа не може да бъде в бъдеще време. Методът трябва да запише дата 1.1.2020, ако параметърът е бъдеща дата.

Output Format

2018-3-1 // date of hiring
3        // years working in the company, depending on the current date
Sample Input 0

Ivan
2018
3
1
2021
3
1
Sample Output 0

2018-03-01
3
Sample Input 1

Ivan
2021
4
1
2021
5
3
Sample Output 1

2020-01-01
1

Task2_h2
Създайте клас Звукозаписно студио (Studio), който се определя от следните член-данни:

Идентификационен номер (id). id-то не се променя, след като се създаде студио от клас Studio.
Цена в лв. за наемане на студиото за 1 час.
Максимален брой часове на ден, през които студиото може да бъде наето. Максималният брой часове е в интервала от 0 до 24 часа. Ако се подаде неправилен аргумент, максималният брой часове е 24 часа.
Брой часове, за които ще бъде наето студиото през деня.
Минимална цена за наемане на час, която е една и съща за всички звукозаписни студиа.
Курс на еврото, за да се пресметне колко е цената в евро.
Реализирайте следните методи на клас Студио:

Конструктор с два параметъра: id-то и максималният брой часове, за които студиото може да бъде наето за деня.
Метод за задаване на минималната цена.
Метод за задаване на цената за наемане на студиото за един час. Тази цена не трябва да е по-млака от минималнта цена. Ако се подаде параметър, който е по-малък от минималната цена, цената трябва да съвпада с минималната.
Метод за задаване на броя часове за деня, през които студиото е било наето. Този брой часове не трябва да надхвърля максималният брой часове, през които студиото може да бъде наето.
Метод за задаване на курса на еврото.
get методи за всички член-данни на класа
Метод, който връща колко е оборотът в лв. от часовете, за които студиото е било наето за деня.
Метод, който връща колко е оборотът в евро. от часовете, за които студиото е било наето за деня.
Метод за сравняване на две студиа, на базата на цената за наемане за 1 час. Методът трябва да връща студиото, което се наема за по-висока цена.
Метод за сравняване на две студиа, на базата на оборота. Методът трябва да връща true, ако първото студио е с по-голям оборот от второто.
Важно!!! Клас Studio трябва да бъде с default спецификатор да достъп (без спецификатор за достъп) и да се създаде преди клас Solution. Клас Solution е класът, в който е main() метода. Клас Solution се създава автоматично. Импортирайте допълнителни класове, ако е необходимо. Например: iimport java.math.BigDecimal;

Input Format

1      // studio1 id
24     // studio1 maxWorkingHours
100    // Studio minPricePerHour
0.51   // Studio currencyEuro
120    // studio1 pricePerHour
15     // studio1 workedHours
2      // studio2 id
20     // studio2 maxWorkingHours
120    // studio2 pricePerHour
15     // studio2 workedHours
Constraints

Цената за наемане на студтиото за 1 час не трябва да е под минималната.
Броят часове, за които студиото е наето за деня, не трябва да надхвърля максималния брой часове на ден.
Максималният брой часове, за които може да се наеме студиото е в интервала [0, 24]. Ако не е в тези граници се присвоява 24.
Минималната цена за наемане на студиото не може да бъде отрицателно число. Ако се предава невалиден аргуемент на метода, се взима 0.
За всички числа с плаваща запетая, използвайте BigDecimal
Output Format

1800.0   // studio1 turnover in lv
918.000  // studio1 turnover in euro
2        // the id of the studio with larger pricePerHour
false    // is the first studio with greater turnover than the second studio
Sample Input 0

1
24
100
0.51
120
15
2
20
120
15
Sample Output 0

1800.0
918.000
2
false
Sample Input 1

1
12
100
0.51
90
15
2
20
100
6
Sample Output 1

1200.0
612.000
2
true
Sample Input 2

1
12
100
0.51
100
15
2
18
150
3
Sample Output 2

1200.0
612.000
2
true
Sample Input 3

1
15
100
0.51
0
15
2
18
150
3
Sample Output 3

1500.0
765.000
2
true
Sample Input 4

1
15
100
0.51
140
0
2
18
150
3
Sample Output 4

0.0
0.000
2
false
