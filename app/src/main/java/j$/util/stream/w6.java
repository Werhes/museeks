package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class w6 {
    public static final w6 OP;
    public static final w6 SPLITERATOR;
    public static final w6 STREAM;
    public static final w6 TERMINAL_OP;
    public static final w6 UPSTREAM_TERMINAL_OP;
    public static final /* synthetic */ w6[] a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j$.util.stream.w6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, j$.util.stream.w6] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, j$.util.stream.w6] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, j$.util.stream.w6] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, j$.util.stream.w6] */
    static {
        ?? r0 = new Enum("SPLITERATOR", 0);
        SPLITERATOR = r0;
        ?? r1 = new Enum("STREAM", 1);
        STREAM = r1;
        ?? r3 = new Enum("OP", 2);
        OP = r3;
        ?? r5 = new Enum("TERMINAL_OP", 3);
        TERMINAL_OP = r5;
        ?? r7 = new Enum("UPSTREAM_TERMINAL_OP", 4);
        UPSTREAM_TERMINAL_OP = r7;
        a = new w6[]{r0, r1, r3, r5, r7};
    }

    public static w6 valueOf(String str) {
        return (w6) Enum.valueOf(w6.class, str);
    }

    public static w6[] values() {
        return (w6[]) a.clone();
    }
}
