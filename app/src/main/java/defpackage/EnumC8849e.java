package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌُٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC8849e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC8849e[] f17772e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC8849e f17773e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC8849e f17774e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eٌُٞ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eٌُٞ] */
    static {
        ?? r0 = new Enum("BIG_ENDIAN", 0);
        f17774e = r0;
        ?? r1 = new Enum("LITTLE_ENDIAN", 1);
        f17773e = r1;
        f17772e = new EnumC8849e[]{r0, r1};
    }

    public static EnumC8849e valueOf(String str) {
        return (EnumC8849e) Enum.valueOf(EnumC8849e.class, str);
    }

    public static EnumC8849e[] values() {
        return (EnumC8849e[]) f17772e.clone();
    }
}
