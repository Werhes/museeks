package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؑٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0291e {
    public final C12745e ad = new C12745e();
    public boolean vip;

    static {
        new C0291e(0);
    }

    public C0291e() {
    }

    public C0291e(int i) {
        ad();
        ad();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x0014. Please report as an issue. */
    public static int metrica(EnumC11345e enumC11345e, int i, Object obj) {
        int vip;
        int subscription;
        int subscription2 = AbstractC13874e.subscription(i << 3);
        if (enumC11345e == EnumC11345e.f22821e) {
            subscription2 += subscription2;
        }
        EnumC7932e enumC7932e = EnumC7932e.f16064e;
        int i2 = 4;
        switch (enumC11345e.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                i2 = 8;
                return i2 + subscription2;
            case 1:
                ((Float) obj).getClass();
                return i2 + subscription2;
            case 2:
                i2 = AbstractC13874e.remoteconfig(((Long) obj).longValue());
                return i2 + subscription2;
            case 3:
                i2 = AbstractC13874e.remoteconfig(((Long) obj).longValue());
                return i2 + subscription2;
            case 4:
                i2 = AbstractC13874e.remoteconfig(((Integer) obj).intValue());
                return i2 + subscription2;
            case 5:
                ((Long) obj).getClass();
                i2 = 8;
                return i2 + subscription2;
            case 6:
                ((Integer) obj).getClass();
                return i2 + subscription2;
            case 7:
                ((Boolean) obj).getClass();
                i2 = 1;
                return i2 + subscription2;
            case 8:
                if (obj instanceof AbstractC7244e) {
                    vip = ((AbstractC7244e) obj).billing();
                    subscription = AbstractC13874e.subscription(vip);
                } else {
                    vip = AbstractC2059e.vip((String) obj);
                    subscription = AbstractC13874e.subscription(vip);
                }
                i2 = subscription + vip;
                return i2 + subscription2;
            case 9:
                i2 = ((AbstractC15319e) ((AbstractC17836e) obj)).amazon();
                return i2 + subscription2;
            case 10:
                vip = ((AbstractC15319e) ((AbstractC17836e) obj)).amazon();
                subscription = AbstractC13874e.subscription(vip);
                i2 = subscription + vip;
                return i2 + subscription2;
            case 11:
                if (obj instanceof AbstractC7244e) {
                    vip = ((AbstractC7244e) obj).billing();
                    subscription = AbstractC13874e.subscription(vip);
                } else {
                    vip = ((byte[]) obj).length;
                    subscription = AbstractC13874e.subscription(vip);
                }
                i2 = subscription + vip;
                return i2 + subscription2;
            case 12:
                i2 = AbstractC13874e.subscription(((Integer) obj).intValue());
                return i2 + subscription2;
            case 13:
                i2 = obj instanceof InterfaceC14759e ? AbstractC13874e.remoteconfig(((InterfaceC14759e) obj).ad()) : AbstractC13874e.remoteconfig(((Integer) obj).intValue());
                return i2 + subscription2;
            case 14:
                ((Integer) obj).getClass();
                return i2 + subscription2;
            case 15:
                ((Long) obj).getClass();
                i2 = 8;
                return i2 + subscription2;
            case 16:
                int intValue = ((Integer) obj).intValue();
                i2 = AbstractC13874e.subscription((intValue >> 31) ^ (intValue + intValue));
                return i2 + subscription2;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                long longValue = ((Long) obj).longValue();
                i2 = AbstractC13874e.remoteconfig((longValue >> 63) ^ (longValue + longValue));
                return i2 + subscription2;
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static void vip(AbstractC13874e abstractC13874e, EnumC11345e enumC11345e, int i, Object obj) {
        if (enumC11345e == EnumC11345e.f22821e) {
            abstractC13874e.pro(i, 3);
            ((AbstractC15319e) ((AbstractC17836e) obj)).purchase(abstractC13874e);
            abstractC13874e.pro(i, 4);
            return;
        }
        abstractC13874e.pro(i, enumC11345e.f22823e);
        EnumC7932e enumC7932e = EnumC7932e.f16064e;
        switch (enumC11345e.ordinal()) {
            case 0:
                abstractC13874e.mo1197extends(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                return;
            case 1:
                abstractC13874e.mo1201this(Float.floatToRawIntBits(((Float) obj).floatValue()));
                return;
            case 2:
                abstractC13874e.mo1200native(((Long) obj).longValue());
                return;
            case 3:
                abstractC13874e.mo1200native(((Long) obj).longValue());
                return;
            case 4:
                abstractC13874e.mo1199interface(((Integer) obj).intValue());
                return;
            case 5:
                abstractC13874e.mo1197extends(((Long) obj).longValue());
                return;
            case 6:
                abstractC13874e.mo1201this(((Integer) obj).intValue());
                return;
            case 7:
                abstractC13874e.mo1196class(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                return;
            case 8:
                if (obj instanceof AbstractC7244e) {
                    abstractC13874e.subs((AbstractC7244e) obj);
                    return;
                } else {
                    abstractC13874e.mo1202throw((String) obj);
                    return;
                }
            case 9:
                ((AbstractC15319e) ((AbstractC17836e) obj)).purchase(abstractC13874e);
                return;
            case 10:
                abstractC13874e.firebase((AbstractC17836e) obj);
                return;
            case 11:
                if (obj instanceof AbstractC7244e) {
                    abstractC13874e.subs((AbstractC7244e) obj);
                    return;
                } else {
                    byte[] bArr = (byte[]) obj;
                    abstractC13874e.crashlytics(bArr.length, bArr);
                    return;
                }
            case 12:
                abstractC13874e.mo1198goto(((Integer) obj).intValue());
                return;
            case 13:
                if (obj instanceof InterfaceC14759e) {
                    abstractC13874e.mo1199interface(((InterfaceC14759e) obj).ad());
                    return;
                } else {
                    abstractC13874e.mo1199interface(((Integer) obj).intValue());
                    return;
                }
            case 14:
                abstractC13874e.mo1201this(((Integer) obj).intValue());
                return;
            case 15:
                abstractC13874e.mo1197extends(((Long) obj).longValue());
                return;
            case 16:
                int intValue = ((Integer) obj).intValue();
                abstractC13874e.mo1198goto((intValue >> 31) ^ (intValue + intValue));
                return;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                long longValue = ((Long) obj).longValue();
                abstractC13874e.mo1200native((longValue >> 63) ^ (longValue + longValue));
                return;
            default:
                return;
        }
    }

    public final void ad() {
        if (this.vip) {
            return;
        }
        C12745e c12745e = this.ad;
        int i = c12745e.f25497e;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = c12745e.ad(i2).f22904e;
            if (obj instanceof AbstractC15319e) {
                ((AbstractC15319e) obj).adcel();
            }
        }
        Iterator it = c12745e.vip().iterator();
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            if (value instanceof AbstractC15319e) {
                ((AbstractC15319e) value).adcel();
            }
        }
        if (!c12745e.f25498e) {
            if (c12745e.f25497e > 0) {
                c12745e.ad(0).f22905e.getClass();
                throw new ClassCastException();
            }
            Iterator it2 = c12745e.vip().iterator();
            if (it2.hasNext()) {
                ((Map.Entry) it2.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!c12745e.f25498e) {
            c12745e.f25496e = c12745e.f25496e.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(c12745e.f25496e);
            c12745e.f25500e = c12745e.f25500e.isEmpty() ? Collections.EMPTY_MAP : DesugarCollections.unmodifiableMap(c12745e.f25500e);
            c12745e.f25498e = true;
        }
        this.vip = true;
    }

    public final Object clone() {
        C0291e c0291e = new C0291e();
        C12745e c12745e = this.ad;
        if (c12745e.f25497e > 0) {
            c12745e.ad(0).f22905e.getClass();
            throw new ClassCastException();
        }
        Iterator it = c12745e.vip().iterator();
        if (!it.hasNext()) {
            return c0291e;
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
        if (obj instanceof C0291e) {
            return this.ad.equals(((C0291e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }
}
