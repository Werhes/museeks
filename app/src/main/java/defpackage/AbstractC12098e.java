package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۥٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC12098e implements Iterator, InterfaceC16555e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f24254e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f24255e;

    public abstract void ad();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f24255e;
        if (i == 0) {
            this.f24255e = 3;
            ad();
            return this.f24255e == 1;
        }
        if (i == 1) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        throw new IllegalArgumentException("hasNext called when the iterator is in the FAILED state.");
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f24255e;
        if (i == 1) {
            this.f24255e = 0;
            return this.f24254e;
        }
        if (i != 2) {
            this.f24255e = 3;
            ad();
            if (this.f24255e == 1) {
                this.f24255e = 0;
                return this.f24254e;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
