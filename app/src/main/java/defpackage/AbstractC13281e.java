package defpackage;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٖ٘ */
/* loaded from: classes3.dex */
public abstract class AbstractC13281e {
    public static C17149e startapp;
    public static final C2892e ad = new C2892e(-1019221978, false, new C16627e(25));
    public static final C2892e vip = new C2892e(-106694995, false, new C11402e(24));
    public static final C2892e metrica = new C2892e(-1959119318, false, new C11402e(25));
    public static final C2892e license = new C2892e(-1885397783, false, new C11402e(26));
    public static final C2892e appmetrica = new C2892e(-2015054922, false, new C11402e(27));
    public static final C2892e purchase = new C2892e(1256526522, false, new C11402e(28));
    public static final C2892e billing = new C2892e(2074421883, false, new C11402e(29));
    public static final C2892e yandex = new C2892e(1128332253, false, new C16627e(26));

    public static /* synthetic */ void ad(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static final C17149e license() {
        C17149e c17149e = startapp;
        if (c17149e != null) {
            return c17149e;
        }
        C18373e c18373e = new C18373e("Rounded.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = AbstractC13069e.ad;
        C18466e c18466e = new C18466e(C3618e.vip);
        C13935e c13935e = new C13935e(20);
        c13935e.m3733extends(19.0f, 11.0f);
        c13935e.firebase(7.83f);
        c13935e.m3738native(4.88f, -4.88f);
        c13935e.premium(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.42f);
        c13935e.premium(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        c13935e.m3738native(-6.59f, 6.59f);
        c13935e.premium(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        c13935e.m3738native(6.59f, 6.59f);
        c13935e.premium(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        c13935e.premium(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        c13935e.m3747this(7.83f, 13.0f);
        c13935e.firebase(19.0f);
        c13935e.premium(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        c13935e.m3735implements(-0.45f, -1.0f, -1.0f, -1.0f);
        c13935e.ads();
        C18373e.ad(c18373e, (ArrayList) c13935e.f27641e, c18466e);
        C17149e vip2 = c18373e.vip();
        startapp = vip2;
        return vip2;
    }

    public static final InterfaceC3314e metrica(C15274e c15274e, C13770e c13770e, int i) {
        Object m3681throw = c13770e.m3681throw();
        C5170e c5170e = C2987e.ad;
        if (m3681throw == c5170e) {
            m3681throw = AbstractC14533e.startapp(Boolean.FALSE);
            c13770e.m3682throws(m3681throw);
        }
        InterfaceC3314e interfaceC3314e = (InterfaceC3314e) m3681throw;
        boolean z = (((i & 14) ^ 6) > 4 && c13770e.purchase(c15274e)) || (i & 6) == 4;
        Object m3681throw2 = c13770e.m3681throw();
        if (z || m3681throw2 == c5170e) {
            m3681throw2 = new C1030e(c15274e, interfaceC3314e, null, 2);
            c13770e.m3682throws(m3681throw2);
        }
        AbstractC17680e.license(c13770e, c15274e, (Function2) m3681throw2);
        return interfaceC3314e;
    }

    public static final void vip(final C9289e c9289e, final Function1 function1, final Function1 function12, final Function1 function13, C13770e c13770e, int i) {
        c13770e.m3671package(-128173924);
        int i2 = i | (c13770e.purchase(c9289e) ? 4 : 2) | (c13770e.yandex(function1) ? 32 : 16) | (c13770e.yandex(function12) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) | (c13770e.yandex(function13) ? 2048 : 1024);
        if (c13770e.m3673protected(i2 & 1, (i2 & 1171) != 1170)) {
            final InterfaceC3314e vip2 = AbstractC3265e.vip(c9289e.billing, c13770e, 0);
            final InterfaceC3314e vip3 = AbstractC3265e.vip(c9289e.yandex, c13770e, 0);
            final InterfaceC3314e vip4 = AbstractC3265e.vip(c9289e.adcel, c13770e, 0);
            InterfaceC3314e vip5 = AbstractC3265e.vip(c9289e.startapp, c13770e, 0);
            final InterfaceC3314e vip6 = AbstractC3265e.vip(c9289e.purchase, c13770e, 0);
            AbstractC13348e.ad(null, AbstractC16653e.license(-1378333864, new C6672e(c9289e, vip5, 0), c13770e), null, null, null, 0, 0L, 0L, AbstractC3338e.ad, AbstractC16653e.license(1840534317, new Function3() { // from class: eٔ۠ٓ
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    InterfaceC12123e interfaceC12123e = (InterfaceC12123e) obj;
                    C13770e c13770e2 = (C13770e) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= c13770e2.purchase(interfaceC12123e) ? 4 : 2;
                    }
                    if (c13770e2.m3673protected(intValue & 1, (intValue & 19) != 18)) {
                        InterfaceC16132e interfaceC16132e = vip2;
                        boolean booleanValue = ((Boolean) interfaceC16132e.getValue()).booleanValue();
                        InterfaceC16132e interfaceC16132e2 = vip4;
                        if (booleanValue && ((AbstractC7674e) ((InterfaceC8346e) interfaceC16132e2.getValue())).isEmpty()) {
                            c13770e2.m3676strictfp(1805417551);
                            InterfaceC12864e adcel = AbstractC12220e.adcel(AbstractC18007e.metrica, interfaceC12123e);
                            InterfaceC2747e license2 = AbstractC17074e.license(C5438e.f11700e, false);
                            long j = c13770e2.f27286case;
                            int i3 = (int) (j ^ (j >>> 32));
                            InterfaceC3483e advert = c13770e2.advert();
                            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e2, adcel);
                            InterfaceC5685e.mopub.getClass();
                            C7309e c7309e = C2721e.vip;
                            c13770e2.m3666import();
                            if (c13770e2.f27292implements) {
                                c13770e2.mopub(c7309e);
                            } else {
                                c13770e2.m3684volatile();
                            }
                            AbstractC2270e.yandex(c13770e2, license2, C2721e.billing);
                            AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
                            AbstractC2270e.yandex(c13770e2, Integer.valueOf(i3), C2721e.adcel);
                            AbstractC2270e.purchase(c13770e2, C2721e.mopub);
                            AbstractC2270e.yandex(c13770e2, purchase2, C2721e.license);
                            AbstractC6232e.vip(null, 0L, null, c13770e2, 0, 7);
                            c13770e2.Signature(true);
                            c13770e2.Signature(false);
                        } else if (((Boolean) interfaceC16132e.getValue()).booleanValue() || !((AbstractC7674e) ((InterfaceC8346e) interfaceC16132e2.getValue())).isEmpty()) {
                            c13770e2.m3676strictfp(1805879978);
                            InterfaceC16132e interfaceC16132e3 = vip6;
                            boolean purchase3 = c13770e2.purchase(interfaceC16132e3);
                            C9289e c9289e2 = c9289e;
                            boolean yandex2 = purchase3 | c13770e2.yandex(c9289e2) | c13770e2.purchase(interfaceC16132e2);
                            Function1 function14 = function1;
                            boolean purchase4 = yandex2 | c13770e2.purchase(function14);
                            Function1 function15 = function12;
                            boolean purchase5 = purchase4 | c13770e2.purchase(function15);
                            Function1 function16 = function13;
                            boolean purchase6 = purchase5 | c13770e2.purchase(function16);
                            InterfaceC16132e interfaceC16132e4 = vip3;
                            boolean purchase7 = purchase6 | c13770e2.purchase(interfaceC16132e4);
                            Object m3681throw = c13770e2.m3681throw();
                            if (purchase7 || m3681throw == C2987e.ad) {
                                C10169e c10169e = new C10169e(interfaceC16132e3, c9289e2, interfaceC16132e2, function14, function15, function16, interfaceC16132e4);
                                c13770e2.m3682throws(c10169e);
                                m3681throw = c10169e;
                            }
                            AbstractC7023e.ad(null, null, interfaceC12123e, null, null, null, false, null, (Function1) m3681throw, c13770e2, (intValue << 6) & 896, 507);
                            c13770e2.Signature(false);
                        } else {
                            c13770e2.m3676strictfp(1805693575);
                            c13770e2.Signature(false);
                        }
                    } else {
                        c13770e2.m3659default();
                    }
                    return Unit.INSTANCE;
                }
            }, c13770e), c13770e, 905969712, 253);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C6409e(c9289e, function1, function12, function13, i, 14);
        }
    }
}
