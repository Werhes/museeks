package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٔۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC14627e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC14627e[] f28859e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC14627e f28860e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC14627e f28861e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eٍٔۙ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eٍٔۙ] */
    static {
        ?? r0 = new Enum("UPTIME", 0);
        f28861e = r0;
        ?? r1 = new Enum("REALTIME", 1);
        f28860e = r1;
        f28859e = new EnumC14627e[]{r0, r1};
    }

    public static EnumC14627e valueOf(String str) {
        return (EnumC14627e) Enum.valueOf(EnumC14627e.class, str);
    }

    public static EnumC14627e[] values() {
        return (EnumC14627e[]) f28859e.clone();
    }
}
