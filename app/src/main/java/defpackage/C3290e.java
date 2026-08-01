package defpackage;

import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؕٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3290e extends AbstractC9649e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f7447e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C0316e f7448e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f7449e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C7594e f7450e;

    public C3290e(C0316e c0316e, int i) {
        super(i, c0316e.f2332e, 1);
        this.f7448e = c0316e;
        this.f7447e = c0316e.m319this();
        this.f7449e = -1;
        vip();
    }

    public final void ad() {
        if (this.f7447e != this.f7448e.m319this()) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // defpackage.AbstractC9649e, java.util.ListIterator
    public final void add(Object obj) {
        ad();
        int i = this.f19132e;
        C0316e c0316e = this.f7448e;
        c0316e.add(i, obj);
        this.f19132e++;
        this.f19131e = c0316e.subs();
        this.f7447e = c0316e.m319this();
        this.f7449e = -1;
        vip();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        ad();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.f19132e;
        this.f7449e = i;
        C7594e c7594e = this.f7450e;
        C0316e c0316e = this.f7448e;
        if (c7594e == null) {
            Object[] objArr = c0316e.f2335e;
            this.f19132e = i + 1;
            return objArr[i];
        }
        if (c7594e.hasNext()) {
            this.f19132e++;
            return c7594e.next();
        }
        Object[] objArr2 = c0316e.f2335e;
        int i2 = this.f19132e;
        this.f19132e = i2 + 1;
        return objArr2[i2 - c7594e.f19131e];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        ad();
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f19132e;
        this.f7449e = i - 1;
        C7594e c7594e = this.f7450e;
        C0316e c0316e = this.f7448e;
        if (c7594e == null) {
            Object[] objArr = c0316e.f2335e;
            int i2 = i - 1;
            this.f19132e = i2;
            return objArr[i2];
        }
        int i3 = c7594e.f19131e;
        if (i <= i3) {
            this.f19132e = i - 1;
            return c7594e.previous();
        }
        Object[] objArr2 = c0316e.f2335e;
        int i4 = i - 1;
        this.f19132e = i4;
        return objArr2[i4 - i3];
    }

    @Override // defpackage.AbstractC9649e, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        ad();
        int i = this.f7449e;
        if (i == -1) {
            throw new IllegalStateException();
        }
        C0316e c0316e = this.f7448e;
        c0316e.firebase(i);
        int i2 = this.f7449e;
        if (i2 < this.f19132e) {
            this.f19132e = i2;
        }
        this.f19131e = c0316e.subs();
        this.f7447e = c0316e.m319this();
        this.f7449e = -1;
        vip();
    }

    @Override // defpackage.AbstractC9649e, java.util.ListIterator
    public final void set(Object obj) {
        ad();
        int i = this.f7449e;
        if (i == -1) {
            throw new IllegalStateException();
        }
        C0316e c0316e = this.f7448e;
        c0316e.set(i, obj);
        this.f7447e = c0316e.m319this();
        vip();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void vip() {
        C0316e c0316e = this.f7448e;
        Object[] objArr = c0316e.f2336e;
        if (objArr == null) {
            this.f7450e = null;
            return;
        }
        int i = (c0316e.f2332e - 1) & (-32);
        int i2 = this.f19132e;
        if (i2 > i) {
            i2 = i;
        }
        int i3 = (c0316e.f2333e / 5) + 1;
        C7594e c7594e = this.f7450e;
        if (c7594e == null) {
            this.f7450e = new C7594e(objArr, i2, i, i3);
            return;
        }
        c7594e.f19132e = i2;
        c7594e.f19131e = i;
        c7594e.f15443e = i3;
        if (c7594e.f15442e.length < i3) {
            c7594e.f15442e = new Object[i3];
        }
        c7594e.f15442e[0] = objArr;
        ?? r6 = i2 == i ? 1 : 0;
        c7594e.f15444e = r6;
        c7594e.vip(i2 - r6, 1);
    }
}
