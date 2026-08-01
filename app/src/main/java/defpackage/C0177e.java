package defpackage;

import androidx.car.app.model.Alert;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؑؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0177e extends AbstractC11101e implements InterfaceC4586e {
    public boolean adcel;
    public int advert;
    public int amazon;
    public final Socket appmetrica;
    public final EnumC12473e billing;
    public final Socket license;
    public final C2257e metrica;
    public boolean mopub;
    public final C2895e purchase;
    public int smaato;
    public C10142e startapp;
    public final C14899e vip;
    public final C12894e yandex;
    public int loadAd = 1;
    public final ArrayList Signature = new ArrayList();
    public long admob = Long.MAX_VALUE;

    public C0177e(C14899e c14899e, C2257e c2257e, Socket socket, Socket socket2, C2895e c2895e, EnumC12473e enumC12473e, C12894e c12894e) {
        this.vip = c14899e;
        this.metrica = c2257e;
        this.license = socket;
        this.appmetrica = socket2;
        this.purchase = c2895e;
        this.billing = enumC12473e;
        this.yandex = c12894e;
    }

    public static void purchase(C1343e c1343e, C2257e c2257e, IOException iOException) {
        if (c2257e.vip.type() != Proxy.Type.DIRECT) {
            C12428e c12428e = c2257e.ad;
            c12428e.billing.connectFailed(c12428e.yandex.yandex(), c2257e.vip.address(), iOException);
        }
        C16089e c16089e = c1343e.premium;
        synchronized (c16089e) {
            ((LinkedHashSet) c16089e.f31681e).add(c2257e);
        }
    }

    @Override // defpackage.InterfaceC4586e
    public final void ad() {
        synchronized (this) {
            this.adcel = true;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void adcel() {
        this.admob = System.nanoTime();
        EnumC12473e enumC12473e = this.billing;
        if (enumC12473e == EnumC12473e.HTTP_2 || enumC12473e == EnumC12473e.H2_PRIOR_KNOWLEDGE) {
            this.appmetrica.setSoTimeout(0);
            C17354e c17354e = C17354e.f34039e;
            C14255e c14255e = C14255e.ad;
            C18464e c18464e = new C18464e(this.vip);
            C12894e c12894e = this.yandex;
            String str = this.metrica.ad.yandex.license;
            c18464e.f36190e = c12894e;
            c18464e.f36192e = AbstractC16286e.vip + ' ' + str;
            c18464e.f36189e = this;
            c18464e.f36194e = c14255e;
            C10142e c10142e = new C10142e(c18464e);
            this.startapp = c10142e;
            C7207e c7207e = C10142e.f20055e;
            this.loadAd = (c7207e.ad & 8) != 0 ? c7207e.vip[3] : Alert.DURATION_SHOW_INDEFINITELY;
            C13341e c13341e = c10142e.f20074e;
            synchronized (c13341e) {
                try {
                    if (c13341e.f26591e) {
                        throw new IOException("closed");
                    }
                    Logger logger = C13341e.f26587e;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(AbstractC16286e.license(">> CONNECTION " + AbstractC17432e.ad.appmetrica(), new Object[0]));
                    }
                    c13341e.f26592e.applovin(AbstractC17432e.ad);
                    c13341e.f26592e.flush();
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            c10142e.f20074e.inmobi(c10142e.f20065e);
            if (c10142e.f20065e.ad() != 65535) {
                c10142e.f20074e.ads(0, r2 - 65535);
            }
            C10497e.metrica(c10142e.f20078e.license(), c10142e.f20059e, 0L, c10142e.f20076e, 6);
        }
    }

    @Override // defpackage.AbstractC11101e
    public final void appmetrica(C10420e c10420e) {
        c10420e.metrica(8, null);
    }

    public final void billing() {
        synchronized (this) {
            this.smaato++;
        }
    }

    @Override // defpackage.InterfaceC4586e
    public final void cancel() {
        AbstractC16286e.metrica(this.license);
    }

    @Override // defpackage.AbstractC11101e
    public final void license(C7207e c7207e) {
        synchronized (this) {
            this.loadAd = (c7207e.ad & 8) != 0 ? c7207e.vip[3] : Alert.DURATION_SHOW_INDEFINITELY;
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // defpackage.InterfaceC4586e
    public final C2257e metrica() {
        return this.metrica;
    }

    public final boolean startapp(boolean z) {
        long j;
        TimeZone timeZone = AbstractC16286e.ad;
        long nanoTime = System.nanoTime();
        if (this.license.isClosed() || this.appmetrica.isClosed() || this.appmetrica.isInputShutdown() || this.appmetrica.isOutputShutdown()) {
            return false;
        }
        C10142e c10142e = this.startapp;
        if (c10142e != null) {
            return c10142e.purchase(nanoTime);
        }
        synchronized (this) {
            j = nanoTime - this.admob;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.appmetrica;
        C13197e c13197e = (C13197e) this.yandex.f25750e;
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !c13197e.yandex();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        C2257e c2257e = this.metrica;
        sb.append(c2257e.ad.yandex.license);
        sb.append(':');
        sb.append(c2257e.ad.yandex.appmetrica);
        sb.append(", proxy=");
        sb.append(c2257e.vip);
        sb.append(" hostAddress=");
        sb.append(c2257e.metrica);
        sb.append(" cipherSuite=");
        C2895e c2895e = this.purchase;
        if (c2895e == null || (obj = c2895e.vip) == null) {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.billing);
        sb.append('}');
        return sb.toString();
    }

    @Override // defpackage.InterfaceC4586e
    public final void vip(C4602e c4602e, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof C7651e)) {
                    if (!(this.startapp != null) || (iOException instanceof C10952e)) {
                        this.adcel = true;
                        if (this.smaato == 0) {
                            if (iOException != null) {
                                purchase(c4602e.f9929e, this.metrica, iOException);
                            }
                            this.advert++;
                        }
                    }
                } else if (((C7651e) iOException).f15545e == 8) {
                    int i = this.amazon + 1;
                    this.amazon = i;
                    if (i > 1) {
                        this.adcel = true;
                        this.advert++;
                    }
                } else if (((C7651e) iOException).f15545e != 9 || !c4602e.f9921e) {
                    this.adcel = true;
                    this.advert++;
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a6, code lost:
    
        if (defpackage.C6249e.vip(r0, (java.security.cert.X509Certificate) r9.get(0)) != false) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean yandex(defpackage.C12428e r8, java.util.List r9) {
        /*
            r7 = this;
            eٕۛؕ r0 = r8.yandex
            java.util.TimeZone r1 = defpackage.AbstractC16286e.ad
            java.util.ArrayList r1 = r7.Signature
            int r1 = r1.size()
            int r2 = r7.loadAd
            r3 = 0
            if (r1 >= r2) goto Lc6
            boolean r1 = r7.adcel
            if (r1 == 0) goto L15
            goto Lc6
        L15:
            eؓۧۥ r1 = r7.metrica
            eِّۘ r2 = r1.ad
            eِّۘ r4 = r1.ad
            boolean r2 = r2.ad(r8)
            if (r2 != 0) goto L23
            goto Lc6
        L23:
            java.lang.String r2 = r0.license
            eٕۛؕ r5 = r4.yandex
            java.lang.String r5 = r5.license
            boolean r2 = defpackage.AbstractC7890e.billing(r2, r5)
            if (r2 == 0) goto L31
            goto Lbb
        L31:
            eًَْ r2 = r7.startapp
            if (r2 != 0) goto L37
            goto Lc6
        L37:
            if (r9 == 0) goto Lc6
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto L41
            goto Lc6
        L41:
            java.util.Iterator r9 = r9.iterator()
        L45:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto Lc6
            java.lang.Object r2 = r9.next()
            eؓۧۥ r2 = (defpackage.C2257e) r2
            java.net.Proxy r5 = r2.vip
            java.net.Proxy$Type r5 = r5.type()
            java.net.Proxy$Type r6 = java.net.Proxy.Type.DIRECT
            if (r5 != r6) goto L45
            java.net.Proxy r5 = r1.vip
            java.net.Proxy$Type r5 = r5.type()
            if (r5 != r6) goto L45
            java.net.InetSocketAddress r5 = r1.metrica
            java.net.InetSocketAddress r2 = r2.metrica
            boolean r2 = defpackage.AbstractC7890e.billing(r5, r2)
            if (r2 == 0) goto L45
            javax.net.ssl.HostnameVerifier r9 = r8.license
            eًؙؚ r1 = defpackage.C6249e.ad
            if (r9 == r1) goto L74
            goto Lc6
        L74:
            java.util.TimeZone r9 = defpackage.AbstractC16286e.ad
            eٕۛؕ r9 = r4.yandex
            int r1 = r0.appmetrica
            java.lang.String r0 = r0.license
            int r2 = r9.appmetrica
            if (r1 == r2) goto L81
            goto Lc6
        L81:
            java.lang.String r9 = r9.license
            boolean r9 = defpackage.AbstractC7890e.billing(r0, r9)
            eؔ۟ٝ r1 = r7.purchase
            if (r9 == 0) goto L8c
            goto La8
        L8c:
            boolean r9 = r7.mopub
            if (r9 != 0) goto Lc6
            if (r1 == 0) goto Lc6
            java.util.List r9 = r1.ad()
            boolean r2 = r9.isEmpty()
            if (r2 != 0) goto Lc6
            java.lang.Object r9 = r9.get(r3)
            java.security.cert.X509Certificate r9 = (java.security.cert.X509Certificate) r9
            boolean r9 = defpackage.C6249e.vip(r0, r9)
            if (r9 == 0) goto Lc6
        La8:
            eّۨۜ r8 = r8.appmetrica     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc6
            r1.ad()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc6
            java.util.Set r8 = r8.ad     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc6
            java.lang.Iterable r8 = (java.lang.Iterable) r8     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc6
            java.util.Iterator r8 = r8.iterator()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc6
            boolean r9 = r8.hasNext()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc6
            if (r9 != 0) goto Lbd
        Lbb:
            r8 = 1
            return r8
        Lbd:
            java.lang.Object r8 = r8.next()     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc6
            defpackage.AbstractC1786e.applovin(r8)     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc6
            r8 = 0
            throw r8     // Catch: javax.net.ssl.SSLPeerUnverifiedException -> Lc6
        Lc6:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0177e.yandex(eِّۘ, java.util.List):boolean");
    }
}
