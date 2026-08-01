package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؖٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15243e implements InterfaceC7103e, Set, InterfaceC16555e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C5896e f30161e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C5896e f30162e;

    public C15243e(C5896e c5896e) {
        this.f30162e = c5896e;
        this.f30161e = c5896e;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        return this.f30161e.ad(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        C5896e c5896e = this.f30161e;
        int i = c5896e.billing;
        for (Object obj : collection) {
            int license = c5896e.license(obj);
            c5896e.vip[license] = obj;
            long[] jArr = c5896e.metrica;
            int i2 = c5896e.license;
            jArr[license] = (i2 & 2147483647L) | 4611686016279904256L;
            if (i2 != Integer.MAX_VALUE) {
                jArr[i2] = ((2147483647L & license) << 31) | (jArr[i2] & (-4611686016279904257L));
            }
            c5896e.license = license;
            if (c5896e.appmetrica == Integer.MAX_VALUE) {
                c5896e.appmetrica = license;
            }
        }
        return i != c5896e.billing;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.f30161e.vip();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f30162e.metrica(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f30162e.metrica(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15243e.class != obj.getClass()) {
            return false;
        }
        return AbstractC7890e.billing(this.f30162e, ((C15243e) obj).f30162e);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        return this.f30162e.hashCode();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.f30162e.billing == 0;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C5143e(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        return this.f30161e.billing(obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
    
        if (((r5 & ((~r5) << 6)) & r12) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        r14 = -1;
     */
    @Override // java.util.Set, java.util.Collection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean removeAll(java.util.Collection r21) {
        /*
            r20 = this;
            r0 = r21
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = r20
            eؘۣۚ r2 = r1.f30161e
            int r3 = r2.billing
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r4 = r0.hasNext()
            r5 = 1
            r6 = 0
            if (r4 == 0) goto L9c
            java.lang.Object r4 = r0.next()
            if (r4 == 0) goto L21
            int r7 = r4.hashCode()
            goto L22
        L21:
            r7 = r6
        L22:
            r8 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r7 = r7 * r8
            int r8 = r7 << 16
            r7 = r7 ^ r8
            r8 = r7 & 127(0x7f, float:1.78E-43)
            int r9 = r2.purchase
            int r7 = r7 >>> 7
            r7 = r7 & r9
        L30:
            long[] r10 = r2.ad
            int r11 = r7 >> 3
            r12 = r7 & 7
            int r12 = r12 << 3
            r13 = r10[r11]
            long r13 = r13 >>> r12
            int r11 = r11 + r5
            r15 = r10[r11]
            int r10 = 64 - r12
            long r10 = r15 << r10
            r21 = r5
            r15 = r6
            long r5 = (long) r12
            long r5 = -r5
            r12 = 63
            long r5 = r5 >> r12
            long r5 = r5 & r10
            long r5 = r5 | r13
            long r10 = (long) r8
            r12 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r10 = r10 * r12
            long r10 = r10 ^ r5
            long r12 = r10 - r12
            long r10 = ~r10
            long r10 = r10 & r12
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
        L5e:
            r16 = 0
            int r14 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r14 == 0) goto L81
            int r14 = java.lang.Long.numberOfTrailingZeros(r10)
            int r14 = r14 >> 3
            int r14 = r14 + r7
            r14 = r14 & r9
            r18 = r12
            java.lang.Object[] r12 = r2.vip
            r12 = r12[r14]
            boolean r12 = defpackage.AbstractC7890e.billing(r12, r4)
            if (r12 == 0) goto L79
            goto L8e
        L79:
            r12 = 1
            long r12 = r10 - r12
            long r10 = r10 & r12
            r12 = r18
            goto L5e
        L81:
            r18 = r12
            long r10 = ~r5
            r12 = 6
            long r10 = r10 << r12
            long r5 = r5 & r10
            long r5 = r5 & r18
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 == 0) goto L95
            r14 = -1
        L8e:
            if (r14 < 0) goto Le
            r2.yandex(r14)
            goto Le
        L95:
            int r6 = r15 + 8
            int r7 = r7 + r6
            r7 = r7 & r9
            r5 = r21
            goto L30
        L9c:
            r21 = r5
            int r0 = r2.billing
            if (r3 == r0) goto La3
            return r21
        La3:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C15243e.removeAll(java.util.Collection):boolean");
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return this.f30161e.startapp(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.f30162e.billing;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return AbstractC4533e.adcel(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return AbstractC4533e.mopub(this, objArr);
    }

    public final String toString() {
        return this.f30162e.toString();
    }
}
