package defpackage;

import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import java.math.BigInteger;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.functions.Function1;

/* renamed from: eؓؓۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1561e {
    public static final Object ad = new Object();
    public static ExecutorService vip;

    public static long[] ad(long[]... jArr) {
        long j = 0;
        for (long[] jArr2 : jArr) {
            j += jArr2.length;
        }
        int i = (int) j;
        AbstractC2301e.appmetrica(j, "the total number of elements (%s) in the arrays must fit in an int", j == ((long) i));
        long[] jArr3 = new long[i];
        int i2 = 0;
        for (long[] jArr4 : jArr) {
            System.arraycopy(jArr4, 0, jArr3, i2, jArr4.length);
            i2 += jArr4.length;
        }
        return jArr3;
    }

    public static int appmetrica(float f) {
        if (Float.isNaN(f)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(f);
    }

    public static final InterfaceC12864e billing(InterfaceC12864e interfaceC12864e, C5780e c5780e, Function1 function1, C6406e c6406e, Function1 function12) {
        return interfaceC12864e.premium(new C9188e(c5780e, function1, c6406e, function12));
    }

    public static int license(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return d > 2.147483647E9d ? Alert.DURATION_SHOW_INDEFINITELY : d < -2.147483648E9d ? RecyclerView.UNDEFINED_DURATION : (int) Math.round(d);
    }

    public static int metrica(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static long purchase(double d) {
        if (Double.isNaN(d)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        }
        return Math.round(d);
    }

    public static final C0763e startapp(C0763e c0763e, InterfaceC0043e interfaceC0043e, InterfaceC0043e interfaceC0043e2) {
        if (!interfaceC0043e.billing() || !interfaceC0043e2.billing()) {
            return C0763e.appmetrica;
        }
        return AbstractC18489e.billing(interfaceC0043e2.mo207class(AbstractC0890e.metrica(interfaceC0043e), c0763e.yandex()), c0763e.billing());
    }

    public static AbstractC9932e vip(AbstractC0362e abstractC0362e, byte[] bArr) {
        AbstractC7861e abstractC7861e;
        AbstractC7861e adcel = abstractC0362e.adcel(BigInteger.valueOf(bArr[bArr.length - 1] & 1));
        AbstractC7861e adcel2 = abstractC0362e.adcel(new BigInteger(1, bArr));
        if (!yandex(adcel2).equals(abstractC0362e.vip)) {
            adcel2 = adcel2.vip();
        }
        if (adcel2.subscription()) {
            abstractC7861e = abstractC0362e.metrica.isPro();
        } else {
            AbstractC7861e ad2 = adcel2.applovin().Signature().remoteconfig(abstractC0362e.metrica).ad(abstractC0362e.vip).ad(adcel2);
            if (!ad2.subscription()) {
                AbstractC7861e adcel3 = abstractC0362e.adcel(InterfaceC4563e.loadAd);
                Random random = new Random();
                int loadAd = ad2.loadAd();
                while (true) {
                    AbstractC7861e adcel4 = abstractC0362e.adcel(new BigInteger(loadAd, random));
                    AbstractC7861e abstractC7861e2 = ad2;
                    AbstractC7861e abstractC7861e3 = adcel3;
                    for (int i = 1; i <= loadAd - 1; i++) {
                        AbstractC7861e applovin = abstractC7861e2.applovin();
                        abstractC7861e3 = abstractC7861e3.applovin().ad(applovin.remoteconfig(adcel4));
                        abstractC7861e2 = applovin.ad(ad2);
                    }
                    if (!abstractC7861e2.subscription()) {
                        ad2 = null;
                        break;
                    }
                    if (!abstractC7861e3.applovin().ad(abstractC7861e3).subscription()) {
                        ad2 = abstractC7861e3;
                        break;
                    }
                }
            }
            if (ad2 != null) {
                if (!yandex(ad2).equals(adcel)) {
                    ad2 = ad2.vip();
                }
                abstractC7861e = adcel2.remoteconfig(ad2);
            } else {
                abstractC7861e = null;
            }
        }
        if (abstractC7861e != null) {
            return abstractC0362e.pro(adcel2.firebase(), abstractC7861e.firebase());
        }
        throw new IllegalArgumentException("Invalid point compression");
    }

    public static AbstractC7861e yandex(AbstractC7861e abstractC7861e) {
        AbstractC7861e abstractC7861e2 = abstractC7861e;
        for (int i = 1; i < abstractC7861e.loadAd(); i++) {
            abstractC7861e2 = abstractC7861e2.applovin().ad(abstractC7861e);
        }
        return abstractC7861e2;
    }
}
