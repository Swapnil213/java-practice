class Leet1 {
    public static void main(String[] args) {
        String haystack = "Hello World";
        String needle = "World";
        // System.out.println(haystack.indexOf(needle));

        int hayEnd = haystack.length();
        int needEnd = needle.length();

        for (int i = 0; i < hayEnd; i++) {
            while (i < hayEnd && haystack.charAt(i) != needle.charAt(0))
                i++;

            if (i < hayEnd) {
                int start = i + 1;
                int needIndex = 1;

                while (start < hayEnd && needIndex < needEnd && haystack.charAt(start) == needle.charAt(needIndex)) {
                    start++;
                    needIndex++;
                }

                if (needIndex == needEnd)
                    System.out.println(i);
            }
        }

        System.out.println("-1");
    }
}