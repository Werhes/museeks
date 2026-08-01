package defpackage;

import sun.misc.Unsafe;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۜ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13525e extends AbstractC17552e {
    public final /* synthetic */ int vip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C13525e(Unsafe unsafe, int i) {
        super(unsafe);
        this.vip = i;
    }

    @Override // defpackage.AbstractC17552e
    public final void advert(Object obj, long j, byte b) {
        switch (this.vip) {
            case 0:
                if (AbstractC5314e.billing) {
                    AbstractC5314e.advert(obj, j, b);
                    return;
                } else {
                    AbstractC5314e.smaato(obj, j, b);
                    return;
                }
            default:
                if (AbstractC5314e.billing) {
                    AbstractC5314e.advert(obj, j, b);
                    return;
                } else {
                    AbstractC5314e.smaato(obj, j, b);
                    return;
                }
        }
    }

    @Override // defpackage.AbstractC17552e
    public final void amazon(Object obj, long j, float f) {
        switch (this.vip) {
            case 0:
                loadAd(j, obj, Float.floatToIntBits(f));
                return;
            default:
                loadAd(j, obj, Float.floatToIntBits(f));
                return;
        }
    }

    @Override // defpackage.AbstractC17552e
    public final double appmetrica(long j, Object obj) {
        switch (this.vip) {
            case 0:
                return Double.longBitsToDouble(yandex(j, obj));
            default:
                return Double.longBitsToDouble(yandex(j, obj));
        }
    }

    @Override // defpackage.AbstractC17552e
    public final byte license(long j, Object obj) {
        switch (this.vip) {
            case 0:
                return AbstractC5314e.billing ? AbstractC5314e.yandex(j, obj) : AbstractC5314e.startapp(j, obj);
            default:
                return AbstractC5314e.billing ? AbstractC5314e.yandex(j, obj) : AbstractC5314e.startapp(j, obj);
        }
    }

    @Override // defpackage.AbstractC17552e
    public final boolean metrica(long j, Object obj) {
        switch (this.vip) {
            case 0:
                if (AbstractC5314e.billing) {
                    if (AbstractC5314e.yandex(j, obj) == 0) {
                        return false;
                    }
                } else if (AbstractC5314e.startapp(j, obj) == 0) {
                    return false;
                }
                return true;
            default:
                if (AbstractC5314e.billing) {
                    if (AbstractC5314e.yandex(j, obj) == 0) {
                        return false;
                    }
                } else if (AbstractC5314e.startapp(j, obj) == 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // defpackage.AbstractC17552e
    public final void mopub(Object obj, long j, boolean z) {
        switch (this.vip) {
            case 0:
                if (AbstractC5314e.billing) {
                    AbstractC5314e.advert(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    AbstractC5314e.smaato(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
            default:
                if (AbstractC5314e.billing) {
                    AbstractC5314e.advert(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                } else {
                    AbstractC5314e.smaato(obj, j, z ? (byte) 1 : (byte) 0);
                    return;
                }
        }
    }

    @Override // defpackage.AbstractC17552e
    public final float purchase(long j, Object obj) {
        switch (this.vip) {
            case 0:
                return Float.intBitsToFloat(billing(j, obj));
            default:
                return Float.intBitsToFloat(billing(j, obj));
        }
    }

    @Override // defpackage.AbstractC17552e
    public final boolean remoteconfig() {
        switch (this.vip) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override // defpackage.AbstractC17552e
    public final void smaato(Object obj, long j, double d) {
        switch (this.vip) {
            case 0:
                Signature(j, Double.doubleToLongBits(d), obj);
                return;
            default:
                Signature(j, Double.doubleToLongBits(d), obj);
                return;
        }
    }
}
