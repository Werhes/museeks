package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eًٖۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC8272e {
    public static final C13556e Companion;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC8272e f16948e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC8272e f16949e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC8272e[] f16950e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final Object f16951e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eًٖۡ] */
    /* JADX WARN: Type inference failed for: r0v1, types: [eْۡؗ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eًٖۡ] */
    static {
        ?? r0 = new Enum("DONE", 0);
        f16949e = r0;
        ?? r1 = new Enum("IN_PROGRESS", 1);
        f16948e = r1;
        f16950e = new EnumC8272e[]{r0, r1, new Enum("UNREAD", 2)};
        Companion = new Object();
        f16951e = AbstractC18039e.appmetrica(2, new C9283e(20));
    }

    public static EnumC8272e valueOf(String str) {
        return (EnumC8272e) Enum.valueOf(EnumC8272e.class, str);
    }

    public static EnumC8272e[] values() {
        return (EnumC8272e[]) f16950e.clone();
    }
}
