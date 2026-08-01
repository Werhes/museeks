package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٖ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9526e extends AbstractC17397e {
    @Override // defpackage.AbstractC17397e
    public final double ad(long j, Object obj) {
        return Double.longBitsToDouble(this.ad.getLong(obj, j));
    }

    @Override // defpackage.AbstractC17397e
    public final void appmetrica(Object obj, long j, boolean z) {
        if (AbstractC8314e.billing) {
            AbstractC8314e.metrica(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            AbstractC8314e.license(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.AbstractC17397e
    public final void billing(Object obj, long j, byte b) {
        if (AbstractC8314e.billing) {
            AbstractC8314e.metrica(obj, j, b);
        } else {
            AbstractC8314e.license(obj, j, b);
        }
    }

    @Override // defpackage.AbstractC17397e
    public final float metrica(long j, Object obj) {
        return Float.intBitsToFloat(this.ad.getInt(obj, j));
    }

    @Override // defpackage.AbstractC17397e
    public final void mopub(Object obj, long j, float f) {
        this.ad.putInt(obj, j, Float.floatToIntBits(f));
    }

    @Override // defpackage.AbstractC17397e
    public final boolean smaato(long j, Object obj) {
        return AbstractC8314e.billing ? AbstractC8314e.smaato(j, obj) : AbstractC8314e.amazon(j, obj);
    }

    @Override // defpackage.AbstractC17397e
    public final void yandex(Object obj, long j, double d) {
        this.ad.putLong(obj, j, Double.doubleToLongBits(d));
    }
}
