package defpackage;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٚٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1917e extends AbstractC9649e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f5111e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C4009e f5112e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f5113e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C17313e f5114e;

    public C1917e(C4009e c4009e, int i) {
        super(i, c4009e.f8927e, 0);
        this.f5112e = c4009e;
        this.f5111e = c4009e.m1441this();
        this.f5113e = -1;
        metrica();
    }

    public final void ad() {
        if (this.f5111e != this.f5112e.m1441this()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // defpackage.AbstractC9649e, java.util.ListIterator
    public final void add(Object obj) {
        ad();
        this.f5112e.add(this.f19132e, obj);
        this.f19132e++;
        vip();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void metrica() {
        C4009e c4009e = this.f5112e;
        Object[] objArr = c4009e.f8925e;
        if (objArr == null) {
            this.f5114e = null;
            return;
        }
        int i = (c4009e.f8927e - 1) & (-32);
        int i2 = this.f19132e;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (c4009e.f8926e / 5) + 1;
        C17313e c17313e = this.f5114e;
        if (c17313e == null) {
            this.f5114e = new C17313e(objArr, i2, i, i3);
            return;
        }
        c17313e.f19132e = i2;
        c17313e.f19131e = i;
        c17313e.f33961e = i3;
        if (c17313e.f33960e.length < i3) {
            c17313e.f33960e = new Object[i3];
        }
        c17313e.f33960e[0] = objArr;
        ?? r6 = i2 == i ? 1 : 0;
        c17313e.f33962e = r6;
        c17313e.vip(i2 - r6, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        ad();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f19132e;
        this.f5113e = i;
        C17313e c17313e = this.f5114e;
        C4009e c4009e = this.f5112e;
        if (c17313e == null) {
            Object[] objArr = c4009e.f8922e;
            this.f19132e = i + 1;
            return objArr[i];
        }
        if (c17313e.hasNext()) {
            this.f19132e++;
            return c17313e.next();
        }
        Object[] objArr2 = c4009e.f8922e;
        int i2 = this.f19132e;
        this.f19132e = i2 + 1;
        return objArr2[i2 - c17313e.f19131e];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        ad();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f19132e;
        this.f5113e = i - 1;
        C17313e c17313e = this.f5114e;
        C4009e c4009e = this.f5112e;
        if (c17313e == null) {
            Object[] objArr = c4009e.f8922e;
            int i2 = i - 1;
            this.f19132e = i2;
            return objArr[i2];
        }
        int i3 = c17313e.f19131e;
        if (i <= i3) {
            this.f19132e = i - 1;
            return c17313e.previous();
        }
        Object[] objArr2 = c4009e.f8922e;
        int i4 = i - 1;
        this.f19132e = i4;
        return objArr2[i4 - i3];
    }

    @Override // defpackage.AbstractC9649e, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        ad();
        int i = this.f5113e;
        if (i == -1) {
            throw new IllegalStateException();
        }
        this.f5112e.firebase(i);
        int i2 = this.f5113e;
        if (i2 < this.f19132e) {
            this.f19132e = i2;
        }
        vip();
    }

    @Override // defpackage.AbstractC9649e, java.util.ListIterator
    public final void set(Object obj) {
        ad();
        int i = this.f5113e;
        if (i == -1) {
            throw new IllegalStateException();
        }
        C4009e c4009e = this.f5112e;
        c4009e.set(i, obj);
        this.f5111e = c4009e.m1441this();
        metrica();
    }

    public final void vip() {
        C4009e c4009e = this.f5112e;
        this.f19131e = c4009e.subs();
        this.f5111e = c4009e.m1441this();
        this.f5113e = -1;
        metrica();
    }
}
