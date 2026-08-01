package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٗؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C16784e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C4034e f32886e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f32887e;

    public /* synthetic */ C16784e(C4034e c4034e, int i) {
        this.f32887e = i;
        this.f32886e = c4034e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C14980e c14980e;
        C14980e c14980e2;
        switch (this.f32887e) {
            case 0:
                return new C6035e(15, this.f32886e);
            case 1:
                long longValue = ((Long) obj).longValue();
                C4034e c4034e = this.f32886e;
                if (c4034e.ad.ad().vip(longValue)) {
                    c4034e.startapp();
                    c4034e.advert(null);
                }
                return Unit.INSTANCE;
            case 2:
                long longValue2 = ((Long) obj).longValue();
                C4034e c4034e2 = this.f32886e;
                C9106e purchase = c4034e2.purchase();
                if (purchase != null && (c14980e2 = purchase.ad) != null && longValue2 == c14980e2.metrica) {
                    c4034e2.Signature.setValue(null);
                }
                C9106e purchase2 = c4034e2.purchase();
                if (purchase2 != null && (c14980e = purchase2.vip) != null && longValue2 == c14980e.metrica) {
                    c4034e2.admob.setValue(null);
                }
                if (c4034e2.ad.ad().vip(longValue2)) {
                    c4034e2.loadAd();
                }
                return Unit.INSTANCE;
            case 3:
                InterfaceC0043e interfaceC0043e = (InterfaceC0043e) obj;
                C4034e c4034e3 = this.f32886e;
                C0763e c0763e = (C0763e) c4034e3.adcel.getValue();
                if (c0763e == null) {
                    return null;
                }
                InterfaceC0043e interfaceC0043e2 = c4034e3.advert;
                if (interfaceC0043e2 != null) {
                    return AbstractC1561e.startapp(c0763e, interfaceC0043e2, interfaceC0043e);
                }
                AbstractC8889e.license("Required value was null.");
                throw new C14803e(9);
            case 4:
                InterfaceC0043e interfaceC0043e3 = (InterfaceC0043e) obj;
                C4034e c4034e4 = this.f32886e;
                c4034e4.advert = interfaceC0043e3;
                if (((Boolean) c4034e4.startapp.getValue()).booleanValue() && c4034e4.purchase() != null) {
                    C2152e c2152e = interfaceC0043e3 != null ? new C2152e(interfaceC0043e3.license(0L)) : null;
                    if (!AbstractC7890e.billing(c4034e4.mopub, c2152e)) {
                        c4034e4.mopub = c2152e;
                        c4034e4.smaato();
                        c4034e4.loadAd();
                    }
                }
                return Unit.INSTANCE;
            case 5:
                C4034e c4034e5 = this.f32886e;
                C0576e c0576e = c4034e5.startapp;
                EnumC16488e enumC16488e = (EnumC16488e) obj;
                if (!enumC16488e.ad() && ((Boolean) c0576e.getValue()).booleanValue()) {
                    c4034e5.startapp();
                }
                c0576e.setValue(Boolean.valueOf(enumC16488e.ad()));
                return Unit.INSTANCE;
            case 6:
                this.f32886e.mopub(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            case 7:
                this.f32886e.advert((C9106e) obj);
                return Unit.INSTANCE;
            default:
                long longValue3 = ((Long) obj).longValue();
                C4034e c4034e6 = this.f32886e;
                if (c4034e6.ad.ad().vip(longValue3)) {
                    c4034e6.smaato.setValue(Unit.INSTANCE);
                    c4034e6.smaato();
                    c4034e6.loadAd();
                }
                return Unit.INSTANCE;
        }
    }
}
