package defpackage;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٕۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11913e {
    public final List ad;
    public final C1169e metrica;
    public final long vip;

    /* JADX WARN: Multi-variable type inference failed */
    public C11913e(AbstractList abstractList, long j) {
        ArrayList arrayList;
        ArrayList arrayList2;
        char c;
        char c2;
        C4211e c4211e;
        List list;
        char c3;
        char c4;
        this.ad = abstractList;
        this.vip = j;
        C1169e license = AbstractC6874e.license();
        char c5 = 3;
        char c6 = 2;
        C4211e c4211e2 = null;
        if (abstractList.size() <= 0 || ((AbstractC8835e) abstractList.get(0)).ad.size() != 3) {
            arrayList = null;
            arrayList2 = null;
        } else {
            C6571e license2 = ((C4211e) ((AbstractC8835e) abstractList.get(0)).ad.get(1)).license(0.5f);
            C4211e c4211e3 = (C4211e) license2.f13544e;
            C4211e c4211e4 = (C4211e) license2.f13543e;
            arrayList2 = AbstractC6874e.mopub(((AbstractC8835e) abstractList.get(0)).ad.get(0), c4211e3);
            arrayList = AbstractC6874e.mopub(c4211e4, ((AbstractC8835e) abstractList.get(0)).ad.get(2));
        }
        int size = abstractList.size();
        if (size >= 0) {
            int i = 0;
            C4211e c4211e5 = null;
            while (true) {
                if (i == 0 && arrayList != null) {
                    list = arrayList;
                } else if (i != this.ad.size()) {
                    list = ((AbstractC8835e) this.ad.get(i)).ad;
                } else {
                    if (arrayList2 == null) {
                        c = c5;
                        c2 = c6;
                        break;
                    }
                    list = arrayList2;
                }
                int size2 = list.size();
                int i2 = 0;
                while (i2 < size2) {
                    C4211e c4211e6 = (C4211e) list.get(i2);
                    if (c4211e6.purchase()) {
                        c3 = c5;
                        if (c4211e5 != null) {
                            float[] fArr = c4211e5.ad;
                            c4 = c6;
                            float[] copyOf = Arrays.copyOf(fArr, fArr.length);
                            C4211e c4211e7 = new C4211e(copyOf);
                            copyOf[6] = c4211e6.ad();
                            copyOf[7] = c4211e6.vip();
                            c4211e5 = c4211e7;
                        } else {
                            c4 = c6;
                        }
                    } else {
                        if (c4211e5 != null) {
                            license.add(c4211e5);
                        }
                        c3 = c5;
                        c4 = c6;
                        if (c4211e2 == null) {
                            c4211e2 = c4211e6;
                            c4211e5 = c4211e2;
                        } else {
                            c4211e5 = c4211e6;
                        }
                    }
                    i2++;
                    c5 = c3;
                    c6 = c4;
                }
                c = c5;
                c2 = c6;
                if (i == size) {
                    break;
                }
                i++;
                c5 = c;
                c6 = c2;
            }
            c4211e = c4211e2;
            c4211e2 = c4211e5;
        } else {
            c = 3;
            c2 = 2;
            c4211e = null;
        }
        if (c4211e2 == null || c4211e == null) {
            license.add(AbstractC8217e.vip(AbstractC11613e.Signature(this.vip), AbstractC11613e.admob(this.vip), AbstractC11613e.Signature(this.vip), AbstractC11613e.admob(this.vip), AbstractC11613e.Signature(this.vip), AbstractC11613e.admob(this.vip), AbstractC11613e.Signature(this.vip), AbstractC11613e.admob(this.vip)));
        } else {
            float[] fArr2 = c4211e2.ad;
            float f = fArr2[0];
            float f2 = fArr2[1];
            float f3 = fArr2[c2];
            float f4 = fArr2[c];
            float f5 = fArr2[4];
            float f6 = fArr2[5];
            float[] fArr3 = c4211e.ad;
            license.add(AbstractC8217e.vip(f, f2, f3, f4, f5, f6, fArr3[0], fArr3[1]));
        }
        C1169e metrica = AbstractC6874e.metrica(license);
        this.metrica = metrica;
        Object obj = metrica.get(metrica.subs() - 1);
        int subs = metrica.subs();
        int i3 = 0;
        while (i3 < subs) {
            C4211e c4211e8 = (C4211e) this.metrica.get(i3);
            C4211e c4211e9 = (C4211e) obj;
            if (Math.abs(c4211e8.ad[0] - c4211e9.ad()) > 1.0E-4f || Math.abs(c4211e8.ad[1] - c4211e9.vip()) > 1.0E-4f) {
                throw new IllegalArgumentException("RoundedPolygon must be contiguous, with the anchor points of all curves matching the anchor points of the preceding and succeeding cubics");
            }
            i3++;
            obj = c4211e8;
        }
    }

    public static float[] ad(C11913e c11913e, float[] fArr, int i) {
        char c;
        char c2;
        char c3;
        char c4;
        char c5 = 1;
        char c6 = 4;
        float[] fArr2 = (i & 1) != 0 ? new float[4] : fArr;
        C1169e c1169e = c11913e.metrica;
        if (fArr2.length < 4) {
            throw new IllegalArgumentException("Required bounds size of 4");
        }
        int subs = c1169e.subs();
        float f = Float.MIN_VALUE;
        char c7 = 0;
        float f2 = Float.MAX_VALUE;
        float f3 = Float.MAX_VALUE;
        int i2 = 0;
        float f4 = Float.MIN_VALUE;
        while (i2 < subs) {
            C4211e c4211e = (C4211e) c1169e.get(i2);
            float[] fArr3 = c4211e.ad;
            if (c4211e.purchase()) {
                fArr2[c7] = fArr3[c7];
                fArr2[c5] = fArr3[c5];
                fArr2[2] = fArr3[c7];
                fArr2[3] = fArr3[c5];
                c = c5;
                c2 = c6;
                c3 = c7;
                c4 = 2;
            } else {
                c = c5;
                float min = Math.min(fArr3[c7], c4211e.ad());
                c2 = c6;
                float min2 = Math.min(fArr3[c], c4211e.vip());
                c3 = c7;
                float max = Math.max(fArr3[c7], c4211e.ad());
                float max2 = Math.max(fArr3[c], c4211e.vip());
                c4 = 2;
                fArr2[c3] = Math.min(min, Math.min(fArr3[2], fArr3[c2]));
                fArr2[c] = Math.min(min2, Math.min(fArr3[3], fArr3[5]));
                fArr2[2] = Math.max(max, Math.max(fArr3[2], fArr3[c2]));
                fArr2[3] = Math.max(max2, Math.max(fArr3[3], fArr3[5]));
            }
            f2 = Math.min(f2, fArr2[c3]);
            f3 = Math.min(f3, fArr2[c]);
            f = Math.max(f, fArr2[c4]);
            f4 = Math.max(f4, fArr2[3]);
            i2++;
            c7 = c3;
            c6 = c2;
            c5 = c;
        }
        fArr2[c7] = f2;
        fArr2[c5] = f3;
        fArr2[2] = f;
        fArr2[3] = f4;
        return fArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11913e)) {
            return false;
        }
        return AbstractC7890e.billing(this.ad, ((C11913e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final C11913e metrica(InterfaceC13543e interfaceC13543e) {
        long j = this.vip;
        long ad = interfaceC13543e.ad(AbstractC11613e.Signature(j), AbstractC11613e.admob(j));
        long ad2 = C9268e.ad(Float.intBitsToFloat((int) (ad >> 32)), Float.intBitsToFloat((int) (ad & 4294967295L)));
        C1169e license = AbstractC6874e.license();
        List list = this.ad;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            license.add(((AbstractC8835e) list.get(i)).ad(interfaceC13543e));
        }
        return new C11913e(AbstractC6874e.metrica(license), ad2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[RoundedPolygon. Cubics = ");
        sb.append(AbstractC13480e.m3608try(this.metrica, null, null, null, null, 63));
        sb.append(" || Features = ");
        sb.append(AbstractC13480e.m3608try(this.ad, null, null, null, null, 63));
        sb.append(" || Center = (");
        long j = this.vip;
        sb.append(AbstractC11613e.Signature(j));
        sb.append(", ");
        sb.append(AbstractC11613e.admob(j));
        sb.append(")]");
        return sb.toString();
    }

    public final C11913e vip() {
        float[] ad = ad(this, null, 3);
        float f = ad[2] - ad[0];
        float f2 = ad[3] - ad[1];
        float max = Math.max(f, f2);
        float f3 = 2;
        return metrica(new C12423e(((max - f) / f3) - ad[0], max, ((max - f2) / f3) - ad[1]));
    }
}
