package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٓۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14005e implements InterfaceC8246e {
    public static final C15793e purchase;
    public final C1343e ad;
    public final C3318e appmetrica;
    public int license;
    public final C12894e metrica;
    public final InterfaceC4586e vip;

    static {
        String[] strArr = (String[]) Arrays.copyOf(new String[]{"OkHttp-Response-Body", "Truncated"}, 2);
        if (strArr.length % 2 != 0) {
            throw new IllegalArgumentException("Expected alternating header names and values");
        }
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        int length = strArr2.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (strArr2[i2] == null) {
                throw new IllegalArgumentException("Headers cannot be null");
            }
            strArr2[i2] = AbstractC5304e.m1855const(strArr[i2]).toString();
        }
        int license = AbstractC4340e.license(0, strArr2.length - 1, 2);
        if (license >= 0) {
            while (true) {
                String str = strArr2[i];
                String str2 = strArr2[i + 1];
                AbstractC3149e.appmetrica(str);
                AbstractC3149e.purchase(str2, str);
                if (i == license) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        purchase = new C15793e(strArr2);
    }

    public C14005e(C1343e c1343e, InterfaceC4586e interfaceC4586e, C12894e c12894e) {
        this.ad = c1343e;
        this.vip = interfaceC4586e;
        this.metrica = c12894e;
        this.appmetrica = new C3318e((C13197e) c12894e.f25750e);
    }

    @Override // defpackage.InterfaceC8246e
    public final InterfaceC2537e ad(C11058e c11058e) {
        C8650e c8650e = c11058e.f21944e;
        if (!AbstractC1277e.ad(c11058e)) {
            return mopub(c8650e.ad, 0L);
        }
        String appmetrica = c11058e.f21946e.appmetrica("Transfer-Encoding");
        if (appmetrica == null) {
            appmetrica = null;
        }
        if ("chunked".equalsIgnoreCase(appmetrica)) {
            C15718e c15718e = c8650e.ad;
            if (this.license == 4) {
                this.license = 5;
                return new C4774e(this, c15718e);
            }
            throw new IllegalStateException(("state: " + this.license).toString());
        }
        long appmetrica2 = AbstractC16286e.appmetrica(c11058e);
        if (appmetrica2 != -1) {
            return mopub(c8650e.ad, appmetrica2);
        }
        C15718e c15718e2 = c8650e.ad;
        if (this.license == 4) {
            this.license = 5;
            this.vip.ad();
            return new AbstractC13367e(this, c15718e2);
        }
        throw new IllegalStateException(("state: " + this.license).toString());
    }

    @Override // defpackage.InterfaceC8246e
    public final void adcel(C8650e c8650e) {
        Proxy.Type type = this.vip.metrica().vip.type();
        StringBuilder sb = new StringBuilder();
        sb.append(c8650e.vip);
        sb.append(' ');
        C15718e c15718e = c8650e.ad;
        if (AbstractC7890e.billing(c15718e.ad, "https") || type != Proxy.Type.HTTP) {
            String vip = c15718e.vip();
            String license = c15718e.license();
            if (license != null) {
                vip = AbstractC0869e.tapsense('?', vip, license);
            }
            sb.append(vip);
        } else {
            sb.append(c15718e);
        }
        sb.append(" HTTP/1.1");
        advert(c8650e.metrica, sb.toString());
    }

    public final void advert(C15793e c15793e, String str) {
        if (this.license != 0) {
            throw new IllegalStateException(("state: " + this.license).toString());
        }
        C12894e c12894e = this.metrica;
        C9674e c9674e = (C9674e) c12894e.f25752e;
        c9674e.mo2631private(str);
        c9674e.mo2631private("\r\n");
        int size = c15793e.size();
        for (int i = 0; i < size; i++) {
            C9674e c9674e2 = (C9674e) c12894e.f25752e;
            c9674e2.mo2631private(c15793e.billing(i));
            c9674e2.mo2631private(": ");
            c9674e2.mo2631private(c15793e.adcel(i));
            c9674e2.mo2631private("\r\n");
        }
        ((C9674e) c12894e.f25752e).mo2631private("\r\n");
        this.license = 1;
    }

    @Override // defpackage.InterfaceC8246e
    public final C7677e appmetrica(boolean z) {
        C3318e c3318e = this.appmetrica;
        int i = this.license;
        if (i != 0 && i != 1 && i != 2 && i != 3) {
            throw new IllegalStateException(("state: " + this.license).toString());
        }
        try {
            String mo1678case = ((InterfaceC4895e) c3318e.f7485e).mo1678case(c3318e.f7486e);
            c3318e.f7486e -= mo1678case.length();
            Csuper Signature = AbstractC7518e.Signature(mo1678case);
            int i2 = Signature.f36470e;
            C7677e c7677e = new C7677e();
            c7677e.vip = (EnumC12473e) Signature.f36469e;
            c7677e.metrica = i2;
            c7677e.license = (String) Signature.f36471e;
            c7677e.purchase = c3318e.isPro().yandex();
            if (z && i2 == 100) {
                return null;
            }
            if (i2 == 100) {
                this.license = 3;
                return c7677e;
            }
            if (102 > i2 || i2 >= 200) {
                this.license = 4;
                return c7677e;
            }
            this.license = 3;
            return c7677e;
        } catch (EOFException e) {
            throw new IOException(AbstractC17861e.Signature("unexpected end of stream on ", this.vip.metrica().ad.yandex.billing()), e);
        }
    }

    @Override // defpackage.InterfaceC8246e
    public final InterfaceC17357e billing() {
        return this.metrica;
    }

    @Override // defpackage.InterfaceC8246e
    public final void cancel() {
        this.vip.cancel();
    }

    @Override // defpackage.InterfaceC8246e
    public final long license(C11058e c11058e) {
        if (!AbstractC1277e.ad(c11058e)) {
            return 0L;
        }
        String appmetrica = c11058e.f21946e.appmetrica("Transfer-Encoding");
        if (appmetrica == null) {
            appmetrica = null;
        }
        if ("chunked".equalsIgnoreCase(appmetrica)) {
            return -1L;
        }
        return AbstractC16286e.appmetrica(c11058e);
    }

    @Override // defpackage.InterfaceC8246e
    public final boolean metrica() {
        return this.license == 6;
    }

    public final C14817e mopub(C15718e c15718e, long j) {
        if (this.license == 4) {
            this.license = 5;
            return new C14817e(this, c15718e, j);
        }
        throw new IllegalStateException(("state: " + this.license).toString());
    }

    @Override // defpackage.InterfaceC8246e
    public final void purchase() {
        ((C9674e) this.metrica.f25752e).flush();
    }

    @Override // defpackage.InterfaceC8246e
    public final InterfaceC4586e startapp() {
        return this.vip;
    }

    @Override // defpackage.InterfaceC8246e
    public final void vip() {
        ((C9674e) this.metrica.f25752e).flush();
    }

    @Override // defpackage.InterfaceC8246e
    public final InterfaceC0274e yandex(C8650e c8650e, long j) {
        AbstractC1101e abstractC1101e = c8650e.license;
        if (abstractC1101e != null && abstractC1101e.billing()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if ("chunked".equalsIgnoreCase(c8650e.metrica.appmetrica("Transfer-Encoding"))) {
            if (this.license == 1) {
                this.license = 2;
                return new C9966e(this);
            }
            throw new IllegalStateException(("state: " + this.license).toString());
        }
        if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        if (this.license == 1) {
            this.license = 2;
            return new C16751e(this);
        }
        throw new IllegalStateException(("state: " + this.license).toString());
    }
}
