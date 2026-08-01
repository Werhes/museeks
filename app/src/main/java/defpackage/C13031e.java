package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘْؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13031e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C1902e f25953e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f25954e;

    public /* synthetic */ C13031e(C1902e c1902e, int i) {
        this.f25954e = i;
        this.f25953e = c1902e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v20, types: [eْٚ۟, eٔؔٗ, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f25954e) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C1902e c1902e = this.f25953e;
                boolean z = c1902e.f5063e;
                if (booleanValue) {
                    if (((C12713e) ((C18188e) ((InterfaceC13130e) AbstractC10432e.vip(c1902e, AbstractC11473e.smaato))).ad.getValue()).ad != 1) {
                        c1902e.f5077e.tapsense(false);
                    }
                    if (z) {
                        c1902e.m715e(false);
                    }
                } else {
                    c1902e.m710e();
                    C11388e c11388e = c1902e.f5067e;
                    C12380e c12380e = c11388e.ad;
                    InterfaceC12006e interfaceC12006e = c11388e.vip;
                    c12380e.vip.ad().admob();
                    C2573e c2573e = c12380e.vip;
                    c2573e.purchase(null);
                    c11388e.advert(c2573e);
                    C12380e.ad(c12380e, interfaceC12006e, true, 1);
                    c12380e.license(true);
                    c1902e.f5067e.ad();
                }
                AbstractC16425e.purchase(c1902e, new C10593e(c1902e, 1));
                return Unit.INSTANCE;
            case 1:
                AbstractC5679e.license(this.f25953e);
                return Unit.INSTANCE;
            case 2:
                ?? obj2 = new Object();
                C1902e c1902e2 = this.f25953e;
                c1902e2.f5072e.vip(obj2);
                c1902e2.f5066e = obj2;
                AbstractC5679e.license(c1902e2);
                return Unit.INSTANCE;
            case 3:
                C1902e c1902e3 = this.f25953e;
                C7102e c7102e = c1902e3.f5064e;
                long j = ((C2152e) obj).ad;
                InterfaceC0043e vip = c7102e.vip();
                if (vip != null && vip.billing()) {
                    j = vip.pro(j);
                }
                int license = c1902e3.f5064e.license(j, true);
                if (license >= 0) {
                    c1902e3.f5067e.adcel(AbstractC9262e.metrica(license, license));
                }
                c1902e3.f5077e.ads(EnumC12813e.f25633e, j);
                return Unit.INSTANCE;
            case 4:
                C1902e c1902e4 = this.f25953e;
                c1902e4.m714e();
                c1902e4.f5077e.license();
                AbstractC5679e.license(c1902e4);
                return Unit.INSTANCE;
            case 5:
                this.f25953e.m714e();
                return Unit.INSTANCE;
            case 6:
                C1902e c1902e5 = this.f25953e;
                AbstractC5336e.purchase(c1902e5.m3623e(), null, 4, new C7602e((EnumC1320e) obj, c1902e5, null, 27), 1);
                return Unit.INSTANCE;
            case 7:
                List list = (List) obj;
                C12476e metrica = this.f25953e.f5064e.metrica();
                return Boolean.valueOf(metrica != null ? list.add(metrica) : false);
            default:
                this.f25953e.f5077e.tapsense(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
        }
    }
}
