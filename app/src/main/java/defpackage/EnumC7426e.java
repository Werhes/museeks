package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۙۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC7426e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final EnumC7426e f15194e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC7426e f15195e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC7426e f15196e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC7426e f15197e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC7426e f15198e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC7426e[] f15199e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eؚۙۙ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eؚۙۙ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [eؚۙۙ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [eؚۙۙ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [eؚۙۙ, java.lang.Enum] */
    static {
        ?? r0 = new Enum("OtaAvailable", 0);
        f15198e = r0;
        ?? r1 = new Enum("Downloading", 1);
        f15196e = r1;
        ?? r3 = new Enum("NeedPermission", 2);
        f15195e = r3;
        ?? r5 = new Enum("Installing", 3);
        f15197e = r5;
        ?? r7 = new Enum("InstallFailed", 4);
        f15194e = r7;
        f15199e = new EnumC7426e[]{r0, r1, r3, r5, r7};
    }

    public static EnumC7426e valueOf(String str) {
        return (EnumC7426e) Enum.valueOf(EnumC7426e.class, str);
    }

    public static EnumC7426e[] values() {
        return (EnumC7426e[]) f15199e.clone();
    }
}
