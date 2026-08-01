package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: eؑٓۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC0300e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC0300e[] f2304e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC0300e f2305e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC0300e f2306e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0300e EF0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Enum, eؑٓۚ] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Enum, eؑٓۚ] */
    static {
        Enum r0 = new Enum("AGREEMENT", 0);
        Enum r1 = new Enum("ENCRYPTION", 1);
        Enum r3 = new Enum("DECRYPTION", 2);
        Enum r5 = new Enum("KEYGEN", 3);
        Enum r7 = new Enum("SIGNING", 4);
        Enum r9 = new Enum("VERIFYING", 5);
        Enum r11 = new Enum("AUTHENTICATION", 6);
        Enum r13 = new Enum("VERIFICATION", 7);
        ?? r15 = new Enum("PRF", 8);
        f2306e = r15;
        ?? r2 = new Enum("ANY", 9);
        f2305e = r2;
        f2304e = new EnumC0300e[]{r0, r1, r3, r5, r7, r9, r11, r13, r15, r2};
    }

    public static EnumC0300e valueOf(String str) {
        return (EnumC0300e) Enum.valueOf(EnumC0300e.class, str);
    }

    public static EnumC0300e[] values() {
        return (EnumC0300e[]) f2304e.clone();
    }
}
