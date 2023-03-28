package ru.netology.stats;

// 1. Cумма всех продаж
public class StatsService {
    public int AllSumSales(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];//начальная сумма продаж плюсуется с каждым значением из массива
        }
        return sum; //итоговая сумма продаж
    }

    //2.Cредняя сумма продаж в месяц
    public int AverageAmount(int[] sales) {
        int result = AllSumSales(sales) / sales.length; //сумма всех продаж(из метода 1), поделенная на количество
        return result; //средняя сумма продаж
    }

    //3.Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*.
    public int MaxSales(int[] sales) {
        int MaxMonth = 0; //номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[MaxMonth]) { // в i-м месяце продаж больше
                MaxMonth = i; // максимальный
            }
        }
        return MaxMonth + 1;
    }

    //4.Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*
    public int minSales(int[] sales) {
        int minMonth = 0; //номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { //  i-м месяце продаж меньше
                minMonth = i; //  минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }
    //5. Количество месяцев, в которых продажи были ниже среднего.
    public int countMonthMin(int[] sales) {
        int average = AverageAmount(sales); //средняя сумма продаж
        int countMonth = 0; //количество  месяцев

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) { //продажи от каждого числа в массиве меньше среднего
                countMonth++; //количество месяцев
            }
        }
        return countMonth;
    }

    //6.Количество месяцев, в которых продажи были выше среднего
public int countMonthMax (int [] sales){
    int average = AverageAmount (sales); //средняя сумма продаж
    int countMonth = 0; // количество месяцев

    for (int i = 0; i < sales.length; i++) {
        if (sales[i] > average) { //продажи от каждого числа в массиве меньше среднего
            countMonth++; //количество месяцев
        }
    }
    return countMonth;
}
}





