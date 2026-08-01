package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؓۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6154e extends C0203e {
    public final C4030e adcel;
    public final int advert;
    public final List mopub;
    public int smaato;

    public C6154e(AbstractC0232e abstractC0232e, C4030e c4030e) {
        super(abstractC0232e, c4030e, (String) null, 12);
        this.adcel = c4030e;
        List m3575continue = AbstractC13480e.m3575continue(c4030e.f8962e.keySet());
        this.mopub = m3575continue;
        this.advert = m3575continue.size() * 2;
        this.smaato = -1;
    }

    @Override // defpackage.C0203e, defpackage.AbstractC9531e
    /* renamed from: catch */
    public final AbstractC1948e mo263catch() {
        return this.adcel;
    }

    @Override // defpackage.C0203e, defpackage.AbstractC9531e
    /* renamed from: implements */
    public final String mo264implements(InterfaceC9998e interfaceC9998e, int i) {
        return (String) this.mopub.get(i / 2);
    }

    @Override // defpackage.C0203e, defpackage.AbstractC9531e
    /* renamed from: interface */
    public final AbstractC1948e mo265interface(String str) {
        return this.smaato % 2 == 0 ? AbstractC12517e.vip(str) : (AbstractC1948e) AbstractC10064e.license(str, this.adcel);
    }

    @Override // defpackage.C0203e
    /* renamed from: private */
    public final C4030e mo263catch() {
        return this.adcel;
    }

    @Override // defpackage.C0203e, defpackage.AbstractC9531e, defpackage.InterfaceC2043e
    public final void vip(InterfaceC9998e interfaceC9998e) {
    }

    @Override // defpackage.C0203e, defpackage.InterfaceC2043e
    public final int yandex(InterfaceC9998e interfaceC9998e) {
        int i = this.smaato;
        if (i >= this.advert - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.smaato = i2;
        return i2;
    }
}
