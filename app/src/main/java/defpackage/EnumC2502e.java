package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؔٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2502e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC2502e[] f6348e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC2502e f6349e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ C15937e f6350e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final EnumC2502e f6351e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, eُؔٝ] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, eُؔٝ] */
    static {
        ?? r0 = new Enum("Library", 0);
        f6351e = r0;
        ?? r1 = new Enum("ManualTracks", 1);
        f6349e = r1;
        EnumC2502e[] enumC2502eArr = {r0, r1, new Enum("AllTracks", 2)};
        f6348e = enumC2502eArr;
        f6350e = new C15937e(enumC2502eArr);
    }

    public static EnumC2502e valueOf(String str) {
        return (EnumC2502e) Enum.valueOf(EnumC2502e.class, str);
    }

    public static EnumC2502e[] values() {
        return (EnumC2502e[]) f6348e.clone();
    }
}
