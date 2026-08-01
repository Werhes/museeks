package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌّۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8650e {
    public final C15718e ad;
    public final C5107e appmetrica;
    public final AbstractC1101e license;
    public final C15793e metrica;
    public C5875e purchase;
    public final String vip;

    public C8650e(C18464e c18464e) {
        C15718e c15718e = (C15718e) c18464e.f36191e;
        if (c15718e == null) {
            throw new IllegalStateException("url == null");
        }
        this.ad = c15718e;
        this.vip = (String) c18464e.f36190e;
        this.metrica = ((C15783e) c18464e.f36192e).billing();
        this.license = (AbstractC1101e) c18464e.f36189e;
        this.appmetrica = (C5107e) c18464e.f36194e;
    }

    public final C18464e ad() {
        C18464e c18464e = new C18464e(false);
        c18464e.f36191e = this.ad;
        c18464e.f36190e = this.vip;
        c18464e.f36189e = this.license;
        c18464e.f36194e = this.appmetrica;
        c18464e.f36192e = this.metrica.yandex();
        return c18464e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.vip);
        sb.append(", url=");
        sb.append(this.ad);
        C15793e c15793e = this.metrica;
        if (c15793e.size() != 0) {
            sb.append(", headers=[");
            Iterator it = c15793e.iterator();
            int i = 0;
            while (true) {
                C1630e c1630e = (C1630e) it;
                if (!c1630e.hasNext()) {
                    sb.append(']');
                    break;
                }
                Object next = c1630e.next();
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC6874e.Signature();
                    throw null;
                }
                C6571e c6571e = (C6571e) next;
                String str = (String) c6571e.f13544e;
                String str2 = (String) c6571e.f13543e;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                if (AbstractC10220e.mopub(str)) {
                    str2 = "██";
                }
                sb.append(str2);
                i = i2;
            }
        }
        C5107e c5107e = C5107e.f10949e;
        C5107e c5107e2 = this.appmetrica;
        if (!AbstractC7890e.billing(c5107e2, c5107e)) {
            sb.append(", tags=");
            sb.append(c5107e2);
        }
        sb.append('}');
        return sb.toString();
    }
}
