package defpackage;

import android.content.res.Resources;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؑ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15920e implements InterfaceC5757e, InterfaceC11845e {
    public static final C2892e ad = new C2892e(-708670039, false, new C13060e(13));
    public static final C2892e vip = new C2892e(-1894194520, false, new C13060e(14));
    public static final C2892e metrica = new C2892e(96626318, false, new C13060e(15));
    public static final C2892e license = new C2892e(1729524047, false, new C13060e(16));
    public static final C2892e appmetrica = new C2892e(-996645297, false, new C14123e(12));
    public static final C2892e purchase = new C2892e(1509045451, false, new C14123e(13));
    public static final C2892e billing = new C2892e(953263671, false, new C14123e(14));
    public static final C2892e yandex = new C2892e(-1220209853, false, new C14123e(15));
    public static final C2892e startapp = new C2892e(-1473050393, false, new C13060e(17));

    public static InterfaceC12864e crashlytics(InterfaceC12864e interfaceC12864e, boolean z, InterfaceC12864e interfaceC12864e2) {
        if (!z) {
            interfaceC12864e2 = C0115e.f1276e;
        }
        return interfaceC12864e.premium(interfaceC12864e2);
    }

    public static String firebase(Resources resources, int i, int i2) {
        Object c12763e;
        try {
            c12763e = resources.getQuantityString(i, i2, Integer.valueOf(i2));
        } catch (Throwable th) {
            c12763e = new C12763e(th);
        }
        if (C13523e.ad(c12763e) != null) {
            c12763e = String.valueOf(i2);
        }
        return (String) c12763e;
    }

    public static String premium(long j) {
        long j2 = 1000;
        long j3 = j / j2;
        long j4 = (j % j2) / 10;
        if (j3 < 3600) {
            long j5 = 60;
            return String.format(Locale.ROOT, "%02d:%02d.%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3 / j5), Long.valueOf(j3 % j5), Long.valueOf(j4)}, 3));
        }
        long j6 = 3600;
        long j7 = 60;
        return String.format(Locale.ROOT, "%02d:%02d:%02d.%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3 / j6), Long.valueOf((j3 % j6) / j7), Long.valueOf(j3 % j7), Long.valueOf(j4)}, 4));
    }

    public static String subs(long j, boolean z) {
        if (z) {
            j /= 1000;
        }
        if (j < EnumC14332e.f28352e.f28355e) {
            long j2 = 60;
            return String.format(Locale.ROOT, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j / j2), Long.valueOf(j % j2)}, 2));
        }
        long j3 = 3600;
        long j4 = 60;
        return String.format(Locale.ROOT, "%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j / j3), Long.valueOf((j % j3) / j4), Long.valueOf(j % j4)}, 3));
    }

    public void Signature(InterfaceC9998e interfaceC9998e, int i, InterfaceC5372e interfaceC5372e, Object obj) {
        tapsense(interfaceC9998e, i);
        if (interfaceC5372e.appmetrica().metrica()) {
            appmetrica(interfaceC5372e, obj);
        } else if (obj == null) {
            license();
        } else {
            smaato();
            appmetrica(interfaceC5372e, obj);
        }
    }

    @Override // defpackage.InterfaceC5757e
    public InterfaceC5757e adcel(InterfaceC9998e interfaceC9998e) {
        return this;
    }

    @Override // defpackage.InterfaceC5757e
    public abstract void admob(long j);

    public void ads(InterfaceC9998e interfaceC9998e, int i, String str) {
        tapsense(interfaceC9998e, i);
        remoteconfig(str);
    }

    @Override // defpackage.InterfaceC5757e
    public abstract void advert(char c);

    public void applovin(InterfaceC9998e interfaceC9998e, int i, InterfaceC5372e interfaceC5372e, Object obj) {
        tapsense(interfaceC9998e, i);
        appmetrica(interfaceC5372e, obj);
    }

    @Override // defpackage.InterfaceC5757e
    public void appmetrica(InterfaceC5372e interfaceC5372e, Object obj) {
        interfaceC5372e.ad(this, obj);
    }

    @Override // defpackage.InterfaceC5757e
    public abstract void billing(short s);

    public void inmobi(int i, int i2, InterfaceC9998e interfaceC9998e) {
        tapsense(interfaceC9998e, i);
        loadAd(i2);
    }

    public void isPro(InterfaceC9998e interfaceC9998e, int i, long j) {
        tapsense(interfaceC9998e, i);
        admob(j);
    }

    public InterfaceC5757e isVip(C3907e c3907e, int i) {
        tapsense(c3907e, i);
        return adcel(c3907e.adcel(i));
    }

    @Override // defpackage.InterfaceC5757e
    public abstract void loadAd(int i);

    @Override // defpackage.InterfaceC5757e
    public abstract void mopub(float f);

    @Override // defpackage.InterfaceC5757e
    public InterfaceC11845e pro(InterfaceC9998e interfaceC9998e, int i) {
        return metrica(interfaceC9998e);
    }

    @Override // defpackage.InterfaceC5757e
    public abstract void purchase(double d);

    @Override // defpackage.InterfaceC5757e
    public abstract void remoteconfig(String str);

    public void signatures(InterfaceC9998e interfaceC9998e, int i, boolean z) {
        tapsense(interfaceC9998e, i);
        startapp(z);
    }

    @Override // defpackage.InterfaceC5757e
    public void smaato() {
    }

    @Override // defpackage.InterfaceC5757e
    public abstract void startapp(boolean z);

    public boolean subscription() {
        return true;
    }

    public abstract void tapsense(InterfaceC9998e interfaceC9998e, int i);

    @Override // defpackage.InterfaceC5757e
    public abstract void yandex(byte b);
}
