package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒٛۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC1177e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1177e[] f3778e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC1177e f3779e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC1177e f3780e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eؒٛۖ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eؒٛۖ] */
    static {
        ?? r0 = new Enum("Effect", 0);
        f3780e = r0;
        ?? r1 = new Enum("Source", 1);
        f3779e = r1;
        f3778e = new EnumC1177e[]{r0, r1};
    }

    public static EnumC1177e valueOf(String str) {
        return (EnumC1177e) Enum.valueOf(EnumC1177e.class, str);
    }

    public static EnumC1177e[] values() {
        return (EnumC1177e[]) f3778e.clone();
    }
}
