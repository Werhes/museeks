package defpackage;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۥٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7594e extends AbstractC9649e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public Object[] f15442e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f15443e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public boolean f15444e;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public C7594e(Object[] objArr, int i, int i2, int i3) {
        super(i, i2, 1);
        this.f15443e = i3;
        Object[] objArr2 = new Object[i3];
        this.f15442e = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.f15444e = r5;
        objArr2[0] = objArr;
        vip(i - r5, 1);
    }

    public final Object ad() {
        return ((Object[]) this.f15442e[this.f15443e - 1])[this.f19132e & 31];
    }

    public final void metrica(int i) {
        int i2 = 0;
        while (AbstractC13083e.metrica(this.f19132e, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            vip(this.f19132e, ((this.f15443e - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object ad = ad();
        int i = this.f19132e + 1;
        this.f19132e = i;
        if (i == this.f19131e) {
            this.f15444e = true;
            return ad;
        }
        metrica(0);
        return ad;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.f19132e--;
        if (this.f15444e) {
            this.f15444e = false;
            return ad();
        }
        metrica(31);
        return ad();
    }

    public final void vip(int i, int i2) {
        int i3 = (this.f15443e - i2) * 5;
        while (i2 < this.f15443e) {
            Object[] objArr = this.f15442e;
            objArr[i2] = ((Object[]) objArr[i2 - 1])[AbstractC13083e.metrica(i, i3)];
            i3 -= 5;
            i2++;
        }
    }
}
