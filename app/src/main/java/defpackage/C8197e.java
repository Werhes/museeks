package defpackage;

import android.content.SharedPreferences;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۚ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C8197e extends AbstractC3199e {
    public final String appmetrica;
    public final C12718e billing;
    public final C6594e license;
    public final C10068e purchase;
    public int startapp;
    public final C12718e yandex;

    public C8197e(C6594e c6594e, String str, C10068e c10068e) {
        this.license = c6594e;
        this.appmetrica = str;
        this.purchase = c10068e;
        C12718e c12718e = new C12718e();
        c12718e.addLast(str);
        this.billing = c12718e;
        C12718e c12718e2 = new C12718e();
        c12718e2.addLast(0);
        this.yandex = c12718e2;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final void Signature() {
    }

    @Override // defpackage.InterfaceC2043e
    public final C10068e ad() {
        return this.purchase;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final byte ads() {
        Integer m2226package = this.license.m2226package(m2390while());
        if (m2226package != null) {
            return (byte) m2226package.intValue();
        }
        AbstractC1216e.ad();
        throw null;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final int amazon() {
        Integer m2226package = this.license.m2226package(m2390while());
        if (m2226package != null) {
            return m2226package.intValue();
        }
        AbstractC1216e.ad();
        throw null;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final boolean appmetrica() {
        Boolean billing = this.license.billing(m2390while());
        if (billing != null) {
            return billing.booleanValue();
        }
        AbstractC1216e.ad();
        throw null;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    /* renamed from: class */
    public final double mo501class() {
        String m2390while = m2390while();
        SharedPreferences sharedPreferences = (SharedPreferences) this.license.f13613e;
        Double valueOf = sharedPreferences.contains(m2390while) ? Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong(m2390while, Double.doubleToRawLongBits(0.0d)))) : null;
        if (valueOf != null) {
            return valueOf.doubleValue();
        }
        AbstractC1216e.ad();
        throw null;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final float crashlytics() {
        String m2390while = m2390while();
        SharedPreferences sharedPreferences = (SharedPreferences) this.license.f13613e;
        Float valueOf = sharedPreferences.contains(m2390while) ? Float.valueOf(sharedPreferences.getFloat(m2390while, 0.0f)) : null;
        if (valueOf != null) {
            return valueOf.floatValue();
        }
        AbstractC1216e.ad();
        throw null;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final boolean isVip() {
        Boolean billing = this.license.billing(m2390while() + '?');
        if (billing != null) {
            return billing.booleanValue();
        }
        AbstractC1216e.ad();
        throw null;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final InterfaceC2043e metrica(InterfaceC9998e interfaceC9998e) {
        this.startapp++;
        return this;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final String pro() {
        String m2390while = m2390while();
        SharedPreferences sharedPreferences = (SharedPreferences) this.license.f13613e;
        String string = sharedPreferences.contains(m2390while) ? sharedPreferences.getString(m2390while, BuildConfig.FLAVOR) : null;
        if (string != null) {
            return string;
        }
        AbstractC1216e.ad();
        throw null;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final char purchase() {
        Integer m2226package = this.license.m2226package(m2390while());
        if (m2226package != null) {
            return (char) m2226package.intValue();
        }
        AbstractC1216e.ad();
        throw null;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final int signatures(InterfaceC9998e interfaceC9998e) {
        Integer m2226package = this.license.m2226package(m2390while());
        if (m2226package != null) {
            return m2226package.intValue();
        }
        AbstractC1216e.ad();
        throw null;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final short subs() {
        Integer m2226package = this.license.m2226package(m2390while());
        if (m2226package != null) {
            return (short) m2226package.intValue();
        }
        AbstractC1216e.ad();
        throw null;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final long tapsense() {
        String m2390while = m2390while();
        SharedPreferences sharedPreferences = (SharedPreferences) this.license.f13613e;
        Long valueOf = sharedPreferences.contains(m2390while) ? Long.valueOf(sharedPreferences.getLong(m2390while, 0L)) : null;
        if (valueOf != null) {
            return valueOf.longValue();
        }
        AbstractC1216e.ad();
        throw null;
    }

    /* renamed from: throw, reason: not valid java name */
    public final int m2389throw() {
        Integer m2226package = this.license.m2226package(m2390while() + ".size");
        if (m2226package != null) {
            return m2226package.intValue();
        }
        AbstractC1216e.ad();
        throw null;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC2043e
    public final void vip(InterfaceC9998e interfaceC9998e) {
        this.startapp--;
        C12718e c12718e = this.billing;
        c12718e.removeLast();
        C12718e c12718e2 = this.yandex;
        c12718e2.removeLast();
        if (c12718e.isEmpty()) {
            c12718e.addLast(this.appmetrica);
            c12718e2.addLast(0);
        }
    }

    /* renamed from: while, reason: not valid java name */
    public final String m2390while() {
        return AbstractC13480e.m3608try(this.billing, ".", null, null, null, 62);
    }

    @Override // defpackage.InterfaceC2043e
    public final int yandex(InterfaceC9998e interfaceC9998e) {
        int intValue;
        String str;
        C6594e c6594e;
        C12718e c12718e = this.billing;
        int i = c12718e.f25459e;
        int i2 = this.startapp;
        C12718e c12718e2 = this.yandex;
        if (i > i2) {
            c12718e.removeLast();
            c12718e2.removeLast();
        }
        AbstractC8457e appmetrica = interfaceC9998e.appmetrica();
        int m2389throw = AbstractC7890e.billing(appmetrica, C3016e.appmetrica) ? m2389throw() : AbstractC7890e.billing(appmetrica, C18215e.appmetrica) ? m2389throw() * 2 : interfaceC9998e.purchase();
        do {
            intValue = ((Number) c12718e2.removeLast()).intValue();
            c12718e2.addLast(Integer.valueOf(intValue + 1));
            if (intValue < m2389throw) {
                str = m2390while() + '.' + interfaceC9998e.billing(intValue);
                if (!interfaceC9998e.mopub(intValue)) {
                    break;
                }
                c6594e = this.license;
                if (((SharedPreferences) c6594e.f13613e).contains(str)) {
                    break;
                }
            } else {
                return -1;
            }
        } while (!AbstractC7890e.billing(c6594e.billing(str.concat("?")), Boolean.TRUE));
        c12718e.addLast(interfaceC9998e.billing(intValue));
        c12718e2.addLast(0);
        return intValue;
    }
}
