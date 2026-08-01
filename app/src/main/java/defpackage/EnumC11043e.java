package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'eؘٙؓ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٗٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC11043e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final EnumC11043e f21875e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final EnumC11043e f21876e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final EnumC11043e f21877e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC11043e f21878e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final EnumC11043e f21879e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final /* synthetic */ EnumC11043e[] f21880e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC11043e f21881e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final EnumC11043e f21882e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final EnumC11043e f21883e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC11043e f21884e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final EnumC11043e f21885e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final EnumC11043e f21886e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final EnumC11043e f21887e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC7227e f21888e;

    static {
        C12232e c12232e = AbstractC3820e.ad;
        EnumC11043e enumC11043e = new EnumC11043e("BOOL", 0, c12232e.vip(Boolean.TYPE));
        f21881e = enumC11043e;
        EnumC11043e enumC11043e2 = new EnumC11043e("INT", 1, c12232e.vip(Long.TYPE));
        f21878e = enumC11043e2;
        EnumC11043e enumC11043e3 = new EnumC11043e("STRING", 2, c12232e.vip(String.class));
        f21884e = enumC11043e3;
        EnumC11043e enumC11043e4 = new EnumC11043e("BINARY", 3, c12232e.vip(byte[].class));
        f21875e = enumC11043e4;
        EnumC11043e enumC11043e5 = new EnumC11043e("OBJECT", 4, c12232e.vip(InterfaceC14287e.class));
        f21887e = enumC11043e5;
        EnumC11043e enumC11043e6 = new EnumC11043e("FLOAT", 5, c12232e.vip(Float.TYPE));
        f21886e = enumC11043e6;
        EnumC11043e enumC11043e7 = new EnumC11043e("DOUBLE", 6, c12232e.vip(Double.TYPE));
        f21882e = enumC11043e7;
        EnumC11043e enumC11043e8 = new EnumC11043e("DECIMAL128", 7, c12232e.vip(C12355e.class));
        f21885e = enumC11043e8;
        EnumC11043e enumC11043e9 = new EnumC11043e("TIMESTAMP", 8, c12232e.vip(InterfaceC6025e.class));
        f21879e = enumC11043e9;
        EnumC11043e enumC11043e10 = new EnumC11043e("OBJECT_ID", 9, c12232e.vip(C2453e.class));
        f21883e = enumC11043e10;
        EnumC11043e enumC11043e11 = new EnumC11043e("UUID", 10, c12232e.vip(InterfaceC17159e.class));
        f21877e = enumC11043e11;
        EnumC11043e enumC11043e12 = new EnumC11043e("ANY", 11, c12232e.vip(InterfaceC5045e.class));
        f21876e = enumC11043e12;
        f21880e = new EnumC11043e[]{enumC11043e, enumC11043e2, enumC11043e3, enumC11043e4, enumC11043e5, enumC11043e6, enumC11043e7, enumC11043e8, enumC11043e9, enumC11043e10, enumC11043e11, enumC11043e12};
    }

    public EnumC11043e(String str, int i, InterfaceC7227e interfaceC7227e) {
        this.f21888e = interfaceC7227e;
    }

    public static EnumC11043e valueOf(String str) {
        return (EnumC11043e) Enum.valueOf(EnumC11043e.class, str);
    }

    public static EnumC11043e[] values() {
        return (EnumC11043e[]) f21880e.clone();
    }
}
