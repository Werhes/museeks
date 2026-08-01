package defpackage;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٔۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15025e extends AbstractC7014e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public boolean f29791e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f29792e;

    public C15025e(Object obj) {
        super(0);
        this.f29792e = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f29791e;
    }

    @Override // defpackage.AbstractC7014e, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (this.f29791e) {
            throw new NoSuchElementException();
        }
        this.f29791e = true;
        return this.f29792e;
    }
}
