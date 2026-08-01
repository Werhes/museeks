package defpackage;

import java.nio.charset.Charset;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۚۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2080e extends AbstractC7185e implements Function5 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f5394e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final /* synthetic */ List f5395e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public /* synthetic */ C12025e f5396e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final /* synthetic */ C7145e f5397e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final /* synthetic */ Set f5398e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ InterfaceC13033e f5399e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ AbstractC16824e f5400e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2080e(C7145e c7145e, InterfaceC5083e interfaceC5083e, List list, Set set) {
        super(5, interfaceC5083e);
        this.f5398e = set;
        this.f5395e = list;
        this.f5397e = c7145e;
    }

    @Override // kotlin.jvm.functions.Function5
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        List list = this.f5395e;
        C2080e c2080e = new C2080e(this.f5397e, (InterfaceC5083e) obj5, list, this.f5398e);
        c2080e.f5400e = (AbstractC16824e) obj2;
        c2080e.f5399e = (InterfaceC13033e) obj3;
        c2080e.f5396e = (C12025e) obj4;
        return c2080e.loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        C1622e c1622e;
        AbstractC16824e abstractC16824e = this.f5400e;
        InterfaceC13033e interfaceC13033e = this.f5399e;
        C12025e c12025e = this.f5396e;
        int i = this.f5394e;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC2003e.purchase(obj);
            return obj;
        }
        AbstractC2003e.purchase(obj);
        String mo459e = abstractC16824e.ad().mo459e("Content-Type");
        if (mo459e != null) {
            C1622e c1622e2 = C1622e.f4539e;
            c1622e = AbstractC6227e.metrica(mo459e);
        } else {
            c1622e = null;
        }
        if (c1622e == null) {
            return null;
        }
        InterfaceC4393e interfaceC4393e = abstractC16824e.vip().f10751e;
        if (interfaceC4393e == null) {
            interfaceC4393e = null;
        }
        InterfaceC18107e ad = interfaceC4393e.ad();
        Charset charset = AbstractC5508e.ad;
        Charset appmetrica = AbstractC0250e.appmetrica(ad, charset);
        Charset charset2 = appmetrica == null ? charset : appmetrica;
        InterfaceC4393e interfaceC4393e2 = abstractC16824e.vip().f10751e;
        if (interfaceC4393e2 == null) {
            interfaceC4393e2 = null;
        }
        C6399e url = interfaceC4393e2.getUrl();
        this.f5400e = null;
        this.f5399e = null;
        this.f5396e = null;
        this.f5394e = 1;
        Object vip = AbstractC15641e.vip(this.f5398e, this.f5395e, url, c12025e, interfaceC13033e, c1622e, charset2, this);
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        return vip == enumC2821e ? enumC2821e : vip;
    }
}
