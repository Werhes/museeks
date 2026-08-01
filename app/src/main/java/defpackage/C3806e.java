package defpackage;

import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖؐۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3806e extends AbstractC7185e implements Function5 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f8420e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public /* synthetic */ C12025e f8421e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Charset f8422e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ InterfaceC13033e f8423e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ AbstractC16824e f8424e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3806e(Charset charset, InterfaceC5083e interfaceC5083e) {
        super(5, interfaceC5083e);
        this.f8422e = charset;
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        C3806e c3806e = new C3806e(this.f8422e, (InterfaceC5083e) obj5);
        c3806e.f8424e = (AbstractC16824e) obj2;
        c3806e.f8423e = (InterfaceC13033e) obj3;
        c3806e.f8421e = (C12025e) obj4;
        return c3806e.loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        C1622e c1622e;
        AbstractC16824e abstractC16824e = this.f8424e;
        InterfaceC13033e interfaceC13033e = this.f8423e;
        C12025e c12025e = this.f8421e;
        int i = this.f8420e;
        if (i == 0) {
            AbstractC2003e.purchase(obj);
            if (!AbstractC7890e.billing(c12025e.ad, AbstractC3820e.ad.vip(String.class))) {
                return null;
            }
            this.f8424e = abstractC16824e;
            this.f8423e = null;
            this.f8421e = null;
            this.f8420e = 1;
            obj = AbstractC11263e.tapsense(interfaceC13033e, this);
            EnumC2821e enumC2821e = EnumC2821e.f6782e;
            if (obj == enumC2821e) {
                return enumC2821e;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2003e.purchase(obj);
        }
        InterfaceC17430e interfaceC17430e = (InterfaceC17430e) obj;
        C5042e vip = abstractC16824e.vip();
        InterfaceC4911e interfaceC4911e = AbstractC0245e.ad;
        AbstractC16824e abstractC16824e2 = vip.f10750e;
        if (abstractC16824e2 == null) {
            abstractC16824e2 = null;
        }
        String mo459e = abstractC16824e2.ad().mo459e("Content-Type");
        if (mo459e != null) {
            C1622e c1622e2 = C1622e.f4539e;
            c1622e = AbstractC6227e.metrica(mo459e);
        } else {
            c1622e = null;
        }
        Charset ad = c1622e != null ? AbstractC9757e.ad(c1622e) : null;
        if (ad == null) {
            ad = this.f8422e;
        }
        InterfaceC4911e interfaceC4911e2 = AbstractC0245e.ad;
        StringBuilder sb = new StringBuilder("Reading response body for ");
        InterfaceC4393e interfaceC4393e = vip.f10751e;
        sb.append((interfaceC4393e != null ? interfaceC4393e : null).getUrl());
        sb.append(" as String with charset ");
        sb.append(ad);
        interfaceC4911e2.amazon(sb.toString());
        return AbstractC1266e.license(interfaceC17430e, ad, 2);
    }
}
