package defpackage;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔؔۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14490e extends AbstractC9649e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C7594e f28645e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Object[] f28646e;

    public C14490e(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2, 1);
        this.f28646e = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.f28645e = new C7594e(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C7594e c7594e = this.f28645e;
        if (c7594e.hasNext()) {
            this.f19132e++;
            return c7594e.next();
        }
        int i = this.f19132e;
        this.f19132e = i + 1;
        return this.f28646e[i - c7594e.f19131e];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f19132e;
        C7594e c7594e = this.f28645e;
        int i2 = c7594e.f19131e;
        if (i <= i2) {
            this.f19132e = i - 1;
            return c7594e.previous();
        }
        int i3 = i - 1;
        this.f19132e = i3;
        return this.f28646e[i3 - i2];
    }
}
