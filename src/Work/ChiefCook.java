package Work;

public class ChiefCook implements Work, Driver{
    @Override
    public void work() {
        System.out.println("Повар гтовит еду");
    }

    @Override
    public void drive() {
        System.out.println("Водит Машину");
    }
}
