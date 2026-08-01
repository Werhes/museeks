package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8892e extends AbstractC12614e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final transient Object f17859e;

    public C8892e(Object obj) {
        obj.getClass();
        this.f17859e = obj;
    }

    @Override // defpackage.AbstractC0281e
    public final boolean advert() {
        return false;
    }

    @Override // defpackage.AbstractC12614e, defpackage.AbstractC0281e
    public final AbstractC17475e appmetrica() {
        return AbstractC17475e.ads(this.f17859e);
    }

    @Override // defpackage.AbstractC0281e
    public final int billing(int i, Object[] objArr) {
        objArr[i] = this.f17859e;
        return i + 1;
    }

    @Override // defpackage.AbstractC0281e, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.f17859e.equals(obj);
    }

    @Override // defpackage.AbstractC12614e, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f17859e.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // defpackage.AbstractC0281e
    /* renamed from: smaato */
    public final AbstractC7014e iterator() {
        return new C15025e(this.f17859e);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.f17859e.toString() + ']';
    }
}
