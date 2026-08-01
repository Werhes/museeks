package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leؖۘٙ;", "Leِٝؓ;", "Leؔۦً;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eؖۘٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4328e extends AbstractC11865e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final EnumC17426e f9463e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C6594e f9464e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final InterfaceC5823e f9465e;

    public C4328e(InterfaceC5823e interfaceC5823e, C6594e c6594e, EnumC17426e enumC17426e) {
        this.f9465e = interfaceC5823e;
        this.f9464e = c6594e;
        this.f9463e = enumC17426e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4328e)) {
            return false;
        }
        C4328e c4328e = (C4328e) obj;
        return AbstractC7890e.billing(this.f9465e, c4328e.f9465e) && AbstractC7890e.billing(this.f9464e, c4328e.f9464e) && this.f9463e == c4328e.f9463e;
    }

    public final int hashCode() {
        return this.f9463e.hashCode() + ((((this.f9464e.hashCode() + (this.f9465e.hashCode() * 31)) * 31) + 1237) * 31);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eؔۦً, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f7035e = this.f9465e;
        abstractC13616e.f7036e = this.f9464e;
        abstractC13616e.f7034e = this.f9463e;
        return abstractC13616e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C2993e c2993e = (C2993e) abstractC13616e;
        c2993e.f7035e = this.f9465e;
        c2993e.f7036e = this.f9464e;
        c2993e.f7034e = this.f9463e;
    }
}
