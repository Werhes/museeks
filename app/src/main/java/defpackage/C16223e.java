package defpackage;

import java.util.ListIterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٕؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16223e implements InterfaceC14620e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C0576e f31873e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public final C0576e f31874e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public C0404e f31875e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C0576e f31876e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public C17985e f31877e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final C0576e f31879e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public C16223e f31880e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C0576e f31881e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C0576e f31882e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C0576e f31884e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final C0576e f31885e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C0576e f31883e = AbstractC14533e.startapp(Boolean.FALSE);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C2616e f31878e = new C2616e(0.0f);

    public C16223e(C7589e c7589e, C11120e c11120e, C14613e c14613e, C9185e c9185e) {
        Boolean bool = Boolean.TRUE;
        this.f31876e = AbstractC14533e.startapp(bool);
        this.f31881e = AbstractC14533e.startapp(c7589e);
        this.f31873e = AbstractC14533e.startapp(c11120e);
        this.f31885e = AbstractC14533e.startapp(C5496e.vip);
        this.f31884e = AbstractC14533e.startapp(bool);
        this.f31879e = AbstractC14533e.startapp(c14613e);
        this.f31882e = AbstractC14533e.startapp(c9185e);
        this.f31874e = AbstractC14533e.startapp(null);
    }

    @Override // defpackage.InterfaceC14620e
    public final void ad() {
    }

    public final C7589e appmetrica() {
        return (C7589e) this.f31881e.getValue();
    }

    public final boolean billing() {
        return purchase() && appmetrica().metrica.pro().license() && yandex() && ((Boolean) this.f31876e.getValue()).booleanValue() && appmetrica().vip.vip();
    }

    public final C11120e license() {
        return (C11120e) this.f31873e.getValue();
    }

    @Override // defpackage.InterfaceC14620e
    public final void metrica() {
        C13610e c13610e = appmetrica().vip;
        c13610e.getClass();
        C7589e appmetrica = appmetrica();
        appmetrica.license.setValue(AbstractC13480e.m3572catch(this, appmetrica.vip()));
        appmetrica.appmetrica();
        c13610e.appmetrica();
        C12742e c12742e = c13610e.f27005e;
        ListIterator listIterator = c12742e.listIterator();
        int i = 0;
        while (true) {
            C11045e c11045e = (C11045e) listIterator;
            if (!c11045e.hasNext()) {
                i = -1;
                break;
            }
            C16223e c16223e = (C16223e) c11045e.next();
            if (!(c16223e instanceof C16223e)) {
                c16223e = null;
            }
            if (AbstractC7890e.billing(c16223e != null ? c16223e.appmetrica() : null, appmetrica())) {
                break;
            } else {
                i++;
            }
        }
        if (i == c12742e.size() - 1 || i == -1) {
            c12742e.add(this);
        } else {
            c12742e.add(i + 1, this);
        }
        appmetrica().metrica.signatures();
    }

    public final boolean purchase() {
        if (license().vip()) {
            return true;
        }
        return (appmetrica().metrica.pro().license() && !appmetrica().metrica.pro().vip()) || !((Boolean) this.f31884e.getValue()).booleanValue();
    }

    @Override // defpackage.InterfaceC14620e
    public final void vip() {
        C13610e c13610e = appmetrica().vip;
        c13610e.getClass();
        C7589e appmetrica = appmetrica();
        appmetrica.license.setValue(AbstractC13480e.m3576default(appmetrica.vip(), this));
        appmetrica.appmetrica.setValue(AbstractC13480e.m3576default(appmetrica.metrica(), this));
        appmetrica.appmetrica();
        c13610e.appmetrica();
        c13610e.f27005e.remove(this);
        if (appmetrica.vip().isEmpty()) {
            AbstractC5336e.purchase(appmetrica.vip.f27001e, null, 0, new C10954e(appmetrica, this, (InterfaceC5083e) null, 15), 3);
        }
        appmetrica().metrica.signatures();
    }

    public final boolean yandex() {
        C9185e c9185e = (C9185e) this.f31882e.getValue();
        if (!((Boolean) this.f31883e.getValue()).booleanValue()) {
            return false;
        }
        ((C8009e) c9185e.vip.getValue()).getClass();
        return true;
    }
}
