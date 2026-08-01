package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙۖۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC6583e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC6583e f13583e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC6583e f13584e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC6583e[] f13585e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC6583e f13586e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eؙۖۧ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eؙۖۧ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [eؙۖۧ, java.lang.Enum] */
    static {
        ?? r0 = new Enum("VK_COM_WORKS", 0);
        f13586e = r0;
        ?? r1 = new Enum("VK_RU_WORKS", 1);
        f13584e = r1;
        ?? r3 = new Enum("NOTHING_WORKS", 2);
        f13583e = r3;
        f13585e = new EnumC6583e[]{r0, r1, r3};
    }

    public static EnumC6583e valueOf(String str) {
        return (EnumC6583e) Enum.valueOf(EnumC6583e.class, str);
    }

    public static EnumC6583e[] values() {
        return (EnumC6583e[]) f13585e.clone();
    }
}
