package defpackage;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٟۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5921e extends AbstractC9649e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Object f12491e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f12492e = 0;

    public C5921e(int i, int i2, Object[] objArr) {
        super(i, i2, 1);
        this.f12491e = objArr;
    }

    public C5921e(int i, Object obj) {
        super(i, 1, 1);
        this.f12491e = obj;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.f12492e) {
            case 0:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f12491e;
                int i = this.f19132e;
                this.f19132e = i + 1;
                return objArr[i];
            default:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                this.f19132e++;
                return this.f12491e;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.f12492e) {
            case 0:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                Object[] objArr = (Object[]) this.f12491e;
                int i = this.f19132e - 1;
                this.f19132e = i;
                return objArr[i];
            default:
                if (!hasPrevious()) {
                    throw new NoSuchElementException();
                }
                this.f19132e--;
                return this.f12491e;
        }
    }
}
