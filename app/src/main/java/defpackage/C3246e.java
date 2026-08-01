package defpackage;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؕۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3246e extends AbstractC7014e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f7377e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f7378e;

    public C3246e(Object obj) {
        super(6);
        this.f7378e = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f7377e;
    }

    @Override // defpackage.AbstractC7014e, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (this.f7377e) {
            throw new NoSuchElementException();
        }
        this.f7377e = true;
        return this.f7378e;
    }
}
