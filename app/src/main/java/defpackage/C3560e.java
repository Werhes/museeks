package defpackage;

import java.io.Serializable;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕۖۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3560e {
    public boolean ad;
    public Object appmetrica;
    public Serializable billing;
    public Object license;
    public boolean metrica;
    public Object purchase;
    public boolean vip;
    public Cloneable yandex;

    public C3560e() {
        this.purchase = C0409e.f2448e;
        this.vip = true;
        C2171e c2171e = AbstractC17475e.f34223e;
        this.billing = C1410e.f4222e;
    }

    public C3560e(InterfaceC10998e interfaceC10998e, C13465e c13465e) {
        this.license = interfaceC10998e;
        this.appmetrica = c13465e;
        this.purchase = new C10215e(10);
        this.billing = new LinkedHashMap();
        this.metrica = true;
    }

    public void ad() {
        InterfaceC10998e interfaceC10998e = (InterfaceC10998e) this.license;
        if (((C4891e) interfaceC10998e.vip()).license != EnumC7785e.f15778e) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.ad) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        ((C13465e) this.appmetrica).invoke();
        interfaceC10998e.vip().ad(new C9993e(0, this));
        this.ad = true;
    }
}
