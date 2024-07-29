class Book
{   private String author;
    private String title;
    private int pages;
    private String refnumber;
    private int lend;
    private boolean coursetext;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookpages, String usedInCourse)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookpages;
        refnumber = "";
        if(usedInCourse.equals("Ja")){
            coursetext = true;
        }
        else{
            coursetext = false;
        }

    }

    public String getAuthor() {
        return author;
    }

    public void giveAuthor(){
        System.out.println(author);
    }

    public String getTitel(){
        return title;
    }

    public int getPages(){
        return pages;
    }

    public String getref(){
        return refnumber;
    }

    public int getlend(){
        return lend;
    }

    public boolean iscoursetext(){
        return coursetext;
    }

    public void setrefnumber (String ref){
        if(ref.length()>3){
            refnumber = ref;
        }
        else{
            System.out.println("Die Referenznummer ist zu kurz.");
        }
    }

    public void givetitle(){
        System.out.println(title);
    }

    public void setlend(){
        lend++;
    }

    public void printdetails(){
        System.out.println("Title: "+ title+ ", Author: "+ author+ ", Pages: "+ pages +".\n");
        if(refnumber.length()>0){
            System.out.println("Ref Number: "+ refnumber);
        }
        else{
            System.out.println("ZZZ");
        }
        System.out.println("Das Buch wurde bereits "+ lend+"-mal ausgeliehen.");
    }
}