package defpackage;

import j$.util.Objects;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِّۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12428e {
    public final C4524e ad;
    public final List adcel;
    public final C12932e appmetrica;
    public final ProxySelector billing;
    public final HostnameVerifier license;
    public final SSLSocketFactory metrica;
    public final InterfaceC4529e purchase;
    public final List startapp;
    public final SocketFactory vip;
    public final C15718e yandex;

    public C12428e(String str, int i, C4524e c4524e, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C12932e c12932e, InterfaceC4529e interfaceC4529e, List list, List list2, ProxySelector proxySelector) {
        this.ad = c4524e;
        this.vip = socketFactory;
        this.metrica = sSLSocketFactory;
        this.license = hostnameVerifier;
        this.appmetrica = c12932e;
        this.purchase = interfaceC4529e;
        this.billing = proxySelector;
        C14052e c14052e = new C14052e();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            c14052e.appmetrica = "http";
        } else {
            if (!str2.equalsIgnoreCase("https")) {
                throw new IllegalArgumentException("unexpected scheme: ".concat(str2));
            }
            c14052e.appmetrica = "https";
        }
        String vip = AbstractC16953e.vip(AbstractC11309e.adcel(0, 0, 7, str));
        if (vip == null) {
            throw new IllegalArgumentException("unexpected host: ".concat(str));
        }
        c14052e.yandex = vip;
        if (1 > i || i >= 65536) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i, "unexpected port: ").toString());
        }
        c14052e.vip = i;
        this.yandex = c14052e.metrica();
        this.startapp = AbstractC16286e.adcel(list);
        this.adcel = AbstractC16286e.adcel(list2);
    }

    public final boolean ad(C12428e c12428e) {
        return AbstractC7890e.billing(this.ad, c12428e.ad) && AbstractC7890e.billing(this.purchase, c12428e.purchase) && AbstractC7890e.billing(this.startapp, c12428e.startapp) && AbstractC7890e.billing(this.adcel, c12428e.adcel) && AbstractC7890e.billing(this.billing, c12428e.billing) && AbstractC7890e.billing(this.metrica, c12428e.metrica) && AbstractC7890e.billing(this.license, c12428e.license) && AbstractC7890e.billing(this.appmetrica, c12428e.appmetrica) && this.yandex.appmetrica == c12428e.yandex.appmetrica;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C12428e)) {
            return false;
        }
        C12428e c12428e = (C12428e) obj;
        return AbstractC7890e.billing(this.yandex, c12428e.yandex) && ad(c12428e);
    }

    public final int hashCode() {
        return Objects.hashCode(this.appmetrica) + ((Objects.hashCode(this.license) + ((Objects.hashCode(this.metrica) + ((this.billing.hashCode() + AbstractC17861e.billing(AbstractC17861e.billing((this.purchase.hashCode() + ((this.ad.hashCode() + AbstractC1786e.advert(527, 31, this.yandex.startapp)) * 31)) * 31, 31, this.startapp), 31, this.adcel)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        C15718e c15718e = this.yandex;
        sb.append(c15718e.license);
        sb.append(':');
        sb.append(c15718e.appmetrica);
        sb.append(", ");
        sb.append("proxySelector=" + this.billing);
        sb.append('}');
        return sb.toString();
    }
}
