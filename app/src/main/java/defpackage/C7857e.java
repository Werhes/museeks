package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًُ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7857e extends AbstractC13616e implements InterfaceC17303e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public boolean f15904e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public EnumC17426e f15905e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public C14995e f15906e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public Function2 f15907e;

    @Override // defpackage.InterfaceC17303e
    public final int ad(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.appmetrica(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17303e
    public final int billing(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.billing(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eّْٝ */
    public final void mo228e() {
        this.f15904e = false;
    }

    @Override // defpackage.InterfaceC17303e
    public final InterfaceC17242e license(InterfaceC13158e interfaceC13158e, InterfaceC16719e interfaceC16719e, long j) {
        AbstractC2832e admob = interfaceC16719e.admob(j);
        if (!interfaceC13158e.mo398transient() || !this.f15904e) {
            C6571e c6571e = (C6571e) this.f15907e.invoke(new C12729e((admob.f6804e & 4294967295L) | (admob.f6806e << 32)), new C5602e(j));
            this.f15906e.loadAd((C1295e) c6571e.f13544e, c6571e.f13543e);
        }
        this.f15904e = interfaceC13158e.mo398transient() || this.f15904e;
        return interfaceC13158e.ads(admob.f6806e, admob.f6804e, C9139e.f18290e, new Cthrows(17, interfaceC13158e, this, admob));
    }

    @Override // defpackage.InterfaceC17303e
    public final int purchase(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.metrica(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17303e
    public final int startapp(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.startapp(this, abstractC9292e, interfaceC16719e, i);
    }
}
