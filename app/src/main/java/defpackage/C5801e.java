package defpackage;

import java.io.IOException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؘٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5801e extends AbstractC4994e {
    private static final C5801e DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 3;
    public static final int LAMBDA_FIELD_NUMBER = 4;
    public static final int MY_PACKAGE_REPLACED_FIELD_NUMBER = 6;
    public static final int OPTIONS_CHANGED_FIELD_NUMBER = 2;
    private static volatile InterfaceC17362e PARSER = null;
    public static final int RUN_CALLBACK_FIELD_NUMBER = 5;
    public static final int UPDATE_FIELD_NUMBER = 1;
    private int requestCase_ = 0;
    private Object request_;

    static {
        C5801e c5801e = new C5801e();
        DEFAULT_INSTANCE = c5801e;
        AbstractC4994e.mopub(C5801e.class, c5801e);
    }

    public static void Signature(C5801e c5801e, C16021e c16021e) {
        c5801e.getClass();
        c5801e.request_ = c16021e;
        c5801e.requestCase_ = 3;
    }

    public static void admob(C5801e c5801e, C8609e c8609e) {
        c5801e.getClass();
        c5801e.request_ = c8609e;
        c5801e.requestCase_ = 4;
    }

    public static void amazon(C5801e c5801e, C15774e c15774e) {
        c5801e.getClass();
        c5801e.request_ = c15774e;
        c5801e.requestCase_ = 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, eَؙۥ] */
    /* renamed from: class, reason: not valid java name */
    public static C5801e m1972class(byte[] bArr) {
        C5801e c5801e = DEFAULT_INSTANCE;
        int length = bArr.length;
        C16593e ad = C16593e.ad();
        if (length != 0) {
            AbstractC4994e adcel = c5801e.adcel();
            try {
                C5623e c5623e = C5623e.metrica;
                c5623e.getClass();
                InterfaceC3028e ad2 = c5623e.ad(adcel.getClass());
                ?? obj = new Object();
                ad.getClass();
                ad2.yandex(adcel, bArr, 0, length, obj);
                ad2.vip(adcel);
                c5801e = adcel;
            } catch (C11872e e) {
                if (e.f23795e) {
                    throw new IOException(e.getMessage(), e);
                }
                throw e;
            } catch (C14491e e2) {
                throw new IOException(e2.getMessage());
            } catch (IOException e3) {
                if (e3.getCause() instanceof C11872e) {
                    throw ((C11872e) e3.getCause());
                }
                throw new IOException(e3.getMessage(), e3);
            } catch (IndexOutOfBoundsException unused) {
                throw C11872e.billing();
            }
        }
        if (c5801e == null || AbstractC4994e.billing(c5801e, true)) {
            return c5801e;
        }
        throw new IOException(new C14491e().getMessage());
    }

    public static C15470e firebase() {
        return (C15470e) DEFAULT_INSTANCE.metrica();
    }

    public static void loadAd(C5801e c5801e, C2900e c2900e) {
        c5801e.getClass();
        c5801e.request_ = c2900e;
        c5801e.requestCase_ = 2;
    }

    public static void remoteconfig(C5801e c5801e, C18114e c18114e) {
        c5801e.getClass();
        c5801e.request_ = c18114e;
        c5801e.requestCase_ = 6;
    }

    public static void subscription(C5801e c5801e, C17583e c17583e) {
        c5801e.getClass();
        c5801e.request_ = c17583e;
        c5801e.requestCase_ = 5;
    }

    public final boolean ads() {
        return this.requestCase_ == 6;
    }

    public final boolean applovin() {
        return this.requestCase_ == 4;
    }

    public final boolean crashlytics() {
        return this.requestCase_ == 1;
    }

    public final C15774e inmobi() {
        return this.requestCase_ == 1 ? (C15774e) this.request_ : C15774e.admob();
    }

    public final boolean isPro() {
        return this.requestCase_ == 3;
    }

    public final C17583e isVip() {
        return this.requestCase_ == 5 ? (C17583e) this.request_ : C17583e.remoteconfig();
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
                return new C14702e(DEFAULT_INSTANCE, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"request_", "requestCase_", C15774e.class, C2900e.class, C16021e.class, C8609e.class, C17583e.class, C18114e.class});
            case 3:
                return new C5801e();
            case 4:
                return new AbstractC12161e(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC17362e interfaceC17362e2 = PARSER;
                if (interfaceC17362e2 != null) {
                    return interfaceC17362e2;
                }
                synchronized (C5801e.class) {
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

    public final boolean premium() {
        return this.requestCase_ == 2;
    }

    public final C16021e pro() {
        return this.requestCase_ == 3 ? (C16021e) this.request_ : C16021e.admob();
    }

    public final C8609e signatures() {
        return this.requestCase_ == 4 ? (C8609e) this.request_ : C8609e.remoteconfig();
    }

    public final boolean subs() {
        return this.requestCase_ == 5;
    }

    public final C2900e tapsense() {
        return this.requestCase_ == 2 ? (C2900e) this.request_ : C2900e.remoteconfig();
    }
}
