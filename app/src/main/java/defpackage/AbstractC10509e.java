package defpackage;

import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import org.conscrypt.PSKKeyManager;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۚؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10509e {
    public static final StringBuilder ad = new StringBuilder(48);

    public static int[] Signature(Collection collection) {
        if (collection instanceof C15235e) {
            C15235e c15235e = (C15235e) collection;
            return Arrays.copyOfRange(c15235e.f30139e, c15235e.f30138e, c15235e.f30137e);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static final void ad(Function0 function0, Function0 function02, C13770e c13770e, int i) {
        int i2;
        Function0 function03;
        Function0 function04;
        C13770e c13770e2 = c13770e;
        c13770e2.m3671package(575471686);
        if ((i & 6) == 0) {
            i2 = (c13770e2.yandex(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e2.yandex(function02) ? 32 : 16;
        }
        int i3 = i2;
        if (c13770e2.m3673protected(i3 & 1, (i3 & 19) != 18)) {
            C8587e ad2 = AbstractC6451e.ad(AbstractC16497e.ad, C5438e.f11685e, c13770e2, 0);
            long j = c13770e2.f27286case;
            int i4 = (int) ((j >>> 32) ^ j);
            InterfaceC3483e advert = c13770e2.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e2, C0115e.f1276e);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e2.m3666import();
            if (c13770e2.f27292implements) {
                c13770e2.mopub(c7309e);
            } else {
                c13770e2.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e2, ad2, C2721e.billing);
            AbstractC2270e.yandex(c13770e2, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e2, Integer.valueOf(i4), C2721e.adcel);
            AbstractC2270e.purchase(c13770e2, C2721e.mopub);
            AbstractC2270e.yandex(c13770e2, purchase, C2721e.license);
            AbstractC1513e.license(function0, null, false, null, null, null, AbstractC2223e.f5677e, c13770e2, (i3 & 14) | 805306368, 510);
            function03 = function0;
            if (1.0f <= 0.0d) {
                AbstractC9534e.ad("invalid weight; must be greater than zero");
            }
            AbstractC12534e.ad(c13770e2, new C5228e(1.0f, true));
            function04 = function02;
            AbstractC1513e.ad(function04, null, false, null, null, null, null, null, AbstractC2223e.f5676e, c13770e, ((i3 >> 3) & 14) | 805306368, 510);
            c13770e2 = c13770e;
            c13770e2.Signature(true);
        } else {
            function03 = function0;
            function04 = function02;
            c13770e2.m3659default();
        }
        C2846e subscription = c13770e2.subscription();
        if (subscription != null) {
            subscription.license = new C0205e(function03, function04, i, 28);
        }
    }

    public static void adcel(long j, C1292e c1292e, InterfaceC18147e[] interfaceC18147eArr) {
        int ads = c1292e.ads();
        if ((ads & 64) != 0) {
            c1292e.m568protected(1);
            int i = (ads & 31) * 3;
            int i2 = c1292e.vip;
            for (InterfaceC18147e interfaceC18147e : interfaceC18147eArr) {
                c1292e.m571try(i2);
                interfaceC18147e.appmetrica(i, c1292e);
                AbstractC2301e.subscription(j != -9223372036854775807L);
                interfaceC18147e.ad(j, 1, i, 0, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Integer admob(String str) {
        byte b;
        Integer num;
        Long l;
        byte b2;
        str.getClass();
        if (!str.isEmpty()) {
            int i = str.charAt(0) == '-' ? 1 : 0;
            if (i != str.length()) {
                int i2 = i + 1;
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    b = AbstractC7938e.ad[charAt];
                } else {
                    byte[] bArr = AbstractC7938e.ad;
                    b = -1;
                }
                if (b >= 0 && b < 10) {
                    long j = -b;
                    long j2 = 10;
                    long j3 = Long.MIN_VALUE / j2;
                    while (true) {
                        if (i2 < str.length()) {
                            int i3 = i2 + 1;
                            char charAt2 = str.charAt(i2);
                            if (charAt2 < 128) {
                                b2 = AbstractC7938e.ad[charAt2];
                            } else {
                                byte[] bArr2 = AbstractC7938e.ad;
                                b2 = -1;
                            }
                            if (b2 < 0 || b2 >= 10 || j < j3) {
                                break;
                            }
                            long j4 = j * j2;
                            num = null;
                            long j5 = b2;
                            if (j4 < j5 - Long.MIN_VALUE) {
                                break;
                            }
                            j = j4 - j5;
                            i2 = i3;
                        } else {
                            num = null;
                            if (i != 0) {
                                l = Long.valueOf(j);
                            } else if (j != Long.MIN_VALUE) {
                                l = Long.valueOf(-j);
                            }
                        }
                    }
                }
                num = null;
                l = num;
                return (l == 0 && l.longValue() == ((long) l.intValue())) ? Integer.valueOf(l.intValue()) : num;
            }
        }
        l = 0;
        num = null;
        if (l == 0) {
        }
    }

    public static int advert(int i, int i2, int i3, int[] iArr) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static void amazon(InterfaceC15813e interfaceC15813e, Annotation annotation, Class cls) {
        for (Method method : cls.getDeclaredMethods()) {
            try {
                Object invoke = method.invoke(annotation, null);
                C0520e appmetrica = C0520e.appmetrica(method.getName());
                Class<?> cls2 = invoke.getClass();
                if (cls2.equals(Class.class)) {
                    interfaceC15813e.remoteconfig(appmetrica, billing((Class) invoke));
                } else if (AbstractC0975e.ad.contains(cls2)) {
                    interfaceC15813e.amazon(appmetrica, invoke);
                } else {
                    List list = AbstractC2677e.ad;
                    if (Enum.class.isAssignableFrom(cls2)) {
                        if (!cls2.isEnum()) {
                            cls2 = cls2.getEnclosingClass();
                        }
                        interfaceC15813e.crashlytics(appmetrica, AbstractC2677e.ad(cls2), C0520e.appmetrica(((Enum) invoke).name()));
                    } else if (Annotation.class.isAssignableFrom(cls2)) {
                        Class cls3 = (Class) AbstractC1660e.m676try(cls2.getInterfaces());
                        InterfaceC15813e mo2367goto = interfaceC15813e.mo2367goto(AbstractC2677e.ad(cls3), appmetrica);
                        if (mo2367goto != null) {
                            amazon(mo2367goto, (Annotation) invoke, cls3);
                        }
                    } else {
                        if (!cls2.isArray()) {
                            throw new UnsupportedOperationException("Unsupported annotation argument value (" + cls2 + "): " + invoke);
                        }
                        InterfaceC11429e tapsense = interfaceC15813e.tapsense(appmetrica);
                        if (tapsense != null) {
                            Class<?> componentType = cls2.getComponentType();
                            if (componentType.isEnum()) {
                                C11709e ad2 = AbstractC2677e.ad(componentType);
                                for (Object obj : (Object[]) invoke) {
                                    tapsense.tapsense(ad2, C0520e.appmetrica(((Enum) obj).name()));
                                }
                            } else if (componentType.equals(Class.class)) {
                                for (Object obj2 : (Object[]) invoke) {
                                    tapsense.mo1988extends(billing((Class) obj2));
                                }
                            } else if (Annotation.class.isAssignableFrom(componentType)) {
                                for (Object obj3 : (Object[]) invoke) {
                                    InterfaceC15813e license = tapsense.license(AbstractC2677e.ad(componentType));
                                    if (license != null) {
                                        amazon(license, (Annotation) obj3, componentType);
                                    }
                                }
                            } else {
                                for (Object obj4 : (Object[]) invoke) {
                                    tapsense.pro(obj4);
                                }
                            }
                            tapsense.mopub();
                        }
                    }
                }
            } catch (IllegalAccessException unused) {
            }
        }
        interfaceC15813e.mopub();
    }

    public static List appmetrica(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new C15235e(0, iArr.length, iArr);
    }

    /* JADX WARN: Type inference failed for: r4v13, types: [java.lang.Object, eؕٛؓ] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, eؕٛؓ] */
    public static C5302e billing(Class cls) {
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
        }
        if (!cls.isPrimitive()) {
            C11709e ad2 = AbstractC2677e.ad(cls);
            String str = C0696e.ad;
            C11709e c11709e = (C11709e) C0696e.yandex.get(ad2.ad().ad);
            if (c11709e != null) {
                ad2 = c11709e;
            }
            return new C5302e(ad2, i);
        }
        if (cls.equals(Void.TYPE)) {
            C12816e startapp = AbstractC0206e.license.startapp();
            return new C5302e(new C11709e(startapp.vip(), startapp.ad.billing()), i);
        }
        EnumC3702e license = EnumC8790e.vip(cls.getName()).license();
        if (i > 0) {
            C12816e c12816e = (C12816e) license.f8287e.getValue();
            return new C5302e(new C11709e(c12816e.vip(), c12816e.ad.billing()), i - 1);
        }
        C12816e c12816e2 = (C12816e) license.f8285e.getValue();
        return new C5302e(new C11709e(c12816e2.vip(), c12816e2.ad.billing()), i);
    }

    public static final void license(boolean z, Function0 function0, Function0 function02, C13770e c13770e, int i) {
        int i2;
        C0115e c0115e;
        float f;
        c13770e.m3671package(1398083095);
        int i3 = i | (c13770e.billing(z) ? 4 : 2) | (c13770e.yandex(function0) ? 32 : 16) | (c13770e.yandex(function02) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c13770e.m3673protected(i3 & 1, (i3 & 147) != 146)) {
            C9577e c9577e = C5438e.f11678e;
            float f2 = 16;
            float ad2 = ((C0916e) c13770e.adcel(AbstractC12450e.ad)).ad(c13770e) + f2;
            C0115e c0115e2 = C0115e.f1276e;
            InterfaceC12864e loadAd = AbstractC12220e.loadAd(c0115e2, f2, 0.0f, f2, ad2, 2);
            C4789e ad3 = AbstractC14801e.ad(AbstractC16497e.metrica, c9577e, c13770e, 48);
            long j = c13770e.f27286case;
            int i4 = (int) (j ^ (j >>> 32));
            InterfaceC3483e advert = c13770e.advert();
            InterfaceC12864e purchase = AbstractC5679e.purchase(c13770e, loadAd);
            InterfaceC5685e.mopub.getClass();
            C7309e c7309e = C2721e.vip;
            c13770e.m3666import();
            if (c13770e.f27292implements) {
                c13770e.mopub(c7309e);
            } else {
                c13770e.m3684volatile();
            }
            AbstractC2270e.yandex(c13770e, ad3, C2721e.billing);
            AbstractC2270e.yandex(c13770e, advert, C2721e.purchase);
            AbstractC2270e.yandex(c13770e, Integer.valueOf(i4), C2721e.adcel);
            AbstractC2270e.purchase(c13770e, C2721e.mopub);
            AbstractC2270e.yandex(c13770e, purchase, C2721e.license);
            if (z) {
                c13770e.m3676strictfp(-905988055);
                i2 = i3;
                c0115e = c0115e2;
                f = f2;
                C8464e.ad.ad(null, 0.0f, 0.0f, null, 0L, c13770e, 196608, 31);
                c13770e.Signature(false);
            } else {
                i2 = i3;
                c0115e = c0115e2;
                f = f2;
                c13770e.m3676strictfp(-905926241);
                AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e, f));
                c13770e.Signature(false);
            }
            metrica(c13770e, 0);
            AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e, f));
            vip(c13770e, 0);
            AbstractC12534e.ad(c13770e, AbstractC18007e.license(c0115e, f));
            ad(function0, function02, c13770e, (i2 >> 3) & 126);
            c13770e.Signature(true);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C4004e(z, function0, function02, i, 1);
        }
    }

    public static int loadAd(long j) {
        return j > 2147483647L ? Alert.DURATION_SHOW_INDEFINITELY : j < -2147483648L ? RecyclerView.UNDEFINED_DURATION : (int) j;
    }

    public static final void metrica(C13770e c13770e, int i) {
        c13770e.m3671package(372940860);
        if (c13770e.m3673protected(i & 1, i != 0)) {
            String appmetrica = AbstractC5297e.appmetrica(c13770e, R.string.ota_card_permission);
            C15492e c15492e = AbstractC11785e.ad;
            AbstractC14489e.vip(appmetrica, AbstractC18007e.metrica(C0115e.f1276e, 1.0f), ((C7019e) c13770e.adcel(c15492e)).ad.admob, 0L, null, null, null, 0L, new C7975e(3), 0L, 0, false, 0, 0, ((C7019e) c13770e.adcel(c15492e)).vip.appmetrica, c13770e, 48, 0, 130040);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C15584e(i, 5);
        }
    }

    public static int mopub(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static int purchase(long j) {
        int i = (int) j;
        AbstractC2301e.appmetrica(j, "Out of range: %s", ((long) i) == j);
        return i;
    }

    public static void smaato(InterfaceC7539e interfaceC7539e, Annotation annotation) {
        Class subs = ((InterfaceC18155e) AbstractC14437e.appmetrica(annotation)).subs();
        InterfaceC15813e metrica = interfaceC7539e.metrica(AbstractC2677e.ad(subs), new C0515e(annotation));
        if (metrica != null) {
            amazon(metrica, annotation, subs);
        }
    }

    public static void startapp(long j, C1292e c1292e, InterfaceC18147e[] interfaceC18147eArr) {
        int i;
        while (true) {
            if (c1292e.ad() <= 1) {
                return;
            }
            int i2 = 0;
            while (true) {
                if (c1292e.ad() == 0) {
                    i = -1;
                    break;
                }
                int ads = c1292e.ads();
                i2 += ads;
                if (ads != 255) {
                    i = i2;
                    break;
                }
            }
            int i3 = 0;
            while (true) {
                if (c1292e.ad() == 0) {
                    i3 = -1;
                    break;
                }
                int ads2 = c1292e.ads();
                i3 += ads2;
                if (ads2 != 255) {
                    break;
                }
            }
            int i4 = c1292e.vip + i3;
            if (i3 == -1 || i3 > c1292e.ad()) {
                AbstractC2803e.smaato("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i4 = c1292e.metrica;
            } else if (i == 4 && i3 >= 8) {
                int ads3 = c1292e.ads();
                int m565goto = c1292e.m565goto();
                int smaato = m565goto == 49 ? c1292e.smaato() : 0;
                int ads4 = c1292e.ads();
                if (m565goto == 47) {
                    c1292e.m568protected(1);
                }
                boolean z = ads3 == 181 && (m565goto == 49 || m565goto == 47) && ads4 == 3;
                if (m565goto == 49) {
                    z &= smaato == 1195456820;
                }
                if (z) {
                    adcel(j, c1292e, interfaceC18147eArr);
                }
            }
            c1292e.m571try(i4);
        }
    }

    public static final void vip(C13770e c13770e, int i) {
        c13770e.m3671package(-1672936872);
        if (c13770e.m3673protected(i & 1, i != 0)) {
            String appmetrica = AbstractC5297e.appmetrica(c13770e, R.string.ota_card_permission_text);
            C15492e c15492e = AbstractC11785e.ad;
            AbstractC14489e.vip(appmetrica, null, ((C7019e) c13770e.adcel(c15492e)).ad.remoteconfig, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, ((C7019e) c13770e.adcel(c15492e)).vip.mopub, c13770e, 0, 0, 131066);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C15584e(i, 6);
        }
    }

    public static int yandex(int i, int i2) {
        AbstractC2301e.metrica(i2, 1073741823, "min (%s) must be less than or equal to max (%s)", i2 <= 1073741823);
        return Math.min(Math.max(i, i2), 1073741823);
    }
}
