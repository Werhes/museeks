package defpackage;

import android.content.Context;
import android.util.TypedValue;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function10;
import kotlin.jvm.functions.Function11;
import kotlin.jvm.functions.Function12;
import kotlin.jvm.functions.Function13;
import kotlin.jvm.functions.Function14;
import kotlin.jvm.functions.Function15;
import kotlin.jvm.functions.Function16;
import kotlin.jvm.functions.Function17;
import kotlin.jvm.functions.Function18;
import kotlin.jvm.functions.Function19;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function20;
import kotlin.jvm.functions.Function21;
import kotlin.jvm.functions.Function22;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.functions.Function6;
import kotlin.jvm.functions.Function7;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.functions.Function9;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٕؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9476e {
    public static final C12434e ad;

    static {
        int i = 0;
        ad = new C12434e(i, i, 9);
    }

    public static final void Signature(C6594e c6594e, C7080e c7080e) {
        C7080e.Companion.serializer().ad(new C5677e(c6594e, AbstractC14966e.vip(), AbstractC16398e.ad), c7080e);
    }

    public static final void ad(C16646e c16646e, final int i, long j, C13770e c13770e, int i2) {
        int i3;
        c13770e.m3671package(-267849987);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? c13770e.purchase(c16646e) : c13770e.yandex(c16646e) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= c13770e.license(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= c13770e.appmetrica(j) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c13770e.m3673protected(i3 & 1, (i3 & 147) != 146)) {
            c13770e.m3655case();
            if ((i2 & 1) != 0 && !c13770e.isPro()) {
                c13770e.m3659default();
            }
            c13770e.admob();
            Object m3681throw = c13770e.m3681throw();
            Object obj = C2987e.ad;
            if (m3681throw == obj) {
                m3681throw = AbstractC14533e.startapp(null);
                c13770e.m3682throws(m3681throw);
            }
            final InterfaceC3314e interfaceC3314e = (InterfaceC3314e) m3681throw;
            Object m3681throw2 = c13770e.m3681throw();
            if (m3681throw2 == obj) {
                m3681throw2 = AbstractC14533e.startapp(null);
                c13770e.m3682throws(m3681throw2);
            }
            final InterfaceC3314e interfaceC3314e2 = (InterfaceC3314e) m3681throw2;
            Object m3681throw3 = c13770e.m3681throw();
            if (m3681throw3 == obj) {
                m3681throw3 = AbstractC17680e.startapp(c13770e);
                c13770e.m3682throws(m3681throw3);
            }
            final InterfaceC18435e interfaceC18435e = (InterfaceC18435e) m3681throw3;
            boolean yandex = c13770e.yandex(interfaceC18435e) | ((i3 & 112) == 32);
            Object m3681throw4 = c13770e.m3681throw();
            if (yandex || m3681throw4 == obj) {
                m3681throw4 = new Function4() { // from class: eٌّٙ
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        InterfaceC13158e interfaceC13158e = (InterfaceC13158e) obj2;
                        InterfaceC16719e interfaceC16719e = (InterfaceC16719e) obj3;
                        C5602e c5602e = (C5602e) obj4;
                        List list = (List) obj5;
                        int i4 = i;
                        float f = ((C15357e) list.get(i4)).ad;
                        C15357e c15357e = (C15357e) list.get(i4);
                        float f2 = c15357e.ad + c15357e.vip;
                        InterfaceC3314e interfaceC3314e3 = interfaceC3314e;
                        C7558e c7558e = (C7558e) interfaceC3314e3.getValue();
                        InterfaceC5083e interfaceC5083e = null;
                        C11139e c11139e = AbstractC9546e.metrica;
                        if (c7558e == null) {
                            c7558e = new C7558e(new C15765e(f), c11139e, null, 12);
                            interfaceC3314e3.setValue(c7558e);
                        }
                        InterfaceC3314e interfaceC3314e4 = interfaceC3314e2;
                        C7558e c7558e2 = (C7558e) interfaceC3314e4.getValue();
                        if (c7558e2 == null) {
                            c7558e2 = new C7558e(new C15765e(f2), c11139e, null, 12);
                            interfaceC3314e4.setValue(c7558e2);
                        }
                        boolean vip = C15765e.vip(((C15765e) c7558e2.appmetrica.getValue()).f31051e, f2);
                        InterfaceC18435e interfaceC18435e2 = interfaceC18435e;
                        if (!vip) {
                            AbstractC5336e.purchase(interfaceC18435e2, null, 0, new C6152e(c7558e2, f2, interfaceC5083e, 1), 3);
                        }
                        if (!C15765e.vip(((C15765e) c7558e.appmetrica.getValue()).f31051e, f)) {
                            AbstractC5336e.purchase(interfaceC18435e2, null, 0, new C6152e(c7558e, f, interfaceC5083e, 2), 3);
                        }
                        int mo493e = interfaceC13158e.mo493e(((C15765e) c7558e2.license()).f31051e);
                        int mo493e2 = interfaceC13158e.mo493e(((C15765e) c7558e.license()).f31051e);
                        int i5 = mo493e - mo493e2;
                        long j2 = c5602e.ad;
                        AbstractC2832e admob = interfaceC16719e.admob(C5602e.ad(i5, i5, 0, 0, 12, j2));
                        return interfaceC13158e.ads(C5602e.yandex(j2), C5602e.billing(j2), C9139e.f18290e, new C14669e(admob, mo493e2, 2));
                    }
                };
                c13770e.m3682throws(m3681throw4);
            }
            AbstractC17074e.ad(AbstractC16136e.metrica(AbstractC12220e.mopub(AbstractC18127e.purchase(C0115e.f1276e, new C17630e((Function4) m3681throw4, c16646e, 5)), 5).premium(AbstractC18007e.metrica), j, AbstractC6549e.ad), c13770e, 0);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C1777e(c16646e, i, j, i2);
        }
    }

    public static boolean adcel(int i, Object obj) {
        if (obj instanceof InterfaceC12561e) {
            if ((obj instanceof InterfaceC17282e ? ((InterfaceC17282e) obj).getArity() : obj instanceof Function0 ? 0 : obj instanceof Function1 ? 1 : obj instanceof Function2 ? 2 : obj instanceof Function3 ? 3 : obj instanceof Function4 ? 4 : obj instanceof Function5 ? 5 : obj instanceof Function6 ? 6 : obj instanceof Function7 ? 7 : obj instanceof Function8 ? 8 : obj instanceof Function9 ? 9 : obj instanceof Function10 ? 10 : obj instanceof Function11 ? 11 : obj instanceof Function12 ? 12 : obj instanceof Function13 ? 13 : obj instanceof Function14 ? 14 : obj instanceof Function15 ? 15 : obj instanceof Function16 ? 16 : obj instanceof Function17 ? 17 : obj instanceof Function18 ? 18 : obj instanceof Function19 ? 19 : obj instanceof Function20 ? 20 : obj instanceof Function21 ? 21 : obj instanceof Function22 ? 22 : -1) == i) {
                return true;
            }
        }
        return false;
    }

    public static void admob(Object obj, String str) {
        ClassCastException classCastException = new ClassCastException(AbstractC4653e.isPro(obj == null ? "null" : obj.getClass().getName(), " cannot be cast to ", str));
        AbstractC7890e.advert(classCastException, AbstractC9476e.class.getName());
        throw classCastException;
    }

    public static String advert(long j) {
        long millis = TimeUnit.MICROSECONDS.toMillis(j);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(millis);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long minutes = timeUnit.toMinutes(millis - timeUnit2.toMillis(hours));
        long millis2 = millis - timeUnit2.toMillis(hours);
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        long seconds = timeUnit.toSeconds(millis2 - timeUnit3.toMillis(minutes));
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(((millis - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds)));
    }

    public static boolean amazon(Context context, int i, boolean z) {
        TypedValue smaato = smaato(context, i);
        return (smaato == null || smaato.type != 18) ? z : smaato.data != 0;
    }

    public static Set appmetrica(Object obj) {
        if ((obj instanceof InterfaceC16555e) && !(obj instanceof InterfaceC7103e)) {
            admob(obj, "kotlin.collections.MutableSet");
            throw null;
        }
        try {
            return (Set) obj;
        } catch (ClassCastException e) {
            AbstractC7890e.advert(e, AbstractC9476e.class.getName());
            throw e;
        }
    }

    public static String billing(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return "null";
        }
        int position = byteBuffer.position();
        try {
            int remaining = byteBuffer.remaining();
            byte[] bArr = new byte[remaining];
            byteBuffer.get(bArr);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < remaining; i++) {
                sb.append(String.format("%02X ", Byte.valueOf(bArr[i])));
            }
            return sb.toString().trim();
        } finally {
            byteBuffer.position(position);
        }
    }

    public static Map.Entry license(Map.Entry entry) {
        if (!(entry instanceof InterfaceC16555e) || (entry instanceof InterfaceC6514e)) {
            return entry;
        }
        admob(entry, "kotlin.collections.MutableMap.MutableEntry");
        throw null;
    }

    public static TypedValue loadAd(int i, Context context, String str) {
        TypedValue smaato = smaato(context, i);
        if (smaato != null) {
            return smaato;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static Map metrica(Object obj) {
        if ((obj instanceof InterfaceC16555e) && !(obj instanceof InterfaceC6770e)) {
            admob(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            AbstractC7890e.advert(e, AbstractC9476e.class.getName());
            throw e;
        }
    }

    public static boolean mopub(Object obj) {
        if (obj instanceof Map.Entry) {
            return !(obj instanceof InterfaceC16555e) || (obj instanceof InterfaceC6514e);
        }
        return false;
    }

    public static void purchase(int i, Object obj) {
        if (obj == null || adcel(i, obj)) {
            return;
        }
        admob(obj, "kotlin.jvm.functions.Function" + i);
        throw null;
    }

    public static final void remoteconfig(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder pro = AbstractC17861e.pro(i3, i, "OffsetMapping.transformedToOriginal returned invalid mapping: ", " -> ", " is not in range of original text [0, ");
        pro.append(i2);
        pro.append(']');
        AbstractC8889e.metrica(pro.toString());
    }

    public static TypedValue smaato(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static final C2547e startapp(C2864e c2864e, C10566e c10566e) {
        c2864e.getClass();
        int length = c10566e.f20850e.length();
        int length2 = c10566e.f20850e.length();
        int min = Math.min(length, 100);
        for (int i = 0; i < min; i++) {
            subscription(i, length2, i);
        }
        subscription(length, length2, length);
        int min2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < min2; i2++) {
            remoteconfig(i2, length, i2);
        }
        remoteconfig(length2, length, length2);
        return new C2547e(c10566e, new C12434e(c10566e.f20850e.length(), c10566e.f20850e.length(), 9));
    }

    public static final void subscription(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        StringBuilder pro = AbstractC17861e.pro(i3, i, "OffsetMapping.originalToTransformed returned invalid mapping: ", " -> ", " is not in range of transformed text [0, ");
        pro.append(i2);
        pro.append(']');
        AbstractC8889e.metrica(pro.toString());
    }

    public static Collection vip(Object obj) {
        if ((obj instanceof InterfaceC16555e) && !(obj instanceof InterfaceC12555e)) {
            admob(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e) {
            AbstractC7890e.advert(e, AbstractC9476e.class.getName());
            throw e;
        }
    }

    public static final void yandex(C6594e c6594e) {
        AbstractC17947e.startapp(c6594e, C7080e.Companion.serializer(), AbstractC14966e.vip());
    }
}
