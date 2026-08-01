package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍْؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC9210e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC9210e[] f18396e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC9210e f18397e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC9210e f18398e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC9210e f18399e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC9210e f18400e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eٍْؓ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eٍْؓ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [eٍْؓ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [eٍْؓ, java.lang.Enum] */
    static {
        ?? r0 = new Enum("START", 0);
        f18400e = r0;
        ?? r1 = new Enum("END", 1);
        f18398e = r1;
        ?? r3 = new Enum("TOP", 2);
        f18397e = r3;
        ?? r5 = new Enum("BOTTOM", 3);
        f18399e = r5;
        f18396e = new EnumC9210e[]{r0, r1, r3, r5};
    }

    public static EnumC9210e valueOf(String str) {
        return (EnumC9210e) Enum.valueOf(EnumC9210e.class, str);
    }

    public static EnumC9210e[] values() {
        return (EnumC9210e[]) f18396e.clone();
    }

    public final boolean ad() {
        return this == f18400e || this == f18398e;
    }

    public final boolean metrica(boolean z) {
        if (z || this != f18398e) {
            return z && this == f18400e;
        }
        return true;
    }

    public final boolean vip(boolean z) {
        if (z || this != f18400e) {
            return z && this == f18398e;
        }
        return true;
    }
}
