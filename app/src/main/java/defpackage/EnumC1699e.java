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
/* renamed from: eٌؓ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC1699e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC1699e f4630e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC1699e f4631e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC1699e[] f4632e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final EnumC2067e f4633e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1699e EF0;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1699e EF1;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC1699e EF2;

    static {
        EnumC1699e enumC1699e = new EnumC1699e("DOUBLE", 0, EnumC2067e.f5366e);
        EnumC1699e enumC1699e2 = new EnumC1699e("FLOAT", 1, EnumC2067e.f5362e);
        EnumC2067e enumC2067e = EnumC2067e.f5364e;
        EnumC1699e enumC1699e3 = new EnumC1699e("INT64", 2, enumC2067e);
        EnumC1699e enumC1699e4 = new EnumC1699e("UINT64", 3, enumC2067e);
        EnumC2067e enumC2067e2 = EnumC2067e.f5368e;
        EnumC1699e enumC1699e5 = new EnumC1699e("INT32", 4, enumC2067e2);
        EnumC1699e enumC1699e6 = new EnumC1699e("FIXED64", 5, enumC2067e);
        EnumC1699e enumC1699e7 = new EnumC1699e("FIXED32", 6, enumC2067e2);
        EnumC1699e enumC1699e8 = new EnumC1699e("BOOL", 7, EnumC2067e.f5361e);
        EnumC1699e enumC1699e9 = new EnumC1699e("STRING", 8, EnumC2067e.f5370e);
        EnumC2067e enumC2067e3 = EnumC2067e.f5367e;
        EnumC1699e enumC1699e10 = new EnumC1699e("GROUP", 9, enumC2067e3);
        f4631e = enumC1699e10;
        EnumC1699e enumC1699e11 = new EnumC1699e("MESSAGE", 10, enumC2067e3);
        EnumC1699e enumC1699e12 = new EnumC1699e("BYTES", 11, EnumC2067e.f5369e);
        EnumC1699e enumC1699e13 = new EnumC1699e("UINT32", 12, enumC2067e2);
        EnumC1699e enumC1699e14 = new EnumC1699e("ENUM", 13, EnumC2067e.f5365e);
        f4630e = enumC1699e14;
        f4632e = new EnumC1699e[]{enumC1699e, enumC1699e2, enumC1699e3, enumC1699e4, enumC1699e5, enumC1699e6, enumC1699e7, enumC1699e8, enumC1699e9, enumC1699e10, enumC1699e11, enumC1699e12, enumC1699e13, enumC1699e14, new EnumC1699e("SFIXED32", 14, enumC2067e2), new EnumC1699e("SFIXED64", 15, enumC2067e), new EnumC1699e("SINT32", 16, enumC2067e2), new EnumC1699e("SINT64", 17, enumC2067e)};
    }

    public EnumC1699e(String str, int i, EnumC2067e enumC2067e) {
        this.f4633e = enumC2067e;
    }

    public static EnumC1699e[] values() {
        return (EnumC1699e[]) f4632e.clone();
    }
}
