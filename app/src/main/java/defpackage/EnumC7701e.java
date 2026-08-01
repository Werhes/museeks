package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؔۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC7701e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC7701e f15626e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC7701e f15627e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC7701e[] f15628e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC7701e f15629e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eًؔۤ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eًؔۤ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [eًؔۤ, java.lang.Enum] */
    static {
        ?? r0 = new Enum("FORCE_FLEXIBILITY", 0);
        f15629e = r0;
        ?? r1 = new Enum("NULLABLE", 1);
        f15627e = r1;
        ?? r3 = new Enum("NOT_NULL", 2);
        f15626e = r3;
        f15628e = new EnumC7701e[]{r0, r1, r3};
    }

    public static EnumC7701e valueOf(String str) {
        return (EnumC7701e) Enum.valueOf(EnumC7701e.class, str);
    }

    public static EnumC7701e[] values() {
        return (EnumC7701e[]) f15628e.clone();
    }
}
