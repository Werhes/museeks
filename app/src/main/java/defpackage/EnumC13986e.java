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
/* renamed from: eٓٔۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC13986e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC13986e[] f27699e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC13986e f27700e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final EnumC13986e f27701e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC13986e[] f27702e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f27703e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC13986e EF0;

    static {
        EnumC2793e enumC2793e = EnumC2793e.DOUBLE;
        EnumC13986e enumC13986e = new EnumC13986e("DOUBLE", 0, 0, 1, enumC2793e);
        EnumC2793e enumC2793e2 = EnumC2793e.FLOAT;
        EnumC13986e enumC13986e2 = new EnumC13986e("FLOAT", 1, 1, 1, enumC2793e2);
        EnumC2793e enumC2793e3 = EnumC2793e.LONG;
        EnumC13986e enumC13986e3 = new EnumC13986e("INT64", 2, 2, 1, enumC2793e3);
        EnumC13986e enumC13986e4 = new EnumC13986e("UINT64", 3, 3, 1, enumC2793e3);
        EnumC2793e enumC2793e4 = EnumC2793e.INT;
        EnumC13986e enumC13986e5 = new EnumC13986e("INT32", 4, 4, 1, enumC2793e4);
        EnumC13986e enumC13986e6 = new EnumC13986e("FIXED64", 5, 5, 1, enumC2793e3);
        EnumC13986e enumC13986e7 = new EnumC13986e("FIXED32", 6, 6, 1, enumC2793e4);
        EnumC2793e enumC2793e5 = EnumC2793e.BOOLEAN;
        EnumC13986e enumC13986e8 = new EnumC13986e("BOOL", 7, 7, 1, enumC2793e5);
        EnumC2793e enumC2793e6 = EnumC2793e.STRING;
        EnumC13986e enumC13986e9 = new EnumC13986e("STRING", 8, 8, 1, enumC2793e6);
        EnumC2793e enumC2793e7 = EnumC2793e.MESSAGE;
        EnumC13986e enumC13986e10 = new EnumC13986e("MESSAGE", 9, 9, 1, enumC2793e7);
        EnumC2793e enumC2793e8 = EnumC2793e.BYTE_STRING;
        EnumC13986e enumC13986e11 = new EnumC13986e("BYTES", 10, 10, 1, enumC2793e8);
        EnumC13986e enumC13986e12 = new EnumC13986e("UINT32", 11, 11, 1, enumC2793e4);
        EnumC2793e enumC2793e9 = EnumC2793e.ENUM;
        EnumC13986e enumC13986e13 = new EnumC13986e("ENUM", 12, 12, 1, enumC2793e9);
        EnumC13986e enumC13986e14 = new EnumC13986e("SFIXED32", 13, 13, 1, enumC2793e4);
        EnumC13986e enumC13986e15 = new EnumC13986e("SFIXED64", 14, 14, 1, enumC2793e3);
        EnumC13986e enumC13986e16 = new EnumC13986e("SINT32", 15, 15, 1, enumC2793e4);
        EnumC13986e enumC13986e17 = new EnumC13986e("SINT64", 16, 16, 1, enumC2793e3);
        EnumC13986e enumC13986e18 = new EnumC13986e("GROUP", 17, 17, 1, enumC2793e7);
        EnumC13986e enumC13986e19 = new EnumC13986e("DOUBLE_LIST", 18, 18, 2, enumC2793e);
        EnumC13986e enumC13986e20 = new EnumC13986e("FLOAT_LIST", 19, 19, 2, enumC2793e2);
        EnumC13986e enumC13986e21 = new EnumC13986e("INT64_LIST", 20, 20, 2, enumC2793e3);
        EnumC13986e enumC13986e22 = new EnumC13986e("UINT64_LIST", 21, 21, 2, enumC2793e3);
        EnumC13986e enumC13986e23 = new EnumC13986e("INT32_LIST", 22, 22, 2, enumC2793e4);
        EnumC13986e enumC13986e24 = new EnumC13986e("FIXED64_LIST", 23, 23, 2, enumC2793e3);
        EnumC13986e enumC13986e25 = new EnumC13986e("FIXED32_LIST", 24, 24, 2, enumC2793e4);
        EnumC13986e enumC13986e26 = new EnumC13986e("BOOL_LIST", 25, 25, 2, enumC2793e5);
        EnumC13986e enumC13986e27 = new EnumC13986e("STRING_LIST", 26, 26, 2, enumC2793e6);
        EnumC13986e enumC13986e28 = new EnumC13986e("MESSAGE_LIST", 27, 27, 2, enumC2793e7);
        EnumC13986e enumC13986e29 = new EnumC13986e("BYTES_LIST", 28, 28, 2, enumC2793e8);
        EnumC13986e enumC13986e30 = new EnumC13986e("UINT32_LIST", 29, 29, 2, enumC2793e4);
        EnumC13986e enumC13986e31 = new EnumC13986e("ENUM_LIST", 30, 30, 2, enumC2793e9);
        EnumC13986e enumC13986e32 = new EnumC13986e("SFIXED32_LIST", 31, 31, 2, enumC2793e4);
        EnumC13986e enumC13986e33 = new EnumC13986e("SFIXED64_LIST", 32, 32, 2, enumC2793e3);
        EnumC13986e enumC13986e34 = new EnumC13986e("SINT32_LIST", 33, 33, 2, enumC2793e4);
        EnumC13986e enumC13986e35 = new EnumC13986e("SINT64_LIST", 34, 34, 2, enumC2793e3);
        EnumC13986e enumC13986e36 = new EnumC13986e("DOUBLE_LIST_PACKED", 35, 35, 3, enumC2793e);
        f27701e = enumC13986e36;
        EnumC13986e enumC13986e37 = new EnumC13986e("FLOAT_LIST_PACKED", 36, 36, 3, enumC2793e2);
        EnumC13986e enumC13986e38 = new EnumC13986e("INT64_LIST_PACKED", 37, 37, 3, enumC2793e3);
        EnumC13986e enumC13986e39 = new EnumC13986e("UINT64_LIST_PACKED", 38, 38, 3, enumC2793e3);
        EnumC13986e enumC13986e40 = new EnumC13986e("INT32_LIST_PACKED", 39, 39, 3, enumC2793e4);
        EnumC13986e enumC13986e41 = new EnumC13986e("FIXED64_LIST_PACKED", 40, 40, 3, enumC2793e3);
        EnumC13986e enumC13986e42 = new EnumC13986e("FIXED32_LIST_PACKED", 41, 41, 3, enumC2793e4);
        EnumC13986e enumC13986e43 = new EnumC13986e("BOOL_LIST_PACKED", 42, 42, 3, enumC2793e5);
        EnumC13986e enumC13986e44 = new EnumC13986e("UINT32_LIST_PACKED", 43, 43, 3, enumC2793e4);
        EnumC13986e enumC13986e45 = new EnumC13986e("ENUM_LIST_PACKED", 44, 44, 3, enumC2793e9);
        EnumC13986e enumC13986e46 = new EnumC13986e("SFIXED32_LIST_PACKED", 45, 45, 3, enumC2793e4);
        EnumC13986e enumC13986e47 = new EnumC13986e("SFIXED64_LIST_PACKED", 46, 46, 3, enumC2793e3);
        EnumC13986e enumC13986e48 = new EnumC13986e("SINT32_LIST_PACKED", 47, 47, 3, enumC2793e4);
        EnumC13986e enumC13986e49 = new EnumC13986e("SINT64_LIST_PACKED", 48, 48, 3, enumC2793e3);
        f27700e = enumC13986e49;
        f27699e = new EnumC13986e[]{enumC13986e, enumC13986e2, enumC13986e3, enumC13986e4, enumC13986e5, enumC13986e6, enumC13986e7, enumC13986e8, enumC13986e9, enumC13986e10, enumC13986e11, enumC13986e12, enumC13986e13, enumC13986e14, enumC13986e15, enumC13986e16, enumC13986e17, enumC13986e18, enumC13986e19, enumC13986e20, enumC13986e21, enumC13986e22, enumC13986e23, enumC13986e24, enumC13986e25, enumC13986e26, enumC13986e27, enumC13986e28, enumC13986e29, enumC13986e30, enumC13986e31, enumC13986e32, enumC13986e33, enumC13986e34, enumC13986e35, enumC13986e36, enumC13986e37, enumC13986e38, enumC13986e39, enumC13986e40, enumC13986e41, enumC13986e42, enumC13986e43, enumC13986e44, enumC13986e45, enumC13986e46, enumC13986e47, enumC13986e48, enumC13986e49, new EnumC13986e("GROUP_LIST", 49, 49, 2, enumC2793e7), new EnumC13986e("MAP", 50, 50, 4, EnumC2793e.VOID)};
        EnumC13986e[] values = values();
        f27702e = new EnumC13986e[values.length];
        for (EnumC13986e enumC13986e50 : values) {
            f27702e[enumC13986e50.f27703e] = enumC13986e50;
        }
    }

    public EnumC13986e(String str, int i, int i2, int i3, EnumC2793e enumC2793e) {
        this.f27703e = i2;
        int m2467class = AbstractC8703e.m2467class(i3);
        if (m2467class == 1) {
            enumC2793e.getClass();
        } else if (m2467class == 3) {
            enumC2793e.getClass();
        }
        if (i3 == 1) {
            enumC2793e.ordinal();
        }
    }

    public static EnumC13986e valueOf(String str) {
        return (EnumC13986e) Enum.valueOf(EnumC13986e.class, str);
    }

    public static EnumC13986e[] values() {
        return (EnumC13986e[]) f27699e.clone();
    }
}
