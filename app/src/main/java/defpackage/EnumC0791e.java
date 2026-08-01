package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣؒؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public enum EnumC0791e implements InterfaceC2102e {
    BYTE(0),
    CHAR(1),
    SHORT(2),
    INT(3),
    LONG(4),
    FLOAT(5),
    DOUBLE(6),
    BOOLEAN(7),
    STRING(8),
    CLASS(9),
    ENUM(10),
    ANNOTATION(11),
    ARRAY(12);


    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f3181e;

    EnumC0791e(int i) {
        this.f3181e = i;
    }

    public static EnumC0791e vip(int i) {
        switch (i) {
            case 0:
                return BYTE;
            case 1:
                return CHAR;
            case 2:
                return SHORT;
            case 3:
                return INT;
            case 4:
                return LONG;
            case 5:
                return FLOAT;
            case 6:
                return DOUBLE;
            case 7:
                return BOOLEAN;
            case 8:
                return STRING;
            case 9:
                return CLASS;
            case 10:
                return ENUM;
            case 11:
                return ANNOTATION;
            case 12:
                return ARRAY;
            default:
                return null;
        }
    }

    @Override // defpackage.InterfaceC2102e
    public final int ad() {
        return this.f3181e;
    }
}
