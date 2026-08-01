package defpackage;

import j$.util.Objects;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۨۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3789e extends AbstractC7014e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f8395e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f8396e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Iterator f8397e;

    public C3789e(AbstractC7014e abstractC7014e) {
        super(0);
        this.f8397e = abstractC7014e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8396e > 0 || this.f8397e.hasNext();
    }

    @Override // defpackage.AbstractC7014e, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (this.f8396e <= 0) {
            C15079e c15079e = (C15079e) this.f8397e.next();
            this.f8395e = c15079e.ad;
            this.f8396e = c15079e.ad();
        }
        this.f8396e--;
        Object obj = this.f8395e;
        Objects.requireNonNull(obj);
        return obj;
    }
}
