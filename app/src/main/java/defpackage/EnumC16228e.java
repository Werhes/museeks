package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٖٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC16228e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC16228e[] f31890e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC16228e f31891e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC16228e f31892e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC16228e f31893e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC16228e f31894e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eّٖٕ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eّٖٕ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, eّٖٕ] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, eّٖٕ] */
    static {
        ?? r0 = new Enum("STARTED", 0);
        f31894e = r0;
        ?? r1 = new Enum("FRAME_INFO_COMPLETE", 1);
        f31892e = r1;
        ?? r3 = new Enum("STREAM_RESULTS_COMPLETE", 2);
        f31891e = r3;
        ?? r5 = new Enum("COMPLETE", 3);
        f31893e = r5;
        f31890e = new EnumC16228e[]{r0, r1, r3, r5};
    }

    public static EnumC16228e valueOf(String str) {
        return (EnumC16228e) Enum.valueOf(EnumC16228e.class, str);
    }

    public static EnumC16228e[] values() {
        return (EnumC16228e[]) f31890e.clone();
    }
}
