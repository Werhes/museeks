package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eُٕۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC11407e {
    public static final C4274e Companion;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC11407e f22931e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC11407e f22932e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC11407e[] f22933e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final Object f22934e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eُٕۧ] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, eٟٜؖ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eُٕۧ] */
    static {
        ?? r0 = new Enum("Success", 0);
        f22932e = r0;
        ?? r1 = new Enum("IoException", 1);
        f22931e = r1;
        f22933e = new EnumC11407e[]{r0, r1, new Enum("Unknown", 2)};
        Companion = new Object();
        f22934e = AbstractC18039e.appmetrica(2, new C13630e(5));
    }

    public static EnumC11407e valueOf(String str) {
        return (EnumC11407e) Enum.valueOf(EnumC11407e.class, str);
    }

    public static EnumC11407e[] values() {
        return (EnumC11407e[]) f22933e.clone();
    }
}
