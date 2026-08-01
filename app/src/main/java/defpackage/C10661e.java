package defpackage;

import android.view.View;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۦؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10661e implements Iterator {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f20999e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f21000e = 0;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f21001e;

    public /* synthetic */ C10661e(int i, Object obj) {
        this.f21001e = i;
        this.f20999e = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f21001e) {
            case 0:
                return this.f21000e < ((C10438e) this.f20999e).getChildCount();
            case 1:
                return this.f21000e < ((Object[]) this.f20999e).length;
            case 2:
                int i = this.f21000e;
                C12403e c12403e = (C12403e) this.f20999e;
                return i < c12403e.billing() - c12403e.appmetrica();
            default:
                return this.f21000e < ((C2246e) ((C10442e) this.f20999e).f20619e).appmetrica;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f21001e) {
            case 0:
                View childAt = ((C10438e) this.f20999e).getChildAt(this.f21000e);
                this.f21000e++;
                return childAt;
            case 1:
                int i = this.f21000e;
                Object[] objArr = (Object[]) this.f20999e;
                if (i != objArr.length) {
                    this.f21000e = i + 1;
                    return objArr[i];
                }
                throw new NoSuchElementException("Out of elements: " + this.f21000e);
            case 2:
                int i2 = this.f21000e;
                C12403e c12403e = (C12403e) this.f20999e;
                if (i2 >= c12403e.billing() - c12403e.appmetrica()) {
                    throw new NoSuchElementException();
                }
                Object obj = c12403e.f24835e.f24467e[c12403e.appmetrica() + i2];
                this.f21000e = i2 + 1;
                return obj;
            default:
                int i3 = this.f21000e;
                this.f21000e = i3 + 1;
                C2246e c2246e = (C2246e) ((C10442e) this.f20999e).f20619e;
                return c2246e.license(c2246e.license[i3] & 31);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f21001e) {
            case 0:
                ((C10438e) this.f20999e).removeViewAt(this.f21000e);
                this.f21000e--;
                return;
            case 1:
                throw new UnsupportedOperationException("Cannot remove element from an Array.");
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }
}
