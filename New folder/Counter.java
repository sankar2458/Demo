import java.util.HashMap;

class Counter implements Runnable {

    public static HashMap < Character, Integer > hs = new HashMap < Character, Integer > ();

    static {

        Counter.hs.put('a', 0);
        Counter.hs.put('e', 0);
        Counter.hs.put('i', 0);
        Counter.hs.put('o', 0);
        Counter.hs.put('u', 0);
    };
    String data;

    Thread t;
    Double s;
    Counter(String s) {
        this.data = s.toLowerCase();

        t = new Thread(this, "c");

        t.start();
    }


    public static void addList(Character ch) {
        Integer count = hs.get(ch);
        hs.put(ch, count + 1);
    }
    public void run() {
        try {
            char ch;

            for (int i = 0; i < data.length(); i++) {

                ch = data.charAt(i);
                switch (ch) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        Counter.addList(ch);
                        break;
                }


                Thread.sleep(100);
            }
        } catch (Exception e) {

        }

    }
}