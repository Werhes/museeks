package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖٗؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4151e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC4151e f9158e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC4151e f9159e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC4151e[] f9160e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC4151e f9161e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eؖٗؔ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eؖٗؔ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, eؖٗؔ] */
    static {
        ?? r0 = new Enum("PASS_THROUGH", 0);
        f9161e = r0;
        ?? r1 = new Enum("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        f9159e = r1;
        ?? r3 = new Enum("DISCARDING", 2);
        f9158e = r3;
        f9160e = new EnumC4151e[]{r0, r1, r3};
    }

    public static EnumC4151e valueOf(String str) {
        return (EnumC4151e) Enum.valueOf(EnumC4151e.class, str);
    }

    public static EnumC4151e[] values() {
        return (EnumC4151e[]) f9160e.clone();
    }
}
