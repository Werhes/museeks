package defpackage;

import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓ۟ٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2128e {
    public static final C2128e metrica;
    public static final C2128e vip;
    public final C5761e ad;

    static {
        LinkedHashMap linkedHashMap = null;
        C15421e c15421e = null;
        C1223e c1223e = null;
        C4980e c4980e = null;
        C12395e c12395e = null;
        vip = new C2128e(new C5761e(c15421e, c1223e, c4980e, c12395e, linkedHashMap, 127));
        metrica = new C2128e(new C5761e(c15421e, c1223e, c4980e, c12395e, linkedHashMap, 95));
    }

    public C2128e(C5761e c5761e) {
        this.ad = c5761e;
    }

    public final C2128e ad(C2128e c2128e) {
        C5761e c5761e = c2128e.ad;
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
        return new C2128e(new C5761e(c15421e, c1223e, c4980e, c12395e, c5761e.appmetrica || c5761e2.appmetrica, AbstractC10064e.yandex(c5761e2.purchase, c5761e.purchase)));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2128e) && AbstractC7890e.billing(((C2128e) obj).ad, this.ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        if (equals(vip)) {
            return "ExitTransition.None";
        }
        if (equals(metrica)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
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
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(c5761e.appmetrica);
        return sb.toString();
    }
}
