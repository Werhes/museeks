package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eََ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10177e {
    public int ad;
    public int appmetrica;
    public Serializable billing;
    public int license;
    public int metrica;
    public int purchase;
    public int vip;

    public boolean ad(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if ((i & (-2097152)) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        this.ad = i2;
        this.billing = AbstractC16704e.ad[3 - i3];
        int i6 = AbstractC16704e.vip[i5];
        this.metrica = i6;
        if (i2 == 2) {
            this.metrica = i6 / 2;
        } else if (i2 == 0) {
            this.metrica = i6 / 4;
        }
        int i7 = (i >>> 9) & 1;
        int i8 = 1152;
        if (i3 != 1) {
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new IllegalArgumentException();
                }
                i8 = 384;
            }
        } else if (i2 != 3) {
            i8 = 576;
        }
        this.purchase = i8;
        if (i3 == 3) {
            int i9 = i2 == 3 ? AbstractC16704e.metrica[i4 - 1] : AbstractC16704e.license[i4 - 1];
            this.appmetrica = i9;
            this.vip = (((i9 * 12) / this.metrica) + i7) * 4;
        } else {
            if (i2 == 3) {
                int i10 = i3 == 2 ? AbstractC16704e.appmetrica[i4 - 1] : AbstractC16704e.purchase[i4 - 1];
                this.appmetrica = i10;
                this.vip = ((i10 * 144) / this.metrica) + i7;
            } else {
                int i11 = AbstractC16704e.billing[i4 - 1];
                this.appmetrica = i11;
                this.vip = (((i3 == 1 ? 72 : 144) * i11) / this.metrica) + i7;
            }
        }
        this.license = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }
}
