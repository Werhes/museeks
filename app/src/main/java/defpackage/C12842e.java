package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۣٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12842e extends AbstractC13616e implements InterfaceC17303e, InterfaceC17453e {

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public Function1 f25663e;

    public C12842e(Function1 function1) {
        this.f25663e = function1;
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int ad(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.appmetrica(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17453e
    public final void adcel(InterfaceC15671e interfaceC15671e) {
        boolean z;
        InterfaceC16154e interfaceC16154e;
        AbstractC17732e yandex = AbstractC5851e.yandex(this, 2);
        if (yandex.f34792e) {
            InterfaceC16154e interfaceC16154e2 = yandex.f34779e;
            z = yandex.f34795e;
            interfaceC16154e = interfaceC16154e2;
        } else {
            C10122e c10122e = AbstractC12546e.ad;
            if (c10122e == null) {
                AbstractC12546e.ad = new C10122e();
            } else {
                c10122e.ad();
            }
            C10122e c10122e2 = AbstractC12546e.ad;
            c10122e2.f20006e = yandex.f34782e.f27604e;
            c10122e2.f19998e = AbstractC8116e.startapp(yandex.f6803e);
            AbstractC13717e adcel = AbstractC12640e.adcel();
            Function1 appmetrica = adcel != null ? adcel.appmetrica() : null;
            AbstractC13717e smaato = AbstractC12640e.smaato(adcel);
            try {
                this.f25663e.invoke(c10122e2);
                Unit unit = Unit.INSTANCE;
                AbstractC12640e.Signature(adcel, smaato, appmetrica);
                interfaceC16154e = c10122e2.f20001e;
                z = c10122e2.f20002e;
            } catch (Throwable th) {
                AbstractC12640e.Signature(adcel, smaato, appmetrica);
                throw th;
            }
        }
        if (z) {
            AbstractC14594e.amazon(interfaceC15671e, interfaceC16154e);
        }
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int billing(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.billing(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17453e
    /* renamed from: break */
    public final /* synthetic */ boolean mo358break() {
        return false;
    }

    @Override // defpackage.InterfaceC17453e
    /* renamed from: eؒۖۗ */
    public final /* synthetic */ boolean mo359e() {
        return false;
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eؚؚؓ */
    public final boolean mo293e() {
        return false;
    }

    @Override // defpackage.InterfaceC17303e
    public final InterfaceC17242e license(InterfaceC13158e interfaceC13158e, InterfaceC16719e interfaceC16719e, long j) {
        AbstractC2832e admob = interfaceC16719e.admob(j);
        return interfaceC13158e.ads(admob.f6806e, admob.f6804e, C9139e.f18290e, new C5337e(admob, this, 7));
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int purchase(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.metrica(this, abstractC9292e, interfaceC16719e, i);
    }

    @Override // defpackage.InterfaceC17453e
    public final boolean smaato() {
        return false;
    }

    @Override // defpackage.InterfaceC17303e
    public final /* synthetic */ int startapp(AbstractC9292e abstractC9292e, InterfaceC16719e interfaceC16719e, int i) {
        return AbstractC0869e.startapp(this, abstractC9292e, interfaceC16719e, i);
    }

    public final String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.f25663e + ')';
    }
}
