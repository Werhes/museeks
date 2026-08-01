package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٖؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class EnumC0337e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C8989e f2361e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC0337e f2362e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC0337e[] f2363e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC0337e f2364e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final EnumC0337e f2365e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final C17167e f2366e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f2367e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final EnumC7310e f2368e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0337e EF0;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0337e EF1;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0337e EF2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [eُٗٞ, eٖٖؑ] */
    /* JADX WARN: Type inference failed for: r6v3, types: [eٖٖؑ, eٌُۜ] */
    static {
        EnumC0337e enumC0337e = new EnumC0337e("DOUBLE", 0, EnumC7310e.f14960e, 1);
        EnumC0337e enumC0337e2 = new EnumC0337e("FLOAT", 1, EnumC7310e.f14966e, 5);
        EnumC7310e enumC7310e = EnumC7310e.f14961e;
        EnumC0337e enumC0337e3 = new EnumC0337e("INT64", 2, enumC7310e, 0);
        EnumC0337e enumC0337e4 = new EnumC0337e("UINT64", 3, enumC7310e, 0);
        EnumC7310e enumC7310e2 = EnumC7310e.f14963e;
        EnumC0337e enumC0337e5 = new EnumC0337e("INT32", 4, enumC7310e2, 0);
        f2362e = enumC0337e5;
        EnumC0337e enumC0337e6 = new EnumC0337e("FIXED64", 5, enumC7310e, 1);
        EnumC0337e enumC0337e7 = new EnumC0337e("FIXED32", 6, enumC7310e2, 5);
        EnumC0337e enumC0337e8 = new EnumC0337e("BOOL", 7, EnumC7310e.f14969e, 0);
        f2364e = enumC0337e8;
        EnumC0337e enumC0337e9 = new EnumC0337e("STRING", 8, EnumC7310e.f14968e, 2);
        EnumC7310e enumC7310e3 = EnumC7310e.f14962e;
        ?? enumC0337e10 = new EnumC0337e("GROUP", 9, enumC7310e3, 3);
        f2361e = enumC0337e10;
        ?? enumC0337e11 = new EnumC0337e("MESSAGE", 10, enumC7310e3, 2);
        f2366e = enumC0337e11;
        EnumC0337e enumC0337e12 = new EnumC0337e("BYTES", 11, EnumC7310e.f14964e, 2);
        EnumC0337e enumC0337e13 = new EnumC0337e("UINT32", 12, enumC7310e2, 0);
        EnumC0337e enumC0337e14 = new EnumC0337e("ENUM", 13, EnumC7310e.f14967e, 0);
        f2365e = enumC0337e14;
        f2363e = new EnumC0337e[]{enumC0337e, enumC0337e2, enumC0337e3, enumC0337e4, enumC0337e5, enumC0337e6, enumC0337e7, enumC0337e8, enumC0337e9, enumC0337e10, enumC0337e11, enumC0337e12, enumC0337e13, enumC0337e14, new EnumC0337e("SFIXED32", 14, enumC7310e2, 5), new EnumC0337e("SFIXED64", 15, enumC7310e, 1), new EnumC0337e("SINT32", 16, enumC7310e2, 0), new EnumC0337e("SINT64", 17, enumC7310e, 0)};
    }

    public EnumC0337e(String str, int i, EnumC7310e enumC7310e, int i2) {
        this.f2368e = enumC7310e;
        this.f2367e = i2;
    }

    public static EnumC0337e valueOf(String str) {
        return (EnumC0337e) Enum.valueOf(EnumC0337e.class, str);
    }

    public static EnumC0337e[] values() {
        return (EnumC0337e[]) f2363e.clone();
    }

    public boolean ad() {
        return !(this instanceof C17882e);
    }
}
