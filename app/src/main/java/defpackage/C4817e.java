package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِّؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4817e extends AbstractC3199e {
    public int adcel;
    public final String appmetrica;
    public final ArrayList billing = new ArrayList();
    public final C6594e license;
    public final C10068e purchase;
    public final C12718e startapp;
    public final C12718e yandex;

    public C4817e(C6594e c6594e, String str, C10068e c10068e) {
        this.license = c6594e;
        this.appmetrica = str;
        this.purchase = c10068e;
        C12718e c12718e = new C12718e();
        c12718e.addLast(str);
        this.yandex = c12718e;
        C12718e c12718e2 = new C12718e();
        c12718e2.addLast(0);
        this.startapp = c12718e2;
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
        this.billing.add(m1674while());
        return (byte) 0;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final int amazon() {
        this.billing.add(m1674while());
        return 0;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final boolean appmetrica() {
        this.billing.add(m1674while());
        return false;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    /* renamed from: class */
    public final double mo501class() {
        this.billing.add(m1674while());
        return 0.0d;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final float crashlytics() {
        this.billing.add(m1674while());
        return 0.0f;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final boolean isVip() {
        boolean z = ((SharedPreferences) this.license.f13613e).getBoolean(m1674while() + '?', false);
        this.billing.add(m1674while() + '?');
        return z;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final InterfaceC2043e metrica(InterfaceC9998e interfaceC9998e) {
        this.adcel++;
        return this;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final String pro() {
        this.billing.add(m1674while());
        return BuildConfig.FLAVOR;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final char purchase() {
        this.billing.add(m1674while());
        return '0';
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final int signatures(InterfaceC9998e interfaceC9998e) {
        this.billing.add(m1674while());
        return 0;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final short subs() {
        this.billing.add(m1674while());
        return (short) 0;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC11754e
    public final long tapsense() {
        this.billing.add(m1674while());
        return 0L;
    }

    /* renamed from: throw, reason: not valid java name */
    public final int m1673throw() {
        int i = ((SharedPreferences) this.license.f13613e).getInt(m1674while() + ".size", 0);
        this.billing.add(m1674while() + ".size");
        return i;
    }

    @Override // defpackage.AbstractC3199e, defpackage.InterfaceC2043e
    public final void vip(InterfaceC9998e interfaceC9998e) {
        this.adcel--;
        C12718e c12718e = this.yandex;
        c12718e.removeLast();
        C12718e c12718e2 = this.startapp;
        c12718e2.removeLast();
        if (c12718e.isEmpty()) {
            c12718e.addLast(this.appmetrica);
            c12718e2.addLast(0);
        }
    }

    /* renamed from: while, reason: not valid java name */
    public final String m1674while() {
        return AbstractC13480e.m3608try(this.yandex, ".", null, null, null, 62);
    }

    @Override // defpackage.InterfaceC2043e
    public final int yandex(InterfaceC9998e interfaceC9998e) {
        int intValue;
        boolean z;
        C12718e c12718e = this.yandex;
        int i = c12718e.f25459e;
        int i2 = this.adcel;
        C12718e c12718e2 = this.startapp;
        if (i > i2) {
            c12718e.removeLast();
            c12718e2.removeLast();
        }
        AbstractC8457e appmetrica = interfaceC9998e.appmetrica();
        int m1673throw = AbstractC7890e.billing(appmetrica, C3016e.appmetrica) ? m1673throw() : AbstractC7890e.billing(appmetrica, C18215e.appmetrica) ? m1673throw() * 2 : interfaceC9998e.purchase();
        do {
            intValue = ((Number) c12718e2.removeLast()).intValue();
            c12718e2.addLast(Integer.valueOf(intValue + 1));
            if (intValue >= m1673throw) {
                return -1;
            }
            String str = m1674while() + '.' + interfaceC9998e.billing(intValue);
            if (interfaceC9998e.mopub(intValue)) {
                C6594e c6594e = this.license;
                if (!((SharedPreferences) c6594e.f13613e).contains(str) && !AbstractC7890e.billing(c6594e.billing(str.concat("?")), Boolean.TRUE)) {
                    z = true;
                    ArrayList arrayList = this.billing;
                    arrayList.add(str);
                    arrayList.add(str + '?');
                }
            }
            z = false;
            ArrayList arrayList2 = this.billing;
            arrayList2.add(str);
            arrayList2.add(str + '?');
        } while (z);
        c12718e.addLast(interfaceC9998e.billing(intValue));
        c12718e2.addLast(0);
        return intValue;
    }
}
