package j$.time.format;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class SignStyle {
    public static final SignStyle ALWAYS;
    public static final SignStyle EXCEEDS_PAD;
    public static final SignStyle NEVER;
    public static final SignStyle NORMAL;
    public static final SignStyle NOT_NEGATIVE;
    public static final /* synthetic */ SignStyle[] a;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, j$.time.format.SignStyle] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, j$.time.format.SignStyle] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, j$.time.format.SignStyle] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, j$.time.format.SignStyle] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, j$.time.format.SignStyle] */
    static {
        ?? r0 = new Enum("NORMAL", 0);
        NORMAL = r0;
        ?? r1 = new Enum("ALWAYS", 1);
        ALWAYS = r1;
        ?? r3 = new Enum("NEVER", 2);
        NEVER = r3;
        ?? r5 = new Enum("NOT_NEGATIVE", 3);
        NOT_NEGATIVE = r5;
        ?? r7 = new Enum("EXCEEDS_PAD", 4);
        EXCEEDS_PAD = r7;
        a = new SignStyle[]{r0, r1, r3, r5, r7};
    }

    public static SignStyle valueOf(String str) {
        return (SignStyle) Enum.valueOf(SignStyle.class, str);
    }

    public static SignStyle[] values() {
        return (SignStyle[]) a.clone();
    }
}
