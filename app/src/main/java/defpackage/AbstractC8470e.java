package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٜؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC8470e {
    public final int[] ad;
    public final List appmetrica;
    public final int license;
    public final int metrica;
    public final int vip;

    public AbstractC8470e(int... iArr) {
        List list;
        this.ad = iArr;
        Integer subs = AbstractC1660e.subs(iArr, 0);
        this.vip = subs != null ? subs.intValue() : -1;
        Integer subs2 = AbstractC1660e.subs(iArr, 1);
        this.metrica = subs2 != null ? subs2.intValue() : -1;
        Integer subs3 = AbstractC1660e.subs(iArr, 2);
        this.license = subs3 != null ? subs3.intValue() : -1;
        if (iArr.length <= 3) {
            list = C13664e.f27089e;
        } else {
            if (iArr.length > 1024) {
                throw new IllegalArgumentException(AbstractC1786e.pro(new StringBuilder("BinaryVersion with length more than 1024 are not supported. Provided length "), iArr.length, '.'));
            }
            list = AbstractC13480e.m3575continue(new C13085e(new C8805e(0, iArr), 3, iArr.length));
        }
        this.appmetrica = list;
    }

    public final boolean ad(int i, int i2, int i3) {
        int i4 = this.vip;
        if (i4 > i) {
            return true;
        }
        if (i4 < i) {
            return false;
        }
        int i5 = this.metrica;
        if (i5 > i2) {
            return true;
        }
        return i5 >= i2 && this.license >= i3;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        AbstractC8470e abstractC8470e = (AbstractC8470e) obj;
        return this.vip == abstractC8470e.vip && this.metrica == abstractC8470e.metrica && this.license == abstractC8470e.license && AbstractC7890e.billing(this.appmetrica, abstractC8470e.appmetrica);
    }

    public final int hashCode() {
        int i = this.vip;
        int i2 = (i * 31) + this.metrica + i;
        int i3 = (i2 * 31) + this.license + i2;
        return this.appmetrica.hashCode() + (i3 * 31) + i3;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        for (int i : this.ad) {
            if (i == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList.isEmpty() ? "unknown" : AbstractC13480e.m3608try(arrayList, ".", null, null, null, 62);
    }
}
