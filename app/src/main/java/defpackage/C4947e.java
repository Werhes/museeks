package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٗۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4947e extends AbstractC12614e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC13294e f10461e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ int f10462e;

    public /* synthetic */ C4947e(AbstractC13294e abstractC13294e, int i) {
        this.f10462e = i;
        this.f10461e = abstractC13294e;
    }

    @Override // defpackage.AbstractC0281e
    public final boolean advert() {
        switch (this.f10462e) {
            case 0:
                this.f10461e.getClass();
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.AbstractC0281e
    public final int billing(int i, Object[] objArr) {
        return appmetrica().billing(i, objArr);
    }

    @Override // defpackage.AbstractC0281e, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f10462e) {
            case 0:
                if (!(obj instanceof C15079e)) {
                    return false;
                }
                C15079e c15079e = (C15079e) obj;
                if (c15079e.ad() <= 0) {
                    return false;
                }
                return ((C11994e) this.f10461e).f23974e.vip(c15079e.ad) == c15079e.ad();
            default:
                return ((C11994e) this.f10461e).contains(obj);
        }
    }

    @Override // defpackage.AbstractC12614e, java.util.Collection, java.util.Set
    public int hashCode() {
        switch (this.f10462e) {
            case 0:
                return this.f10461e.hashCode();
            default:
                return super.hashCode();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.f10462e) {
            case 0:
                return this.f10461e.loadAd().size();
            default:
                return ((C11994e) this.f10461e).f23974e.metrica;
        }
    }

    @Override // defpackage.AbstractC0281e
    /* renamed from: smaato */
    public final AbstractC7014e iterator() {
        return appmetrica().listIterator(0);
    }

    @Override // defpackage.AbstractC12614e
    public final AbstractC17475e subscription() {
        return new C10436e(this);
    }
}
