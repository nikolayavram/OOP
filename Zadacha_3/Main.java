/* 
1. Сделать так, чтобы после добавления нескольких одинаковых объектов Pharmacy, в сете result были только уникальные.
Set<Pharmacy> result = new HashSet<>();
System.out.println(result.size()); //
2. Переписать compareTo так, чтобы если power лекарств равны, сравнение шло еще и по названиям компонентов лекарства
*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import HomeWork_3.drugs.Component;
import HomeWork_3.drugs.impl.CatDrug;
import HomeWork_3.drugs.impl.components.Azitron;
import HomeWork_3.drugs.impl.components.Penicillin;
import HomeWork_3.drugs.impl.components.Water;

public class Main {
    public static void main(String[] args) {
        
        // Создаем и добавляем в сет элементы с одинаковыми компанентами
        Set<Component> result = new HashSet<>();
        result.add(new Component("Вода", "5", 15));
        result.add(new Component("Вода", "5", 15));
        result.add(new Component("Азитрон", "2", 6));
        System.out.println(result + "\n");

        // Создаем список компонентов
        List<Component> componentsCat1 = List.of(
                new Azitron("Азитрон", "4", 6),
                new Water("Вода", "20", 10));
        List<Component> componentsCat2 = List.of(
                new Azitron("Азитрон","4",6),
                new Penicillin("Пенициллин", "16", 6));
        List<Component> componentsCat3 = List.of(
                new Water("Вода", "20", 10),
                new Azitron("Азитрон", "10", 12));
        List<Component> componentsCat4 = List.of(
                new Water("Вода", "20", 1),
                new Penicillin("Пенициллин", "18", 12));
        List<Component> componentsCat5 = List.of(
                new Water("Вода", "10", 12),
                new Azitron("Азитрон", "8", 12));
        
        // Создаем лекарства для кошек из разных компонентов
        CatDrug drug1 = new CatDrug(componentsCat1);
        CatDrug drug2 = new CatDrug(componentsCat2);
        CatDrug drug3 = new CatDrug(componentsCat3);
        CatDrug drug4 = new CatDrug(componentsCat4);
        CatDrug drug5 = new CatDrug(componentsCat5);

        // Создаем список лекарств
        List<CatDrug> drugs = new ArrayList<>();
        drugs.add(drug1);
        drugs.add(drug2);
        drugs.add(drug3);
        drugs.add(drug4);
        drugs.add(drug5);
        System.out.println(drugs);

        // Сортируем список лекарств для кошек по возрастанию силы
        Collections.sort(drugs);
        System.out.println(drugs);
    }
}

