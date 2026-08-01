package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۗۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC14920e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final EnumC14920e f29592e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC14920e f29593e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC14920e f29594e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC14920e f29595e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final /* synthetic */ C15937e f29596e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC14920e[] f29597e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C10861e f29598e;

    static {
        EnumC14920e enumC14920e = new EnumC14920e("FINAL", 0, 0);
        f29594e = enumC14920e;
        EnumC14920e enumC14920e2 = new EnumC14920e("OPEN", 1, 1);
        f29593e = enumC14920e2;
        EnumC14920e enumC14920e3 = new EnumC14920e("ABSTRACT", 2, 2);
        f29595e = enumC14920e3;
        EnumC14920e enumC14920e4 = new EnumC14920e("SEALED", 3, 3);
        f29592e = enumC14920e4;
        EnumC14920e[] enumC14920eArr = {enumC14920e, enumC14920e2, enumC14920e3, enumC14920e4};
        f29597e = enumC14920eArr;
        f29596e = new C15937e(enumC14920eArr);
    }

    public EnumC14920e(String str, int i, int i2) {
        this.f29598e = new C10861e(AbstractC1787e.appmetrica, i2);
    }

    public static EnumC14920e valueOf(String str) {
        return (EnumC14920e) Enum.valueOf(EnumC14920e.class, str);
    }

    public static EnumC14920e[] values() {
        return (EnumC14920e[]) f29597e.clone();
    }
}
