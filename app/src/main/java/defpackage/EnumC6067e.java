package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۦۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC6067e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC6067e[] f12742e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC6067e f12743e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC6067e f12744e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eؘۦۦ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eؘۦۦ] */
    static {
        ?? r0 = new Enum("GENERAL", 0);
        f12744e = r0;
        ?? r1 = new Enum("FALLBACK", 1);
        f12743e = r1;
        f12742e = new EnumC6067e[]{r0, r1};
    }

    public static EnumC6067e valueOf(String str) {
        return (EnumC6067e) Enum.valueOf(EnumC6067e.class, str);
    }

    public static EnumC6067e[] values() {
        return (EnumC6067e[]) f12742e.clone();
    }
}
