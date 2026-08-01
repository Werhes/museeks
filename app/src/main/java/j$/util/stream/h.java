package j$.util.stream;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class h {
    public static final h CONCURRENT;
    public static final h IDENTITY_FINISH;
    public static final h UNORDERED;
    public static final /* synthetic */ h[] a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [j$.util.stream.h, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [j$.util.stream.h, java.lang.Enum] */
    static {
        ?? r0 = new Enum("CONCURRENT", 0);
        CONCURRENT = r0;
        ?? r1 = new Enum("UNORDERED", 1);
        UNORDERED = r1;
        ?? r3 = new Enum("IDENTITY_FINISH", 2);
        IDENTITY_FINISH = r3;
        a = new h[]{r0, r1, r3};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) a.clone();
    }
}
