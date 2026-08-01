package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٕٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15548e extends AbstractC7185e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f30697e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ AppActivity f30698e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f30699e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f30700e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15548e(int i, AppActivity appActivity, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f30697e = 2;
        this.f30700e = i;
        this.f30698e = appActivity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15548e(AppActivity appActivity, InterfaceC5083e interfaceC5083e, int i) {
        super(2, interfaceC5083e);
        this.f30697e = i;
        this.f30698e = appActivity;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        switch (this.f30697e) {
            case 0:
                C15548e c15548e = new C15548e(this.f30698e, interfaceC5083e, 0);
                c15548e.f30699e = obj;
                return c15548e;
            case 1:
                C15548e c15548e2 = new C15548e(this.f30698e, interfaceC5083e, 1);
                c15548e2.f30699e = obj;
                return c15548e2;
            default:
                C15548e c15548e3 = new C15548e(this.f30700e, this.f30698e, interfaceC5083e);
                c15548e3.f30699e = obj;
                return c15548e3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30697e) {
            case 0:
                return ((C15548e) advert((InterfaceC5083e) obj2, (C15007e) obj)).loadAd(Unit.INSTANCE);
            case 1:
                return ((C15548e) advert((InterfaceC5083e) obj2, (C16686e) obj)).loadAd(Unit.INSTANCE);
            default:
                return ((C15548e) advert((InterfaceC5083e) obj2, (InterfaceC18435e) obj)).loadAd(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [eٖؑۡ, eُۙۨ] */
    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        int i = this.f30697e;
        EnumC2821e enumC2821e = EnumC2821e.f6782e;
        AppActivity appActivity = this.f30698e;
        switch (i) {
            case 0:
                C15007e c15007e = (C15007e) this.f30699e;
                int i2 = this.f30700e;
                if (i2 == 0) {
                    AbstractC2003e.purchase(obj);
                    if (AbstractC15933e.appmetrica.license) {
                        InterfaceC1108e ad = ((InterfaceC8018e) ((C6325e) AbstractC1831e.metrica().f22772e).f13170e).ad();
                        this.f30699e = c15007e;
                        this.f30700e = 1;
                        obj = AbstractC7535e.startapp(ad, this);
                        if (obj == enumC2821e) {
                            return enumC2821e;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2003e.purchase(obj);
                if (((C10876e) obj).f21545e != EnumC5778e.f12228e) {
                    if (c15007e.ad) {
                        int i3 = AppActivity.f36539e;
                        C1731e m4677class = appActivity.m4677class();
                        m4677class.vip(true);
                        m4677class.ad(true);
                    } else {
                        int i4 = AppActivity.f36539e;
                        C1731e m4677class2 = appActivity.m4677class();
                        m4677class2.vip(false);
                        m4677class2.ad(false);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                C16686e c16686e = (C16686e) this.f30699e;
                int i5 = this.f30700e;
                if (i5 == 0) {
                    AbstractC2003e.purchase(obj);
                    InterfaceC1108e ad2 = ((InterfaceC8018e) ((C6325e) AbstractC1831e.metrica().f22772e).f13170e).ad();
                    this.f30699e = c16686e;
                    this.f30700e = 1;
                    obj = AbstractC7535e.startapp(ad2, this);
                    if (obj == enumC2821e) {
                        return enumC2821e;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC2003e.purchase(obj);
                }
                if (((C10876e) obj).f21533e) {
                    if (c16686e.ad) {
                        int i6 = AppActivity.f36539e;
                        appActivity.m4677class().ad.appmetrica();
                    } else {
                        int i7 = AppActivity.f36539e;
                        appActivity.m4677class().ad.advert(1);
                    }
                }
                return Unit.INSTANCE;
            default:
                AbstractC2003e.purchase(obj);
                int i8 = this.f30700e;
                int license = AbstractC3062e.license(i8, new C11241e(200, 700, 1));
                int i9 = Resources.getSystem().getDisplayMetrics().densityDpi;
                if (i8 != 0 && license != ((C6965e) appActivity.getResources()).ad.getDisplayMetrics().densityDpi) {
                    Configuration configuration = ((C6965e) appActivity.getResources()).ad.getConfiguration();
                    configuration.densityDpi = license;
                    appActivity.getResources().updateConfiguration(configuration, ((C6965e) appActivity.getResources()).ad.getDisplayMetrics());
                    appActivity.recreate();
                } else if (i8 == 0 && ((C6965e) appActivity.getResources()).ad.getDisplayMetrics().densityDpi != i9) {
                    Configuration configuration2 = ((C6965e) appActivity.getResources()).ad.getConfiguration();
                    configuration2.densityDpi = Resources.getSystem().getDisplayMetrics().densityDpi;
                    appActivity.getResources().updateConfiguration(configuration2, ((C6965e) appActivity.getResources()).ad.getDisplayMetrics());
                    appActivity.recreate();
                }
                return Unit.INSTANCE;
        }
    }
}
