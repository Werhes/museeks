package defpackage;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۧٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16663e implements InterfaceC1753e, InterfaceC4586e {
    public volatile boolean Signature;
    public final C14899e ad;
    public final C2257e adcel;
    public Socket admob;
    public final int advert;
    public final int amazon;
    public final int appmetrica;
    public final boolean billing;
    public final int license;
    public final boolean loadAd;
    public final int metrica;
    public final List mopub;
    public EnumC12473e pro;
    public final int purchase;
    public C2895e remoteconfig;
    public C12894e signatures;
    public final C8650e smaato;
    public final C0309e startapp;
    public Socket subscription;
    public C0177e tapsense;
    public final C16389e vip;
    public final C4602e yandex;

    public C16663e(C14899e c14899e, C16389e c16389e, int i, int i2, int i3, int i4, boolean z, C4602e c4602e, C0309e c0309e, C2257e c2257e, List list, int i5, C8650e c8650e, int i6, boolean z2) {
        this.ad = c14899e;
        this.vip = c16389e;
        this.metrica = i;
        this.license = i2;
        this.appmetrica = i3;
        this.purchase = i4;
        this.billing = z;
        this.yandex = c4602e;
        this.startapp = c0309e;
        this.adcel = c2257e;
        this.mopub = list;
        this.advert = i5;
        this.smaato = c8650e;
        this.amazon = i6;
        this.loadAd = z2;
    }

    public static C16663e advert(C16663e c16663e, int i, C8650e c8650e, int i2, boolean z, int i3) {
        return new C16663e(c16663e.ad, c16663e.vip, c16663e.metrica, c16663e.license, c16663e.appmetrica, c16663e.purchase, c16663e.billing, c16663e.yandex, c16663e.startapp, c16663e.adcel, c16663e.mopub, (i3 & 1) != 0 ? c16663e.advert : i, (i3 & 2) != 0 ? c16663e.smaato : c8650e, (i3 & 4) != 0 ? c16663e.amazon : i2, (i3 & 8) != 0 ? c16663e.loadAd : z);
    }

    @Override // defpackage.InterfaceC4586e
    public final void ad() {
    }

    public final void adcel(SSLSocket sSLSocket, C9919e c9919e) {
        C12428e c12428e = this.adcel.ad;
        try {
            if (c9919e.vip) {
                AbstractC18303e abstractC18303e = AbstractC18303e.ad;
                AbstractC18303e.ad.appmetrica(sSLSocket, c12428e.yandex.license, c12428e.startapp);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            C2895e metrica = AbstractC16619e.metrica(session);
            if (c12428e.license.verify(c12428e.yandex.license, session)) {
                C12932e c12932e = c12428e.appmetrica;
                this.remoteconfig = new C2895e(metrica.ad, metrica.vip, metrica.metrica, new Csynchronized(4, c12932e, metrica, c12428e));
                String str = c12428e.yandex.license;
                Iterator it = c12932e.ad.iterator();
                String str2 = null;
                if (it.hasNext()) {
                    AbstractC1786e.applovin(it.next());
                    throw null;
                }
                if (c9919e.vip) {
                    AbstractC18303e abstractC18303e2 = AbstractC18303e.ad;
                    str2 = AbstractC18303e.ad.billing(sSLSocket);
                }
                this.subscription = sSLSocket;
                this.signatures = new C12894e(new C11980e(sSLSocket));
                this.pro = str2 != null ? AbstractC16268e.appmetrica(str2) : EnumC12473e.HTTP_1_1;
                AbstractC18303e abstractC18303e3 = AbstractC18303e.ad;
                AbstractC18303e.ad.getClass();
                return;
            }
            List ad = metrica.ad();
            if (ad.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + c12428e.yandex.license + " not verified (no certificates)");
            }
            X509Certificate x509Certificate = (X509Certificate) ad.get(0);
            StringBuilder sb = new StringBuilder("\n            |Hostname ");
            sb.append(c12428e.yandex.license);
            sb.append(" not verified:\n            |    certificate: ");
            C12932e c12932e2 = C12932e.metrica;
            sb.append(AbstractC15365e.vip(x509Certificate));
            sb.append("\n            |    DN: ");
            sb.append(x509Certificate.getSubjectDN().getName());
            sb.append("\n            |    subjectAltNames: ");
            sb.append(AbstractC13480e.m3584final(C6249e.ad(x509Certificate, 7), C6249e.ad(x509Certificate, 2)));
            sb.append("\n            ");
            throw new SSLPeerUnverifiedException(AbstractC17540e.appmetrica(sb.toString()));
        } catch (Throwable th) {
            AbstractC18303e abstractC18303e4 = AbstractC18303e.ad;
            AbstractC18303e.ad.getClass();
            AbstractC16286e.metrica(sSLSocket);
            throw th;
        }
    }

    public final C16663e amazon(SSLSocket sSLSocket, List list) {
        if (this.amazon != -1) {
            return this;
        }
        C16663e smaato = smaato(sSLSocket, list);
        if (smaato != null) {
            return smaato;
        }
        throw new UnknownServiceException("Unable to find acceptable protocols. isFallback=" + this.loadAd + ", modes=" + list + ", supported protocols=" + Arrays.toString(sSLSocket.getEnabledProtocols()));
    }

    @Override // defpackage.InterfaceC1753e
    public final InterfaceC1753e appmetrica() {
        return new C16663e(this.ad, this.vip, this.metrica, this.license, this.appmetrica, this.purchase, this.billing, this.yandex, this.startapp, this.adcel, this.mopub, this.advert, this.smaato, this.amazon, this.loadAd);
    }

    @Override // defpackage.InterfaceC1753e
    public final C10972e billing() {
        Socket socket;
        Socket socket2;
        C16389e c16389e = this.vip;
        C2257e c2257e = this.adcel;
        CopyOnWriteArrayList copyOnWriteArrayList = this.yandex.f9926e;
        if (this.admob != null) {
            throw new IllegalStateException("TCP already connected");
        }
        copyOnWriteArrayList.add(this);
        boolean z = false;
        try {
            try {
                InetSocketAddress inetSocketAddress = c2257e.metrica;
                c16389e.getClass();
                startapp();
                z = true;
                C10972e c10972e = new C10972e(this, null, null, 6);
                copyOnWriteArrayList.remove(this);
                return c10972e;
            } catch (IOException e) {
                C12428e c12428e = c2257e.ad;
                if (c2257e.vip.type() != Proxy.Type.DIRECT) {
                    C12428e c12428e2 = c2257e.ad;
                    c12428e2.billing.connectFailed(c12428e2.yandex.yandex(), c2257e.vip.address(), e);
                }
                c16389e.getClass();
                C10972e c10972e2 = new C10972e(this, null, e, 2);
                copyOnWriteArrayList.remove(this);
                if (!z && (socket = this.admob) != null) {
                    AbstractC16286e.metrica(socket);
                }
                return c10972e2;
            }
        } catch (Throwable th) {
            copyOnWriteArrayList.remove(this);
            if (!z && (socket2 = this.admob) != null) {
                AbstractC16286e.metrica(socket2);
            }
            throw th;
        }
    }

    @Override // defpackage.InterfaceC1753e
    public final void cancel() {
        this.Signature = true;
        Socket socket = this.admob;
        if (socket != null) {
            AbstractC16286e.metrica(socket);
        }
    }

    @Override // defpackage.InterfaceC1753e
    public final boolean license() {
        return this.pro != null;
    }

    @Override // defpackage.InterfaceC4586e
    public final C2257e metrica() {
        return this.adcel;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c7, code lost:
    
        if (r9 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cf, code lost:
    
        return new defpackage.C10972e(r13, null, null, 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d0, code lost:
    
        r0 = r13.admob;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d2, code lost:
    
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d4, code lost:
    
        defpackage.AbstractC16286e.metrica(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d7, code lost:
    
        r8 = r13.advert + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00dd, code lost:
    
        if (r8 >= 21) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ee, code lost:
    
        return new defpackage.C10972e(r13, advert(r13, r8, r9, 0, false, 12), null, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ef, code lost:
    
        r0 = new java.net.ProtocolException("Too many tunnel connections attempted: 21");
        r13.vip.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0102, code lost:
    
        return new defpackage.C10972e(r13, null, r0, 2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C10972e mopub() {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16663e.mopub():eُْ٘");
    }

    @Override // defpackage.InterfaceC1753e
    public final C0177e purchase() {
        this.yandex.f9929e.premium.billing(this.adcel);
        C0177e c0177e = this.tapsense;
        c0177e.getClass();
        C7367e appmetrica = this.startapp.appmetrica(this, this.mopub);
        if (appmetrica != null) {
            return appmetrica.ad;
        }
        synchronized (c0177e) {
            C16389e c16389e = this.vip;
            c16389e.getClass();
            TimeZone timeZone = AbstractC16286e.ad;
            ((ConcurrentLinkedQueue) c16389e.f32195e).add(c0177e);
            ((C10497e) c16389e.f32194e).license((C14799e) c16389e.f32193e, 0L);
            this.yandex.vip(c0177e);
            Unit unit = Unit.INSTANCE;
        }
        return c0177e;
    }

    public final C16663e smaato(SSLSocket sSLSocket, List list) {
        String[] strArr;
        String[] strArr2;
        int i = this.amazon;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            C9919e c9919e = (C9919e) list.get(i2);
            if (c9919e.ad && (((strArr = c9919e.license) == null || AbstractC10220e.purchase(strArr, sSLSocket.getEnabledProtocols(), C4992e.f10568e)) && ((strArr2 = c9919e.metrica) == null || AbstractC10220e.purchase(strArr2, sSLSocket.getEnabledCipherSuites(), C6893e.metrica)))) {
                return advert(this, 0, null, i2, i != -1, 3);
            }
        }
        return null;
    }

    public final void startapp() {
        Proxy.Type type = this.adcel.vip.type();
        int i = type == null ? -1 : AbstractC1945e.ad[type.ordinal()];
        Socket createSocket = (i == 1 || i == 2) ? this.adcel.ad.vip.createSocket() : new Socket(this.adcel.vip);
        this.admob = createSocket;
        if (this.Signature) {
            throw new IOException("canceled");
        }
        createSocket.setSoTimeout(this.purchase);
        try {
            AbstractC18303e abstractC18303e = AbstractC18303e.ad;
            AbstractC18303e.ad.purchase(createSocket, this.adcel.metrica, this.appmetrica);
            try {
                this.signatures = new C12894e(new C11980e(createSocket));
            } catch (NullPointerException e) {
                if (AbstractC7890e.billing(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.adcel.metrica);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    @Override // defpackage.InterfaceC4586e
    public final void vip(C4602e c4602e, IOException iOException) {
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0111  */
    @Override // defpackage.InterfaceC1753e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C10972e yandex() {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C16663e.yandex():eُْ٘");
    }
}
