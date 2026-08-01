package defpackage;

import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٙۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10350e {
    public final InterfaceC10545e ad;
    public final C0583e metrica;
    public final C1672e vip;

    public C10350e(InterfaceC10545e interfaceC10545e, C1672e c1672e) {
        this.ad = interfaceC10545e;
        this.vip = c1672e;
        long[] jArr = AbstractC12981e.ad;
        this.metrica = new C0583e();
    }

    public final Function2 ad(int i, Object obj, Object obj2) {
        C0583e c0583e = this.metrica;
        C3430e c3430e = (C3430e) c0583e.billing(obj);
        if (c3430e != null && c3430e.metrica == i && AbstractC7890e.billing(c3430e.vip, obj2)) {
            C2892e c2892e = c3430e.license;
            if (c2892e != null) {
                return c2892e;
            }
            C2892e c2892e2 = new C2892e(818252804, true, new C17785e(c3430e.appmetrica, c3430e, 14));
            c3430e.license = c2892e2;
            return c2892e2;
        }
        C3430e c3430e2 = new C3430e(this, i, obj, obj2);
        c0583e.amazon(obj, c3430e2);
        C2892e c2892e3 = c3430e2.license;
        if (c2892e3 != null) {
            return c2892e3;
        }
        C2892e c2892e4 = new C2892e(818252804, true, new C17785e(this, c3430e2, 14));
        c3430e2.license = c2892e4;
        return c2892e4;
    }

    public final Object vip(Object obj) {
        if (obj == null) {
            return null;
        }
        C3430e c3430e = (C3430e) this.metrica.billing(obj);
        if (c3430e != null) {
            return c3430e.vip;
        }
        InterfaceC9153e interfaceC9153e = (InterfaceC9153e) this.vip.invoke();
        int appmetrica = interfaceC9153e.appmetrica(obj);
        if (appmetrica != -1) {
            return interfaceC9153e.metrica(appmetrica);
        }
        return null;
    }
}
