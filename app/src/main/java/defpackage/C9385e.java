package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9385e extends AbstractC8415e {
    public final /* synthetic */ int vip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9385e(Unsafe unsafe, int i) {
        super(unsafe);
        this.vip = i;
    }

    @Override // defpackage.AbstractC8415e
    public final void adcel(Object obj, long j, boolean z) {
        switch (this.vip) {
            case 0:
                if (AbstractC9259e.billing) {
                    AbstractC9259e.mopub(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    AbstractC9259e.advert(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (AbstractC9259e.billing) {
                    AbstractC9259e.mopub(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    AbstractC9259e.advert(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // defpackage.AbstractC8415e
    public final void advert(Object obj, long j, double d) {
        switch (this.vip) {
            case 0:
                loadAd(j, Double.doubleToLongBits(d), obj);
                return;
            default:
                loadAd(j, Double.doubleToLongBits(d), obj);
                return;
        }
    }

    @Override // defpackage.AbstractC8415e
    public final float appmetrica(long j, Object obj) {
        switch (this.vip) {
            case 0:
                return Float.intBitsToFloat(purchase(j, obj));
            default:
                return Float.intBitsToFloat(purchase(j, obj));
        }
    }

    @Override // defpackage.AbstractC8415e
    public final double license(long j, Object obj) {
        switch (this.vip) {
            case 0:
                return Double.longBitsToDouble(billing(j, obj));
            default:
                return Double.longBitsToDouble(billing(j, obj));
        }
    }

    @Override // defpackage.AbstractC8415e
    public final boolean metrica(long j, Object obj) {
        switch (this.vip) {
            case 0:
                return AbstractC9259e.billing ? AbstractC9259e.vip(j, obj) : AbstractC9259e.metrica(j, obj);
            default:
                return AbstractC9259e.billing ? AbstractC9259e.vip(j, obj) : AbstractC9259e.metrica(j, obj);
        }
    }

    @Override // defpackage.AbstractC8415e
    public final void mopub(Object obj, long j, byte b) {
        switch (this.vip) {
            case 0:
                if (AbstractC9259e.billing) {
                    AbstractC9259e.mopub(obj, j, b);
                    return;
                } else {
                    AbstractC9259e.advert(obj, j, b);
                    return;
                }
            default:
                if (AbstractC9259e.billing) {
                    AbstractC9259e.mopub(obj, j, b);
                    return;
                } else {
                    AbstractC9259e.advert(obj, j, b);
                    return;
                }
        }
    }

    @Override // defpackage.AbstractC8415e
    public final void smaato(Object obj, long j, float f) {
        switch (this.vip) {
            case 0:
                amazon(j, obj, Float.floatToIntBits(f));
                return;
            default:
                amazon(j, obj, Float.floatToIntBits(f));
                return;
        }
    }

    @Override // defpackage.AbstractC8415e
    public final boolean subscription() {
        switch (this.vip) {
            case 0:
                return false;
            default:
                return false;
        }
    }
}
