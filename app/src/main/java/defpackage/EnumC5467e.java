package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؘۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC5467e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ C15937e f11735e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC5467e[] f11736e;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        EnumC5467e[] enumC5467eArr = {new Enum("MONDAY", 0), new Enum("TUESDAY", 1), new Enum("WEDNESDAY", 2), new Enum("THURSDAY", 3), new Enum("FRIDAY", 4), new Enum("SATURDAY", 5), new Enum("SUNDAY", 6)};
        f11736e = enumC5467eArr;
        f11735e = new C15937e(enumC5467eArr);
    }

    public static EnumC5467e valueOf(String str) {
        return (EnumC5467e) Enum.valueOf(EnumC5467e.class, str);
    }

    public static EnumC5467e[] values() {
        return (EnumC5467e[]) f11736e.clone();
    }
}
