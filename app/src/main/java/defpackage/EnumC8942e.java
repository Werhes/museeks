package defpackage;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٌۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC8942e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC8942e[] f17958e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC8942e f17959e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC8942e f17960e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC8942e[] f17961e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f17962e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC8942e EF0;

    static {
        EnumC3609e enumC3609e = EnumC3609e.DOUBLE;
        EnumC8942e enumC8942e = new EnumC8942e("DOUBLE", 0, 0, 1, enumC3609e);
        EnumC3609e enumC3609e2 = EnumC3609e.FLOAT;
        EnumC8942e enumC8942e2 = new EnumC8942e("FLOAT", 1, 1, 1, enumC3609e2);
        EnumC3609e enumC3609e3 = EnumC3609e.LONG;
        EnumC8942e enumC8942e3 = new EnumC8942e("INT64", 2, 2, 1, enumC3609e3);
        EnumC8942e enumC8942e4 = new EnumC8942e("UINT64", 3, 3, 1, enumC3609e3);
        EnumC3609e enumC3609e4 = EnumC3609e.INT;
        EnumC8942e enumC8942e5 = new EnumC8942e("INT32", 4, 4, 1, enumC3609e4);
        EnumC8942e enumC8942e6 = new EnumC8942e("FIXED64", 5, 5, 1, enumC3609e3);
        EnumC8942e enumC8942e7 = new EnumC8942e("FIXED32", 6, 6, 1, enumC3609e4);
        EnumC3609e enumC3609e5 = EnumC3609e.BOOLEAN;
        EnumC8942e enumC8942e8 = new EnumC8942e("BOOL", 7, 7, 1, enumC3609e5);
        EnumC3609e enumC3609e6 = EnumC3609e.STRING;
        EnumC8942e enumC8942e9 = new EnumC8942e("STRING", 8, 8, 1, enumC3609e6);
        EnumC3609e enumC3609e7 = EnumC3609e.MESSAGE;
        EnumC8942e enumC8942e10 = new EnumC8942e("MESSAGE", 9, 9, 1, enumC3609e7);
        EnumC3609e enumC3609e8 = EnumC3609e.BYTE_STRING;
        EnumC8942e enumC8942e11 = new EnumC8942e("BYTES", 10, 10, 1, enumC3609e8);
        EnumC8942e enumC8942e12 = new EnumC8942e("UINT32", 11, 11, 1, enumC3609e4);
        EnumC3609e enumC3609e9 = EnumC3609e.ENUM;
        EnumC8942e enumC8942e13 = new EnumC8942e("ENUM", 12, 12, 1, enumC3609e9);
        EnumC8942e enumC8942e14 = new EnumC8942e("SFIXED32", 13, 13, 1, enumC3609e4);
        EnumC8942e enumC8942e15 = new EnumC8942e("SFIXED64", 14, 14, 1, enumC3609e3);
        EnumC8942e enumC8942e16 = new EnumC8942e("SINT32", 15, 15, 1, enumC3609e4);
        EnumC8942e enumC8942e17 = new EnumC8942e("SINT64", 16, 16, 1, enumC3609e3);
        EnumC8942e enumC8942e18 = new EnumC8942e("GROUP", 17, 17, 1, enumC3609e7);
        EnumC8942e enumC8942e19 = new EnumC8942e("DOUBLE_LIST", 18, 18, 2, enumC3609e);
        EnumC8942e enumC8942e20 = new EnumC8942e("FLOAT_LIST", 19, 19, 2, enumC3609e2);
        EnumC8942e enumC8942e21 = new EnumC8942e("INT64_LIST", 20, 20, 2, enumC3609e3);
        EnumC8942e enumC8942e22 = new EnumC8942e("UINT64_LIST", 21, 21, 2, enumC3609e3);
        EnumC8942e enumC8942e23 = new EnumC8942e("INT32_LIST", 22, 22, 2, enumC3609e4);
        EnumC8942e enumC8942e24 = new EnumC8942e("FIXED64_LIST", 23, 23, 2, enumC3609e3);
        EnumC8942e enumC8942e25 = new EnumC8942e("FIXED32_LIST", 24, 24, 2, enumC3609e4);
        EnumC8942e enumC8942e26 = new EnumC8942e("BOOL_LIST", 25, 25, 2, enumC3609e5);
        EnumC8942e enumC8942e27 = new EnumC8942e("STRING_LIST", 26, 26, 2, enumC3609e6);
        EnumC8942e enumC8942e28 = new EnumC8942e("MESSAGE_LIST", 27, 27, 2, enumC3609e7);
        EnumC8942e enumC8942e29 = new EnumC8942e("BYTES_LIST", 28, 28, 2, enumC3609e8);
        EnumC8942e enumC8942e30 = new EnumC8942e("UINT32_LIST", 29, 29, 2, enumC3609e4);
        EnumC8942e enumC8942e31 = new EnumC8942e("ENUM_LIST", 30, 30, 2, enumC3609e9);
        EnumC8942e enumC8942e32 = new EnumC8942e("SFIXED32_LIST", 31, 31, 2, enumC3609e4);
        EnumC8942e enumC8942e33 = new EnumC8942e("SFIXED64_LIST", 32, 32, 2, enumC3609e3);
        EnumC8942e enumC8942e34 = new EnumC8942e("SINT32_LIST", 33, 33, 2, enumC3609e4);
        EnumC8942e enumC8942e35 = new EnumC8942e("SINT64_LIST", 34, 34, 2, enumC3609e3);
        EnumC8942e enumC8942e36 = new EnumC8942e("DOUBLE_LIST_PACKED", 35, 35, 3, enumC3609e);
        f17960e = enumC8942e36;
        EnumC8942e enumC8942e37 = new EnumC8942e("FLOAT_LIST_PACKED", 36, 36, 3, enumC3609e2);
        EnumC8942e enumC8942e38 = new EnumC8942e("INT64_LIST_PACKED", 37, 37, 3, enumC3609e3);
        EnumC8942e enumC8942e39 = new EnumC8942e("UINT64_LIST_PACKED", 38, 38, 3, enumC3609e3);
        EnumC8942e enumC8942e40 = new EnumC8942e("INT32_LIST_PACKED", 39, 39, 3, enumC3609e4);
        EnumC8942e enumC8942e41 = new EnumC8942e("FIXED64_LIST_PACKED", 40, 40, 3, enumC3609e3);
        EnumC8942e enumC8942e42 = new EnumC8942e("FIXED32_LIST_PACKED", 41, 41, 3, enumC3609e4);
        EnumC8942e enumC8942e43 = new EnumC8942e("BOOL_LIST_PACKED", 42, 42, 3, enumC3609e5);
        EnumC8942e enumC8942e44 = new EnumC8942e("UINT32_LIST_PACKED", 43, 43, 3, enumC3609e4);
        EnumC8942e enumC8942e45 = new EnumC8942e("ENUM_LIST_PACKED", 44, 44, 3, enumC3609e9);
        EnumC8942e enumC8942e46 = new EnumC8942e("SFIXED32_LIST_PACKED", 45, 45, 3, enumC3609e4);
        EnumC8942e enumC8942e47 = new EnumC8942e("SFIXED64_LIST_PACKED", 46, 46, 3, enumC3609e3);
        EnumC8942e enumC8942e48 = new EnumC8942e("SINT32_LIST_PACKED", 47, 47, 3, enumC3609e4);
        EnumC8942e enumC8942e49 = new EnumC8942e("SINT64_LIST_PACKED", 48, 48, 3, enumC3609e3);
        f17959e = enumC8942e49;
        f17958e = new EnumC8942e[]{enumC8942e, enumC8942e2, enumC8942e3, enumC8942e4, enumC8942e5, enumC8942e6, enumC8942e7, enumC8942e8, enumC8942e9, enumC8942e10, enumC8942e11, enumC8942e12, enumC8942e13, enumC8942e14, enumC8942e15, enumC8942e16, enumC8942e17, enumC8942e18, enumC8942e19, enumC8942e20, enumC8942e21, enumC8942e22, enumC8942e23, enumC8942e24, enumC8942e25, enumC8942e26, enumC8942e27, enumC8942e28, enumC8942e29, enumC8942e30, enumC8942e31, enumC8942e32, enumC8942e33, enumC8942e34, enumC8942e35, enumC8942e36, enumC8942e37, enumC8942e38, enumC8942e39, enumC8942e40, enumC8942e41, enumC8942e42, enumC8942e43, enumC8942e44, enumC8942e45, enumC8942e46, enumC8942e47, enumC8942e48, enumC8942e49, new EnumC8942e("GROUP_LIST", 49, 49, 2, enumC3609e7), new EnumC8942e("MAP", 50, 50, 4, EnumC3609e.VOID)};
        EnumC8942e[] values = values();
        f17961e = new EnumC8942e[values.length];
        for (EnumC8942e enumC8942e50 : values) {
            f17961e[enumC8942e50.f17962e] = enumC8942e50;
        }
    }

    public EnumC8942e(String str, int i, int i2, int i3, EnumC3609e enumC3609e) {
        this.f17962e = i2;
        int m2467class = AbstractC8703e.m2467class(i3);
        if (m2467class == 1) {
            enumC3609e.getClass();
        } else if (m2467class == 3) {
            enumC3609e.getClass();
        }
        if (i3 == 1) {
            enumC3609e.ordinal();
        }
    }

    public static EnumC8942e valueOf(String str) {
        return (EnumC8942e) Enum.valueOf(EnumC8942e.class, str);
    }

    public static EnumC8942e[] values() {
        return (EnumC8942e[]) f17958e.clone();
    }
}
