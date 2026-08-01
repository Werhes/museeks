package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓؒۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1546e extends AbstractC16858e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC2832e f4418e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f4419e = 0;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ C0404e f4420e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1546e(C0404e c0404e, AbstractC2832e abstractC2832e) {
        super(1);
        this.f4420e = c0404e;
        this.f4418e = abstractC2832e;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1546e(AbstractC2832e abstractC2832e, C0404e c0404e) {
        super(1);
        this.f4418e = abstractC2832e;
        this.f4420e = c0404e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        char c;
        long j;
        C0763e c0763e;
        long j2;
        InterfaceC0043e license;
        long mo210native;
        switch (this.f4419e) {
            case 0:
                AbstractC3698e abstractC3698e = (AbstractC3698e) obj;
                C0404e c0404e = this.f4420e;
                c0404e.f2446e = true;
                C2152e c2152e = null;
                c0404e.f2445e = null;
                AbstractC14049e pro = c0404e.f2444e.appmetrica().metrica.pro();
                boolean yandex = c0404e.f2444e.yandex();
                AbstractC2832e abstractC2832e = this.f4418e;
                if (!yandex) {
                    abstractC3698e.billing(abstractC2832e, 0, 0, 0.0f);
                } else if (pro.license()) {
                    C11106e appmetrica = pro.appmetrica();
                    if (appmetrica == null) {
                        throw new IllegalArgumentException(("Match State is configured, but target data is null. State = " + pro).toString());
                    }
                    C0763e metrica = pro.metrica();
                    if (metrica == null) {
                        throw new IllegalArgumentException(("Match State is configured, but current bounds is null. State = " + pro).toString());
                    }
                    if (c0404e.f2444e.appmetrica().vip.vip()) {
                        InterfaceC0043e license2 = abstractC3698e.license();
                        if (license2 == null) {
                            abstractC3698e.billing(abstractC2832e, 0, 0, 0.0f);
                        } else {
                            boolean vip = c0404e.f2444e.appmetrica().metrica.pro().vip();
                            long mo207class = c0404e.m339e().mo207class(license2, 0L);
                            AbstractC6494e.mopub(appmetrica);
                            if (vip) {
                                c = ' ';
                                j = 4294967295L;
                                c0404e.f2444e.license().ad(metrica, AbstractC6494e.mopub(appmetrica), null);
                            } else {
                                j = 4294967295L;
                                c = ' ';
                                c0404e.f2444e.license().ad(metrica, AbstractC6494e.mopub(appmetrica), new C1581e(0));
                            }
                            C0763e metrica2 = c0404e.f2444e.license().metrica();
                            if (metrica2 != null) {
                                c0763e = metrica2;
                                c2152e = new C2152e(C2152e.startapp(C2152e.yandex(metrica2.yandex(), ((C2152e) ((C0576e) appmetrica.f22007e).getValue()).ad), ((C2152e) ((C0576e) appmetrica.f22006e).getValue()).ad));
                            } else {
                                c0763e = metrica2;
                            }
                            if (c0404e.f2444e.license().vip() || !vip) {
                                long j3 = c2152e != null ? c2152e.ad : mo207class;
                                c0404e.f2444e.appmetrica().metrica.pro().startapp(c2152e == null ? AbstractC18489e.billing(mo207class, AbstractC8116e.startapp(license2.advert())) : AbstractC18489e.billing(c2152e.ad, c0763e.billing()));
                                j2 = j3;
                            } else {
                                j2 = c2152e != null ? c2152e.ad : metrica.yandex();
                            }
                            long yandex2 = C2152e.yandex(j2, mo207class);
                            abstractC3698e.billing(abstractC2832e, Math.round(Float.intBitsToFloat((int) (yandex2 >> c))), Math.round(Float.intBitsToFloat((int) (yandex2 & j))), 0.0f);
                        }
                    } else if (c0404e.f2444e.license().vip()) {
                        abstractC3698e.billing(abstractC2832e, 0, 0, 0.0f);
                    } else {
                        InterfaceC0043e license3 = abstractC3698e.license();
                        long purchase = license3 != null ? AbstractC17324e.purchase(C2152e.yandex(metrica.yandex(), c0404e.m339e().mo207class(license3, 0L))) : 0L;
                        abstractC3698e.billing(abstractC2832e, (int) (purchase >> 32), (int) (purchase & 4294967295L), 0.0f);
                    }
                } else {
                    abstractC3698e.billing(abstractC2832e, 0, 0, 0.0f);
                }
                return Unit.INSTANCE;
            default:
                AbstractC3698e abstractC3698e2 = (AbstractC3698e) obj;
                abstractC3698e2.billing(this.f4418e, 0, 0, 0.0f);
                C0404e c0404e2 = this.f4420e;
                C7589e appmetrica2 = c0404e2.f2444e.appmetrica();
                C16223e c16223e = c0404e2.f2444e;
                C11224e c11224e = appmetrica2.metrica;
                c11224e.tapsense();
                if (!AbstractC7890e.billing(c11224e.pro(), C4471e.ad) && c16223e.yandex()) {
                    AbstractC14049e pro2 = c11224e.pro();
                    if (c16223e.license().vip() && pro2.vip() && (license = abstractC3698e2.license()) != null) {
                        long startapp = AbstractC8116e.startapp(license.advert());
                        C13610e c13610e = c16223e.appmetrica().vip;
                        InterfaceC0043e interfaceC0043e = c16223e.appmetrica().vip.f27006e;
                        if (interfaceC0043e == null) {
                            throw new IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                        }
                        long metrica3 = c13610e.f27004e.metrica(interfaceC0043e, license);
                        C13610e c13610e2 = c16223e.appmetrica().vip;
                        InterfaceC0043e interfaceC0043e2 = c16223e.appmetrica().vip.f27006e;
                        if (interfaceC0043e2 == null) {
                            throw new IllegalArgumentException("Error: Uninitialized LayoutCoordinates. Please make sure when using the SharedTransitionScope composable function, the modifier passed to the child content is being used, or use SharedTransitionLayout instead.");
                        }
                        mo210native = interfaceC0043e2.mo210native(license, 0L, (r4 & 4) != 0);
                        ((C0576e) c11224e.appmetrica).setValue(c11224e.pro().ad((C7589e) c11224e.license, (C0404e) c11224e.billing, startapp, metrica3, mo210native));
                    }
                }
                return Unit.INSTANCE;
        }
    }
}
