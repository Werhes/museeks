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
/* renamed from: eؖؓ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class EnumC3844e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C8484e f8484e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C5841e f8485e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final C10449e f8486e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ EnumC3844e[] f8487e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f8488e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final EnumC10711e f8489e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC3844e EF0;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC3844e EF1;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC3844e EF2;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [eؖؓ۟, eٌؕۖ] */
    /* JADX WARN: Type inference failed for: r4v2, types: [eؖؓ۟, eؘۗٞ] */
    /* JADX WARN: Type inference failed for: r6v3, types: [eؖؓ۟, eَۖۘ] */
    static {
        EnumC3844e enumC3844e = new EnumC3844e("DOUBLE", 0, EnumC10711e.DOUBLE, 1);
        EnumC3844e enumC3844e2 = new EnumC3844e("FLOAT", 1, EnumC10711e.FLOAT, 5);
        EnumC10711e enumC10711e = EnumC10711e.LONG;
        EnumC3844e enumC3844e3 = new EnumC3844e("INT64", 2, enumC10711e, 0);
        EnumC3844e enumC3844e4 = new EnumC3844e("UINT64", 3, enumC10711e, 0);
        EnumC10711e enumC10711e2 = EnumC10711e.INT;
        EnumC3844e enumC3844e5 = new EnumC3844e("INT32", 4, enumC10711e2, 0);
        EnumC3844e enumC3844e6 = new EnumC3844e("FIXED64", 5, enumC10711e, 1);
        EnumC3844e enumC3844e7 = new EnumC3844e("FIXED32", 6, enumC10711e2, 5);
        EnumC3844e enumC3844e8 = new EnumC3844e("BOOL", 7, EnumC10711e.BOOLEAN, 0);
        ?? enumC3844e9 = new EnumC3844e("STRING", 8, EnumC10711e.STRING, 2);
        f8485e = enumC3844e9;
        EnumC10711e enumC10711e3 = EnumC10711e.MESSAGE;
        ?? enumC3844e10 = new EnumC3844e("GROUP", 9, enumC10711e3, 3);
        f8486e = enumC3844e10;
        ?? enumC3844e11 = new EnumC3844e("MESSAGE", 10, enumC10711e3, 2);
        f8484e = enumC3844e11;
        f8487e = new EnumC3844e[]{enumC3844e, enumC3844e2, enumC3844e3, enumC3844e4, enumC3844e5, enumC3844e6, enumC3844e7, enumC3844e8, enumC3844e9, enumC3844e10, enumC3844e11, new EnumC3844e("BYTES", 11, EnumC10711e.BYTE_STRING, 2), new EnumC3844e("UINT32", 12, enumC10711e2, 0), new EnumC3844e("ENUM", 13, EnumC10711e.ENUM, 0), new EnumC3844e("SFIXED32", 14, enumC10711e2, 5), new EnumC3844e("SFIXED64", 15, enumC10711e, 1), new EnumC3844e("SINT32", 16, enumC10711e2, 0), new EnumC3844e("SINT64", 17, enumC10711e, 0)};
    }

    public EnumC3844e(String str, int i, EnumC10711e enumC10711e, int i2) {
        this.f8489e = enumC10711e;
        this.f8488e = i2;
    }

    public static EnumC3844e valueOf(String str) {
        return (EnumC3844e) Enum.valueOf(EnumC3844e.class, str);
    }

    public static EnumC3844e[] values() {
        return (EnumC3844e[]) f8487e.clone();
    }
}
