package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٝۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5043e implements InterfaceC2869e {
    public final InterfaceC18133e ad;
    public final long metrica;
    public final int vip;

    public C5043e(InterfaceC18133e interfaceC18133e, int i, long j) {
        this.ad = interfaceC18133e;
        this.vip = i;
        this.metrica = j;
        if (interfaceC18133e instanceof C12870e) {
            C12870e c12870e = (C12870e) interfaceC18133e;
            if (c12870e.ad != 0 || c12870e.vip != 0) {
                return;
            }
        } else if (interfaceC18133e instanceof C13594e) {
            if (((C13594e) interfaceC18133e).ad != 0) {
                return;
            }
        } else if (!(interfaceC18133e instanceof C2802e) || ((C2802e) interfaceC18133e).ad.ad != 0) {
            return;
        }
        throw new IllegalArgumentException("Animation to be infinitely repeated cannot have a 0-duration");
    }

    @Override // defpackage.InterfaceC2869e
    public final InterfaceC17717e ad(C11139e c11139e) {
        return new C13132e(this.ad.ad(c11139e), this.vip, this.metrica);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C5043e) {
            C5043e c5043e = (C5043e) obj;
            if (c5043e.ad.equals(this.ad) && c5043e.vip == this.vip && c5043e.metrica == this.metrica) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int mopub = AbstractC1786e.mopub(this.vip, this.ad.hashCode() * 31, 31);
        long j = this.metrica;
        return ((int) (j ^ (j >>> 32))) + mopub;
    }
}
