package defpackage;

import java.io.Serializable;
import java.util.HashSet;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؕٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9237e {
    public String ad = null;
    public Serializable appmetrica;
    public Object billing;
    public Object license;
    public int metrica;
    public Serializable purchase;
    public int vip;

    public C9237e(Class cls, Class[] clsArr) {
        HashSet hashSet = new HashSet();
        this.license = hashSet;
        this.appmetrica = new HashSet();
        this.vip = 0;
        this.metrica = 0;
        this.purchase = new HashSet();
        hashSet.add(C16786e.ad(cls));
        for (Class cls2 : clsArr) {
            AbstractC11138e.metrica(cls2, "Null interface");
            ((HashSet) this.license).add(C16786e.ad(cls2));
        }
    }

    public void ad(C8625e c8625e) {
        if (((HashSet) this.license).contains(c8625e.ad)) {
            throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
        }
        ((HashSet) this.appmetrica).add(c8625e);
    }

    public void metrica(int i) {
        if (!(this.vip == 0)) {
            throw new IllegalStateException("Instantiation type has already been set.");
        }
        this.vip = i;
    }

    public C7259e vip() {
        if (((InterfaceC5808e) this.billing) != null) {
            return new C7259e(this.ad, new HashSet((HashSet) this.license), new HashSet((HashSet) this.appmetrica), this.vip, this.metrica, (InterfaceC5808e) this.billing, (HashSet) this.purchase);
        }
        throw new IllegalStateException("Missing required property: factory.");
    }
}
