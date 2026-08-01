package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۧۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2257e {
    public final C12428e ad;
    public final InetSocketAddress metrica;
    public final Proxy vip;

    public C2257e(C12428e c12428e, Proxy proxy, InetSocketAddress inetSocketAddress) {
        this.ad = c12428e;
        this.vip = proxy;
        this.metrica = inetSocketAddress;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2257e)) {
            return false;
        }
        C2257e c2257e = (C2257e) obj;
        return AbstractC7890e.billing(c2257e.ad, this.ad) && AbstractC7890e.billing(c2257e.vip, this.vip) && AbstractC7890e.billing(c2257e.metrica, this.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + ((this.vip.hashCode() + ((this.ad.hashCode() + 527) * 31)) * 31);
    }

    public final String toString() {
        String hostAddress;
        StringBuilder sb = new StringBuilder();
        C15718e c15718e = this.ad.yandex;
        String str = c15718e.license;
        InetSocketAddress inetSocketAddress = this.metrica;
        InetAddress address = inetSocketAddress.getAddress();
        String vip = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : AbstractC16953e.vip(hostAddress);
        if (AbstractC5304e.isPro(str, ':')) {
            sb.append("[");
            sb.append(str);
            sb.append("]");
        } else {
            sb.append(str);
        }
        if (c15718e.appmetrica != inetSocketAddress.getPort() || AbstractC7890e.billing(str, vip)) {
            sb.append(":");
            sb.append(c15718e.appmetrica);
        }
        if (!AbstractC7890e.billing(str, vip)) {
            if (this.vip.equals(Proxy.NO_PROXY)) {
                sb.append(" at ");
            } else {
                sb.append(" via proxy ");
            }
            if (vip == null) {
                sb.append("<unresolved>");
            } else if (AbstractC5304e.isPro(vip, ':')) {
                sb.append("[");
                sb.append(vip);
                sb.append("]");
            } else {
                sb.append(vip);
            }
            sb.append(":");
            sb.append(inetSocketAddress.getPort());
        }
        return sb.toString();
    }
}
