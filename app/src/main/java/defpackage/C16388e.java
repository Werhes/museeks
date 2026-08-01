package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٞٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16388e extends AbstractC18270e {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final C16388e DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile InterfaceC8432e PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    static {
        C16388e c16388e = new C16388e();
        DEFAULT_INSTANCE = c16388e;
        AbstractC18270e.adcel(C16388e.class, c16388e);
    }

    public static void Signature(C16388e c16388e, double d) {
        c16388e.valueCase_ = 7;
        c16388e.value_ = Double.valueOf(d);
    }

    public static void admob(C16388e c16388e, C6283e c6283e) {
        c16388e.getClass();
        c16388e.valueCase_ = 8;
        c16388e.value_ = c6283e;
    }

    public static void amazon(C16388e c16388e, String str) {
        c16388e.getClass();
        c16388e.valueCase_ = 5;
        c16388e.value_ = str;
    }

    public static C8426e firebase() {
        return (C8426e) ((AbstractC12661e) DEFAULT_INSTANCE.vip(5));
    }

    public static C16388e isVip() {
        return DEFAULT_INSTANCE;
    }

    public static void loadAd(C16388e c16388e, C6403e c6403e) {
        c16388e.getClass();
        c16388e.value_ = c6403e;
        c16388e.valueCase_ = 6;
    }

    public static void pro(C16388e c16388e, int i) {
        c16388e.valueCase_ = 3;
        c16388e.value_ = Integer.valueOf(i);
    }

    public static void remoteconfig(C16388e c16388e, float f) {
        c16388e.valueCase_ = 2;
        c16388e.value_ = Float.valueOf(f);
    }

    public static void smaato(C16388e c16388e, long j) {
        c16388e.valueCase_ = 4;
        c16388e.value_ = Long.valueOf(j);
    }

    public static void subscription(C16388e c16388e, boolean z) {
        c16388e.valueCase_ = 1;
        c16388e.value_ = Boolean.valueOf(z);
    }

    public final long ads() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public final int applovin() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public final int crashlytics() {
        switch (this.valueCase_) {
            case 0:
                return 9;
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            case 8:
                return 8;
            default:
                return 0;
        }
    }

    public final double inmobi() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public final float isPro() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public final String premium() {
        return this.valueCase_ == 5 ? (String) this.value_ : BuildConfig.FLAVOR;
    }

    public final boolean signatures() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public final C6403e subs() {
        return this.valueCase_ == 6 ? (C6403e) this.value_ : C6403e.amazon();
    }

    public final C6283e tapsense() {
        return this.valueCase_ == 8 ? (C6283e) this.value_ : C6283e.f13092e;
    }

    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object, eٌؑۦ] */
    @Override // defpackage.AbstractC18270e
    public final Object vip(int i) {
        InterfaceC8432e interfaceC8432e;
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class == 0) {
            return (byte) 1;
        }
        if (m2467class == 2) {
            return new C8678e(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", C6403e.class});
        }
        if (m2467class == 3) {
            return new C16388e();
        }
        if (m2467class == 4) {
            return new AbstractC12661e(DEFAULT_INSTANCE);
        }
        if (m2467class == 5) {
            return DEFAULT_INSTANCE;
        }
        if (m2467class != 6) {
            throw null;
        }
        InterfaceC8432e interfaceC8432e2 = PARSER;
        if (interfaceC8432e2 != null) {
            return interfaceC8432e2;
        }
        synchronized (C16388e.class) {
            try {
                InterfaceC8432e interfaceC8432e3 = PARSER;
                interfaceC8432e = interfaceC8432e3;
                if (interfaceC8432e3 == null) {
                    ?? obj = new Object();
                    PARSER = obj;
                    interfaceC8432e = obj;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC8432e;
    }
}
