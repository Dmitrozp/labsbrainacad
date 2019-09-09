class Chapter{
    int colOfChapter = 5;
    String[] chapter = new String[colOfChapter];
    int [][]pagesOfChapters = new int[colOfChapter][2];

    public Chapter(int colum){
        this.colOfChapter = colum;
        System.out.println("количество глав =" + colOfChapter);
    }

    Chapter(){}



    void chapter(String... chapters){
        //colOfChapter = chapters.length;

        for (int i = 0; i < 5; i++ ) {
            chapter[i] = chapters[i];
            System.out.println("Массив [" + i + "]=" + chapter[i]);
        }
    }

    void pagesOfChapters(int... pages){
        for (int i = 0; i <= 5; i = i+2 ) {
            pagesOfChapters[i][0] = pages[i];
            System.out.println("Массив [" + i + "]" + "[0]=" + pagesOfChapters[i]);
        }
        for (int i = 1; i <= 5; i = i+2 ) {
            pagesOfChapters[i][1] = pages[i];
            System.out.println("Массив [" + i + "]" + "[1]=" + pagesOfChapters[i]);
        }
    }
}

