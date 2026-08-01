package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00030\u0002¨\u0006\u0004"}, d2 = {"Leؘؓٓ;", "S", "Leِٝؓ;", "Leؘٜۥ;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eؘؓٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1797e<S> extends AbstractC11865e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C15921e f4855e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC3314e f4856e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C15037e f4857e;

    public C1797e(C15037e c15037e, InterfaceC3314e interfaceC3314e, C15921e c15921e) {
        this.f4857e = c15037e;
        this.f4856e = interfaceC3314e;
        this.f4855e = c15921e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1797e)) {
            return false;
        }
        C1797e c1797e = (C1797e) obj;
        return AbstractC7890e.billing(c1797e.f4857e, this.f4857e) && c1797e.f4856e.equals(this.f4856e);
    }

    public final int hashCode() {
        int hashCode = this.f4855e.hashCode() * 31;
        C15037e c15037e = this.f4857e;
        return this.f4856e.hashCode() + ((hashCode + (c15037e != null ? c15037e.hashCode() : 0)) * 31);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؘٜۥ, eٌٓۛ, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13870e = new AbstractC13870e(1);
        abstractC13870e.f12189e = this.f4857e;
        abstractC13870e.f12188e = this.f4856e;
        abstractC13870e.f12187e = this.f4855e;
        abstractC13870e.f12190e = AbstractC7572e.ad;
        return abstractC13870e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C5760e c5760e = (C5760e) abstractC13616e;
        c5760e.f12189e = this.f4857e;
        c5760e.f12188e = this.f4856e;
        c5760e.f12187e = this.f4855e;
    }
}
