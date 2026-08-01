package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٞۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16392e implements InterfaceC8998e {
    public final float[] ad;
    public final float[] vip;

    public C16392e(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            throw new IllegalArgumentException("Array lengths must match and be nonzero");
        }
        this.ad = fArr;
        this.vip = fArr2;
    }

    @Override // defpackage.InterfaceC8998e
    public final float ad(float f) {
        return C11993e.vip(f, this.vip, this.ad);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C16392e)) {
            return false;
        }
        C16392e c16392e = (C16392e) obj;
        return Arrays.equals(this.ad, c16392e.ad) && Arrays.equals(this.vip, c16392e.vip);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.vip) + (Arrays.hashCode(this.ad) * 31);
    }

    public final String toString() {
        return "FontScaleConverter{fromSpValues=" + Arrays.toString(this.ad) + ", toDpValues=" + Arrays.toString(this.vip) + '}';
    }

    @Override // defpackage.InterfaceC8998e
    public final float vip(float f) {
        return C11993e.vip(f, this.ad, this.vip);
    }
}
