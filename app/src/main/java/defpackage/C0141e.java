package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؑ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0141e implements Function1 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f1367e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f1368e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f1369e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f1370e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f1371e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f1372e;

    public /* synthetic */ C0141e(int i, Object obj, Object obj2, Object obj3, Object obj4, boolean z) {
        this.f1371e = i;
        this.f1368e = obj;
        this.f1370e = obj2;
        this.f1369e = z;
        this.f1367e = obj3;
        this.f1372e = obj4;
    }

    public /* synthetic */ C0141e(boolean z, C0351e c0351e, InterfaceC3314e interfaceC3314e, C11117e c11117e, C11117e c11117e2) {
        this.f1371e = 0;
        this.f1369e = z;
        this.f1368e = c0351e;
        this.f1370e = interfaceC3314e;
        this.f1367e = c11117e;
        this.f1372e = c11117e2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f1371e) {
            case 0:
                C0576e c0576e = ((C0351e) this.f1368e).metrica;
                InterfaceC3314e interfaceC3314e = (InterfaceC3314e) this.f1370e;
                InterfaceC16132e interfaceC16132e = (InterfaceC16132e) this.f1367e;
                InterfaceC16132e interfaceC16132e2 = (InterfaceC16132e) this.f1372e;
                C10122e c10122e = (C10122e) obj;
                boolean z = this.f1369e;
                float f = 0.8f;
                float f2 = 1.0f;
                c10122e.advert(!z ? ((Number) interfaceC16132e.getValue()).floatValue() : ((Boolean) c0576e.getValue()).booleanValue() ? 1.0f : 0.8f);
                if (!z) {
                    f = ((Number) interfaceC16132e.getValue()).floatValue();
                } else if (((Boolean) c0576e.getValue()).booleanValue()) {
                    f = 1.0f;
                }
                c10122e.smaato(f);
                if (!z) {
                    f2 = ((Number) interfaceC16132e2.getValue()).floatValue();
                } else if (!((Boolean) c0576e.getValue()).booleanValue()) {
                    f2 = 0.0f;
                }
                c10122e.metrica(f2);
                c10122e.admob(((C13220e) interfaceC3314e.getValue()).ad);
                return Unit.INSTANCE;
            case 1:
                C7911e c7911e = (C7911e) this.f1368e;
                C6260e c6260e = (C6260e) this.f1370e;
                C15860e c15860e = (C15860e) this.f1367e;
                InterfaceC6256e interfaceC6256e = (InterfaceC6256e) this.f1372e;
                C2152e c2152e = (C2152e) obj;
                if (c7911e.vip()) {
                    InterfaceC3965e interfaceC3965e = c7911e.metrica;
                    if (interfaceC3965e != null) {
                        ((C3112e) interfaceC3965e).vip();
                    }
                } else {
                    C6260e.vip(c6260e);
                }
                if (c7911e.vip() && this.f1369e) {
                    if (c7911e.ad() != EnumC13262e.f26309e) {
                        C0866e license = c7911e.license();
                        if (license != null) {
                            long j = c2152e.ad;
                            C16911e c16911e = c7911e.license;
                            C11840e c11840e = c7911e.tapsense;
                            int license2 = interfaceC6256e.license(license.vip(j, true));
                            c11840e.invoke(C0398e.ad((C0398e) c16911e.f33137e, null, AbstractC9262e.metrica(license2, license2), 5));
                            if (c7911e.ad.ad.f20850e.length() > 0) {
                                c7911e.mopub.setValue(EnumC13262e.f26308e);
                            }
                        }
                    } else {
                        c15860e.billing(c2152e);
                    }
                }
                return Unit.INSTANCE;
            default:
                C7142e c7142e = (C7142e) this.f1368e;
                C7765e c7765e = (C7765e) this.f1370e;
                EnumC12813e enumC12813e = (EnumC12813e) this.f1367e;
                C7142e c7142e2 = (C7142e) this.f1372e;
                long ad = AbstractC1163e.ad(c7765e.loadAd(this.f1369e));
                c7142e.f14622e = ad;
                c7765e.ads(enumC12813e, ad);
                c7142e2.f14622e = 0L;
                c7765e.isVip = -1;
                return Unit.INSTANCE;
        }
    }
}
