package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۢۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2947e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC2947e[] f6938e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC2947e f6939e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eؔۢۨ, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Small", 0);
        f6939e = r0;
        f6938e = new EnumC2947e[]{r0, new Enum("Medium", 1), new Enum("Large", 2)};
    }

    public static EnumC2947e valueOf(String str) {
        return (EnumC2947e) Enum.valueOf(EnumC2947e.class, str);
    }

    public static EnumC2947e[] values() {
        return (EnumC2947e[]) f6938e.clone();
    }
}
