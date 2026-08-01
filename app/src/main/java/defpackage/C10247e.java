package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٓؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10247e {
    public final C9062e ad = C9062e.purchase();
    public boolean vip;

    static {
        new C10247e(0);
    }

    public C10247e() {
    }

    public C10247e(int i) {
        vip();
        vip();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0013. Please report as an issue. */
    public static int ad(EnumC3844e enumC3844e, int i, Object obj) {
        int size;
        int amazon;
        int smaato = C15997e.smaato(i);
        if (enumC3844e == EnumC3844e.f8486e) {
            smaato *= 2;
        }
        int i2 = 1;
        switch (enumC3844e.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                Logger logger = C15997e.billing;
                i2 = 8;
                return i2 + smaato;
            case 1:
                ((Float) obj).getClass();
                Logger logger2 = C15997e.billing;
                i2 = 4;
                return i2 + smaato;
            case 2:
                i2 = C15997e.loadAd(((Long) obj).longValue());
                return i2 + smaato;
            case 3:
                i2 = C15997e.loadAd(((Long) obj).longValue());
                return i2 + smaato;
            case 4:
                i2 = C15997e.loadAd(((Integer) obj).intValue());
                return i2 + smaato;
            case 5:
                ((Long) obj).getClass();
                Logger logger3 = C15997e.billing;
                i2 = 8;
                return i2 + smaato;
            case 6:
                ((Integer) obj).getClass();
                Logger logger4 = C15997e.billing;
                i2 = 4;
                return i2 + smaato;
            case 7:
                ((Boolean) obj).getClass();
                Logger logger5 = C15997e.billing;
                return i2 + smaato;
            case 8:
                if (!(obj instanceof C6283e)) {
                    i2 = C15997e.advert((String) obj);
                    return i2 + smaato;
                }
                Logger logger6 = C15997e.billing;
                size = ((C6283e) obj).size();
                amazon = C15997e.amazon(size);
                i2 = amazon + size;
                return i2 + smaato;
            case 9:
                i2 = ((AbstractC18270e) ((AbstractC4765e) obj)).ad(null);
                return i2 + smaato;
            case 10:
                Logger logger7 = C15997e.billing;
                size = ((AbstractC18270e) ((AbstractC4765e) obj)).ad(null);
                amazon = C15997e.amazon(size);
                i2 = amazon + size;
                return i2 + smaato;
            case 11:
                if (obj instanceof C6283e) {
                    Logger logger8 = C15997e.billing;
                    size = ((C6283e) obj).size();
                    amazon = C15997e.amazon(size);
                } else {
                    Logger logger9 = C15997e.billing;
                    size = ((byte[]) obj).length;
                    amazon = C15997e.amazon(size);
                }
                i2 = amazon + size;
                return i2 + smaato;
            case 12:
                i2 = C15997e.amazon(((Integer) obj).intValue());
                return i2 + smaato;
            case 13:
                i2 = C15997e.loadAd(((Integer) obj).intValue());
                return i2 + smaato;
            case 14:
                ((Integer) obj).getClass();
                Logger logger10 = C15997e.billing;
                i2 = 4;
                return i2 + smaato;
            case 15:
                ((Long) obj).getClass();
                Logger logger11 = C15997e.billing;
                i2 = 8;
                return i2 + smaato;
            case 16:
                int intValue = ((Integer) obj).intValue();
                i2 = C15997e.amazon((intValue >> 31) ^ (intValue << 1));
                return i2 + smaato;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                long longValue = ((Long) obj).longValue();
                i2 = C15997e.loadAd((longValue << 1) ^ (longValue >> 63));
                return i2 + smaato;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static void metrica(C15997e c15997e, EnumC3844e enumC3844e, int i, Object obj) {
        if (enumC3844e == EnumC3844e.f8486e) {
            c15997e.firebase(i, 3);
            ((AbstractC18270e) ((AbstractC4765e) obj)).advert(c15997e);
            c15997e.firebase(i, 4);
            return;
        }
        c15997e.firebase(i, enumC3844e.f8488e);
        switch (enumC3844e.ordinal()) {
            case 0:
                c15997e.applovin(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                c15997e.inmobi(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                c15997e.m4100this(((Long) obj).longValue());
                return;
            case 3:
                c15997e.m4100this(((Long) obj).longValue());
                return;
            case 4:
                c15997e.premium(((Integer) obj).intValue());
                return;
            case 5:
                c15997e.applovin(((Long) obj).longValue());
                return;
            case 6:
                c15997e.inmobi(((Integer) obj).intValue());
                return;
            case 7:
                c15997e.subscription(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 8:
                if (obj instanceof C6283e) {
                    c15997e.tapsense((C6283e) obj);
                    return;
                } else {
                    c15997e.crashlytics((String) obj);
                    return;
                }
            case 9:
                ((AbstractC18270e) ((AbstractC4765e) obj)).advert(c15997e);
                return;
            case 10:
                AbstractC4765e abstractC4765e = (AbstractC4765e) obj;
                c15997e.getClass();
                c15997e.m4099interface(((AbstractC18270e) abstractC4765e).ad(null));
                ((AbstractC18270e) abstractC4765e).advert(c15997e);
                return;
            case 11:
                if (obj instanceof C6283e) {
                    c15997e.tapsense((C6283e) obj);
                    return;
                }
                byte[] bArr = (byte[]) obj;
                int length = bArr.length;
                c15997e.m4099interface(length);
                c15997e.remoteconfig(bArr, 0, length);
                return;
            case 12:
                c15997e.m4099interface(((Integer) obj).intValue());
                return;
            case 13:
                c15997e.premium(((Integer) obj).intValue());
                return;
            case 14:
                c15997e.inmobi(((Integer) obj).intValue());
                return;
            case 15:
                c15997e.applovin(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                c15997e.m4099interface((intValue >> 31) ^ (intValue << 1));
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                long longValue = ((Long) obj).longValue();
                c15997e.m4100this((longValue >> 63) ^ (longValue << 1));
                return;
            default:
                return;
        }
    }

    public final Object clone() {
        C10247e c10247e = new C10247e();
        C9062e c9062e = this.ad;
        if (c9062e.f18155e > 0) {
            c9062e.metrica(0).f15162e.getClass();
            throw new ClassCastException();
        }
        Iterator it = c9062e.license().iterator();
        if (!it.hasNext()) {
            return c10247e;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10247e) {
            return this.ad.equals(((C10247e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final void vip() {
        if (this.vip) {
            return;
        }
        C9062e c9062e = this.ad;
        int i = c9062e.f18155e;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = c9062e.metrica(i2).f15161e;
            if (obj instanceof AbstractC18270e) {
                ((AbstractC18270e) obj).billing();
            }
        }
        Iterator it = c9062e.license().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof AbstractC18270e) {
                ((AbstractC18270e) value).billing();
            }
        }
        if (!c9062e.f18156e) {
            if (c9062e.f18155e > 0) {
                c9062e.metrica(0).f15162e.getClass();
                throw new ClassCastException();
            }
            Iterator it2 = c9062e.license().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!c9062e.f18156e) {
            c9062e.f18154e = c9062e.f18154e.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(c9062e.f18154e);
            c9062e.f18158e = c9062e.f18158e.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(c9062e.f18158e);
            c9062e.f18156e = true;
        }
        this.vip = true;
    }
}
