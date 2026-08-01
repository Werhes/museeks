package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٝٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16374e {
    public final /* synthetic */ int ad;
    public int appmetrica;
    public int license;
    public int metrica;
    public int purchase;
    public int vip;

    public /* synthetic */ C16374e(int i, int i2, int i3, int i4, int i5, int i6) {
        this.ad = i6;
        this.vip = i;
        this.metrica = i2;
        this.license = i3;
        this.appmetrica = i4;
        this.purchase = i5;
    }

    public C16374e(int i, int i2, int i3, int i4, int i5, long j) {
        this.ad = 0;
        this.vip = i;
        this.metrica = i2;
        this.license = i3;
        this.appmetrica = i4;
        this.purchase = i5;
    }

    public boolean ad() {
        int i = this.vip;
        int i2 = 2;
        if ((i & 7) != 0) {
            int i3 = this.appmetrica;
            int i4 = this.metrica;
            if (((i3 > i4 ? 1 : i3 == i4 ? 2 : 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i5 = this.appmetrica;
            int i6 = this.license;
            if ((((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i7 = this.purchase;
            int i8 = this.metrica;
            if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i9 = this.purchase;
            int i10 = this.license;
            if (i9 > i10) {
                i2 = 1;
            } else if (i9 != i10) {
                i2 = 4;
            }
            if ((i & (i2 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }

    public int metrica() {
        switch (this.ad) {
            case 1:
                return this.vip;
            default:
                return this.vip;
        }
    }

    public AbstractC7629e vip() {
        switch (this.ad) {
            case 1:
                return new C3893e(this.vip, this.metrica, this.license, this.appmetrica, this.purchase);
            default:
                return new C8888e(this.vip, this.metrica, this.license, this.appmetrica, this.purchase);
        }
    }
}
