public static int alternate(String s) {
    ArrayList<Character> list = new ArrayList<>();

    // Find unique characters
    for (char ch : s.toCharArray()) {
        if (!list.contains(ch)) {
            list.add(ch);
        }
    }

    int max = 0;

    // Choose two characters
    for (int i = 0; i < list.size() - 1; i++) {

        for (int j = i + 1; j < list.size(); j++) {

            char first = list.get(i);
            char second = list.get(j);

            char previous = '\0';
            int length = 0;
            boolean isValid = true;

            // Check the selected pair in original string
            for (char ch : s.toCharArray()) {

                if (ch == first || ch == second) {

                    if (ch == previous) {
                        isValid = false;
                        break;
                    }

                    previous = ch;
                    length++;
                }
            }

            if (isValid && length > max) {
                max = length;
            }
        }
    }

    return max;
}