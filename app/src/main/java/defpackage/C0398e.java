package defpackage;

import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑٚٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0398e {
    public final C10566e ad;
    public final C12347e metrica;
    public final long vip;

    public C0398e(long j, int i, String str) {
        this(new C10566e((i & 1) != 0 ? BuildConfig.FLAVOR : str), (i & 2) != 0 ? C12347e.vip : j, (C12347e) null);
    }

    public C0398e(C10566e c10566e, long j, C12347e c12347e) {
        C12347e c12347e2;
        this.ad = c10566e;
        this.vip = AbstractC9262e.license(c10566e.f20850e.length(), j);
        if (c12347e != null) {
            c12347e2 = new C12347e(AbstractC9262e.license(c10566e.f20850e.length(), c12347e.ad));
        } else {
            c12347e2 = null;
        }
        this.metrica = c12347e2;
    }

    public static C0398e ad(C0398e c0398e, C10566e c10566e, long j, int i) {
        if ((i & 1) != 0) {
            c10566e = c0398e.ad;
        }
        if ((i & 2) != 0) {
            j = c0398e.vip;
        }
        C12347e c12347e = (i & 4) != 0 ? c0398e.metrica : null;
        c0398e.getClass();
        return new C0398e(c10566e, j, c12347e);
    }

    public static C0398e vip(C0398e c0398e, String str) {
        long j = c0398e.vip;
        C12347e c12347e = c0398e.metrica;
        c0398e.getClass();
        return new C0398e(new C10566e(str), j, c12347e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0398e)) {
            return false;
        }
        C0398e c0398e = (C0398e) obj;
        return C12347e.metrica(this.vip, c0398e.vip) && AbstractC7890e.billing(this.metrica, c0398e.metrica) && AbstractC7890e.billing(this.ad, c0398e.ad);
    }

    public final int hashCode() {
        int startapp = (C12347e.startapp(this.vip) + (this.ad.hashCode() * 31)) * 31;
        C12347e c12347e = this.metrica;
        return startapp + (c12347e != null ? C12347e.startapp(c12347e.ad) : 0);
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.ad) + "', selection=" + ((Object) C12347e.adcel(this.vip)) + ", composition=" + this.metrica + ')';
    }
}
