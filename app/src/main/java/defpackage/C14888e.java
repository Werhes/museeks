package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٔۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14888e extends AbstractC4994e {
    public static final int CHILDREN_FIELD_NUMBER = 7;
    private static final C14888e DEFAULT_INSTANCE;
    public static final int HASACTION_FIELD_NUMBER = 9;
    public static final int HAS_IMAGE_ALPHA_FIELD_NUMBER = 12;
    public static final int HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER = 11;
    public static final int HAS_IMAGE_DESCRIPTION_FIELD_NUMBER = 10;
    public static final int HEIGHT_FIELD_NUMBER = 3;
    public static final int HORIZONTAL_ALIGNMENT_FIELD_NUMBER = 4;
    public static final int IDENTITY_FIELD_NUMBER = 8;
    public static final int IMAGE_SCALE_FIELD_NUMBER = 6;
    private static volatile InterfaceC17362e PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 1;
    public static final int VERTICAL_ALIGNMENT_FIELD_NUMBER = 5;
    public static final int WIDTH_FIELD_NUMBER = 2;
    private InterfaceC4115e children_ = C11361e.f22872e;
    private boolean hasAction_;
    private boolean hasImageAlpha_;
    private boolean hasImageColorFilter_;
    private boolean hasImageDescription_;
    private int height_;
    private int horizontalAlignment_;
    private int identity_;
    private int imageScale_;
    private int type_;
    private int verticalAlignment_;
    private int width_;

    static {
        C14888e c14888e = new C14888e();
        DEFAULT_INSTANCE = c14888e;
        AbstractC4994e.mopub(C14888e.class, c14888e);
    }

    public static void Signature(C14888e c14888e, EnumC5847e enumC5847e) {
        c14888e.getClass();
        c14888e.height_ = enumC5847e.ad();
    }

    public static void admob(C14888e c14888e, EnumC12302e enumC12302e) {
        c14888e.getClass();
        if (enumC12302e != EnumC12302e.UNRECOGNIZED) {
            c14888e.horizontalAlignment_ = enumC12302e.f24686e;
        } else {
            enumC12302e.getClass();
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static C1119e ads() {
        return (C1119e) DEFAULT_INSTANCE.metrica();
    }

    public static void amazon(C14888e c14888e, EnumC4441e enumC4441e) {
        c14888e.getClass();
        if (enumC4441e != EnumC4441e.UNRECOGNIZED) {
            c14888e.type_ = enumC4441e.f9635e;
        } else {
            enumC4441e.getClass();
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static C14888e applovin() {
        return DEFAULT_INSTANCE;
    }

    public static void inmobi(C14888e c14888e, boolean z) {
        c14888e.hasImageColorFilter_ = z;
    }

    public static void isPro(C14888e c14888e, boolean z) {
        c14888e.hasImageAlpha_ = z;
    }

    public static void isVip(C14888e c14888e, boolean z) {
        c14888e.hasImageDescription_ = z;
    }

    public static void loadAd(C14888e c14888e, EnumC5847e enumC5847e) {
        c14888e.getClass();
        c14888e.width_ = enumC5847e.ad();
    }

    public static void pro(C14888e c14888e) {
        c14888e.getClass();
        EnumC2093e enumC2093e = EnumC2093e.UNRECOGNIZED;
        EnumC2093e enumC2093e2 = EnumC2093e.BACKGROUND_NODE;
        if (enumC2093e2 != enumC2093e) {
            c14888e.identity_ = enumC2093e2.f5425e;
        } else {
            enumC2093e2.getClass();
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static void remoteconfig(C14888e c14888e, EnumC0137e enumC0137e) {
        c14888e.getClass();
        if (enumC0137e != EnumC0137e.UNRECOGNIZED) {
            c14888e.imageScale_ = enumC0137e.f1365e;
        } else {
            enumC0137e.getClass();
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static void signatures(C14888e c14888e, boolean z) {
        c14888e.hasAction_ = z;
    }

    public static void subscription(C14888e c14888e, EnumC10368e enumC10368e) {
        c14888e.getClass();
        if (enumC10368e != EnumC10368e.UNRECOGNIZED) {
            c14888e.verticalAlignment_ = enumC10368e.f20470e;
        } else {
            enumC10368e.getClass();
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    public static void tapsense(C14888e c14888e, ArrayList arrayList) {
        InterfaceC4115e interfaceC4115e = c14888e.children_;
        if (!((AbstractC5360e) interfaceC4115e).f11481e) {
            int size = interfaceC4115e.size();
            c14888e.children_ = interfaceC4115e.metrica(size == 0 ? 10 : size * 2);
        }
        AbstractC6866e.ad(arrayList, c14888e.children_);
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, eؚۣٗ] */
    @Override // defpackage.AbstractC4994e
    public final Object license(int i) {
        InterfaceC17362e interfaceC17362e;
        switch (AbstractC8703e.m2467class(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new C14702e(DEFAULT_INSTANCE, "\u0000\f\u0000\u0000\u0001\f\f\u0000\u0001\u0000\u0001\f\u0002\f\u0003\f\u0004\f\u0005\f\u0006\f\u0007\u001b\b\f\t\u0007\n\u0007\u000b\u0007\f\u0007", new Object[]{"type_", "width_", "height_", "horizontalAlignment_", "verticalAlignment_", "imageScale_", "children_", C14888e.class, "identity_", "hasAction_", "hasImageDescription_", "hasImageColorFilter_", "hasImageAlpha_"});
            case 3:
                return new C14888e();
            case 4:
                return new AbstractC12161e(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC17362e interfaceC17362e2 = PARSER;
                if (interfaceC17362e2 != null) {
                    return interfaceC17362e2;
                }
                synchronized (C14888e.class) {
                    try {
                        InterfaceC17362e interfaceC17362e3 = PARSER;
                        interfaceC17362e = interfaceC17362e3;
                        if (interfaceC17362e3 == null) {
                            ?? obj = new Object();
                            PARSER = obj;
                            interfaceC17362e = obj;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return interfaceC17362e;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
