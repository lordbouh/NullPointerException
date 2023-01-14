    class Formatter {
        public String format(String value) {
        return "["+value+"]";
        }
        }
        public class TestNPE {
            public static String handle(Formatter f, String s) {
            if(s.isEmpty()) {
            return "(none)";
            }
            return f.format(s.trim());
            }
        }