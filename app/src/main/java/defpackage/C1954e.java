package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜؓۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1954e extends AbstractC13616e implements InterfaceC17303e, InterfaceC0479e, InterfaceC8501e, InterfaceC1683e {

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public C13610e f5147e;

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int ad(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.appmetrica(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int billing(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.billing(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC8501e
    /* renamed from: case */
    public final /* synthetic */ void mo292case() {
    }

    @Override // defpackage.InterfaceC8501e
    /* renamed from: eُؚٕ */
    public final void mo294e(C4017e c4017e) {
        C0763e metrica;
        C18478e c18478e;
        c4017e.ad();
        C13610e c13610e = this.f5147e;
        c13610e.getClass();
        C14434e c14434e = c4017e.f8940e;
        C12742e c12742e = c13610e.f27005e;
        if (c12742e.size() > 1) {
            AbstractC5167e.signatures(new C11797e(15), c12742e);
        }
        int size = c12742e.size();
        for (int i = 0; i < size; i++) {
            C16223e c16223e = (C16223e) c12742e.get(i);
            C16446e c16446e = (C16446e) c16223e.f31874e.getValue();
            if (c16446e != null && (metrica = c16223e.appmetrica().metrica.pro().metrica()) != null && c16223e.billing()) {
                long yandex = metrica.yandex();
                float intBitsToFloat = Float.intBitsToFloat((int) (yandex >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (yandex & 4294967295L));
                C17985e c17985e = c16223e.f31877e;
                if (c17985e != null) {
                    C18478e c18478e2 = c14434e.f28537e;
                    c18478e = c14434e.f28537e;
                    long m4560try = c18478e2.m4560try();
                    c18478e2.m4557this().billing();
                    try {
                        ((C18478e) ((C5389e) c18478e2.f36228e).f11540e).m4557this().smaato(c17985e);
                        ((C5389e) c18478e.f36228e).m1898this(intBitsToFloat, intBitsToFloat2);
                        try {
                            C17138e.metrica(c4017e, c16446e);
                        } finally {
                        }
                    } finally {
                        AbstractC0054e.m224this(c18478e2, m4560try);
                    }
                } else {
                    C18478e c18478e3 = c14434e.f28537e;
                    c18478e = c14434e.f28537e;
                    ((C5389e) c18478e3.f36228e).m1898this(intBitsToFloat, intBitsToFloat2);
                    try {
                        C17138e.metrica(c4017e, c16446e);
                    } finally {
                    }
                }
            }
        }
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eّْٝ */
    public final void mo228e() {
        this.f5147e.getClass();
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: e٘ٔ٘ */
    public final void mo229e() {
        AbstractC16425e.purchase(this, this.f5147e.f27003e);
        this.f5147e.getClass();
    }

    @Override // defpackage.InterfaceC0479e
    /* renamed from: for */
    public final void mo343for() {
        this.f5147e.appmetrica();
        AbstractC16425e.purchase(this, this.f5147e.f27003e);
    }

    @Override // defpackage.InterfaceC17303e
    public final InterfaceC17242e license(InterfaceC13158e interfaceC13158e, InterfaceC16719e interfaceC16719e, long j) {
        AbstractC2832e admob = interfaceC16719e.admob(j);
        return interfaceC13158e.ads(admob.f6806e, admob.f6804e, C9139e.f18290e, new C7314e(11, interfaceC13158e, this, admob));
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
