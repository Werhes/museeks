package defpackage;

import j$.util.Objects;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۥٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3746e extends AbstractC7014e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public Object f8337e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC7014e f8338e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public AbstractC7014e f8339e;

    public C3746e(C9706e c9706e) {
        super(0);
        C0409e c0409e = c9706e.f19207e;
        AbstractC12614e abstractC12614e = c0409e.f17300e;
        if (abstractC12614e == null) {
            abstractC12614e = c0409e.metrica();
            c0409e.f17300e = abstractC12614e;
        }
        this.f8338e = abstractC12614e.iterator();
        this.f8337e = null;
        this.f8339e = C0626e.f2854e;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8339e.hasNext() || this.f8338e.hasNext();
    }

    @Override // defpackage.AbstractC7014e, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (!this.f8339e.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f8338e.next();
            this.f8337e = entry.getKey();
            this.f8339e = ((AbstractC0281e) entry.getValue()).iterator();
        }
        Object obj = this.f8337e;
        Objects.requireNonNull(obj);
        return new C7750e(obj, this.f8339e.next());
    }
}
