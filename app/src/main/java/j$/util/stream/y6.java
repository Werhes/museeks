package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class y6 {
    public static final y6 DOUBLE_VALUE;
    public static final y6 INT_VALUE;
    public static final y6 LONG_VALUE;
    public static final y6 REFERENCE;
    public static final /* synthetic */ y6[] a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j$.util.stream.y6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, j$.util.stream.y6] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, j$.util.stream.y6] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, j$.util.stream.y6] */
    static {
        ?? r0 = new Enum("REFERENCE", 0);
        REFERENCE = r0;
        ?? r1 = new Enum("INT_VALUE", 1);
        INT_VALUE = r1;
        ?? r3 = new Enum("LONG_VALUE", 2);
        LONG_VALUE = r3;
        ?? r5 = new Enum("DOUBLE_VALUE", 3);
        DOUBLE_VALUE = r5;
        a = new y6[]{r0, r1, r3, r5};
    }

    public static y6 valueOf(String str) {
        return (y6) Enum.valueOf(y6.class, str);
    }

    public static y6[] values() {
        return (y6[]) a.clone();
    }
}
