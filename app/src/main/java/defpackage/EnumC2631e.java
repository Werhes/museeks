package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٗۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2631e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC2631e[] f6495e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC2631e f6496e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC2631e f6497e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eؔٗۙ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eؔٗۙ] */
    static {
        ?? r0 = new Enum("Full", 0);
        f6497e = r0;
        ?? r1 = new Enum("Default", 1);
        f6496e = r1;
        f6495e = new EnumC2631e[]{r0, r1};
    }

    public static EnumC2631e valueOf(String str) {
        return (EnumC2631e) Enum.valueOf(EnumC2631e.class, str);
    }

    public static EnumC2631e[] values() {
        return (EnumC2631e[]) f6495e.clone();
    }
}
