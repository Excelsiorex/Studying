package i_o;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.regex.Pattern;

class FilesExample {
    static void getFileProperties(File file) {
        long lastModified = file.getAbsoluteFile().lastModified();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd 'at' HH:mm:ss");
        String format = dateFormat.format(lastModified);

        System.out.println("FILE NAME: " + file.getName());
        System.out.println("FILE ABSOLUTE PATH: " + file.getAbsolutePath());
        try {
            System.out.println("FILE CANONICAL PATH: " + file.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("FILE CHANGE LAST MODIFIED TIME: " + file.setLastModified(10)); // set last file modification
        System.out.println("FILE LAST MODIFIED: " + format);
        System.out.println("FILE CAN READ: " + (file.canRead() ? "yes" : "no"));
        System.out.println("FILE CAN WRITE: " + (file.canWrite() ? "yes" : "no"));
    }

    /* Strategy pattern */

    static void getFileAndDirectoryNames(String[] args) {
        File path = new java.io.File(".");
        String[] list;

        if (args.length == 0) {
            list = path.list();
        } else {
            list = path.list(new DirFilter(args[0]));
        }

        if (list != null) {
            Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
            for (String s : list) {
                System.out.println(s);
            }
        }
    }

    private static class DirFilter implements FilenameFilter {
        private Pattern pattern;

        DirFilter(String regex) {
            pattern = Pattern.compile(regex);
        }

        @Override
        public boolean accept(File file, String s) {
            return pattern.matcher(s).matches();
        }
    }
}
