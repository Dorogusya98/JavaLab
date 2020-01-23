package ru.bstu.iitus.vt41.dev;

import ru.bstu.iitus.vt41.dev.constructions.*;

public enum ConstructionType {
    Здание {
        public Construction factoryMethod () { return new Building(); }
    },
    Дом {
        public Construction factoryMethod () { return new House(); }
    },
    Отель {
        public Construction factoryMethod () { return new Hotel(); }
    },
    Ресторан {
        public Construction factoryMethod () { return new Restaurant(); }
    },
    ЧастныйДом {
        public Construction factoryMethod () { return new PHouse(); }
    },
    МногоквартирныйДом {
        public Construction factoryMethod () { return new MSHouse(); }
    };

    public abstract Construction factoryMethod();
}
