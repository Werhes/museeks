package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۘؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1264e extends AbstractC2753e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final transient AbstractC2753e f3968e;

    public C1264e(AbstractC2753e abstractC2753e) {
        super(1);
        this.f3968e = abstractC2753e;
    }

    @Override // defpackage.AbstractC2753e, java.util.List
    /* renamed from: Signature */
    public final AbstractC2753e subList(int i, int i2) {
        AbstractC2753e abstractC2753e = this.f3968e;
        AbstractC0223e.amazon(i, i2, abstractC2753e.size());
        return abstractC2753e.subList(abstractC2753e.size() - i2, abstractC2753e.size() - i).loadAd();
    }

    @Override // defpackage.AbstractC2753e, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f3968e.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC2753e abstractC2753e = this.f3968e;
        AbstractC0223e.smaato(i, abstractC2753e.size());
        return abstractC2753e.get((abstractC2753e.size() - 1) - i);
    }

    @Override // defpackage.AbstractC2753e, java.util.List
    public final int indexOf(Object obj) {
        int lastIndexOf = this.f3968e.lastIndexOf(obj);
        if (lastIndexOf >= 0) {
            return (r0.size() - 1) - lastIndexOf;
        }
        return -1;
    }

    @Override // defpackage.AbstractC2753e, java.util.List
    public final int lastIndexOf(Object obj) {
        int indexOf = this.f3968e.indexOf(obj);
        if (indexOf >= 0) {
            return (r0.size() - 1) - indexOf;
        }
        return -1;
    }

    @Override // defpackage.AbstractC2753e
    public final AbstractC2753e loadAd() {
        return this.f3968e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3968e.size();
    }
}
