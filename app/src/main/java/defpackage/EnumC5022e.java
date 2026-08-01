package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؗٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC5022e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC5022e f10704e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC5022e f10705e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC5022e[] f10706e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC5022e f10707e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eٜؗٚ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eٜؗٚ] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, eٜؗٚ] */
    static {
        ?? r0 = new Enum("None", 0);
        f10707e = r0;
        ?? r1 = new Enum("Cursor", 1);
        f10705e = r1;
        ?? r3 = new Enum("Selection", 2);
        f10704e = r3;
        f10706e = new EnumC5022e[]{r0, r1, r3};
    }

    public static EnumC5022e valueOf(String str) {
        return (EnumC5022e) Enum.valueOf(EnumC5022e.class, str);
    }

    public static EnumC5022e[] values() {
        return (EnumC5022e[]) f10706e.clone();
    }
}
