package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۡٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC12811e extends AbstractC13616e implements InterfaceC6459e, InterfaceC4890e, InterfaceC1683e {

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public boolean f25627e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public C6054e f25628e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public C14298e f25629e;

    public AbstractC12811e(C14298e c14298e, C6054e c6054e) {
        this.f25628e = c6054e;
        this.f25629e = c14298e;
    }

    @Override // defpackage.InterfaceC4890e
    /* renamed from: catch */
    public final /* synthetic */ void mo708catch() {
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // defpackage.InterfaceC4890e
    public final void crashlytics(C2561e c2561e, EnumC13456e enumC13456e, long j) {
        if (enumC13456e == EnumC13456e.f26727e) {
            ?? r3 = c2561e.ad;
            int size = r3.size();
            for (int i = 0; i < size; i++) {
                if (mo463e(((C2401e) r3.get(i)).startapp)) {
                    int i2 = c2561e.purchase;
                    if (i2 == 4) {
                        this.f25627e = true;
                        m3404e();
                        return;
                    } else {
                        if (i2 == 5) {
                            m3403e();
                            return;
                        }
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: eؒٚۨ */
    public abstract void mo462e(InterfaceC15690e interfaceC15690e);

    @Override // defpackage.InterfaceC4890e
    /* renamed from: eؘُٔ */
    public final void mo709e() {
        mo720protected();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [eّؖٝ, java.lang.Object] */
    /* renamed from: eؚٜ۠, reason: contains not printable characters */
    public final void m3403e() {
        if (this.f25627e) {
            this.f25627e = false;
            if (this.f27016e) {
                ?? obj = new Object();
                AbstractC14114e.startapp(this, new C6229e(obj, 1));
                AbstractC12811e abstractC12811e = (AbstractC12811e) obj.f9318e;
                if (abstractC12811e != null) {
                    abstractC12811e.m3405e();
                } else {
                    mo462e(null);
                }
            }
        }
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eُۘٙ */
    public final void mo713e() {
        mo720protected();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eٍؚؔ, java.lang.Object] */
    /* renamed from: eّّۚ, reason: contains not printable characters */
    public final void m3404e() {
        ?? obj = new Object();
        obj.f18534e = true;
        AbstractC14114e.mopub(this, new C17097e(21, (Object) obj));
        if (obj.f18534e) {
            m3405e();
        }
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eّْٝ */
    public final void mo228e() {
        m3403e();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eّؖٝ, java.lang.Object] */
    /* renamed from: eٌٔٗ, reason: contains not printable characters */
    public final void m3405e() {
        C14298e c14298e;
        ?? obj = new Object();
        AbstractC14114e.startapp(this, new C18314e(obj));
        AbstractC12811e abstractC12811e = (AbstractC12811e) obj.f9318e;
        if (abstractC12811e == null || (c14298e = abstractC12811e.f25629e) == null) {
            c14298e = this.f25629e;
        }
        mo462e(c14298e);
    }

    @Override // defpackage.InterfaceC4890e
    /* renamed from: eّٔؖ */
    public final /* synthetic */ boolean mo716e() {
        return false;
    }

    /* renamed from: eٖٔۧ */
    public abstract boolean mo463e(int i);

    @Override // defpackage.InterfaceC4890e
    public final long pro() {
        C6054e c6054e = this.f25628e;
        if (c6054e == null) {
            return AbstractC15287e.ad;
        }
        InterfaceC14388e interfaceC14388e = AbstractC5851e.mopub(this).f27604e;
        int i = AbstractC15287e.vip;
        return C10215e.billing(interfaceC14388e.mo493e(c6054e.ad), interfaceC14388e.mo493e(c6054e.vip), interfaceC14388e.mo493e(c6054e.metrica), interfaceC14388e.mo493e(c6054e.license));
    }

    @Override // defpackage.InterfaceC4890e
    /* renamed from: protected */
    public final void mo720protected() {
        m3403e();
    }
}
