package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4033e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC4033e[] f8968e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC4033e f8969e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC4033e f8970e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eٍُؖ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eٍُؖ] */
    static {
        ?? r0 = new Enum("IDLE", 0);
        f8970e = r0;
        ?? r1 = new Enum("STREAMING", 1);
        f8969e = r1;
        f8968e = new EnumC4033e[]{r0, r1};
    }

    public static EnumC4033e valueOf(String str) {
        return (EnumC4033e) Enum.valueOf(EnumC4033e.class, str);
    }

    public static EnumC4033e[] values() {
        return (EnumC4033e[]) f8968e.clone();
    }
}
