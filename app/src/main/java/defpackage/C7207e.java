package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚِٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7207e {
    public int ad;
    public final int[] vip = new int[10];

    public final int ad() {
        if ((this.ad & 16) != 0) {
            return this.vip[4];
        }
        return 65535;
    }

    public final void vip(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.vip;
            if (i >= iArr.length) {
                return;
            }
            this.ad = (1 << i) | this.ad;
            iArr[i] = i2;
        }
    }
}
