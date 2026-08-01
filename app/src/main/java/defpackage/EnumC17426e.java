package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٗۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC17426e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC17426e[] f34144e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC17426e f34145e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC17426e f34146e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eَٗۧ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eَٗۧ] */
    static {
        ?? r0 = new Enum("Vertical", 0);
        f34146e = r0;
        ?? r1 = new Enum("Horizontal", 1);
        f34145e = r1;
        f34144e = new EnumC17426e[]{r0, r1};
    }

    public static EnumC17426e valueOf(String str) {
        return (EnumC17426e) Enum.valueOf(EnumC17426e.class, str);
    }

    public static EnumC17426e[] values() {
        return (EnumC17426e[]) f34144e.clone();
    }
}
