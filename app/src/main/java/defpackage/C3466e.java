package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؕٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3466e implements InterfaceC11283e {
    public final AbstractC15319e ad;

    static {
        C17268e c17268e = C17268e.ad;
        int i = AbstractC3433e.ad;
    }

    public C3466e(AbstractC15319e abstractC15319e) {
        this.ad = abstractC15319e;
    }

    public final AbstractC15319e ad(InputStream inputStream, C17268e c17268e) {
        AbstractC3513e m1366interface = AbstractC3513e.m1366interface(inputStream, 4096);
        int i = AbstractC15319e.zzd;
        AbstractC15319e startapp = this.ad.startapp();
        try {
            InterfaceC16984e ad = C5913e.metrica.ad(startapp.getClass());
            C11226e c11226e = (C11226e) m1366interface.metrica;
            if (c11226e == null) {
                c11226e = new C11226e(m1366interface, (byte) 0);
            }
            ad.adcel(startapp, c11226e, c17268e);
            ad.metrica(startapp);
            m1366interface.mo648throw(0);
            if (AbstractC15319e.subscription(startapp, true)) {
                return startapp;
            }
            throw new C16873e().ad();
        } catch (C10895e e) {
            if (e.f21565e) {
                throw new IOException(e.getMessage(), e);
            }
            throw e;
        } catch (C16873e e2) {
            throw e2.ad();
        } catch (IOException e3) {
            if (e3.getCause() instanceof C10895e) {
                throw ((C10895e) e3.getCause());
            }
            throw new IOException(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof C10895e) {
                throw ((C10895e) e4.getCause());
            }
            throw e4;
        }
    }
}
