package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْ٘٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13314e implements InterfaceC0284e {
    public final String ad;
    public final String metrica;
    public final String vip;

    public C13314e(String str, String str2, String str3) {
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
    }

    @Override // defpackage.InterfaceC0284e
    public final void ad(InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        c13770e.m3671package(1678336903);
        int i2 = i | (c13770e.purchase(interfaceC12864e) ? 4 : 2) | (c13770e.purchase(this) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            Function1 function1 = (Function1) c13770e.adcel(AbstractC10577e.ad);
            Object m3681throw = c13770e.m3681throw();
            C5170e c5170e = C2987e.ad;
            if (m3681throw == c5170e) {
                m3681throw = AbstractC17861e.adcel(c13770e);
            }
            C15274e c15274e = (C15274e) m3681throw;
            InterfaceC3314e metrica = AbstractC13281e.metrica(c15274e, c13770e, 6);
            boolean purchase = c13770e.purchase(function1) | ((i2 & 112) == 32);
            Object m3681throw2 = c13770e.m3681throw();
            if (purchase || m3681throw2 == c5170e) {
                m3681throw2 = new Celse(function1, this, 26);
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC11160e.vip((Function0) m3681throw2, interfaceC12864e, false, 0.0f, null, null, C4524e.applovin(30), null, null, c15274e, AbstractC16653e.license(-1500268826, new C8937e(this, metrica, 3), c13770e), c13770e, (i2 << 3) & 112, 54, 892);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C1743e((InterfaceC0284e) this, interfaceC12864e, i, 2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13314e)) {
            return false;
        }
        C13314e c13314e = (C13314e) obj;
        if (!this.ad.equals(c13314e.ad) || !AbstractC7890e.billing(this.vip, c13314e.vip) || !AbstractC7890e.billing(this.metrica, c13314e.metrica)) {
            return false;
        }
        C11747e c11747e = C11747e.ad;
        return c11747e.equals(c11747e) && c11747e.equals(c11747e);
    }

    public final int hashCode() {
        return ((((this.metrica.hashCode() + AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip)) * 31) + 361106348) * 31) + 361106348;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioTrack(imageUrl=");
        sb.append(this.ad);
        sb.append(", title=");
        sb.append(this.vip);
        sb.append(", subtitle=");
        sb.append(this.metrica);
        sb.append(", onClick=");
        C11747e c11747e = C11747e.ad;
        sb.append(c11747e);
        sb.append(", onMenuClick=");
        sb.append(c11747e);
        sb.append(')');
        return sb.toString();
    }
}
