package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۥٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1453e extends AbstractC17397e {
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
        if (AbstractC9914e.billing) {
            AbstractC9914e.metrica(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            AbstractC9914e.license(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.AbstractC17397e
    public final boolean license(long j, Object obj) {
        return AbstractC9914e.billing ? AbstractC9914e.amazon(j, obj) : AbstractC9914e.loadAd(j, obj);
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
        if (AbstractC9914e.billing) {
            AbstractC9914e.metrica(obj, j, b);
        } else {
            AbstractC9914e.license(obj, j, b);
        }
    }
}
