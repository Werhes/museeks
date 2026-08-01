package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؚ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7495e extends AbstractC9359e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ int f15273e = 0;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f15274e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Object f15275e;

    public C7495e(int i) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
    
        if (defpackage.AbstractC9476e.appmetrica(r6.f15275e).add(r7) == false) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.AbstractCollection, java.util.Collection, java.util.LinkedHashSet] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean add(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.f15274e
            r1 = 1
            if (r0 != 0) goto L8
            r6.f15275e = r7
            goto L6a
        L8:
            r2 = 0
            if (r0 != r1) goto L20
            java.lang.Object r0 = r6.f15275e
            boolean r0 = defpackage.AbstractC7890e.billing(r0, r7)
            if (r0 == 0) goto L14
            goto L69
        L14:
            java.lang.Object r0 = r6.f15275e
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r0
            r3[r1] = r7
            r6.f15275e = r3
            goto L6a
        L20:
            r3 = 5
            if (r0 >= r3) goto L5d
            java.lang.Object r0 = r6.f15275e
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            boolean r3 = defpackage.AbstractC1660e.yandex(r7, r0)
            if (r3 == 0) goto L2e
            goto L69
        L2e:
            int r3 = r6.f15274e
            r4 = 4
            if (r3 != r4) goto L51
            int r3 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            int r4 = r0.length
            int r4 = defpackage.AbstractC10064e.appmetrica(r4)
            r3.<init>(r4)
            int r4 = r0.length
        L43:
            if (r2 >= r4) goto L4d
            r5 = r0[r2]
            r3.add(r5)
            int r2 = r2 + 1
            goto L43
        L4d:
            r3.add(r7)
            goto L5a
        L51:
            int r3 = r3 + r1
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r0, r3)
            int r0 = r3.length
            int r0 = r0 - r1
            r3[r0] = r7
        L5a:
            r6.f15275e = r3
            goto L6a
        L5d:
            java.lang.Object r0 = r6.f15275e
            java.util.Set r0 = defpackage.AbstractC9476e.appmetrica(r0)
            boolean r7 = r0.add(r7)
            if (r7 != 0) goto L6a
        L69:
            return r2
        L6a:
            int r7 = r6.f15274e
            int r7 = r7 + r1
            r6.f15274e = r7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7495e.add(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.f15275e = null;
        this.f15274e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (subs() == 0) {
            return false;
        }
        return subs() == 1 ? AbstractC7890e.billing(this.f15275e, obj) : subs() < 5 ? AbstractC1660e.yandex(obj, (Object[]) this.f15275e) : ((Set) this.f15275e).contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.f15274e;
        return i == 0 ? Collections.EMPTY_SET.iterator() : i == 1 ? new C4109e(1, this.f15275e) : i < 5 ? new C11927e((Object[]) this.f15275e) : AbstractC9476e.appmetrica(this.f15275e).iterator();
    }

    @Override // defpackage.AbstractC9359e
    public final int subs() {
        return this.f15274e;
    }
}
