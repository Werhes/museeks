package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@InterfaceC5413e
/* renamed from: eّۦٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12893e {
    public static final C1999e Companion = new Object();
    public static final InterfaceC5372e[] license = {null, null, new C17327e(C9582e.ad, C3596e.ad, 1)};
    public final C5707e ad;
    public final Map metrica;
    public final C16971e vip;

    public /* synthetic */ C12893e(int i, C5707e c5707e, C16971e c16971e, Map map) {
        if (1 != (i & 1)) {
            AbstractC5756e.billing(i, 1, C8558e.ad.appmetrica());
            throw null;
        }
        this.ad = c5707e;
        if ((i & 2) == 0) {
            this.vip = null;
        } else {
            this.vip = c16971e;
        }
        if ((i & 4) == 0) {
            this.metrica = null;
        } else {
            this.metrica = map;
        }
    }

    public C12893e(C5707e c5707e, C16971e c16971e, Map map) {
        this.ad = c5707e;
        this.vip = c16971e;
        this.metrica = map;
    }

    public static C12893e ad(C12893e c12893e, C5707e c5707e, C16971e c16971e, Map map, int i) {
        if ((i & 1) != 0) {
            c5707e = c12893e.ad;
        }
        if ((i & 2) != 0) {
            c16971e = c12893e.vip;
        }
        if ((i & 4) != 0) {
            map = c12893e.metrica;
        }
        c12893e.getClass();
        return new C12893e(c5707e, c16971e, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12893e)) {
            return false;
        }
        C12893e c12893e = (C12893e) obj;
        return AbstractC7890e.billing(this.ad, c12893e.ad) && AbstractC7890e.billing(this.vip, c12893e.vip) && AbstractC7890e.billing(this.metrica, c12893e.metrica);
    }

    public final int hashCode() {
        int hashCode = this.ad.hashCode() * 31;
        C16971e c16971e = this.vip;
        int hashCode2 = (hashCode + (c16971e == null ? 0 : c16971e.hashCode())) * 31;
        Map map = this.metrica;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return "SessionData(sessionDetails=" + this.ad + ", backgroundTime=" + this.vip + ", processDataMap=" + this.metrica + ')';
    }
}
