package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class q implements e {
    public static final q INSENSITIVE;
    public static final q LENIENT;
    public static final q SENSITIVE;
    public static final q STRICT;
    public static final /* synthetic */ q[] a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j$.time.format.q] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, j$.time.format.q] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, j$.time.format.q] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, j$.time.format.q] */
    static {
        ?? r0 = new Enum("SENSITIVE", 0);
        SENSITIVE = r0;
        ?? r1 = new Enum("INSENSITIVE", 1);
        INSENSITIVE = r1;
        ?? r3 = new Enum("STRICT", 2);
        STRICT = r3;
        ?? r5 = new Enum("LENIENT", 3);
        LENIENT = r5;
        a = new q[]{r0, r1, r3, r5};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) a.clone();
    }

    @Override // j$.time.format.e
    public final boolean i(x xVar, StringBuilder sb) {
        return true;
    }

    @Override // j$.time.format.e
    public final int j(v vVar, CharSequence charSequence, int i) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            vVar.b = true;
            return i;
        }
        if (ordinal == 1) {
            vVar.b = false;
            return i;
        }
        if (ordinal == 2) {
            vVar.c = true;
            return i;
        }
        if (ordinal != 3) {
            return i;
        }
        vVar.c = false;
        return i;
    }

    @Override // java.lang.Enum
    public final String toString() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (ordinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (ordinal == 2) {
            return "ParseStrict(true)";
        }
        if (ordinal == 3) {
            return "ParseStrict(false)";
        }
        throw new IllegalStateException("Unreachable");
    }
}
