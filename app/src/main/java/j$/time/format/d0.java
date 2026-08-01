package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d0 {
    public static final d0 LENIENT;
    public static final d0 SMART;
    public static final d0 STRICT;
    public static final /* synthetic */ d0[] a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j$.time.format.d0] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, j$.time.format.d0] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, j$.time.format.d0] */
    static {
        ?? r0 = new Enum("STRICT", 0);
        STRICT = r0;
        ?? r1 = new Enum("SMART", 1);
        SMART = r1;
        ?? r3 = new Enum("LENIENT", 2);
        LENIENT = r3;
        a = new d0[]{r0, r1, r3};
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) a.clone();
    }
}
