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
/* renamed from: eٟؖؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4266e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC4266e[] f9353e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC4266e f9354e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC4266e f9355e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC4266e[] f9356e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f9357e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC4266e EF0;

    static {
        EnumC5950e enumC5950e = EnumC5950e.DOUBLE;
        EnumC4266e enumC4266e = new EnumC4266e("DOUBLE", 0, 0, 1, enumC5950e);
        EnumC5950e enumC5950e2 = EnumC5950e.FLOAT;
        EnumC4266e enumC4266e2 = new EnumC4266e("FLOAT", 1, 1, 1, enumC5950e2);
        EnumC5950e enumC5950e3 = EnumC5950e.LONG;
        EnumC4266e enumC4266e3 = new EnumC4266e("INT64", 2, 2, 1, enumC5950e3);
        EnumC4266e enumC4266e4 = new EnumC4266e("UINT64", 3, 3, 1, enumC5950e3);
        EnumC5950e enumC5950e4 = EnumC5950e.INT;
        EnumC4266e enumC4266e5 = new EnumC4266e("INT32", 4, 4, 1, enumC5950e4);
        EnumC4266e enumC4266e6 = new EnumC4266e("FIXED64", 5, 5, 1, enumC5950e3);
        EnumC4266e enumC4266e7 = new EnumC4266e("FIXED32", 6, 6, 1, enumC5950e4);
        EnumC5950e enumC5950e5 = EnumC5950e.BOOLEAN;
        EnumC4266e enumC4266e8 = new EnumC4266e("BOOL", 7, 7, 1, enumC5950e5);
        EnumC5950e enumC5950e6 = EnumC5950e.STRING;
        EnumC4266e enumC4266e9 = new EnumC4266e("STRING", 8, 8, 1, enumC5950e6);
        EnumC5950e enumC5950e7 = EnumC5950e.MESSAGE;
        EnumC4266e enumC4266e10 = new EnumC4266e("MESSAGE", 9, 9, 1, enumC5950e7);
        EnumC5950e enumC5950e8 = EnumC5950e.BYTE_STRING;
        EnumC4266e enumC4266e11 = new EnumC4266e("BYTES", 10, 10, 1, enumC5950e8);
        EnumC4266e enumC4266e12 = new EnumC4266e("UINT32", 11, 11, 1, enumC5950e4);
        EnumC5950e enumC5950e9 = EnumC5950e.ENUM;
        EnumC4266e enumC4266e13 = new EnumC4266e("ENUM", 12, 12, 1, enumC5950e9);
        EnumC4266e enumC4266e14 = new EnumC4266e("SFIXED32", 13, 13, 1, enumC5950e4);
        EnumC4266e enumC4266e15 = new EnumC4266e("SFIXED64", 14, 14, 1, enumC5950e3);
        EnumC4266e enumC4266e16 = new EnumC4266e("SINT32", 15, 15, 1, enumC5950e4);
        EnumC4266e enumC4266e17 = new EnumC4266e("SINT64", 16, 16, 1, enumC5950e3);
        EnumC4266e enumC4266e18 = new EnumC4266e("GROUP", 17, 17, 1, enumC5950e7);
        EnumC4266e enumC4266e19 = new EnumC4266e("DOUBLE_LIST", 18, 18, 2, enumC5950e);
        EnumC4266e enumC4266e20 = new EnumC4266e("FLOAT_LIST", 19, 19, 2, enumC5950e2);
        EnumC4266e enumC4266e21 = new EnumC4266e("INT64_LIST", 20, 20, 2, enumC5950e3);
        EnumC4266e enumC4266e22 = new EnumC4266e("UINT64_LIST", 21, 21, 2, enumC5950e3);
        EnumC4266e enumC4266e23 = new EnumC4266e("INT32_LIST", 22, 22, 2, enumC5950e4);
        EnumC4266e enumC4266e24 = new EnumC4266e("FIXED64_LIST", 23, 23, 2, enumC5950e3);
        EnumC4266e enumC4266e25 = new EnumC4266e("FIXED32_LIST", 24, 24, 2, enumC5950e4);
        EnumC4266e enumC4266e26 = new EnumC4266e("BOOL_LIST", 25, 25, 2, enumC5950e5);
        EnumC4266e enumC4266e27 = new EnumC4266e("STRING_LIST", 26, 26, 2, enumC5950e6);
        EnumC4266e enumC4266e28 = new EnumC4266e("MESSAGE_LIST", 27, 27, 2, enumC5950e7);
        EnumC4266e enumC4266e29 = new EnumC4266e("BYTES_LIST", 28, 28, 2, enumC5950e8);
        EnumC4266e enumC4266e30 = new EnumC4266e("UINT32_LIST", 29, 29, 2, enumC5950e4);
        EnumC4266e enumC4266e31 = new EnumC4266e("ENUM_LIST", 30, 30, 2, enumC5950e9);
        EnumC4266e enumC4266e32 = new EnumC4266e("SFIXED32_LIST", 31, 31, 2, enumC5950e4);
        EnumC4266e enumC4266e33 = new EnumC4266e("SFIXED64_LIST", 32, 32, 2, enumC5950e3);
        EnumC4266e enumC4266e34 = new EnumC4266e("SINT32_LIST", 33, 33, 2, enumC5950e4);
        EnumC4266e enumC4266e35 = new EnumC4266e("SINT64_LIST", 34, 34, 2, enumC5950e3);
        EnumC4266e enumC4266e36 = new EnumC4266e("DOUBLE_LIST_PACKED", 35, 35, 3, enumC5950e);
        f9355e = enumC4266e36;
        EnumC4266e enumC4266e37 = new EnumC4266e("FLOAT_LIST_PACKED", 36, 36, 3, enumC5950e2);
        EnumC4266e enumC4266e38 = new EnumC4266e("INT64_LIST_PACKED", 37, 37, 3, enumC5950e3);
        EnumC4266e enumC4266e39 = new EnumC4266e("UINT64_LIST_PACKED", 38, 38, 3, enumC5950e3);
        EnumC4266e enumC4266e40 = new EnumC4266e("INT32_LIST_PACKED", 39, 39, 3, enumC5950e4);
        EnumC4266e enumC4266e41 = new EnumC4266e("FIXED64_LIST_PACKED", 40, 40, 3, enumC5950e3);
        EnumC4266e enumC4266e42 = new EnumC4266e("FIXED32_LIST_PACKED", 41, 41, 3, enumC5950e4);
        EnumC4266e enumC4266e43 = new EnumC4266e("BOOL_LIST_PACKED", 42, 42, 3, enumC5950e5);
        EnumC4266e enumC4266e44 = new EnumC4266e("UINT32_LIST_PACKED", 43, 43, 3, enumC5950e4);
        EnumC4266e enumC4266e45 = new EnumC4266e("ENUM_LIST_PACKED", 44, 44, 3, enumC5950e9);
        EnumC4266e enumC4266e46 = new EnumC4266e("SFIXED32_LIST_PACKED", 45, 45, 3, enumC5950e4);
        EnumC4266e enumC4266e47 = new EnumC4266e("SFIXED64_LIST_PACKED", 46, 46, 3, enumC5950e3);
        EnumC4266e enumC4266e48 = new EnumC4266e("SINT32_LIST_PACKED", 47, 47, 3, enumC5950e4);
        EnumC4266e enumC4266e49 = new EnumC4266e("SINT64_LIST_PACKED", 48, 48, 3, enumC5950e3);
        f9354e = enumC4266e49;
        f9353e = new EnumC4266e[]{enumC4266e, enumC4266e2, enumC4266e3, enumC4266e4, enumC4266e5, enumC4266e6, enumC4266e7, enumC4266e8, enumC4266e9, enumC4266e10, enumC4266e11, enumC4266e12, enumC4266e13, enumC4266e14, enumC4266e15, enumC4266e16, enumC4266e17, enumC4266e18, enumC4266e19, enumC4266e20, enumC4266e21, enumC4266e22, enumC4266e23, enumC4266e24, enumC4266e25, enumC4266e26, enumC4266e27, enumC4266e28, enumC4266e29, enumC4266e30, enumC4266e31, enumC4266e32, enumC4266e33, enumC4266e34, enumC4266e35, enumC4266e36, enumC4266e37, enumC4266e38, enumC4266e39, enumC4266e40, enumC4266e41, enumC4266e42, enumC4266e43, enumC4266e44, enumC4266e45, enumC4266e46, enumC4266e47, enumC4266e48, enumC4266e49, new EnumC4266e("GROUP_LIST", 49, 49, 2, enumC5950e7), new EnumC4266e("MAP", 50, 50, 4, EnumC5950e.VOID)};
        EnumC4266e[] values = values();
        f9356e = new EnumC4266e[values.length];
        for (EnumC4266e enumC4266e50 : values) {
            f9356e[enumC4266e50.f9357e] = enumC4266e50;
        }
    }

    public EnumC4266e(String str, int i, int i2, int i3, EnumC5950e enumC5950e) {
        this.f9357e = i2;
        int m2467class = AbstractC8703e.m2467class(i3);
        if (m2467class == 1) {
            enumC5950e.getClass();
        } else if (m2467class == 3) {
            enumC5950e.getClass();
        }
        if (i3 == 1) {
            enumC5950e.ordinal();
        }
    }

    public static EnumC4266e valueOf(String str) {
        return (EnumC4266e) Enum.valueOf(EnumC4266e.class, str);
    }

    public static EnumC4266e[] values() {
        return (EnumC4266e[]) f9353e.clone();
    }
}
