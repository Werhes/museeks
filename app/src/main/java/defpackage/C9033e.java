package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٟ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9033e extends AbstractC13616e implements InterfaceC17303e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public boolean f18086e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public EnumC17426e f18087e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public C14995e f18088e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public Function2 f18089e;

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int ad(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.appmetrica(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int billing(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.billing(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eّْٝ */
    public final void mo228e() {
        this.f18086e = false;
    }

    @Override // defpackage.InterfaceC17303e
    public final InterfaceC17242e license(InterfaceC13158e interfaceC13158e, InterfaceC16719e interfaceC16719e, long j) {
        Object m3592native;
        AbstractC2832e admob = interfaceC16719e.admob(j);
        boolean z = true;
        if (!interfaceC13158e.mo398transient() || !this.f18086e) {
            C6571e c6571e = (C6571e) this.f18089e.invoke(new C12729e((admob.f6806e << 32) | (admob.f6804e & 4294967295L)), new C5602e(j));
            C1295e c1295e = (C1295e) c6571e.f13544e;
            Object obj = c6571e.f13543e;
            if (!c1295e.metrica(obj) && (m3592native = AbstractC13480e.m3592native(0, c1295e.ad)) != null) {
                obj = m3592native;
            }
            this.f18088e.loadAd(c1295e, obj);
            this.f18086e = true;
        }
        if (!interfaceC13158e.mo398transient() && !this.f18086e) {
            z = false;
        }
        this.f18086e = z;
        return interfaceC13158e.ads(admob.f6806e, admob.f6804e, C9139e.f18290e, new Cthrows(16, interfaceC13158e, this, admob));
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int purchase(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.metrica(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int startapp(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.startapp(this, abstractC9292e, interfaceC16719e, i);
    }
}
