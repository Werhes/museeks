package defpackage;

import android.content.SharedPreferences;
import java.util.Locale;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٛۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC7291e {
    public static final C4989e ad = new C4989e(false);

    public static final void ad(C0731e c0731e, C3189e c3189e, EnumC17426e enumC17426e, C7180e c7180e, C13572e c13572e, long j) {
        float intBitsToFloat;
        C12328e c12328e = (C12328e) c13572e.f26878e;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (c3189e.metrica >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (c3189e.metrica & 4294967295L));
        if (license(c3189e)) {
            c13572e.f26879e = 0;
            c12328e.purchase();
        }
        if (!vip(c3189e) && !license(c3189e)) {
            if (c12328e.vip == 3) {
                int i = c13572e.f26879e;
                c13572e.f26879e = i + 1;
                c12328e.Signature(i, c3189e);
            } else {
                c12328e.ad(c3189e);
            }
            if (c13572e.f26879e == 3) {
                c13572e.f26879e = 0;
            }
            Object[] objArr = c12328e.ad;
            int i2 = c12328e.vip;
            float f = 0.0f;
            for (int i3 = 0; i3 < i2; i3++) {
                f += Float.intBitsToFloat((int) (((C3189e) objArr[i3]).metrica >> 32));
            }
            int i4 = c12328e.vip;
            intBitsToFloat2 = f / i4;
            Object[] objArr2 = c12328e.ad;
            float f2 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                f2 += Float.intBitsToFloat((int) (((C3189e) objArr2[i5]).metrica & 4294967295L));
            }
            intBitsToFloat3 = f2 / c12328e.vip;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << 32) | (Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
        if (enumC17426e != null) {
            int i6 = c7180e.ad;
            if (i6 == 1) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            } else if (i6 == 2) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            }
            floatToRawIntBits = enumC17426e == EnumC17426e.f34145e ? (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L) : (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
        }
        ((C7699e) c0731e.f3025e).license(c3189e.vip, C2152e.startapp(floatToRawIntBits, j));
    }

    public static String adcel(int i) {
        return AbstractC8647e.applovin("OperatingMode(mode=", i, ')');
    }

    public static final C13614e appmetrica(C6594e c6594e) {
        Object c12763e;
        SharedPreferences sharedPreferences = (SharedPreferences) c6594e.f13613e;
        String string = sharedPreferences.contains("vk.accountStore") ? sharedPreferences.getString("vk.accountStore", BuildConfig.FLAVOR) : null;
        if (string == null) {
            return null;
        }
        try {
            C18382e c18382e = AbstractC14714e.ad;
            c18382e.getClass();
            c12763e = (C13614e) AbstractC8787e.appmetrica(c18382e, C13614e.Companion.serializer(), string);
        } catch (Throwable th) {
            c12763e = new C12763e(th);
        }
        if (C13523e.ad(c12763e) != null) {
            c6594e.m2217e("vk.accountStore");
        }
        return (C13614e) (c12763e instanceof C12763e ? null : c12763e);
    }

    public static final long billing(C3189e c3189e, EnumC17426e enumC17426e, C7180e c7180e) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long j;
        if (enumC17426e == null) {
            return c3189e.metrica;
        }
        int i = c7180e.ad;
        if (i == 1) {
            intBitsToFloat = Float.intBitsToFloat((int) (c3189e.metrica >> 32));
        } else {
            if (i != 2) {
                return c3189e.metrica;
            }
            intBitsToFloat = Float.intBitsToFloat((int) (c3189e.metrica & 4294967295L));
        }
        if (enumC17426e == EnumC17426e.f34145e) {
            long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
            floatToRawIntBits = Float.floatToRawIntBits(0.0f);
            j = floatToRawIntBits2 << 32;
        } else {
            long floatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
            floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
            j = floatToRawIntBits3 << 32;
        }
        return j | (4294967295L & floatToRawIntBits);
    }

    public static final boolean license(C3189e c3189e) {
        return !c3189e.yandex && c3189e.license;
    }

    public static final C7695e metrica(int i) {
        if (i == 0) {
            return new C7695e(47, true, true);
        }
        if (i == 1) {
            return new C7695e(155, false, false);
        }
        if (i == 2) {
            return new C7695e(229, false, false);
        }
        if (i == 3) {
            return new C7695e(242, false, false);
        }
        throw new IllegalStateException(AbstractC1786e.admob(i, "Incorrect eye number: "));
    }

    public static final long purchase(C3189e c3189e, EnumC17426e enumC17426e, C7180e c7180e, boolean z) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long j;
        long j2 = c3189e.billing;
        if (enumC17426e != null) {
            int i = c7180e.ad;
            if (i == 1) {
                intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            } else if (i == 2) {
                intBitsToFloat = Float.intBitsToFloat((int) (j2 & 4294967295L));
            }
            if (enumC17426e == EnumC17426e.f34145e) {
                long floatToRawIntBits2 = Float.floatToRawIntBits(intBitsToFloat);
                floatToRawIntBits = Float.floatToRawIntBits(0.0f);
                j = floatToRawIntBits2 << 32;
            } else {
                long floatToRawIntBits3 = Float.floatToRawIntBits(0.0f);
                floatToRawIntBits = Float.floatToRawIntBits(intBitsToFloat);
                j = floatToRawIntBits3 << 32;
            }
            j2 = j | (4294967295L & floatToRawIntBits);
        }
        long yandex = C2152e.yandex(billing(c3189e, enumC17426e, c7180e), j2);
        if (z || !c3189e.startapp) {
            return yandex;
        }
        return 0L;
    }

    public static final void startapp(C6594e c6594e, C13614e c13614e) {
        C18382e c18382e = AbstractC14714e.ad;
        c18382e.getClass();
        byte[] metrica = c18382e.metrica(C13614e.Companion.serializer(), c13614e);
        StringBuilder sb = new StringBuilder(metrica.length * 2);
        for (byte b : metrica) {
            sb.append("0123456789ABCDEF".charAt((b >> 4) & 15));
            sb.append("0123456789ABCDEF".charAt(b & 15));
        }
        ((SharedPreferences) c6594e.f13613e).edit().putString("vk.accountStore", sb.toString().toLowerCase(Locale.ROOT)).apply();
    }

    public static final boolean vip(C3189e c3189e) {
        return c3189e.yandex && !c3189e.license;
    }

    /* JADX WARN: Type inference failed for: r8v1, types: [eؒؕ٘, java.lang.Object] */
    public static final C3258e yandex(String str, Object[] objArr, Function1 function1, C13770e c13770e) {
        boolean purchase = c13770e.purchase(objArr);
        Object m3681throw = c13770e.m3681throw();
        Object obj = C2987e.ad;
        if (purchase || m3681throw == obj) {
            C11883e c11883e = new C11883e(10, false);
            InterfaceC11104e.f22002e.getClass();
            C2691e c2691e = C18390e.vip;
            InterfaceC12646e.f25366e.getClass();
            c11883e.f23815e = new C5256e(C13494e.ad, c2691e, c2691e, C13231e.vip, C4832e.ad, true);
            InterfaceC10857e.ad.getClass();
            C0547e c0547e = C12120e.metrica;
            C0547e c0547e2 = C12120e.vip;
            c11883e.f23814e = new C15407e(c0547e, c0547e2, c0547e2, c0547e2);
            C5447e c5447e = new C5447e();
            ?? obj2 = new Object();
            function1.invoke(new C11384e(c11883e));
            Object c14960e = new C14960e((C5256e) c11883e.f23815e, (C15407e) c11883e.f23814e, c5447e, obj2, 1.0f);
            c13770e.m3682throws(c14960e);
            m3681throw = c14960e;
        }
        C14960e c14960e2 = (C14960e) m3681throw;
        boolean purchase2 = c13770e.purchase(str) | c13770e.purchase(c14960e2);
        Object m3681throw2 = c13770e.m3681throw();
        if (purchase2 || m3681throw2 == obj) {
            m3681throw2 = new C3258e(str, c14960e2);
            c13770e.m3682throws(m3681throw2);
        }
        return (C3258e) m3681throw2;
    }
}
