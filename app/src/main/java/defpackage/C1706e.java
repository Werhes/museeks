package defpackage;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؓؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1706e extends AbstractC9649e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C17313e f4643e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Object[] f4644e;

    public C1706e(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2, 0);
        this.f4644e = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.f4643e = new C17313e(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        C17313e c17313e = this.f4643e;
        if (c17313e.hasNext()) {
            this.f19132e++;
            return c17313e.next();
        }
        int i = this.f19132e;
        this.f19132e = i + 1;
        return this.f4644e[i - c17313e.f19131e];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.f19132e;
        C17313e c17313e = this.f4643e;
        int i2 = c17313e.f19131e;
        if (i <= i2) {
            this.f19132e = i - 1;
            return c17313e.previous();
        }
        int i3 = i - 1;
        this.f19132e = i3;
        return this.f4644e[i3 - i2];
    }
}
