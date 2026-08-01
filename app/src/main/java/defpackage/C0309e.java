package defpackage;

import java.io.IOException;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑٔۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0309e {
    public final C12718e Signature = new C12718e();
    public final C14899e ad;
    public final C16089e adcel;
    public final boolean advert;
    public C4052e amazon;
    public final int appmetrica;
    public final boolean billing;
    public final int license;
    public C2257e loadAd;
    public final int metrica;
    public final C4602e mopub;
    public final int purchase;
    public C7417e smaato;
    public final C12428e startapp;
    public final C16389e vip;
    public final boolean yandex;

    public C0309e(C14899e c14899e, C16389e c16389e, int i, int i2, int i3, int i4, boolean z, boolean z2, C12428e c12428e, C16089e c16089e, C4602e c4602e, C8650e c8650e) {
        this.ad = c14899e;
        this.vip = c16389e;
        this.metrica = i;
        this.license = i2;
        this.appmetrica = i3;
        this.purchase = i4;
        this.billing = z;
        this.yandex = z2;
        this.startapp = c12428e;
        this.adcel = c16089e;
        this.mopub = c4602e;
        this.advert = !AbstractC7890e.billing(c8650e.vip, "GET");
    }

    public final boolean ad(C0177e c0177e) {
        C4052e c4052e;
        C2257e c2257e;
        if (this.Signature.isEmpty() && this.loadAd == null) {
            if (c0177e != null) {
                synchronized (c0177e) {
                    c2257e = null;
                    if (c0177e.advert == 0 && c0177e.adcel && AbstractC16286e.ad(c0177e.metrica.ad.yandex, this.startapp.yandex)) {
                        c2257e = c0177e.metrica;
                    }
                }
                if (c2257e != null) {
                    this.loadAd = c2257e;
                    return true;
                }
            }
            C7417e c7417e = this.smaato;
            if ((c7417e == null || c7417e.ad >= c7417e.vip.size()) && (c4052e = this.amazon) != null) {
                return c4052e.startapp();
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0034, code lost:
    
        if ((r7.startapp != null) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C7367e appmetrica(defpackage.C16663e r11, java.util.List r12) {
        /*
            r10 = this;
            eٖٜٞ r0 = r10.vip
            boolean r1 = r10.advert
            eِّۘ r2 = r10.startapp
            eِؗؓ r3 = r10.mopub
            r4 = 0
            r5 = 1
            if (r11 == 0) goto L14
            boolean r6 = r11.license()
            if (r6 == 0) goto L14
            r6 = r5
            goto L15
        L14:
            r6 = r4
        L15:
            java.lang.Object r0 = r0.f32195e
            java.util.concurrent.ConcurrentLinkedQueue r0 = (java.util.concurrent.ConcurrentLinkedQueue) r0
            java.util.Iterator r0 = r0.iterator()
        L1d:
            boolean r7 = r0.hasNext()
            r8 = 0
            if (r7 == 0) goto L62
            java.lang.Object r7 = r0.next()
            eًؑؕ r7 = (defpackage.C0177e) r7
            monitor-enter(r7)
            if (r6 == 0) goto L3a
            eًَْ r9 = r7.startapp     // Catch: java.lang.Throwable -> L38
            if (r9 == 0) goto L33
            r9 = r5
            goto L34
        L33:
            r9 = r4
        L34:
            if (r9 != 0) goto L3a
        L36:
            r9 = r4
            goto L45
        L38:
            r11 = move-exception
            goto L60
        L3a:
            boolean r9 = r7.yandex(r2, r12)     // Catch: java.lang.Throwable -> L38
            if (r9 != 0) goto L41
            goto L36
        L41:
            r3.vip(r7)     // Catch: java.lang.Throwable -> L38
            r9 = r5
        L45:
            monitor-exit(r7)
            if (r9 == 0) goto L1d
            boolean r9 = r7.startapp(r1)
            if (r9 == 0) goto L4f
            goto L63
        L4f:
            monitor-enter(r7)
            r7.adcel = r5     // Catch: java.lang.Throwable -> L5d
            java.net.Socket r8 = r3.mopub()     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r7)
            if (r8 == 0) goto L1d
            defpackage.AbstractC16286e.metrica(r8)
            goto L1d
        L5d:
            r11 = move-exception
            monitor-exit(r7)
            throw r11
        L60:
            monitor-exit(r7)
            throw r11
        L62:
            r7 = r8
        L63:
            if (r7 != 0) goto L66
            return r8
        L66:
            if (r11 == 0) goto L73
            eؓۧۥ r12 = r11.adcel
            r10.loadAd = r12
            java.net.Socket r11 = r11.subscription
            if (r11 == 0) goto L73
            defpackage.AbstractC16286e.metrica(r11)
        L73:
            eؚۖۡ r11 = new eؚۖۡ
            r11.<init>(r7)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0309e.appmetrica(eٖۧٚ, java.util.List):eؚۖۡ");
    }

    public final C16663e license(C2257e c2257e, ArrayList arrayList) {
        EnumC12473e enumC12473e = EnumC12473e.H2_PRIOR_KNOWLEDGE;
        C12428e c12428e = c2257e.ad;
        if (c12428e.metrica == null) {
            if (!c12428e.adcel.contains(C9919e.purchase)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = c2257e.ad.yandex.license;
            AbstractC18303e abstractC18303e = AbstractC18303e.ad;
            if (!AbstractC18303e.ad.startapp(str)) {
                throw new UnknownServiceException(AbstractC5087e.m1746extends("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (c12428e.startapp.contains(enumC12473e)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        C8650e c8650e = null;
        if (c2257e.vip.type() == Proxy.Type.HTTP) {
            C12428e c12428e2 = c2257e.ad;
            if (c12428e2.metrica != null || c12428e2.startapp.contains(enumC12473e)) {
                C18464e c18464e = new C18464e(23);
                c18464e.f36191e = c2257e.ad.yandex;
                c18464e.m4494e("CONNECT", null);
                C12428e c12428e3 = c2257e.ad;
                ((C15783e) c18464e.f36192e).adcel("Host", AbstractC16286e.startapp(c12428e3.yandex, true));
                ((C15783e) c18464e.f36192e).adcel("Proxy-Connection", "Keep-Alive");
                ((C15783e) c18464e.f36192e).adcel("User-Agent", "okhttp/5.3.2");
                C8650e c8650e2 = new C8650e(c18464e);
                C2599e c2599e = AbstractC12834e.f25655e;
                C10914e c10914e = InterfaceC5019e.f10701e;
                C15783e c15783e = new C15783e(0);
                EnumC12473e enumC12473e2 = EnumC12473e.HTTP_1_1;
                c15783e.adcel("Proxy-Authenticate", "OkHttp-Preemptive");
                C8650e purchase = c12428e3.purchase.purchase(c2257e, new C11058e(c8650e2, enumC12473e2, "Preemptive Authenticate", 407, null, c15783e.billing(), c2599e, null, null, null, null, -1L, -1L, null, c10914e));
                c8650e = purchase == null ? c8650e2 : purchase;
            }
        }
        return new C16663e(this.ad, this.vip, this.metrica, this.license, this.appmetrica, this.purchase, this.billing, this.mopub, this, c2257e, arrayList, 0, c8650e, -1, false);
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, eِؖۙ] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.util.List, java.lang.Object] */
    public final C16663e metrica() {
        String str;
        int i;
        List list;
        boolean contains;
        List mopub;
        C2257e c2257e = this.loadAd;
        if (c2257e != null) {
            this.loadAd = null;
            return license(c2257e, null);
        }
        C7417e c7417e = this.smaato;
        if (c7417e != null && c7417e.ad < c7417e.vip.size()) {
            int i2 = c7417e.ad;
            ArrayList arrayList = c7417e.vip;
            if (i2 >= arrayList.size()) {
                throw new NoSuchElementException();
            }
            int i3 = c7417e.ad;
            c7417e.ad = i3 + 1;
            return license((C2257e) arrayList.get(i3), null);
        }
        C4052e c4052e = this.amazon;
        C4052e c4052e2 = c4052e;
        if (c4052e == null) {
            C12428e c12428e = this.startapp;
            C16089e c16089e = this.adcel;
            boolean z = this.yandex;
            ?? obj = new Object();
            obj.f9000e = c12428e;
            obj.f9002e = c16089e;
            obj.f9003e = z;
            C13664e c13664e = C13664e.f27089e;
            obj.f8999e = c13664e;
            obj.f9005e = c13664e;
            obj.f9004e = new ArrayList();
            URI yandex = c12428e.yandex.yandex();
            if (yandex.getHost() == null) {
                mopub = AbstractC16286e.mopub(new Proxy[]{Proxy.NO_PROXY});
            } else {
                List<Proxy> select = c12428e.billing.select(yandex);
                mopub = (select == null || select.isEmpty()) ? AbstractC16286e.mopub(new Proxy[]{Proxy.NO_PROXY}) : AbstractC16286e.adcel(select);
            }
            obj.f8999e = mopub;
            obj.f9001e = 0;
            this.amazon = obj;
            c4052e2 = obj;
        }
        if (!c4052e2.startapp()) {
            throw new IOException("exhausted all routes");
        }
        if (!c4052e2.startapp()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList2 = new ArrayList();
        while (c4052e2.f9001e < ((List) c4052e2.f8999e).size()) {
            C12428e c12428e2 = (C12428e) c4052e2.f9000e;
            if (c4052e2.f9001e >= ((List) c4052e2.f8999e).size()) {
                throw new SocketException("No route to " + c12428e2.yandex.license + "; exhausted proxy configurations: " + ((List) c4052e2.f8999e));
            }
            List list2 = (List) c4052e2.f8999e;
            int i4 = c4052e2.f9001e;
            c4052e2.f9001e = i4 + 1;
            Proxy proxy = (Proxy) list2.get(i4);
            ArrayList arrayList3 = new ArrayList();
            c4052e2.f9005e = arrayList3;
            if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                C15718e c15718e = c12428e2.yandex;
                str = c15718e.license;
                i = c15718e.appmetrica;
            } else {
                SocketAddress address = proxy.address();
                if (!(address instanceof InetSocketAddress)) {
                    throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + address.getClass()).toString());
                }
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                InetAddress address2 = inetSocketAddress.getAddress();
                str = address2 == null ? inetSocketAddress.getHostName() : address2.getHostAddress();
                i = inetSocketAddress.getPort();
            }
            if (1 > i || i >= 65536) {
                throw new SocketException("No route to " + str + ':' + i + "; port is out of range");
            }
            if (proxy.type() == Proxy.Type.SOCKS) {
                arrayList3.add(InetSocketAddress.createUnresolved(str, i));
            } else {
                if (AbstractC16953e.ad.license(str)) {
                    list = Collections.singletonList(InetAddress.getByName(str));
                } else {
                    c12428e2.ad.getClass();
                    try {
                        List m670implements = AbstractC1660e.m670implements(InetAddress.getAllByName(str));
                        if (m670implements.isEmpty()) {
                            throw new UnknownHostException(c12428e2.ad + " returned no addresses for " + str);
                        }
                        list = m670implements;
                    } catch (NullPointerException e) {
                        UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(str));
                        unknownHostException.initCause(e);
                        throw unknownHostException;
                    }
                }
                if (c4052e2.f9003e && list.size() >= 2) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList arrayList5 = new ArrayList();
                    for (Object obj2 : list) {
                        if (((InetAddress) obj2) instanceof Inet6Address) {
                            arrayList4.add(obj2);
                        } else {
                            arrayList5.add(obj2);
                        }
                    }
                    if (!arrayList4.isEmpty() && !arrayList5.isEmpty()) {
                        byte[] bArr = AbstractC10220e.ad;
                        Iterator it = arrayList4.iterator();
                        Iterator it2 = arrayList5.iterator();
                        C1169e license = AbstractC6874e.license();
                        while (true) {
                            if (!it.hasNext() && !it2.hasNext()) {
                                break;
                            }
                            if (it.hasNext()) {
                                license.add(it.next());
                            }
                            if (it2.hasNext()) {
                                license.add(it2.next());
                            }
                        }
                        list = AbstractC6874e.metrica(license);
                    }
                }
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    arrayList3.add(new InetSocketAddress((InetAddress) it3.next(), i));
                }
            }
            Iterator it4 = c4052e2.f9005e.iterator();
            while (it4.hasNext()) {
                C2257e c2257e2 = new C2257e((C12428e) c4052e2.f9000e, proxy, (InetSocketAddress) it4.next());
                C16089e c16089e2 = (C16089e) c4052e2.f9002e;
                synchronized (c16089e2) {
                    contains = ((LinkedHashSet) c16089e2.f31681e).contains(c2257e2);
                }
                if (contains) {
                    ((ArrayList) c4052e2.f9004e).add(c2257e2);
                } else {
                    arrayList2.add(c2257e2);
                }
            }
            if (!arrayList2.isEmpty()) {
                break;
            }
        }
        if (arrayList2.isEmpty()) {
            AbstractC13480e.inmobi(arrayList2, (ArrayList) c4052e2.f9004e);
            ((ArrayList) c4052e2.f9004e).clear();
        }
        C7417e c7417e2 = new C7417e(3, arrayList2);
        this.smaato = c7417e2;
        if (this.mopub.f9921e) {
            throw new IOException("Canceled");
        }
        if (c7417e2.ad >= arrayList2.size()) {
            throw new NoSuchElementException();
        }
        int i5 = c7417e2.ad;
        c7417e2.ad = i5 + 1;
        return license((C2257e) arrayList2.get(i5), arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.InterfaceC1753e vip() {
        /*
            r7 = this;
            eِؗؓ r0 = r7.mopub
            eًؑؕ r0 = r0.f9928e
            r1 = 0
            if (r0 != 0) goto L9
        L7:
            r2 = r1
            goto L67
        L9:
            boolean r2 = r7.advert
            boolean r2 = r0.startapp(r2)
            monitor-enter(r0)
            r3 = 1
            if (r2 != 0) goto L1f
            r0.adcel = r3     // Catch: java.lang.Throwable -> L1c
            eِؗؓ r2 = r7.mopub     // Catch: java.lang.Throwable -> L1c
            java.net.Socket r2 = r2.mopub()     // Catch: java.lang.Throwable -> L1c
            goto L4a
        L1c:
            r1 = move-exception
            goto L90
        L1f:
            boolean r2 = r0.adcel     // Catch: java.lang.Throwable -> L1c
            if (r2 != 0) goto L44
            eؓۧۥ r2 = r0.metrica     // Catch: java.lang.Throwable -> L1c
            eِّۘ r2 = r2.ad     // Catch: java.lang.Throwable -> L1c
            eٕۛؕ r2 = r2.yandex     // Catch: java.lang.Throwable -> L1c
            eِّۘ r4 = r7.startapp     // Catch: java.lang.Throwable -> L1c
            eٕۛؕ r4 = r4.yandex     // Catch: java.lang.Throwable -> L1c
            int r5 = r2.appmetrica     // Catch: java.lang.Throwable -> L1c
            int r6 = r4.appmetrica     // Catch: java.lang.Throwable -> L1c
            if (r5 != r6) goto L3e
            java.lang.String r2 = r2.license     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = r4.license     // Catch: java.lang.Throwable -> L1c
            boolean r2 = defpackage.AbstractC7890e.billing(r2, r4)     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L3e
            goto L3f
        L3e:
            r3 = 0
        L3f:
            if (r3 != 0) goto L42
            goto L44
        L42:
            r2 = r1
            goto L4a
        L44:
            eِؗؓ r2 = r7.mopub     // Catch: java.lang.Throwable -> L1c
            java.net.Socket r2 = r2.mopub()     // Catch: java.lang.Throwable -> L1c
        L4a:
            monitor-exit(r0)
            eِؗؓ r3 = r7.mopub
            eًؑؕ r3 = r3.f9928e
            if (r3 == 0) goto L61
            if (r2 != 0) goto L59
            eؚۖۡ r2 = new eؚۖۡ
            r2.<init>(r0)
            goto L67
        L59:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            r0.<init>(r1)
            throw r0
        L61:
            if (r2 == 0) goto L7
            defpackage.AbstractC16286e.metrica(r2)
            goto L7
        L67:
            if (r2 == 0) goto L6a
            return r2
        L6a:
            eؚۖۡ r0 = r7.appmetrica(r1, r1)
            if (r0 == 0) goto L71
            return r0
        L71:
            eّۙٗ r0 = r7.Signature
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L82
            eّۙٗ r0 = r7.Signature
            java.lang.Object r0 = r0.removeFirst()
            eِؓؗ r0 = (defpackage.InterfaceC1753e) r0
            return r0
        L82:
            eٖۧٚ r0 = r7.metrica()
            java.util.List r1 = r0.mopub
            eؚۖۡ r1 = r7.appmetrica(r0, r1)
            if (r1 == 0) goto L8f
            return r1
        L8f:
            return r0
        L90:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0309e.vip():eِؓؗ");
    }
}
