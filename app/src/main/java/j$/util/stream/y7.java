package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class y7 {
    public static final y7 MAYBE_MORE;
    public static final y7 NO_MORE;
    public static final y7 UNLIMITED;
    public static final /* synthetic */ y7[] a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j$.util.stream.y7] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, j$.util.stream.y7] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, j$.util.stream.y7] */
    static {
        ?? r0 = new Enum("NO_MORE", 0);
        NO_MORE = r0;
        ?? r1 = new Enum("MAYBE_MORE", 1);
        MAYBE_MORE = r1;
        ?? r3 = new Enum("UNLIMITED", 2);
        UNLIMITED = r3;
        a = new y7[]{r0, r1, r3};
    }

    public static y7 valueOf(String str) {
        return (y7) Enum.valueOf(y7.class, str);
    }

    public static y7[] values() {
        return (y7[]) a.clone();
    }
}
