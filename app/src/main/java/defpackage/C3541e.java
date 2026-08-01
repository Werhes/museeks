package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؕٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3541e extends AbstractC14681e {
    public final int[] appmetrica;
    public final int license;
    public final int metrica;
    public final int[] purchase;
    public final int vip;

    public C3541e(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        super("MLLT");
        this.vip = i;
        this.metrica = i2;
        this.license = i3;
        this.appmetrica = iArr;
        this.purchase = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3541e.class == obj.getClass()) {
            C3541e c3541e = (C3541e) obj;
            if (this.vip == c3541e.vip && this.metrica == c3541e.metrica && this.license == c3541e.license && Arrays.equals(this.appmetrica, c3541e.appmetrica) && Arrays.equals(this.purchase, c3541e.purchase)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.purchase) + ((Arrays.hashCode(this.appmetrica) + ((((((527 + this.vip) * 31) + this.metrica) * 31) + this.license) * 31)) * 31);
    }
}
