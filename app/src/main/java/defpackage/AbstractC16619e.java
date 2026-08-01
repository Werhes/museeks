package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۤ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16619e {
    public static final C2892e ad = new C2892e(-1035853807, false, new C15480e(14));

    public static final C7433e ad(float f, long j) {
        return new C7433e(f, new C18466e(j));
    }

    public static final int appmetrica(InterfaceC9998e interfaceC9998e, InterfaceC9998e[] interfaceC9998eArr) {
        int hashCode = (interfaceC9998e.ad().hashCode() * 31) + Arrays.hashCode(interfaceC9998eArr);
        int purchase = interfaceC9998e.purchase();
        int i = 1;
        while (true) {
            int i2 = 0;
            if (!(purchase > 0)) {
                break;
            }
            int i3 = purchase - 1;
            int i4 = i * 31;
            String ad2 = interfaceC9998e.adcel(interfaceC9998e.purchase() - purchase).ad();
            if (ad2 != null) {
                i2 = ad2.hashCode();
            }
            i = i4 + i2;
            purchase = i3;
        }
        int purchase2 = interfaceC9998e.purchase();
        int i5 = 1;
        while (true) {
            if (!(purchase2 > 0)) {
                return (((hashCode * 31) + i) * 31) + i5;
            }
            int i6 = purchase2 - 1;
            int i7 = i5 * 31;
            AbstractC8457e appmetrica = interfaceC9998e.adcel(interfaceC9998e.purchase() - purchase2).appmetrica();
            i5 = i7 + (appmetrica != null ? appmetrica.hashCode() : 0);
            purchase2 = i6;
        }
    }

    public static final C10437e license(InterfaceC5052e interfaceC5052e) {
        InterfaceC5052e interfaceC5052e2;
        InterfaceC4077e advert;
        int i = AbstractC2876e.ad;
        Iterator it = interfaceC5052e.mo1458e().loadAd().ad().iterator();
        while (true) {
            if (!it.hasNext()) {
                interfaceC5052e2 = null;
                break;
            }
            AbstractC1186e abstractC1186e = (AbstractC1186e) it.next();
            if (!AbstractC13270e.inmobi(abstractC1186e)) {
                advert = abstractC1186e.loadAd().advert();
                if (AbstractC14300e.advert(advert, 1) || AbstractC14300e.advert(advert, 3)) {
                    break;
                }
            }
        }
        interfaceC5052e2 = (InterfaceC5052e) advert;
        if (interfaceC5052e2 == null) {
            return null;
        }
        InterfaceC8528e mo1719e = interfaceC5052e2.mo1719e();
        C10437e c10437e = mo1719e instanceof C10437e ? (C10437e) mo1719e : null;
        return c10437e == null ? license(interfaceC5052e2) : c10437e;
    }

    public static C2895e metrica(SSLSession sSLSession) {
        List list;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if (cipherSuite.equals("TLS_NULL_WITH_NULL_NULL") || cipherSuite.equals("SSL_NULL_WITH_NULL_NULL")) {
            throw new IOException("cipherSuite == ".concat(cipherSuite));
        }
        C6893e smaato = C6893e.vip.smaato(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        EnumC17692e metrica = AbstractC5729e.metrica(protocol);
        try {
            list = AbstractC16286e.mopub(sSLSession.getPeerCertificates());
        } catch (SSLPeerUnverifiedException unused) {
            list = C13664e.f27089e;
        }
        return new C2895e(metrica, smaato, AbstractC16286e.mopub(sSLSession.getLocalCertificates()), new C5864e(1, list));
    }

    public static final String purchase(InterfaceC9998e interfaceC9998e) {
        return AbstractC13480e.m3608try(AbstractC3062e.admob(0, interfaceC9998e.purchase()), ", ", interfaceC9998e.ad() + '(', ")", new C8552e(1, interfaceC9998e), 24);
    }

    public static final ArrayList vip(ArrayList arrayList, List list, InterfaceC16528e interfaceC16528e) {
        AbstractC1186e abstractC1186e;
        arrayList.size();
        list.size();
        ArrayList m3579e = AbstractC13480e.m3579e(list, arrayList);
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(m3579e, 10));
        Iterator it = m3579e.iterator();
        while (it.hasNext()) {
            C6571e c6571e = (C6571e) it.next();
            AbstractC1186e abstractC1186e2 = (AbstractC1186e) c6571e.f13544e;
            C13043e c13043e = (C13043e) c6571e.f13543e;
            int i = c13043e.f25973e;
            InterfaceC2460e annotations = c13043e.getAnnotations();
            C0520e name = c13043e.getName();
            boolean m3525e = c13043e.m3525e();
            boolean z = c13043e.f25972e;
            boolean z2 = c13043e.f25969e;
            if (c13043e.f25971e != null) {
                int i2 = AbstractC2876e.ad;
                abstractC1186e = AbstractC14300e.metrica(interfaceC16528e).amazon().purchase(abstractC1186e2);
            } else {
                abstractC1186e = null;
            }
            arrayList2.add(new C13043e(interfaceC16528e, null, i, annotations, name, abstractC1186e2, m3525e, z, z2, abstractC1186e, c13043e.adcel()));
        }
        return arrayList2;
    }
}
