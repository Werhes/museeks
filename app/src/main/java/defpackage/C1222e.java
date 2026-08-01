package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒٞٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1222e extends AbstractC4994e {
    private static final C1222e DEFAULT_INSTANCE;
    public static final int LAYOUT_FIELD_NUMBER = 1;
    public static final int NEXT_INDEX_FIELD_NUMBER = 2;
    private static volatile InterfaceC17362e PARSER;
    private InterfaceC4115e layout_ = C11361e.f22872e;
    private int nextIndex_;

    static {
        C1222e c1222e = new C1222e();
        DEFAULT_INSTANCE = c1222e;
        AbstractC4994e.mopub(C1222e.class, c1222e);
    }

    public static void Signature(C1222e c1222e, int i) {
        c1222e.nextIndex_ = i;
    }

    public static C1222e admob() {
        return DEFAULT_INSTANCE;
    }

    public static void amazon(C1222e c1222e, C3994e c3994e) {
        c1222e.getClass();
        InterfaceC4115e interfaceC4115e = c1222e.layout_;
        if (!((AbstractC5360e) interfaceC4115e).f11481e) {
            int size = interfaceC4115e.size();
            c1222e.layout_ = interfaceC4115e.metrica(size == 0 ? 10 : size * 2);
        }
        c1222e.layout_.add(c3994e);
    }

    public static void loadAd(C1222e c1222e) {
        c1222e.getClass();
        c1222e.layout_ = C11361e.f22872e;
    }

    public static C1222e pro(InputStream inputStream) {
        AbstractC15825e c13296e;
        C1222e c1222e = DEFAULT_INSTANCE;
        if (inputStream == null) {
            byte[] bArr = AbstractC0352e.vip;
            int length = bArr.length;
            c13296e = new C16834e(bArr, 0, length, false);
            try {
                c13296e.subscription(length);
            } catch (C11872e e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            c13296e = new C13296e(inputStream);
        }
        C16593e ad = C16593e.ad();
        AbstractC4994e adcel = c1222e.adcel();
        try {
            C5623e c5623e = C5623e.metrica;
            c5623e.getClass();
            InterfaceC3028e ad2 = c5623e.ad(adcel.getClass());
            C11226e c11226e = (C11226e) c13296e.f31256e;
            if (c11226e == null) {
                c11226e = new C11226e(c13296e);
            }
            ad2.startapp(adcel, c11226e, ad);
            ad2.vip(adcel);
            if (AbstractC4994e.billing(adcel, true)) {
                return (C1222e) adcel;
            }
            throw new IOException(new C14491e().getMessage());
        } catch (C11872e e2) {
            if (e2.f23795e) {
                throw new IOException(e2.getMessage(), e2);
            }
            throw e2;
        } catch (C14491e e3) {
            throw new IOException(e3.getMessage());
        } catch (IOException e4) {
            if (e4.getCause() instanceof C11872e) {
                throw ((C11872e) e4.getCause());
            }
            throw new IOException(e4.getMessage(), e4);
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof C11872e) {
                throw ((C11872e) e5.getCause());
            }
            throw e5;
        }
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
                return new C14702e(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0004", new Object[]{"layout_", C3994e.class, "nextIndex_"});
            case 3:
                return new C1222e();
            case 4:
                return new AbstractC12161e(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                InterfaceC17362e interfaceC17362e2 = PARSER;
                if (interfaceC17362e2 != null) {
                    return interfaceC17362e2;
                }
                synchronized (C1222e.class) {
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

    public final int remoteconfig() {
        return this.nextIndex_;
    }

    public final InterfaceC4115e subscription() {
        return this.layout_;
    }
}
