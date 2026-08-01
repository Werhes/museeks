package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eؚؒؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0767e {
    public static final C7177e Companion;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC0767e[] f3120e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC0767e f3121e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final Object f3122e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0767e EF0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, eؚٕٛ] */
    /* JADX WARN: Type inference failed for: r9v1, types: [eؚؒؑ, java.lang.Enum] */
    static {
        Enum r0 = new Enum("Blue", 0);
        Enum r1 = new Enum("BlueLight", 1);
        Enum r3 = new Enum("BlueDark", 2);
        Enum r5 = new Enum("Cyan", 3);
        Enum r7 = new Enum("Violet", 4);
        ?? r9 = new Enum("Pink", 5);
        f3121e = r9;
        f3120e = new EnumC0767e[]{r0, r1, r3, r5, r7, r9, new Enum("PinkDark", 6)};
        Companion = new Object();
        f3122e = AbstractC18039e.appmetrica(2, new C18420e(8));
    }

    public static EnumC0767e valueOf(String str) {
        return (EnumC0767e) Enum.valueOf(EnumC0767e.class, str);
    }

    public static EnumC0767e[] values() {
        return (EnumC0767e[]) f3120e.clone();
    }
}
