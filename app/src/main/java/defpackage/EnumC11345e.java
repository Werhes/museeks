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
/* renamed from: eُۢٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC11345e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final EnumC11345e f22819e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final EnumC11345e f22820e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final EnumC11345e f22821e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC11345e[] f22822e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f22823e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final EnumC7932e f22824e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC11345e EF0;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC11345e EF1;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC11345e EF2;

    static {
        EnumC11345e enumC11345e = new EnumC11345e("DOUBLE", 0, EnumC7932e.f16062e, 1);
        EnumC11345e enumC11345e2 = new EnumC11345e("FLOAT", 1, EnumC7932e.f16058e, 5);
        EnumC7932e enumC7932e = EnumC7932e.f16060e;
        EnumC11345e enumC11345e3 = new EnumC11345e("INT64", 2, enumC7932e, 0);
        EnumC11345e enumC11345e4 = new EnumC11345e("UINT64", 3, enumC7932e, 0);
        EnumC7932e enumC7932e2 = EnumC7932e.f16064e;
        EnumC11345e enumC11345e5 = new EnumC11345e("INT32", 4, enumC7932e2, 0);
        EnumC11345e enumC11345e6 = new EnumC11345e("FIXED64", 5, enumC7932e, 1);
        EnumC11345e enumC11345e7 = new EnumC11345e("FIXED32", 6, enumC7932e2, 5);
        EnumC11345e enumC11345e8 = new EnumC11345e("BOOL", 7, EnumC7932e.f16057e, 0);
        EnumC11345e enumC11345e9 = new EnumC11345e("STRING", 8, EnumC7932e.f16066e, 2);
        f22820e = enumC11345e9;
        EnumC7932e enumC7932e3 = EnumC7932e.f16063e;
        EnumC11345e enumC11345e10 = new EnumC11345e("GROUP", 9, enumC7932e3, 3);
        f22821e = enumC11345e10;
        EnumC11345e enumC11345e11 = new EnumC11345e("MESSAGE", 10, enumC7932e3, 2);
        f22819e = enumC11345e11;
        f22822e = new EnumC11345e[]{enumC11345e, enumC11345e2, enumC11345e3, enumC11345e4, enumC11345e5, enumC11345e6, enumC11345e7, enumC11345e8, enumC11345e9, enumC11345e10, enumC11345e11, new EnumC11345e("BYTES", 11, EnumC7932e.f16065e, 2), new EnumC11345e("UINT32", 12, enumC7932e2, 0), new EnumC11345e("ENUM", 13, EnumC7932e.f16061e, 0), new EnumC11345e("SFIXED32", 14, enumC7932e2, 5), new EnumC11345e("SFIXED64", 15, enumC7932e, 1), new EnumC11345e("SINT32", 16, enumC7932e2, 0), new EnumC11345e("SINT64", 17, enumC7932e, 0)};
    }

    public EnumC11345e(String str, int i, EnumC7932e enumC7932e, int i2) {
        this.f22824e = enumC7932e;
        this.f22823e = i2;
    }

    public static EnumC11345e[] values() {
        return (EnumC11345e[]) f22822e.clone();
    }
}
