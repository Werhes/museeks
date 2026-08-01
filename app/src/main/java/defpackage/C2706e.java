package defpackage;

import java.nio.charset.Charset;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔٛۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2706e extends AbstractC7185e implements Function3 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public /* synthetic */ C10263e f6578e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ Charset f6579e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ String f6580e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public /* synthetic */ Object f6581e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2706e(String str, Charset charset, InterfaceC5083e interfaceC5083e) {
        super(3, interfaceC5083e);
        this.f6580e = str;
        this.f6579e = charset;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C2706e c2706e = new C2706e(this.f6580e, this.f6579e, (InterfaceC5083e) obj3);
        c2706e.f6578e = (C10263e) obj;
        c2706e.f6581e = obj2;
        return c2706e.loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        C1622e vip;
        Charset charset;
        C10263e c10263e = this.f6578e;
        Object obj2 = this.f6581e;
        AbstractC2003e.purchase(obj);
        InterfaceC4911e interfaceC4911e = AbstractC0245e.ad;
        String str = this.f6580e;
        if (str != null && c10263e.metrica.m4623e("Accept-Charset") == null) {
            InterfaceC4911e interfaceC4911e2 = AbstractC0245e.ad;
            StringBuilder applovin = AbstractC8703e.applovin("Adding Accept-Charset=", str, " to ");
            applovin.append(c10263e.ad);
            interfaceC4911e2.amazon(applovin.toString());
            c10263e.metrica.m4622e("Accept-Charset", str);
        }
        if (!(obj2 instanceof String) || ((vip = AbstractC17419e.vip(c10263e)) != null && !AbstractC7890e.billing(vip.f4541e, AbstractC17135e.vip.f4541e))) {
            return null;
        }
        String str2 = (String) obj2;
        C1622e c1622e = vip == null ? AbstractC17135e.vip : vip;
        if (vip == null || (charset = AbstractC9757e.ad(vip)) == null) {
            charset = this.f6579e;
        }
        AbstractC0245e.ad.amazon("Sending request body to " + c10263e.ad + " as text/plain with charset " + charset);
        int i = AbstractC9757e.ad;
        return new C12171e(str2, c1622e.m657e(charset.name()), null);
    }
}
