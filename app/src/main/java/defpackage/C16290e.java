package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖ٘ۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16290e implements Iterator, InterfaceC16555e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f31973e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f31974e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f31975e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final int f31976e;

    public C16290e(char c, char c2, int i) {
        this.f31976e = i;
        this.f31974e = c2;
        boolean z = false;
        if (i <= 0 ? AbstractC7890e.yandex(c, c2) >= 0 : AbstractC7890e.yandex(c, c2) <= 0) {
            z = true;
        }
        this.f31973e = z;
        this.f31975e = z ? c : c2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31973e;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f31975e;
        if (i != this.f31974e) {
            this.f31975e = this.f31976e + i;
        } else {
            if (!this.f31973e) {
                throw new NoSuchElementException();
            }
            this.f31973e = false;
        }
        return Character.valueOf((char) i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
