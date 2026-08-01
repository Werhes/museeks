package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙِؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11566e {
    public final C15398e ad;
    public int vip = 1;
    public long metrica = ad();

    public C11566e(C15398e c15398e) {
        this.ad = c15398e;
    }

    public final long ad() {
        C15398e c15398e = this.ad;
        AbstractC9528e.startapp(c15398e);
        long longValue = ((Long) AbstractC17254e.tapsense.ad(null)).longValue();
        long longValue2 = ((Long) AbstractC17254e.isVip.ad(null)).longValue();
        for (int i = 1; i < this.vip; i++) {
            longValue += longValue;
            if (longValue >= longValue2) {
                break;
            }
        }
        c15398e.mo2259e().getClass();
        return Math.min(longValue, longValue2) + System.currentTimeMillis();
    }
}
