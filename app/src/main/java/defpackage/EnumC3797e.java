package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؖؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC3797e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ C15937e f8405e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC3797e[] f8406e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC3797e f8407e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eؚؖؐ] */
    static {
        Enum r0 = new Enum("DYNAMIC_RANGE", 0);
        ?? r1 = new Enum("FPS_RANGE", 1);
        f8407e = r1;
        EnumC3797e[] enumC3797eArr = {r0, r1, new Enum("VIDEO_STABILIZATION", 2), new Enum("IMAGE_FORMAT", 3), new Enum("RECORDING_QUALITY", 4)};
        f8406e = enumC3797eArr;
        f8405e = new C15937e(enumC3797eArr);
    }

    public static EnumC3797e valueOf(String str) {
        return (EnumC3797e) Enum.valueOf(EnumC3797e.class, str);
    }

    public static EnumC3797e[] values() {
        return (EnumC3797e[]) f8406e.clone();
    }
}
