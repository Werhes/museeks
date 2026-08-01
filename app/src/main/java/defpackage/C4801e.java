package defpackage;

import kotlin.Metadata;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leُؗ٘;", "Leِٝؓ;", "Leٓؐ۟;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eُؗ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C4801e extends AbstractC11865e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C13540e f10229e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C13540e f10230e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C13540e f10231e;

    public C4801e(C13540e c13540e, C13540e c13540e2, C13540e c13540e3) {
        this.f10231e = c13540e;
        this.f10230e = c13540e2;
        this.f10229e = c13540e3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4801e)) {
            return false;
        }
        C4801e c4801e = (C4801e) obj;
        return this.f10231e.equals(c4801e.f10231e) && this.f10230e.equals(c4801e.f10230e) && this.f10229e.equals(c4801e.f10229e);
    }

    public final int hashCode() {
        return this.f10229e.hashCode() + ((this.f10230e.hashCode() + (this.f10231e.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LazyLayoutAnimateItemElement(fadeInSpec=" + this.f10231e + ", placementSpec=" + this.f10230e + ", fadeOutSpec=" + this.f10229e + ')';
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٓؐ۟, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f27117e = this.f10231e;
        abstractC13616e.f27118e = this.f10230e;
        abstractC13616e.f27116e = this.f10229e;
        return abstractC13616e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C13686e c13686e = (C13686e) abstractC13616e;
        c13686e.f27117e = this.f10231e;
        c13686e.f27118e = this.f10230e;
        c13686e.f27116e = this.f10229e;
    }
}
