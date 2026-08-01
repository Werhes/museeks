package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؚ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7016e extends AbstractC13616e implements InterfaceC1683e, InterfaceC9629e, InterfaceC18105e, InterfaceC8501e, InterfaceC6459e, InterfaceC0479e {

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public C8419e f14360e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public final C16106e f14361e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public C4254e f14362e;

    public C7016e(C4254e c4254e) {
        C16106e c16106e = new C16106e();
        this.f14361e = c16106e;
        c16106e.metrica.startapp(0.0f);
        this.f14362e = c4254e;
    }

    @Override // defpackage.InterfaceC18105e
    public final void Signature(InterfaceC0043e interfaceC0043e) {
        AbstractC13717e adcel = AbstractC12640e.adcel();
        Function1 appmetrica = adcel != null ? adcel.appmetrica() : null;
        AbstractC13717e smaato = AbstractC12640e.smaato(adcel);
        try {
            if ((this.f14361e.vip() & 9223372034707292159L) == 9205357640488583168L) {
                m2264e(interfaceC0043e);
            }
            Unit unit = Unit.INSTANCE;
            AbstractC12640e.Signature(adcel, smaato, appmetrica);
        } catch (Throwable th) {
            AbstractC12640e.Signature(adcel, smaato, appmetrica);
            throw th;
        }
    }

    @Override // defpackage.InterfaceC6459e
    public final Object admob() {
        return EnumC1177e.f3779e;
    }

    @Override // defpackage.InterfaceC8501e
    /* renamed from: case */
    public final /* bridge */ void mo292case() {
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eَؑۨ */
    public final void mo338e() {
        C16106e c16106e = this.f14361e;
        AbstractC0054e.m220goto(9205357640488583168L, c16106e.ad);
        c16106e.vip.setValue(new C2108e(9205357640488583168L));
        c16106e.billing = false;
    }

    /* renamed from: eؒٚۨ, reason: contains not printable characters */
    public final void m2264e(InterfaceC0043e interfaceC0043e) {
        if (this.f27016e) {
            long Signature = interfaceC0043e.Signature(0L);
            C16106e c16106e = this.f14361e;
            c16106e.ad.setValue(new C2152e(Signature));
            c16106e.vip.setValue(new C2108e(AbstractC8116e.startapp(interfaceC0043e.advert())));
            c16106e.license = ((View) AbstractC10432e.vip(this, AbstractC2676e.purchase)).getWindowId();
        }
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eؚؚؓ */
    public final boolean mo293e() {
        return false;
    }

    @Override // defpackage.InterfaceC8501e
    /* renamed from: eُؚٕ */
    public final void mo294e(C4017e c4017e) {
        C16106e c16106e = this.f14361e;
        try {
            c16106e.billing = true;
            if (this.f27016e) {
                if (AbstractC1561e.appmetrica(C2108e.appmetrica(c4017e.f8940e.f28537e.m4560try())) >= 1) {
                    InterfaceC2661e interfaceC2661e = (InterfaceC2661e) AbstractC10432e.vip(this, AbstractC11473e.billing);
                    C16446e ad = c16106e.ad();
                    if (ad != null) {
                        if (ad.remoteconfig) {
                            ad = null;
                        }
                        if (ad != null) {
                            c4017e.remoteconfig(AbstractC8116e.yandex(c4017e.yandex()), ad, new C17928e(c4017e, ad));
                            C17138e.metrica(c4017e, ad);
                        }
                    }
                    ad = interfaceC2661e.metrica();
                    c16106e.purchase.setValue(ad);
                    c4017e.remoteconfig(AbstractC8116e.yandex(c4017e.yandex()), ad, new C17928e(c4017e, ad));
                    C17138e.metrica(c4017e, ad);
                } else {
                    AbstractC12662e.metrica(c4017e);
                }
            }
            c16106e.billing = false;
            m2265e();
        } catch (Throwable th) {
            c16106e.billing = false;
            m2265e();
            throw th;
        }
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: eّْٝ */
    public final void mo228e() {
        C16106e c16106e = this.f14361e;
        AbstractC0054e.m220goto(9205357640488583168L, c16106e.ad);
        c16106e.vip.setValue(new C2108e(9205357640488583168L));
        c16106e.billing = false;
        C16446e ad = c16106e.ad();
        if (ad != null) {
            ((InterfaceC2661e) AbstractC10432e.vip(this, AbstractC11473e.billing)).ad(ad);
        }
        c16106e.purchase.setValue(null);
        this.f14362e.ad.remove(c16106e);
    }

    /* renamed from: eٌٔٗ, reason: contains not printable characters */
    public final C8419e m2265e() {
        return AbstractC5336e.purchase(m3623e(), null, 0, new C16600e(this, null, 8), 3);
    }

    @Override // defpackage.AbstractC13616e
    /* renamed from: e٘ٔ٘ */
    public final void mo229e() {
        InterfaceC5083e interfaceC5083e;
        AbstractActivityC15824e abstractActivityC15824e;
        this.f14362e.ad.add(this.f14361e);
        Context context = (Context) AbstractC10432e.vip(this, AbstractC2676e.vip);
        while (true) {
            interfaceC5083e = null;
            if (!(context instanceof AbstractActivityC15824e)) {
                if (!(context instanceof ContextWrapper)) {
                    abstractActivityC15824e = null;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            } else {
                abstractActivityC15824e = (AbstractActivityC15824e) context;
                break;
            }
        }
        if (abstractActivityC15824e != null) {
            AbstractC5336e.purchase(m3623e(), null, 0, new C6626e(abstractActivityC15824e, this, interfaceC5083e, 19), 3);
        }
        mo343for();
    }

    @Override // defpackage.InterfaceC0479e
    /* renamed from: for */
    public final void mo343for() {
        AbstractC16425e.purchase(this, new C12851e(1, this));
    }

    @Override // defpackage.InterfaceC12415e
    public final /* bridge */ void signatures(long j) {
    }

    @Override // defpackage.InterfaceC9629e
    /* renamed from: try */
    public final void mo721try(InterfaceC0043e interfaceC0043e) {
        m2264e(interfaceC0043e);
    }
}
