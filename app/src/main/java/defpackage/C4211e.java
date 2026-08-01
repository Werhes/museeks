package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C4211e {
    public final float[] ad;

    public C4211e(float[] fArr) {
        this.ad = fArr;
        if (fArr.length != 8) {
            throw new IllegalArgumentException("Points array size should be 8");
        }
    }

    public final float ad() {
        return this.ad[6];
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؖٛ, eًٌٓ] */
    public final C13845e appmetrica(InterfaceC13543e interfaceC13543e) {
        float[] fArr = new float[8];
        ?? c4211e = new C4211e(fArr);
        AbstractC1660e.subscription(this.ad, fArr, 14);
        c4211e.billing(interfaceC13543e, 0);
        c4211e.billing(interfaceC13543e, 2);
        c4211e.billing(interfaceC13543e, 4);
        c4211e.billing(interfaceC13543e, 6);
        return c4211e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4211e)) {
            return false;
        }
        return Arrays.equals(this.ad, ((C4211e) obj).ad);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.ad);
    }

    public final C6571e license(float f) {
        float f2 = 1 - f;
        long metrica = metrica(f);
        float[] fArr = this.ad;
        float f3 = fArr[0];
        float f4 = fArr[1];
        float f5 = fArr[2];
        float f6 = fArr[3];
        float f7 = f2 * f2;
        float f8 = 2 * f2 * f;
        float f9 = f * f;
        return new C6571e(AbstractC8217e.vip(f3, f4, (f5 * f) + (f3 * f2), (f6 * f) + (f4 * f2), (fArr[4] * f9) + (f5 * f8) + (f3 * f7), (fArr[5] * f9) + (f6 * f8) + (f4 * f7), AbstractC11613e.Signature(metrica), AbstractC11613e.admob(metrica)), AbstractC8217e.vip(AbstractC11613e.Signature(metrica), AbstractC11613e.admob(metrica), (ad() * f9) + (fArr[4] * f8) + (fArr[2] * f7), (vip() * f9) + (fArr[5] * f8) + (fArr[3] * f7), (ad() * f) + (fArr[4] * f2), (vip() * f) + (fArr[5] * f2), ad(), vip()));
    }

    public final long metrica(float f) {
        float f2 = 1 - f;
        float[] fArr = this.ad;
        float f3 = f2 * f2 * f2;
        float f4 = 3 * f;
        float f5 = f4 * f2 * f2;
        float f6 = f4 * f * f2;
        float f7 = f * f * f;
        return C9268e.ad((ad() * f7) + (fArr[4] * f6) + (fArr[2] * f5) + (fArr[0] * f3), (vip() * f7) + (fArr[5] * f6) + (fArr[3] * f5) + (fArr[1] * f3));
    }

    public final boolean purchase() {
        float[] fArr = this.ad;
        return Math.abs(fArr[0] - ad()) < 1.0E-4f && Math.abs(fArr[1] - vip()) < 1.0E-4f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("anchor0: (");
        float[] fArr = this.ad;
        sb.append(fArr[0]);
        sb.append(", ");
        sb.append(fArr[1]);
        sb.append(") control0: (");
        sb.append(fArr[2]);
        sb.append(", ");
        sb.append(fArr[3]);
        sb.append("), control1: (");
        sb.append(fArr[4]);
        sb.append(", ");
        sb.append(fArr[5]);
        sb.append("), anchor1: (");
        sb.append(ad());
        sb.append(", ");
        sb.append(vip());
        sb.append(')');
        return sb.toString();
    }

    public final float vip() {
        return this.ad[7];
    }
}
