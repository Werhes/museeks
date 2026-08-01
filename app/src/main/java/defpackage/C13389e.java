package defpackage;

import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٝۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13389e implements InterfaceC7860e, InterfaceC7224e {
    public final /* synthetic */ InterfaceC7224e ad;
    public final C14826e appmetrica;
    public final C9140e license;
    public final C7460e metrica;
    public final C7988e purchase;
    public final Function0 vip;

    /* JADX WARN: Multi-variable type inference failed */
    public C13389e(Function0 function0, Function1 function1, Function1 function12, InterfaceC7224e interfaceC7224e) {
        this.ad = interfaceC7224e;
        this.vip = function0;
        this.metrica = (C7460e) function1;
        C16722e metrica = interfaceC7224e.metrica();
        InterfaceC13984e ad = AbstractC3820e.ad(C9140e.class);
        InterfaceC4095e interfaceC4095e = (InterfaceC4095e) ((HashMap) metrica.f32780e).get(ad);
        if (interfaceC4095e == null) {
            interfaceC4095e = new C9140e();
            metrica.isVip(ad, interfaceC4095e);
        }
        this.license = (C9140e) interfaceC4095e;
        this.appmetrica = AbstractC8461e.license(this);
        InterfaceC10540e vip = interfaceC7224e.vip();
        vip.smaato(new C11898e(vip, this, 2));
        this.purchase = new C7988e(14);
    }

    @Override // defpackage.InterfaceC7860e
    public final void ad(InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        c13770e.m3671package(128163128);
        int i2 = (c13770e.yandex(this) ? 32 : 16) | i;
        if (c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            C9140e c9140e = this.license;
            InterfaceC3314e vip = AbstractC3265e.vip(c9140e.metrica, c13770e, 0);
            InterfaceC3314e vip2 = AbstractC3265e.vip(c9140e.appmetrica, c13770e, 0);
            C4993e ad = AbstractC9735e.ad(0, 3, c13770e);
            Object m3681throw = c13770e.m3681throw();
            Object obj = C2987e.ad;
            if (m3681throw == obj) {
                C6260e c6260e = C6260e.vip;
                m3681throw = C11080e.ad;
                c13770e.m3682throws(m3681throw);
            }
            ((C11080e) m3681throw).getClass();
            C6260e c6260e2 = new C6260e();
            C6260e c6260e3 = new C6260e();
            C15492e c15492e = AbstractC10577e.ad;
            boolean purchase = c13770e.purchase(c6260e2) | c13770e.yandex(this);
            Object m3681throw2 = c13770e.m3681throw();
            if (purchase || m3681throw2 == obj) {
                m3681throw2 = new C13942e(c6260e2, this, 2);
                c13770e.m3682throws(m3681throw2);
            }
            AbstractC1101e.ad(c15492e.ad((Function1) m3681throw2), AbstractC16653e.license(975245432, new C15044e(interfaceC12864e, this, vip, c6260e2, c6260e3, ad, vip2), c13770e), c13770e, 56);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C2173e(this, interfaceC12864e, i, 17);
        }
    }

    @Override // defpackage.InterfaceC7224e
    public final InterfaceC1722e appmetrica() {
        return this.ad.appmetrica();
    }

    @Override // defpackage.InterfaceC7224e
    public final C13391e license() {
        return this.ad.license();
    }

    @Override // defpackage.InterfaceC7224e
    public final C16722e metrica() {
        return this.ad.metrica();
    }

    @Override // defpackage.InterfaceC7224e
    public final C15723e purchase() {
        return this.ad.purchase();
    }

    @Override // defpackage.InterfaceC7224e
    public final InterfaceC10540e vip() {
        return this.ad.vip();
    }
}
