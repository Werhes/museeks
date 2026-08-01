package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۖؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11906e {
    public static final void ad(InterfaceC4977e interfaceC4977e, Function0 function0, InterfaceC12864e interfaceC12864e, boolean z, C13770e c13770e, int i, int i2) {
        boolean z2;
        int i3;
        InterfaceC4977e interfaceC4977e2;
        Function0 function02;
        boolean z3;
        C2846e subscription;
        C12967e c12967e;
        int i4;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        C10156e c10156e = C5438e.f11695e;
        c13770e.m3671package(929783610);
        int i5 = (c13770e.purchase(interfaceC4977e) ? 4 : 2) | i | (c13770e.yandex(function0) ? 32 : 16);
        if ((i & 384) == 0) {
            i5 |= c13770e.purchase(interfaceC12864e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 = i5 | 3072;
            z2 = z;
        } else {
            z2 = z;
            i3 = i5 | (c13770e.billing(z2) ? 2048 : 1024);
        }
        if (c13770e.m3673protected(i3 & 1, (i3 & 1171) != 1170)) {
            if (i6 != 0) {
                i4 = i3;
                z4 = true;
            } else {
                i4 = i3;
                z4 = z2;
            }
            if (interfaceC4977e instanceof C4440e) {
                subscription = c13770e.subscription();
                if (subscription != null) {
                    c12967e = new C12967e(interfaceC4977e, function0, interfaceC12864e, z4, i, i2, 0);
                    subscription.license = c12967e;
                }
                return;
            }
            function02 = function0;
            boolean z8 = z4;
            Activity activity = (Activity) c13770e.adcel(AbstractC0168e.ad);
            InterfaceC12864e premium = interfaceC12864e.premium(AbstractC18007e.metrica);
            C10156e c10156e2 = C5438e.f11676e;
            InterfaceC2747e license = AbstractC17074e.license(c10156e2, false);
            int i7 = i4;
            long j = c13770e.f27286case;
            int i8 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, premium);
            InterfaceC5685e.mopub.getClass();
            Function0 function03 = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(function03);
            } else {
                c13770e.m3684volatile();
            }
            C14865e c14865e = C2721e.billing;
            AbstractC2270e.yandex(c13770e, license, c14865e);
            C14865e c14865e2 = C2721e.purchase;
            AbstractC2270e.yandex(c13770e, advert, c14865e2);
            Integer valueOf = Integer.valueOf(i8);
            C14865e c14865e3 = C2721e.adcel;
            AbstractC2270e.yandex(c13770e, valueOf, c14865e3);
            C5430e c5430e = C2721e.mopub;
            AbstractC2270e.purchase(c13770e, c5430e);
            C14865e c14865e4 = C2721e.license;
            AbstractC2270e.yandex(c13770e, purchase, c14865e4);
            C10156e c10156e3 = C5438e.f11700e;
            C14486e c14486e = C14486e.ad;
            C0115e c0115e = C0115e.f1276e;
            float f = 16;
            InterfaceC12864e smaato = AbstractC12220e.smaato(c14486e.ad(c0115e, c10156e3), f, 0.0f, 2);
            C4789e ad = AbstractC14801e.ad(AbstractC16497e.billing(8), C5438e.f11678e, c13770e, 54);
            long j2 = c13770e.f27286case;
            int i9 = (int) (j2 ^ (j2 >>> 32));
            InterfaceC3483e advert2 = c13770e.advert();
            InterfaceC12864e purchase2 = AbstractC5679e.purchase(c13770e, smaato);
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(function03);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad, c14865e);
            AbstractC2270e.yandex(c13770e, advert2, c14865e2);
            AbstractC13501e.mopub(i9, c13770e, c14865e3, c13770e, c5430e);
            AbstractC2270e.yandex(c13770e, purchase2, c14865e4);
            C5015e c5015e = AbstractC0608e.ad;
            AbstractC4455e abstractC4455e = AbstractC11785e.ad;
            interfaceC4977e2 = interfaceC4977e;
            AbstractC1101e.ad(AbstractC8703e.loadAd(((C7019e) c13770e.adcel(abstractC4455e)).ad.remoteconfig, c5015e), AbstractC16653e.license(-651019778, new C8207e(interfaceC4977e2, 1), c13770e), c13770e, 56);
            int i10 = i7 & 14;
            license(interfaceC4977e2, null, c13770e, i10);
            if (z8) {
                c13770e.m3676strictfp(-203248299);
                metrica(interfaceC4977e2, function02, null, c13770e, i7 & 126);
                z5 = false;
            } else {
                z5 = false;
                c13770e.m3676strictfp(-208463708);
            }
            c13770e.Signature(z5);
            c13770e.Signature(true);
            if ((interfaceC4977e2 instanceof C6577e ? ((C6577e) interfaceC4977e2).ad : interfaceC4977e2 instanceof C5134e ? ((C5134e) interfaceC4977e2).ad : null) != null) {
                c13770e.m3676strictfp(463358768);
                boolean yandex = c13770e.yandex(activity) | (i10 == 4);
                Object m3681throw = c13770e.m3681throw();
                if (yandex || m3681throw == C2987e.ad) {
                    m3681throw = new C1872e(activity, interfaceC4977e2, 0);
                    c13770e.m3682throws(m3681throw);
                }
                AbstractC1513e.license((Function0) m3681throw, AbstractC12220e.loadAd(c14486e.ad(c0115e, c10156e), 0.0f, 0.0f, 0.0f, f, 7), false, null, null, null, AbstractC16091e.ad, c13770e, 805306368, 508);
                c13770e.Signature(false);
                z6 = true;
            } else {
                if (interfaceC4977e2 instanceof C9908e) {
                    c13770e.m3676strictfp(463851327);
                    InterfaceC12864e vip = AbstractC12447e.vip(c14486e.ad(AbstractC12220e.loadAd(c0115e, 0.0f, 0.0f, 0.0f, f, 7), c10156e), AbstractC6549e.ad);
                    InterfaceC2747e license2 = AbstractC17074e.license(c10156e2, false);
                    long j3 = c13770e.f27286case;
                    int i11 = (int) (j3 ^ (j3 >>> 32));
                    InterfaceC3483e advert3 = c13770e.advert();
                    InterfaceC12864e purchase3 = AbstractC5679e.purchase(c13770e, vip);
                    c13770e.m3666import();
                    if (c13770e.f27292implements) {
                        c13770e.mopub(function03);
                    } else {
                        c13770e.m3684volatile();
                    }
                    AbstractC2270e.yandex(c13770e, license2, c14865e);
                    AbstractC2270e.yandex(c13770e, advert3, c14865e2);
                    AbstractC13501e.mopub(i11, c13770e, c14865e3, c13770e, c5430e);
                    AbstractC2270e.yandex(c13770e, purchase3, c14865e4);
                    interfaceC4977e2 = interfaceC4977e;
                    AbstractC1101e.ad(AbstractC8703e.loadAd(((C7019e) c13770e.adcel(abstractC4455e)).ad.ad, c5015e), AbstractC16653e.license(886324586, new C17785e(activity, interfaceC4977e2, 2), c13770e), c13770e, 56);
                    z6 = true;
                    c13770e.Signature(true);
                    z7 = false;
                } else {
                    z6 = true;
                    z7 = false;
                    c13770e.m3676strictfp(457936558);
                }
                c13770e.Signature(z7);
            }
            c13770e.Signature(z6);
            z3 = z8;
        } else {
            interfaceC4977e2 = interfaceC4977e;
            function02 = function0;
            c13770e.m3659default();
            z3 = z2;
        }
        subscription = c13770e.subscription();
        if (subscription != null) {
            c12967e = new C12967e(interfaceC4977e2, function02, interfaceC12864e, z3, i, i2, 1);
            subscription.license = c12967e;
        }
    }

    public static final C17719e adcel(C13770e c13770e, int i) {
        Object m3681throw = c13770e.m3681throw();
        if (m3681throw == C2987e.ad) {
            m3681throw = new C17719e();
            c13770e.m3682throws(m3681throw);
        }
        C17719e c17719e = (C17719e) m3681throw;
        c17719e.ad(c13770e, 0);
        return c17719e;
    }

    public static final void appmetrica(EnumC10002e enumC10002e, C0763e c0763e, InterfaceC12864e interfaceC12864e, C2892e c2892e, C13770e c13770e, int i) {
        c13770e.m3671package(860637404);
        int i2 = (c13770e.license(enumC10002e.ordinal()) ? 4 : 2) | i | (c13770e.purchase(c0763e) ? 32 : 16);
        if (c13770e.m3673protected(i2 & 1, (i2 & 1171) != 1170)) {
            Object m3681throw = c13770e.m3681throw();
            if (m3681throw == C2987e.ad) {
                m3681throw = new C16780e();
                c13770e.m3682throws(m3681throw);
            }
            AbstractC17957e.ad(interfaceC12864e, null, AbstractC16653e.license(-1043727438, new C12050e((C16780e) m3681throw, enumC10002e, c0763e, c2892e, 12), c13770e), c13770e, 3078, 6);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C6409e(enumC10002e, c0763e, interfaceC12864e, c2892e, i, 17);
        }
    }

    public static final C4298e billing(C17719e c17719e, Number number, Number number2, C11139e c11139e, C5043e c5043e, String str, C13770e c13770e, int i, int i2) {
        C17719e c17719e2;
        Number number3;
        Object m3681throw = c13770e.m3681throw();
        C5170e c5170e = C2987e.ad;
        if (m3681throw == c5170e) {
            c17719e2 = c17719e;
            C4298e c4298e = new C4298e(c17719e2, number, number2, c11139e, c5043e);
            number3 = number2;
            c13770e.m3682throws(c4298e);
            m3681throw = c4298e;
        } else {
            c17719e2 = c17719e;
            number3 = number2;
        }
        C4298e c4298e2 = (C4298e) m3681throw;
        boolean z = (((57344 & i) ^ 24576) > 16384 && c13770e.yandex(c5043e)) || (i & 24576) == 16384;
        Object m3681throw2 = c13770e.m3681throw();
        if (z || m3681throw2 == c5170e) {
            C9411e c9411e = new C9411e(number, c4298e2, number3, c5043e, 4);
            c13770e.m3682throws(c9411e);
            m3681throw2 = c9411e;
        }
        AbstractC17680e.purchase((Function0) m3681throw2, c13770e);
        boolean yandex = c13770e.yandex(c17719e2);
        Object m3681throw3 = c13770e.m3681throw();
        if (yandex || m3681throw3 == c5170e) {
            m3681throw3 = new C9041e(c17719e2, c4298e2, 24);
            c13770e.m3682throws(m3681throw3);
        }
        AbstractC17680e.vip(c4298e2, (Function1) m3681throw3, c13770e);
        return c4298e2;
    }

    public static final void license(InterfaceC4977e interfaceC4977e, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        int i2;
        InterfaceC12864e interfaceC12864e2;
        c13770e.m3671package(692452305);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c13770e.purchase(interfaceC4977e) : c13770e.yandex(interfaceC4977e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 3) != 2)) {
            C15492e c15492e = AbstractC11785e.ad;
            AbstractC14489e.ad(C1839e.ad(((C7019e) c13770e.adcel(c15492e)).vip.mopub, ((C7019e) c13770e.adcel(c15492e)).ad.remoteconfig, 0L, null, null, 0L, 0L, null, null, 16744446), AbstractC16653e.license(1777832768, new C8207e(interfaceC4977e, 0), c13770e), c13770e, 48);
            interfaceC12864e2 = C0115e.f1276e;
        } else {
            c13770e.m3659default();
            interfaceC12864e2 = interfaceC12864e;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C0205e(interfaceC4977e, interfaceC12864e2, i, 7);
        }
    }

    public static final void metrica(InterfaceC4977e interfaceC4977e, Function0 function0, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        int i2;
        InterfaceC12864e interfaceC12864e2;
        String appmetrica;
        Function0 function02;
        c13770e.m3671package(-675659617);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c13770e.purchase(interfaceC4977e) : c13770e.yandex(interfaceC4977e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.yandex(function0) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (c13770e.m3673protected(i3 & 1, (i3 & 147) != 146)) {
            if ((interfaceC4977e instanceof C9908e) || (interfaceC4977e instanceof C6577e) || (interfaceC4977e instanceof C5134e)) {
                c13770e.m3676strictfp(1936336472);
                appmetrica = AbstractC5297e.appmetrica(c13770e, R.string.error_occurred_reload);
                c13770e.Signature(false);
            } else if (interfaceC4977e instanceof C13045e) {
                c13770e.m3676strictfp(1936453249);
                appmetrica = AbstractC5297e.appmetrica(c13770e, ((C13045e) interfaceC4977e).license);
                c13770e.Signature(false);
            } else if (interfaceC4977e instanceof C2374e) {
                c13770e.m3676strictfp(1936563423);
                c13770e.Signature(false);
                appmetrica = ((C2374e) interfaceC4977e).license;
            } else if (AbstractC7890e.billing(interfaceC4977e, C4440e.ad)) {
                c13770e.m3676strictfp(1936631561);
                c13770e.Signature(false);
                appmetrica = BuildConfig.FLAVOR;
            } else {
                if (!(interfaceC4977e instanceof C2008e) && !(interfaceC4977e instanceof C12392e)) {
                    throw AbstractC1786e.loadAd(-768824865, c13770e, false);
                }
                c13770e.m3676strictfp(1936743068);
                appmetrica = AbstractC5297e.appmetrica(c13770e, R.string.error_1117_action);
                c13770e.Signature(false);
            }
            Activity activity = (Activity) c13770e.adcel(AbstractC0168e.ad);
            if ((interfaceC4977e instanceof C2008e) || (interfaceC4977e instanceof C12392e)) {
                c13770e.m3676strictfp(1936987968);
                boolean yandex = c13770e.yandex(activity);
                Object m3681throw = c13770e.m3681throw();
                if (yandex || m3681throw == C2987e.ad) {
                    m3681throw = new C4669e(activity, 1);
                    c13770e.m3682throws(m3681throw);
                }
                function02 = (Function0) m3681throw;
                c13770e.Signature(false);
            } else {
                c13770e.m3676strictfp(1937212811);
                c13770e.Signature(false);
                function02 = function0;
            }
            C0115e c0115e = C0115e.f1276e;
            AbstractC1513e.license(function02, c0115e, false, null, null, null, AbstractC16653e.license(-1791629950, new C7542e(appmetrica, 1), c13770e), c13770e, ((i3 >> 3) & 112) | 805306368, 508);
            interfaceC12864e2 = c0115e;
        } else {
            c13770e.m3659default();
            interfaceC12864e2 = interfaceC12864e;
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C9381e(i, 14, interfaceC4977e, function0, interfaceC12864e2);
        }
    }

    public static final void mopub(C6594e c6594e, C18479e c18479e) {
        long j = c18479e.ad;
        C13614e appmetrica = AbstractC7291e.appmetrica(c6594e);
        if (appmetrica == null) {
            AbstractC7291e.startapp(c6594e, new C13614e(j, Collections.singletonList(c18479e)));
            return;
        }
        List list = appmetrica.vip;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C18479e) obj).ad != j) {
                arrayList.add(obj);
            }
        }
        AbstractC7291e.startapp(c6594e, new C13614e(j, AbstractC13480e.m3572catch(c18479e, arrayList)));
    }

    public static final C4298e purchase(C17719e c17719e, float f, float f2, C5043e c5043e, String str, C13770e c13770e, int i, int i2) {
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        return billing(c17719e, Float.valueOf(f), Float.valueOf(f2), AbstractC9546e.ad, c5043e, str, c13770e, 33208 | ((i << 3) & 458752), 0);
    }

    public static final C18479e startapp(C6594e c6594e, long j) {
        C13614e appmetrica = AbstractC7291e.appmetrica(c6594e);
        Object obj = null;
        if (appmetrica == null) {
            return null;
        }
        Iterator it = appmetrica.vip.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((C18479e) next).ad == j) {
                obj = next;
                break;
            }
        }
        return (C18479e) obj;
    }

    public static final void vip(InterfaceC4977e interfaceC4977e, InterfaceC12864e interfaceC12864e, C13770e c13770e, int i) {
        c13770e.m3671package(-1059900155);
        int i2 = (c13770e.purchase(interfaceC4977e) ? 4 : 2) | i;
        if (!c13770e.m3673protected(i2 & 1, (i2 & 19) != 18)) {
            c13770e.m3659default();
        } else if ((interfaceC4977e instanceof C9908e) || (interfaceC4977e instanceof C6577e)) {
            c13770e.m3676strictfp(1114240307);
            AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_error_outline_28, 0, c13770e), null, interfaceC12864e, 0L, c13770e, 440, 8);
            c13770e.Signature(false);
        } else if (interfaceC4977e instanceof C5134e) {
            c13770e.m3676strictfp(1114484339);
            AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_globe_outline_28, 0, c13770e), null, interfaceC12864e, 0L, c13770e, 440, 8);
            c13770e.Signature(false);
        } else if (interfaceC4977e instanceof C2008e) {
            c13770e.m3676strictfp(1114736152);
            AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.key_outline_28, 0, c13770e), null, interfaceC12864e, 0L, c13770e, 440, 8);
            c13770e.Signature(false);
        } else if (interfaceC4977e instanceof C12392e) {
            c13770e.m3676strictfp(1114976495);
            AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.ic_snowflake_outline_28, 0, c13770e), null, interfaceC12864e, 0L, c13770e, 440, 8);
            c13770e.Signature(false);
        } else if (interfaceC4977e instanceof C13045e) {
            c13770e.m3676strictfp(1115222852);
            AbstractC5647e.vip(AbstractC12475e.metrica(((C13045e) interfaceC4977e).ad, 0, c13770e), null, interfaceC12864e, 0L, c13770e, 440, 8);
            c13770e.Signature(false);
        } else if (interfaceC4977e instanceof C2374e) {
            c13770e.m3676strictfp(1115453771);
            AbstractC8461e.ad(((C2374e) interfaceC4977e).ad, null, interfaceC12864e, null, new C2815e(((C3618e) c13770e.adcel(AbstractC0608e.ad)).ad, 5), c13770e, 432, 1784);
            c13770e.Signature(false);
        } else {
            if (!AbstractC7890e.billing(interfaceC4977e, C4440e.ad)) {
                throw AbstractC1786e.loadAd(-656794881, c13770e, false);
            }
            c13770e.m3676strictfp(1115719131);
            c13770e.Signature(false);
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C17785e(interfaceC4977e, interfaceC12864e, i, 3);
        }
    }

    public static final C14131e yandex(String str, String str2, C15681e c15681e) {
        ArrayList mopub = AbstractC6874e.mopub(str);
        if (str2 != null) {
            mopub.add(str2);
        }
        return new C14131e(mopub, c15681e);
    }
}
