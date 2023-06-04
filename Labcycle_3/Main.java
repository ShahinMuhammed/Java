class Students {
    private String name;
    private int academicScore;

    public Students(String name, int academicScore) {
        this.name = name;
        this.academicScore = academicScore;
    }

    public String getName() {
        return name;
    }

    public int getAcademicScore() {
        return academicScore;
    }
}

class Sports {
    private int sportsScore;

    public Sports(int sportsScore) {
        this.sportsScore = sportsScore;
    }

    public int getSportsScore() {
        return sportsScore;
    }
}

class Result extends Students, Sports{
    public Result(String name, int academicScore, int sportsScore) {
        super(name, academicScore);
        this.sportsScore = sportsScore;
    }

    public void displayScores() {
        System.out.println("Name: " + getName());
        System.out.println("Academic Score: " + getAcademicScore());
        System.out.println("Sports Score: " + getSportsScore());
    }
}

public class Main {
    public static void main(String[] args) {
        Result studentResult = new Result("John Doe", 85, 90);
        studentResult.displayScores();
    }
}