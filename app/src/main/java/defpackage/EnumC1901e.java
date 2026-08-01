package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٙۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC1901e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC1901e f5058e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC1901e f5059e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1901e[] f5060e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC1901e f5061e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [eؓٙۢ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [eؓٙۢ, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [eؓٙۢ, java.lang.Enum] */
    static {
        ?? r0 = new Enum("UNCOMPRESSED", 0);
        f5061e = r0;
        ?? r1 = new Enum("COMPRESSED", 1);
        f5059e = r1;
        ?? r3 = new Enum("DO_NOT_USE_CRUNCHY_UNCOMPRESSED", 2);
        f5058e = r3;
        f5060e = new EnumC1901e[]{r0, r1, r3};
    }

    public static EnumC1901e valueOf(String str) {
        return (EnumC1901e) Enum.valueOf(EnumC1901e.class, str);
    }

    public static EnumC1901e[] values() {
        return (EnumC1901e[]) f5060e.clone();
    }
}
