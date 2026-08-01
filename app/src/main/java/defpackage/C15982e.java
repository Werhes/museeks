package defpackage;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Leُٖؕ;", "Leِٝؓ;", "Leَؚٝ;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: eُٖؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15982e extends AbstractC11865e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final float f31493e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final AbstractC4457e f31494e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final InterfaceC16154e f31495e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f31496e;

    public C15982e(long j, C11078e c11078e, InterfaceC16154e interfaceC16154e, int i) {
        j = (i & 1) != 0 ? C3618e.adcel : j;
        c11078e = (i & 2) != 0 ? null : c11078e;
        this.f31496e = j;
        this.f31494e = c11078e;
        this.f31493e = 1.0f;
        this.f31495e = interfaceC16154e;
    }

    public final boolean equals(Object obj) {
        C15982e c15982e = obj instanceof C15982e ? (C15982e) obj : null;
        return c15982e != null && C3618e.metrica(this.f31496e, c15982e.f31496e) && AbstractC7890e.billing(this.f31494e, c15982e.f31494e) && this.f31493e == c15982e.f31493e && AbstractC7890e.billing(this.f31495e, c15982e.f31495e);
    }

    public final int hashCode() {
        int i = C3618e.mopub;
        int ad = C10994e.ad(this.f31496e) * 31;
        AbstractC4457e abstractC4457e = this.f31494e;
        return this.f31495e.hashCode() + AbstractC1414e.license((ad + (abstractC4457e != null ? abstractC4457e.hashCode() : 0)) * 31, this.f31493e, 31);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eَؚٝ, eْۤۡ] */
    @Override // defpackage.AbstractC11865e
    public final AbstractC13616e vip() {
        ?? abstractC13616e = new AbstractC13616e();
        abstractC13616e.f20027e = this.f31496e;
        abstractC13616e.f20028e = this.f31494e;
        abstractC13616e.f20026e = this.f31493e;
        abstractC13616e.f20025e = this.f31495e;
        abstractC13616e.f20030e = 9205357640488583168L;
        return abstractC13616e;
    }

    @Override // defpackage.AbstractC11865e
    public final void yandex(AbstractC13616e abstractC13616e) {
        C10127e c10127e = (C10127e) abstractC13616e;
        c10127e.f20027e = this.f31496e;
        c10127e.f20028e = this.f31494e;
        c10127e.f20026e = this.f31493e;
        InterfaceC16154e interfaceC16154e = c10127e.f20025e;
        InterfaceC16154e interfaceC16154e2 = this.f31495e;
        if (!AbstractC7890e.billing(interfaceC16154e, interfaceC16154e2)) {
            c10127e.f20025e = interfaceC16154e2;
            AbstractC15118e.appmetrica(c10127e);
        }
        AbstractC12640e.advert(c10127e);
    }
}
