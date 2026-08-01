package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗؑۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC16708e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC16708e f32762e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC16708e f32763e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC16708e[] f32764e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC16708e f32765e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eٗؑۦ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eٗؑۦ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [eٗؑۦ, java.lang.Enum] */
    static {
        ?? r0 = new Enum("RUNTIME", 0);
        f32765e = r0;
        ?? r1 = new Enum("BINARY", 1);
        f32763e = r1;
        ?? r3 = new Enum("SOURCE", 2);
        f32762e = r3;
        f32764e = new EnumC16708e[]{r0, r1, r3};
    }

    public static EnumC16708e valueOf(String str) {
        return (EnumC16708e) Enum.valueOf(EnumC16708e.class, str);
    }

    public static EnumC16708e[] values() {
        return (EnumC16708e[]) f32764e.clone();
    }
}
