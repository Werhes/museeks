package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؔؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2320e implements Iterator, InterfaceC16555e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f5835e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Iterator f5836e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f5837e;

    public C2320e(C10131e c10131e) {
        this.f5837e = 0;
        this.f5836e = c10131e.ad.iterator();
        this.f5835e = c10131e.vip;
    }

    public C2320e(C15809e c15809e) {
        this.f5837e = 2;
        this.f5835e = 40;
        this.f5836e = c15809e.ad.iterator();
    }

    public C2320e(Iterator it) {
        this.f5837e = 1;
        this.f5836e = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.f5837e) {
            case 0:
                break;
            case 1:
                return this.f5836e.hasNext();
            default:
                return this.f5835e > 0 && this.f5836e.hasNext();
        }
        while (true) {
            int i = this.f5835e;
            it = this.f5836e;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.f5835e--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.f5837e) {
            case 0:
                break;
            case 1:
                int i = this.f5835e;
                this.f5835e = i + 1;
                if (i >= 0) {
                    return new C9817e(i, this.f5836e.next());
                }
                AbstractC6874e.Signature();
                throw null;
            default:
                int i2 = this.f5835e;
                if (i2 == 0) {
                    throw new NoSuchElementException();
                }
                this.f5835e = i2 - 1;
                return this.f5836e.next();
        }
        while (true) {
            int i3 = this.f5835e;
            it = this.f5836e;
            if (i3 > 0 && it.hasNext()) {
                it.next();
                this.f5835e--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f5837e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
