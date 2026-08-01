package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؔۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2520e extends AbstractC12614e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final transient C7816e f6361e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final transient AbstractC8507e f6362e;

    public C2520e(AbstractC8507e abstractC8507e, C7816e c7816e) {
        this.f6362e = abstractC8507e;
        this.f6361e = c7816e;
    }

    @Override // defpackage.AbstractC0281e
    public final boolean advert() {
        return true;
    }

    @Override // defpackage.AbstractC12614e, defpackage.AbstractC0281e
    public final AbstractC17475e appmetrica() {
        return this.f6361e;
    }

    @Override // defpackage.AbstractC0281e
    public final int billing(int i, Object[] objArr) {
        return this.f6361e.billing(i, objArr);
    }

    @Override // defpackage.AbstractC0281e, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f6362e.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f6362e.size();
    }

    @Override // defpackage.AbstractC0281e
    /* renamed from: smaato */
    public final AbstractC7014e iterator() {
        return this.f6361e.listIterator(0);
    }
}
