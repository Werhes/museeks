package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؗۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6955e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC6955e f14253e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC6955e f14254e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC6955e[] f14255e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC6955e f14256e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eؚؗۨ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eؚؗۨ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [eؚؗۨ, java.lang.Enum] */
    static {
        ?? r0 = new Enum("Default", 0);
        f14256e = r0;
        ?? r1 = new Enum("UserInput", 1);
        f14254e = r1;
        ?? r3 = new Enum("PreventUserInput", 2);
        f14253e = r3;
        f14255e = new EnumC6955e[]{r0, r1, r3};
    }

    public static EnumC6955e valueOf(String str) {
        return (EnumC6955e) Enum.valueOf(EnumC6955e.class, str);
    }

    public static EnumC6955e[] values() {
        return (EnumC6955e[]) f14255e.clone();
    }
}
