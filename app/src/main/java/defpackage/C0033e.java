package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؑؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0033e extends AbstractC17397e {
    @Override // defpackage.AbstractC17397e
    public final double adcel(long j, Object obj) {
        return Double.longBitsToDouble(this.ad.getLong(obj, j));
    }

    @Override // defpackage.AbstractC17397e
    public final void advert(Object obj, long j, double d) {
        this.ad.putLong(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.AbstractC17397e
    public final void appmetrica(Object obj, long j, boolean z) {
        if (AbstractC1929e.purchase) {
            AbstractC1929e.vip(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            AbstractC1929e.metrica(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.AbstractC17397e
    public final boolean license(long j, Object obj) {
        return AbstractC1929e.purchase ? AbstractC1929e.amazon(j, obj) : AbstractC1929e.loadAd(j, obj);
    }

    @Override // defpackage.AbstractC17397e
    public final float purchase(long j, Object obj) {
        return Float.intBitsToFloat(this.ad.getInt(obj, j));
    }

    @Override // defpackage.AbstractC17397e
    public final void startapp(Object obj, long j, float f) {
        this.ad.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.AbstractC17397e
    public final void vip(Object obj, long j, byte b) {
        if (AbstractC1929e.purchase) {
            AbstractC1929e.vip(obj, j, b);
        } else {
            AbstractC1929e.metrica(obj, j, b);
        }
    }
}
