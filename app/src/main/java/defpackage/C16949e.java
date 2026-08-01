package defpackage;

import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٗٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16949e extends AbstractC18270e {
    private static final C16949e DEFAULT_INSTANCE;
    private static volatile InterfaceC8432e PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private C3882e preferences_ = C3882e.f8708e;

    static {
        C16949e c16949e = new C16949e();
        DEFAULT_INSTANCE = c16949e;
        AbstractC18270e.adcel(C16949e.class, c16949e);
    }

    public static C16949e Signature(InputStream inputStream) {
        AbstractC3513e c17442e;
        C16949e c16949e = DEFAULT_INSTANCE;
        if (inputStream == null) {
            byte[] bArr = AbstractC2930e.vip;
            int length = bArr.length;
            c17442e = new C10561e(bArr, 0, length, false);
            try {
                c17442e.appmetrica(length);
            } catch (C11690e e) {
                throw new IllegalArgumentException(e);
            }
        } else {
            c17442e = new C17442e(inputStream);
        }
        C3758e ad = C3758e.ad();
        AbstractC18270e startapp = c16949e.startapp();
        try {
            C13571e c13571e = C13571e.metrica;
            c13571e.getClass();
            InterfaceC11969e ad2 = c13571e.ad(startapp.getClass());
            C11226e c11226e = (C11226e) c17442e.metrica;
            if (c11226e == null) {
                c11226e = new C11226e(c17442e);
            }
            ad2.startapp(startapp, c11226e, ad);
            ad2.vip(startapp);
            if (AbstractC18270e.appmetrica(startapp, true)) {
                return (C16949e) startapp;
            }
            throw new IOException(new C4142e().getMessage());
        } catch (C4142e e2) {
            throw new IOException(e2.getMessage());
        } catch (C11690e e3) {
            if (e3.f23521e) {
                throw new IOException(e3.getMessage(), e3);
            }
            throw e3;
        } catch (IOException e4) {
            if (e4.getCause() instanceof C11690e) {
                throw ((C11690e) e4.getCause());
            }
            throw new IOException(e4.getMessage(), e4);
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof C11690e) {
                throw ((C11690e) e5.getCause());
            }
            throw e5;
        }
    }

    public static C14016e loadAd() {
        return (C14016e) ((AbstractC12661e) DEFAULT_INSTANCE.vip(5));
    }

    public static C3882e smaato(C16949e c16949e) {
        C3882e c3882e = c16949e.preferences_;
        if (!c3882e.f8709e) {
            c16949e.preferences_ = c3882e.vip();
        }
        return c16949e.preferences_;
    }

    public final Map amazon() {
        return DesugarCollections.unmodifiableMap(this.preferences_);
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object, eٌؑۦ] */
    @Override // defpackage.AbstractC18270e
    public final Object vip(int i) {
        InterfaceC8432e interfaceC8432e;
        int m2467class = AbstractC8703e.m2467class(i);
        if (m2467class == 0) {
            return (byte) 1;
        }
        if (m2467class == 2) {
            return new C8678e(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", AbstractC1084e.ad});
        }
        if (m2467class == 3) {
            return new C16949e();
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
        synchronized (C16949e.class) {
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
