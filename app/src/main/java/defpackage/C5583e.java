package defpackage;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘِؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5583e extends AbstractC9649e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Object f11931e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f11932e = 0;

    public C5583e(int i, int i2, Object[] objArr) {
        super(i, i2, 0);
        this.f11931e = objArr;
    }

    public C5583e(int i, Object obj) {
        super(i, 1, 0);
        this.f11931e = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f11932e) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f11931e;
                int i = this.f19132e;
                this.f19132e = i + 1;
                return objArr[i];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f19132e++;
                return this.f11931e;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f11932e) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f11931e;
                int i = this.f19132e - 1;
                this.f19132e = i;
                return objArr[i];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f19132e--;
                return this.f11931e;
        }
    }
}
