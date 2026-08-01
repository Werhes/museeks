package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۙۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18351e {
    public static final C18351e vip = new C18351e(new C5761e((C15421e) null, (C1223e) null, (C4980e) null, (C12395e) null, (LinkedHashMap) null, 127));
    public final C5761e ad;

    public C18351e(C5761e c5761e) {
        this.ad = c5761e;
    }

    public final C18351e ad(C18351e c18351e) {
        C5761e c5761e = c18351e.ad;
        C15421e c15421e = c5761e.ad;
        C5761e c5761e2 = this.ad;
        if (c15421e == null) {
            c15421e = c5761e2.ad;
        }
        C1223e c1223e = c5761e.vip;
        if (c1223e == null) {
            c1223e = c5761e2.vip;
        }
        C4980e c4980e = c5761e.metrica;
        if (c4980e == null) {
            c4980e = c5761e2.metrica;
        }
        C12395e c12395e = c5761e.license;
        if (c12395e == null) {
            c12395e = c5761e2.license;
        }
        return new C18351e(new C5761e(c15421e, c1223e, c4980e, c12395e, AbstractC10064e.yandex(c5761e2.purchase, c5761e.purchase), 32));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C18351e) && AbstractC7890e.billing(((C18351e) obj).ad, this.ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        if (equals(vip)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        C5761e c5761e = this.ad;
        C15421e c15421e = c5761e.ad;
        sb.append(c15421e != null ? c15421e.toString() : null);
        sb.append(",\nSlide - ");
        C1223e c1223e = c5761e.vip;
        sb.append(c1223e != null ? c1223e.toString() : null);
        sb.append(",\nShrink - ");
        C4980e c4980e = c5761e.metrica;
        sb.append(c4980e != null ? c4980e.toString() : null);
        sb.append(",\nScale - ");
        C12395e c12395e = c5761e.license;
        sb.append(c12395e != null ? c12395e.toString() : null);
        return sb.toString();
    }
}
