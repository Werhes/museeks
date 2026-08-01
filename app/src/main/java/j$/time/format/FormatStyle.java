package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class FormatStyle {
    public static final FormatStyle FULL;
    public static final FormatStyle LONG;
    public static final FormatStyle MEDIUM;
    public static final FormatStyle SHORT;
    public static final /* synthetic */ FormatStyle[] a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j$.time.format.FormatStyle] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, j$.time.format.FormatStyle] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, j$.time.format.FormatStyle] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, j$.time.format.FormatStyle] */
    static {
        ?? r0 = new Enum("FULL", 0);
        FULL = r0;
        ?? r1 = new Enum("LONG", 1);
        LONG = r1;
        ?? r3 = new Enum("MEDIUM", 2);
        MEDIUM = r3;
        ?? r5 = new Enum("SHORT", 3);
        SHORT = r5;
        a = new FormatStyle[]{r0, r1, r3, r5};
    }

    public static FormatStyle valueOf(String str) {
        return (FormatStyle) Enum.valueOf(FormatStyle.class, str);
    }

    public static FormatStyle[] values() {
        return (FormatStyle[]) a.clone();
    }
}
