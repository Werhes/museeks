package defpackage;

import android.view.KeyEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓۘٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14194e extends AbstractC16858e implements Function0 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f28045e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f28046e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f28047e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14194e(Object obj, Object obj2, int i) {
        super(0);
        this.f28046e = i;
        this.f28045e = obj;
        this.f28047e = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23, types: [eْۤۡ] */
    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27, types: [eّّؔ] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean dispatchKeyEvent;
        C6071e c6071e;
        C13915e c13915e;
        C0763e c0763e;
        int i = this.f28046e;
        int i2 = 1;
        Object obj = this.f28047e;
        Object obj2 = this.f28045e;
        switch (i) {
            case 0:
                dispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) obj);
                return Boolean.valueOf(dispatchKeyEvent);
            case 1:
                ViewOnAttachStateChangeListenerC2004e viewOnAttachStateChangeListenerC2004e = (ViewOnAttachStateChangeListenerC2004e) obj;
                C16905e c16905e = (C16905e) obj2;
                C9585e c9585e = c16905e.f33125e;
                C9585e c9585e2 = c16905e.f33130e;
                Float f = c16905e.f33126e;
                Float f2 = c16905e.f33128e;
                float floatValue = (c9585e == null || f == null) ? 0.0f : ((Number) c9585e.ad.invoke()).floatValue() - f.floatValue();
                float floatValue2 = (c9585e2 == null || f2 == null) ? 0.0f : ((Number) c9585e2.ad.invoke()).floatValue() - f2.floatValue();
                if (floatValue != 0.0f || floatValue2 != 0.0f) {
                    int ads = viewOnAttachStateChangeListenerC2004e.ads(c16905e.f33129e);
                    C3993e c3993e = (C3993e) viewOnAttachStateChangeListenerC2004e.remoteconfig().vip(viewOnAttachStateChangeListenerC2004e.f5228e);
                    if (c3993e != null) {
                        try {
                            C8092e c8092e = viewOnAttachStateChangeListenerC2004e.f5212e;
                            if (c8092e != null) {
                                c8092e.ad.setBoundsInScreen(viewOnAttachStateChangeListenerC2004e.mopub(c3993e));
                                Unit unit = Unit.INSTANCE;
                            }
                        } catch (IllegalStateException unused) {
                            Unit unit2 = Unit.INSTANCE;
                        }
                    }
                    C3993e c3993e2 = (C3993e) viewOnAttachStateChangeListenerC2004e.remoteconfig().vip(viewOnAttachStateChangeListenerC2004e.f5213e);
                    if (c3993e2 != null) {
                        try {
                            C8092e c8092e2 = viewOnAttachStateChangeListenerC2004e.f5216e;
                            if (c8092e2 != null) {
                                c8092e2.ad.setBoundsInScreen(viewOnAttachStateChangeListenerC2004e.mopub(c3993e2));
                                Unit unit3 = Unit.INSTANCE;
                            }
                        } catch (IllegalStateException unused2) {
                            Unit unit4 = Unit.INSTANCE;
                        }
                    }
                    viewOnAttachStateChangeListenerC2004e.f5236e.invalidate();
                    C3993e c3993e3 = (C3993e) viewOnAttachStateChangeListenerC2004e.remoteconfig().vip(ads);
                    if (c3993e3 != null && (c6071e = c3993e3.ad) != null && (c13915e = c6071e.metrica) != null) {
                        if (c9585e != null) {
                            viewOnAttachStateChangeListenerC2004e.f5223e.startapp(ads, c9585e);
                        }
                        if (c9585e2 != null) {
                            viewOnAttachStateChangeListenerC2004e.f5220e.startapp(ads, c9585e2);
                        }
                        viewOnAttachStateChangeListenerC2004e.isVip(c13915e);
                    }
                }
                if (c9585e != null) {
                    c16905e.f33126e = (Float) c9585e.ad.invoke();
                }
                if (c9585e2 != null) {
                    c16905e.f33128e = (Float) c9585e2.ad.invoke();
                }
                return Unit.INSTANCE;
            case 2:
                Function0 function0 = (Function0) obj2;
                if (function0 != null && (c0763e = (C0763e) function0.invoke()) != null) {
                    return c0763e;
                }
                AbstractC17732e abstractC17732e = (AbstractC17732e) obj;
                if (!abstractC17732e.mo2524e().f27016e) {
                    abstractC17732e = null;
                }
                if (abstractC17732e != null) {
                    return AbstractC18489e.billing(0L, AbstractC8116e.startapp(abstractC17732e.f6803e));
                }
                return null;
            case 3:
                ((C17166e) obj2).f33657e.invoke((C8953e) obj);
                return Unit.INSTANCE;
            case 4:
                ((C4246e) obj2).f9318e = AbstractC10432e.vip((C10083e) obj, AbstractC5319e.ad);
                return Unit.INSTANCE;
            case 5:
                ((C4246e) obj2).f9318e = ((C11795e) obj).m3238e();
                return Unit.INSTANCE;
            case 6:
                ((C10780e) obj2).license((AbstractC13616e) obj);
                return Unit.INSTANCE;
            case 7:
                C14742e c14742e = ((C13915e) obj2).f27592e;
                C4246e c4246e = (C4246e) obj;
                if ((((AbstractC13616e) c14742e.billing).f27020e & 8) != 0) {
                    for (AbstractC13616e abstractC13616e = (C9011e) c14742e.purchase; abstractC13616e != null; abstractC13616e = abstractC13616e.f27011e) {
                        if ((abstractC13616e.f27014e & 8) != 0) {
                            AbstractC6126e abstractC6126e = abstractC13616e;
                            ?? r3 = 0;
                            while (abstractC6126e != 0) {
                                if (abstractC6126e instanceof InterfaceC17453e) {
                                    InterfaceC17453e interfaceC17453e = (InterfaceC17453e) abstractC6126e;
                                    if (interfaceC17453e.mo358break()) {
                                        C0500e c0500e = new C0500e();
                                        c4246e.f9318e = c0500e;
                                        c0500e.f2577e = true;
                                    }
                                    if (interfaceC17453e.mo359e()) {
                                        ((C0500e) c4246e.f9318e).f2575e = true;
                                    }
                                    interfaceC17453e.adcel((InterfaceC15671e) c4246e.f9318e);
                                } else if ((abstractC6126e.f27014e & 8) != 0 && (abstractC6126e instanceof AbstractC6126e)) {
                                    AbstractC13616e abstractC13616e2 = abstractC6126e.f12873e;
                                    int i3 = 0;
                                    abstractC6126e = abstractC6126e;
                                    r3 = r3;
                                    while (abstractC13616e2 != null) {
                                        if ((abstractC13616e2.f27014e & 8) != 0) {
                                            i3++;
                                            r3 = r3;
                                            if (i3 == 1) {
                                                abstractC6126e = abstractC13616e2;
                                            } else {
                                                if (r3 == 0) {
                                                    r3 = new C12431e(0, new AbstractC13616e[16]);
                                                }
                                                if (abstractC6126e != 0) {
                                                    r3.license(abstractC6126e);
                                                    abstractC6126e = 0;
                                                }
                                                r3.license(abstractC13616e2);
                                            }
                                        }
                                        abstractC13616e2 = abstractC13616e2.f27024e;
                                        abstractC6126e = abstractC6126e;
                                        r3 = r3;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                abstractC6126e = AbstractC5851e.vip(r3);
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            case 8:
                C10122e c10122e = AbstractC17732e.f34770e;
                ((Function1) obj2).invoke(c10122e);
                AbstractC17732e abstractC17732e2 = (AbstractC17732e) obj;
                boolean billing = AbstractC7890e.billing(abstractC17732e2.f34779e, c10122e.f20001e);
                boolean z = abstractC17732e2.f34795e;
                boolean z2 = c10122e.f20002e;
                boolean z3 = z != z2;
                if (!billing || z3) {
                    abstractC17732e2.f34779e = c10122e.f20001e;
                    abstractC17732e2.f34795e = z2;
                    if (abstractC17732e2.f34792e && (z3 || (z2 && !billing))) {
                        abstractC17732e2.f34782e.m3723this();
                    }
                }
                abstractC17732e2.f34792e = true;
                c10122e.f20005e = c10122e.f20001e.ad(c10122e.f19998e, c10122e.f20012e, c10122e.f20006e);
                return Unit.INSTANCE;
            case 9:
                C10743e c10743e = ((C12692e) obj2).ad;
                C2164e license = c10743e.license();
                C0576e c0576e = c10743e.adcel;
                InterfaceC5083e interfaceC5083e = null;
                C11490e c11490e = license != null ? new C11490e(license.vip()) : null;
                C2164e license2 = c10743e.license();
                if ((license2 != null ? Integer.valueOf(license2.ad()) : null) != null) {
                    c10743e.subscription.setValue(c0576e.getValue());
                    AbstractC5336e.purchase(c10743e.vip, null, 0, new C7977e(c10743e, c10743e.appmetrica(), interfaceC5083e, 2), 3);
                }
                c10743e.advert.setValue(new C2152e(0L));
                c0576e.setValue(null);
                c10743e.smaato.setValue(new C11490e(c11490e != null ? c11490e.ad : 0L));
                C5659e c5659e = c10743e.purchase;
                AbstractC5336e.purchase(c5659e.vip, null, 0, new C13037e(c5659e, interfaceC5083e, i2), 3);
                c10743e.amazon.setValue(null);
                c10743e.loadAd.setValue(null);
                ((Function0) obj).invoke();
                return Unit.INSTANCE;
            case 10:
                return Boolean.valueOf(AbstractC7890e.billing(obj2, ((C10743e) obj).adcel.getValue()));
            case 11:
                return Float.valueOf(((Number) ((Function0) ((InterfaceC3314e) obj2).getValue()).invoke()).floatValue() / (((Number) ((InterfaceC3314e) obj).getValue()).floatValue() / 1000.0f));
            case 12:
                ((AbstractC5133e) obj2).removeOnAttachStateChangeListener((ViewOnAttachStateChangeListenerC3060e) obj);
                return Unit.INSTANCE;
            default:
                ((AbstractC0003e) obj2).vip((C9993e) obj);
                return Unit.INSTANCE;
        }
    }
}
