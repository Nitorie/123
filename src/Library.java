public class Library {

        Book[] books = new Book[10];
        int len;

        public void addBooks(Book book) {
            if (len < books.length) {
                books[len] = book;
                len++;
        }
        }
        public void removeBooks(String bookName) {
            for (int i = 0; i < books.length; i++) {
                if (bookName == books[i].name) {
                    books[i] = null;
                }
            }
            len--;
        }
        public void print() {
            for (int i = 0; i < len; i++) {
                System.out.println(i + 1 + " ");
                books[i].print();
            }
        }
}
