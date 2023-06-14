public class main {
    public static void main(String[] args) {
        //{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
        //"select * from students where "
        //SELECT * FROM students WHERE name = 'Ivanov' AND country = 'Russia' AND city = 'Moscow'
        //НАЧАЛО
//        String s = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
//        String s2 = s.replace("\"", "");
//        System.out.println(s2);
//
//        int startIndex = s2.indexOf("name:");
//        int endIndex = s2.indexOf(", ");
//        String name = s2.substring(startIndex, endIndex).replace(":"," = ");
//
//
//        startIndex = s2.indexOf("country:");
//        endIndex = s2.indexOf(", ", startIndex);
//        String country = s2.substring(startIndex, endIndex).replace(":"," = ");
//
//        startIndex = s2.indexOf("city:");
//        endIndex = s2.indexOf(",", startIndex);
//        String city = s2.substring(startIndex, endIndex).replace(":"," = ");
//
//        startIndex = s2.indexOf("age:");
//        endIndex = s2.indexOf("}");
//        String age = s2.substring(startIndex, endIndex).replace(":"," = ");
//
//
//
//        System.out.println(name);
//        System.out.println(country);
//        System.out.println(city);
//        System.out.println(age);
//        System.out.println("select * FROM students WHERE " + name + " AND " + country + " AND " + city);
//        Надоело возиться;
//        КОНЕЦ


//*Сравнить время выполнения замены символа "а" на "А" любой строки содержащей >1000 символов средствами String и StringBuilder.
        String str = ("He was an old man who fished alone in a skiff in the Gulf Stream and he had gone eighty-four days now without taking a fish. In the first forty days a boy had been with him. But after forty days without a fish the boy's parents had told him that the old man was now definitely and finally salao, which is the worst form of unlucky, and the boy had gone at their orders in another boat which caught three good fish the first week. It made the boy sad to see the old man come in each day with his skiff empty and he always went down to help him carry either the coiled lines or the gaff and harpoon and the sail that was furled around the mast. The sail was patched with flour sacks and, furled, it looked like the flag of permanent defeat.\n" +
                "\n" +
                "The old man was thin and gaunt with deep wrinkles in the back of his neck. The brown blotches of the benevolent skin cancer the sun brings from its reflection on the tropic sea were on his cheeks. The blotches ran well down the sides of his face and his hands had the deep-creased scars from handling heavy fish on the cords. But none of these scars were fresh. They were as old as erosions in a fishless desert.\n" +
                "\n" +
                "Everything about him was old except his eyes and they were the same color as the sea and were cheerful and undefeated.\n" +
                "\n" +
                "''Santiago,'' the boy said to him as they climbed the bank from where the skiff was hauled up. ''I could go with you again. We've made some money.''\n" +
                "\n" +
                "The old man had taught the boy to fish and the boy loved him.\n" +
                "\n" +
                "''No,'' the old man said. ''You're with a lucky boat. Stay with them.''\n" +
                "\n" +
                "''But remember how you went eighty-seven days without fish and then we caught big ones every day for three weeks.''\n" +
                "\n" +
                "''I remember,'' the old man said. ''I know you did not leave me because you doubted.''\n" +
                "\n" +
                "''It was papa made me leave. I am a boy and I must obey him.''\n" +
                "\n" +
                "''I know,'' the old man said. ''It is quite normal.''");
        long start = System.currentTimeMillis();
        String str2 = str.replace("a", "A");
        long end = System.currentTimeMillis();
        System.out.println((end - start) + " ms");
        //System.out.println(str2);


        StringBuilder builder = new StringBuilder("He was an old man who fished alone in a skiff in the Gulf Stream and he had gone eighty-four days now without taking a fish. In the first forty days a boy had been with him. But after forty days without a fish the boy's parents had told him that the old man was now definitely and finally salao, which is the worst form of unlucky, and the boy had gone at their orders in another boat which caught three good fish the first week. It made the boy sad to see the old man come in each day with his skiff empty and he always went down to help him carry either the coiled lines or the gaff and harpoon and the sail that was furled around the mast. The sail was patched with flour sacks and, furled, it looked like the flag of permanent defeat.\n" +
                "\n" +
                "The old man was thin and gaunt with deep wrinkles in the back of his neck. The brown blotches of the benevolent skin cancer the sun brings from its reflection on the tropic sea were on his cheeks. The blotches ran well down the sides of his face and his hands had the deep-creased scars from handling heavy fish on the cords. But none of these scars were fresh. They were as old as erosions in a fishless desert.\n" +
                "\n" +
                "Everything about him was old except his eyes and they were the same color as the sea and were cheerful and undefeated.\n" +
                "\n" +
                "''Santiago,'' the boy said to him as they climbed the bank from where the skiff was hauled up. ''I could go with you again. We've made some money.''\n" +
                "\n" +
                "The old man had taught the boy to fish and the boy loved him.\n" +
                "\n" +
                "''No,'' the old man said. ''You're with a lucky boat. Stay with them.''\n" +
                "\n" +
                "''But remember how you went eighty-seven days without fish and then we caught big ones every day for three weeks.''\n" +
                "\n" +
                "''I remember,'' the old man said. ''I know you did not leave me because you doubted.''\n" +
                "\n" +
                "''It was papa made me leave. I am a boy and I must obey him.''\n" +
                "\n" +
                "''I know,'' the old man said. ''It is quite normal.''");
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < builder.length(); i++) {
            if (builder.charAt(i) == 'a') {
                builder.setCharAt(i, 'A');
            }
        }
        long end2 = System.currentTimeMillis();
        System.out.println((end2 - start2) + " ms");
        //System.out.println(builder);
    }
}