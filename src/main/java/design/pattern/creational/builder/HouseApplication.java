package design.pattern.creational.builder;

// House Class
final class House {
    private final String foundation;
    private final String structure;
    private final String roof;
    private final boolean hasGarden;
    private final boolean hasGarage;

    public House(String foundation, String structure, String roof, boolean hasGarden, boolean hasGarage) {
        this.foundation = foundation;
        this.structure = structure;
        this.roof = roof;
        this.hasGarden = hasGarden;
        this.hasGarage = hasGarage;
    }

    @Override
    public String toString() {
        return "House [foundation=" + foundation + ", structure=" + structure +
                ", roof=" + roof + ", hasGarden=" + hasGarden + ", hasGarage=" + hasGarage + "]";
    }
}

// Builder Interface
interface HouseBuilder {
    HouseBuilder buildFoundation(String foundation);
    HouseBuilder buildStructure(String structure);
    HouseBuilder buildRoof(String roof);
    HouseBuilder buildGarden(boolean hasGarden);
    HouseBuilder buildGarage(boolean hasGarage);
    House build();
}

// Concrete Builder Implementation
class ConcreteHouseBuilder implements HouseBuilder {
    private String foundation;
    private String structure;
    private String roof;
    private boolean hasGarden;
    private boolean hasGarage;

    @Override
    public HouseBuilder buildFoundation(String foundation) {
        this.foundation = foundation;
        return this;
    }

    @Override
    public HouseBuilder buildStructure(String structure) {
        this.structure = structure;
        return this;
    }

    @Override
    public HouseBuilder buildRoof(String roof) {
        this.roof = roof;
        return this;
    }

    @Override
    public HouseBuilder buildGarden(boolean hasGarden) {
        this.hasGarden = hasGarden;
        return this;
    }

    @Override
    public HouseBuilder buildGarage(boolean hasGarage) {
        this.hasGarage = hasGarage;
        return this;
    }

    @Override
    public House build() {
        return new House(foundation, structure, roof, hasGarden, hasGarage);
    }
}

public class HouseApplication {
    public static void main(String[] args) {
        HouseBuilder builder = new ConcreteHouseBuilder();
        House house = builder.buildFoundation("Concrete")
                .buildStructure("Wood")
                .buildRoof("Shingles")
                .buildGarden(true)
                .buildGarage(true)
                .build();

        System.out.println(house);
    }
}




