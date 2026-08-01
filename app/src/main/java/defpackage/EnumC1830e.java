package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٕؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC1830e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final EnumC1830e f4922e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC1830e f4923e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC1830e f4924e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC1830e f4925e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC1830e f4926e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1830e[] f4927e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eٌٕؓ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eٌٕؓ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [eٌٕؓ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [eٌٕؓ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [eٌٕؓ, java.lang.Enum] */
    static {
        ?? r0 = new Enum("HIDDEN", 0);
        f4926e = r0;
        ?? r1 = new Enum("VISIBLE", 1);
        f4924e = r1;
        ?? r3 = new Enum("DEPRECATED_LIST_METHODS", 2);
        f4923e = r3;
        ?? r5 = new Enum("NOT_CONSIDERED", 3);
        f4925e = r5;
        ?? r7 = new Enum("DROP", 4);
        f4922e = r7;
        f4927e = new EnumC1830e[]{r0, r1, r3, r5, r7};
    }

    public static EnumC1830e valueOf(String str) {
        return (EnumC1830e) Enum.valueOf(EnumC1830e.class, str);
    }

    public static EnumC1830e[] values() {
        return (EnumC1830e[]) f4927e.clone();
    }
}
