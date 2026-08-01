package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٜ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7303e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f14918e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f14919e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f14920e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f14921e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f14922e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ Object f14923e;

    public /* synthetic */ C7303e(C6540e c6540e, InterfaceC3314e interfaceC3314e, InterfaceC12864e interfaceC12864e, C2892e c2892e, int i) {
        this.f14922e = 2;
        this.f14919e = c6540e;
        this.f14918e = interfaceC3314e;
        this.f14921e = interfaceC12864e;
        this.f14923e = c2892e;
        this.f14920e = i;
    }

    public /* synthetic */ C7303e(C11188e c11188e, String str, int i, Function0 function0, Function2 function2, int i2) {
        this.f14922e = 10;
        this.f14919e = c11188e;
        this.f14921e = str;
        this.f14920e = i;
        this.f14918e = function0;
        this.f14923e = function2;
    }

    public /* synthetic */ C7303e(C13621e c13621e, int i, C16875e c16875e, InterfaceC3314e interfaceC3314e, InterfaceC18435e interfaceC18435e) {
        this.f14922e = 0;
        this.f14919e = c13621e;
        this.f14920e = i;
        this.f14921e = c16875e;
        this.f14918e = interfaceC3314e;
        this.f14923e = interfaceC18435e;
    }

    public /* synthetic */ C7303e(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.f14922e = i2;
        this.f14919e = obj;
        this.f14921e = obj2;
        this.f14918e = obj3;
        this.f14923e = obj4;
        this.f14920e = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C13770e c13770e;
        boolean z;
        C13770e c13770e2;
        int i;
        boolean z2;
        C13770e c13770e3;
        int i2 = this.f14922e;
        Object obj3 = this.f14921e;
        int i3 = this.f14920e;
        Object obj4 = this.f14923e;
        Object obj5 = this.f14918e;
        Object obj6 = this.f14919e;
        switch (i2) {
            case 0:
                final C13621e c13621e = (C13621e) obj6;
                C2038e c2038e = c13621e.ad;
                final C16875e c16875e = (C16875e) obj3;
                final InterfaceC3314e interfaceC3314e = (InterfaceC3314e) obj5;
                final InterfaceC18435e interfaceC18435e = (InterfaceC18435e) obj4;
                C13770e c13770e4 = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                int i4 = 0;
                if (c13770e4.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    C7913e c7913e = AbstractC18007e.metrica;
                    InterfaceC2747e license = AbstractC17074e.license(C5438e.f11676e, false);
                    long j = c13770e4.f27286case;
                    int i5 = (int) (j ^ (j >>> 32));
                    InterfaceC3483e advert = c13770e4.advert();
                    InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e4, c7913e);
                    InterfaceC5685e.mopub.getClass();
                    C7309e c7309e = C2721e.vip;
                    c13770e4.m3666import();
                    if (c13770e4.f27292implements) {
                        c13770e4.mopub(c7309e);
                    } else {
                        c13770e4.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e4, license, C2721e.billing);
                    AbstractC2270e.yandex(c13770e4, advert, C2721e.purchase);
                    AbstractC2270e.yandex(c13770e4, Integer.valueOf(i5), C2721e.adcel);
                    AbstractC2270e.purchase(c13770e4, C2721e.mopub);
                    AbstractC2270e.yandex(c13770e4, purchase, C2721e.license);
                    if (((C10876e) interfaceC3314e.getValue()).f21544e) {
                        c13770e4.m3676strictfp(1248124070);
                        AbstractC5960e.purchase((C10983e) ((C0576e) c2038e.Signature.f23070e).getValue(), c13770e4, 0);
                        if (AbstractC15211e.metrica(c13770e4)) {
                            z2 = false;
                            c13770e4.m3676strictfp(1237759096);
                            c13770e3 = c13770e4;
                        } else {
                            c13770e4.m3676strictfp(1248266701);
                            z2 = false;
                            AbstractC12640e.license(c13621e.amazon() == EnumC10483e.f20707e, c7913e, AbstractC4533e.billing(i3, false), AbstractC4533e.yandex(i3, true), null, AbstractC16653e.license(-2084959876, new C8937e(interfaceC3314e, c13621e, i4), c13770e4), c13770e4, 196656, 16);
                            c13770e3 = c13770e4;
                        }
                        c13770e3.Signature(z2);
                        c13770e3.Signature(z2);
                        i = z2;
                        c13770e2 = c13770e3;
                    } else {
                        boolean z3 = false;
                        c13770e4.m3676strictfp(1250246330);
                        int ordinal = ((C10876e) interfaceC3314e.getValue()).f21545e.ordinal();
                        if (ordinal != 0) {
                            C5100e c5100e = AbstractC10432e.ad;
                            if (ordinal != 1) {
                                InterfaceC5083e interfaceC5083e = null;
                                if (ordinal != 2) {
                                    int i6 = 3;
                                    C5170e c5170e = C2987e.ad;
                                    if (ordinal == 3) {
                                        c13770e4.m3676strictfp(1252031806);
                                        Object m3681throw = c13770e4.m3681throw();
                                        Object obj7 = m3681throw;
                                        if (m3681throw == c5170e) {
                                            C0576e startapp = AbstractC14533e.startapp(null);
                                            c13770e4.m3682throws(startapp);
                                            obj7 = startapp;
                                        }
                                        InterfaceC3314e interfaceC3314e2 = (InterfaceC3314e) obj7;
                                        C14314e c14314e = (C14314e) interfaceC3314e2.getValue();
                                        C16875e mopub = c2038e.mopub();
                                        boolean yandex = c13770e4.yandex(c13621e);
                                        Object m3681throw2 = c13770e4.m3681throw();
                                        Object obj8 = m3681throw2;
                                        if (yandex || m3681throw2 == c5170e) {
                                            C6659e c6659e = new C6659e(c13621e, interfaceC3314e2, interfaceC5083e, z3 ? 1 : 0);
                                            c13770e4.m3682throws(c6659e);
                                            obj8 = c6659e;
                                        }
                                        AbstractC17680e.appmetrica(c14314e, mopub, (Function2) obj8, c13770e4);
                                        C14314e c14314e2 = (C14314e) interfaceC3314e2.getValue();
                                        C10983e c10983e = (C10983e) ((C0576e) c2038e.Signature.f23070e).getValue();
                                        boolean yandex2 = c13770e4.yandex(c13621e);
                                        Object m3681throw3 = c13770e4.m3681throw();
                                        Object obj9 = m3681throw3;
                                        if (yandex2 || m3681throw3 == c5170e) {
                                            C6659e c6659e2 = new C6659e(c13621e, interfaceC3314e2, interfaceC5083e, 1);
                                            c13770e4.m3682throws(c6659e2);
                                            obj9 = c6659e2;
                                        }
                                        AbstractC17680e.appmetrica(c14314e2, c10983e, (Function2) obj9, c13770e4);
                                        InterfaceC12864e metrica = AbstractC16136e.metrica(c7913e, C3618e.vip(0.3f, C3618e.vip), c5100e);
                                        boolean yandex3 = c13770e4.yandex(c13621e);
                                        Object m3681throw4 = c13770e4.m3681throw();
                                        Object obj10 = m3681throw4;
                                        if (yandex3 || m3681throw4 == c5170e) {
                                            C12439e c12439e = new C12439e(c13621e, interfaceC3314e2, 1);
                                            c13770e4.m3682throws(c12439e);
                                            obj10 = c12439e;
                                        }
                                        Function1 function1 = (Function1) obj10;
                                        Object m3681throw5 = c13770e4.m3681throw();
                                        Object obj11 = m3681throw5;
                                        if (m3681throw5 == c5170e) {
                                            C9214e c9214e = new C9214e(interfaceC3314e2, 0);
                                            c13770e4.m3682throws(c9214e);
                                            obj11 = c9214e;
                                        }
                                        Function1 function12 = (Function1) obj11;
                                        Object m3681throw6 = c13770e4.m3681throw();
                                        Object obj12 = m3681throw6;
                                        if (m3681throw6 == c5170e) {
                                            C14099e c14099e = new C14099e(2);
                                            c13770e4.m3682throws(c14099e);
                                            obj12 = c14099e;
                                        }
                                        AbstractC9464e.vip(function1, metrica, function12, (Function1) obj12, c13770e4, 27696, 4);
                                        C13770e c13770e5 = c13770e4;
                                        c13770e5.Signature(false);
                                        Unit unit = Unit.INSTANCE;
                                        z = false;
                                        c13770e = c13770e5;
                                    } else {
                                        if (ordinal != 4) {
                                            throw AbstractC1786e.loadAd(1425804512, c13770e4, false);
                                        }
                                        c13770e4.m3676strictfp(1253904578);
                                        Object m3681throw7 = c13770e4.m3681throw();
                                        Object obj13 = m3681throw7;
                                        if (m3681throw7 == c5170e) {
                                            C14099e c14099e2 = new C14099e(i6);
                                            c13770e4.m3682throws(c14099e2);
                                            obj13 = c14099e2;
                                        }
                                        Function1 function13 = (Function1) obj13;
                                        boolean yandex4 = c13770e4.yandex(c13621e);
                                        Object m3681throw8 = c13770e4.m3681throw();
                                        Object obj14 = m3681throw8;
                                        if (yandex4 || m3681throw8 == c5170e) {
                                            C3306e c3306e = new C3306e(c13621e, z3 ? 1 : 0);
                                            c13770e4.m3682throws(c3306e);
                                            obj14 = c3306e;
                                        }
                                        AbstractC9464e.ad(function13, c7913e, (Function1) obj14, c13770e4, 54);
                                        c13770e4.Signature(false);
                                        Unit unit2 = Unit.INSTANCE;
                                        z = z3;
                                        c13770e = c13770e4;
                                    }
                                } else {
                                    c13770e4.m3676strictfp(1250842584);
                                    AbstractC9180e.vip(new C3618e(((C3618e) ((C0576e) c2038e.Signature.f23071e).getValue()).ad), null, AbstractC12696e.yandex(750, 6, null), BuildConfig.FLAVOR, AbstractC17864e.ad, c13770e4, 28032, 2);
                                    z = false;
                                    c13770e4.Signature(false);
                                    Unit unit3 = Unit.INSTANCE;
                                    c13770e = c13770e4;
                                }
                            } else {
                                c13770e4.m3676strictfp(1250463361);
                                AbstractC17074e.ad(AbstractC16136e.metrica(c7913e, ((C7019e) c13770e4.adcel(AbstractC11785e.ad)).ad.amazon, c5100e), c13770e4, 0);
                                c13770e4.Signature(false);
                                Unit unit4 = Unit.INSTANCE;
                                z = z3;
                                c13770e = c13770e4;
                            }
                        } else {
                            c13770e4.m3676strictfp(1250259226);
                            AbstractC5960e.purchase((C10983e) ((C0576e) c2038e.Signature.f23070e).getValue(), c13770e4, 0);
                            c13770e4.Signature(false);
                            Unit unit5 = Unit.INSTANCE;
                            z = z3;
                            c13770e = c13770e4;
                        }
                        c13770e.Signature(z);
                        i = z;
                        c13770e2 = c13770e;
                    }
                    final boolean metrica2 = AbstractC15211e.metrica(c13770e2);
                    c16875e.getClass();
                    int i7 = 0;
                    AbstractC8228e.ad(c13621e.amazon(), AbstractC16653e.license(-161109836, new C5270e(2, c16875e, c13621e, interfaceC3314e), c13770e2), AbstractC16653e.license(-82988747, new Function4() { // from class: eٌؙٞ
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj15, Object obj16, Object obj17, Object obj18) {
                            C13610e c13610e = (C13610e) obj15;
                            InterfaceC6340e interfaceC6340e = (InterfaceC6340e) obj16;
                            C13770e c13770e6 = (C13770e) obj17;
                            ((Integer) obj18).getClass();
                            C16875e c16875e2 = C16875e.this;
                            String str = c16875e2.ad.ad;
                            C13621e c13621e2 = c13621e;
                            C2038e c2038e2 = c13621e2.ad;
                            InterfaceC2558e interfaceC2558e = (InterfaceC2558e) c2038e2.subscription.appmetrica.getValue();
                            C12805e c12805e = c2038e2.subscription;
                            C12781e c12781e = new C12781e(0, 0, C12805e.class, c12805e, "currentPlayingLine", "getCurrentPlayingLine()I");
                            C12781e c12781e2 = new C12781e(0, 1, C12805e.class, c12805e, "currentInterludeProgress", "getCurrentInterludeProgress()I");
                            boolean yandex5 = c13770e6.yandex(c12805e);
                            Object m3681throw9 = c13770e6.m3681throw();
                            C5170e c5170e2 = C2987e.ad;
                            if (yandex5 || m3681throw9 == c5170e2) {
                                m3681throw9 = new C0638e(1, c12805e, C12805e.class, "dispatchNavigatingToLine", "dispatchNavigatingToLine(I)V", 0, 0, 6);
                                c13770e6.m3682throws(m3681throw9);
                            }
                            Function1 function14 = (Function1) ((InterfaceC5261e) m3681throw9);
                            boolean yandex6 = c13770e6.yandex(c13621e2);
                            Object m3681throw10 = c13770e6.m3681throw();
                            if (yandex6 || m3681throw10 == c5170e2) {
                                m3681throw10 = new C3306e(c13621e2, 2);
                                c13770e6.m3682throws(m3681throw10);
                            }
                            AbstractC12185e.metrica(str, interfaceC2558e, c12781e, c12781e2, function14, (Function1) m3681throw10, AbstractC16653e.license(1796601440, new C6409e(c16875e2, c13621e2, c13610e, interfaceC6340e, 2), c13770e6), AbstractC16653e.license(2028269951, new C2535e(0, c13621e2, interfaceC18435e, interfaceC3314e, c16875e2, metrica2), c13770e6), AbstractC18007e.metrica, c13770e6, 114819072);
                            return Unit.INSTANCE;
                        }
                    }, c13770e2), AbstractC16653e.license(-4867658, new C6358e(c16875e, c13621e, i7), c13770e2), AbstractC5400e.billing(AbstractC5400e.billing(AbstractC12220e.loadAd(c7913e, metrica2 ? 80 : i, 0.0f, 0.0f, metrica2 ? i : 80, 6), AbstractC5400e.yandex), AbstractC5400e.mopub), c13770e2, 3504);
                    boolean booleanValue = ((Boolean) c13621e.appmetrica.getValue()).booleanValue();
                    C2892e license2 = AbstractC16653e.license(-2030598708, new C13268e(c16875e, c13621e, i7), c13770e2);
                    C2892e license3 = AbstractC16653e.license(1697456555, new C15545e(c13621e, c16875e, metrica2, i7), c13770e2);
                    C0115e c0115e = C0115e.f1276e;
                    InterfaceC12864e metrica3 = AbstractC18007e.metrica(c0115e, 1.0f);
                    C10156e c10156e = metrica2 ? C5438e.f11666e : C5438e.f11695e;
                    C14486e c14486e = C14486e.ad;
                    c13621e.adcel(booleanValue, license2, license3, AbstractC5400e.billing(c14486e.ad(metrica3, c10156e), AbstractC5400e.billing), c13770e2, 432);
                    AbstractC15390e.ad((InterfaceC4384e) ((C0576e) c2038e.admob.f25752e).getValue(), AbstractC5400e.billing(c14486e.ad(c0115e, C5438e.f11669e), AbstractC5400e.startapp), c13770e2, 0);
                    c13770e2.Signature(true);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC1981e.license((Function0) obj6, (InterfaceC12864e) obj3, (C9207e) obj5, (C2892e) obj4, (C13770e) obj, AbstractC5190e.advert(1 | i3));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC0718e.appmetrica((C6540e) obj6, (InterfaceC3314e) obj5, (InterfaceC12864e) obj3, (C2892e) obj4, (C13770e) obj, AbstractC5190e.advert(1 | i3));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).intValue();
                ((C2892e) obj6).purchase(this.f14921e, this.f14918e, this.f14923e, (C13770e) obj, AbstractC5190e.advert(i3) | 1);
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).intValue();
                ((C1922e) obj6).m727private((C10620e) obj3, (Function0) obj5, (Function0) obj4, (C13770e) obj, AbstractC5190e.advert(1 | i3));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).intValue();
                ((C1922e) obj6).m725instanceof((C10620e) obj3, (Function0) obj5, (Function1) obj4, (C13770e) obj, AbstractC5190e.advert(1 | i3));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                AbstractC17181e.purchase((Boolean) obj6, this.f14921e, (InterfaceC16400e) obj5, (Function1) obj4, (C13770e) obj, AbstractC5190e.advert(1 | i3));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                ((C2921e) obj6).m1218instanceof(AbstractC5190e.advert(1 | i3), (C13770e) obj, (InterfaceC12864e) obj4, (Function0) obj3, (Function0) obj5);
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).intValue();
                ((C4271e) obj6).isPro((C2277e) obj3, (EnumC14399e) obj5, (String) obj4, (C13770e) obj, AbstractC5190e.advert(1 | i3));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                AbstractC10423e.vip((InterfaceC12864e) obj6, (C9106e) obj3, (Function1) obj5, (C2892e) obj4, (C13770e) obj, AbstractC5190e.advert(1 | i3));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                ((C11188e) obj6).m3051instanceof((String) obj3, this.f14920e, (Function0) obj5, (Function2) obj4, (C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).intValue();
                ((C16869e) obj6).m4203private((C16579e) obj3, (Function0) obj5, (Function0) obj4, (C13770e) obj, AbstractC5190e.advert(i3 | 1));
                return Unit.INSTANCE;
        }
    }
}
