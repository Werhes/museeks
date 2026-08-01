package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۘۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7405e implements InterfaceC10371e {
    public final ArrayList ad;
    public boolean appmetrica;
    public int billing;
    public C6761e license;
    public float metrica;
    public boolean purchase;
    public float vip;
    public boolean yandex;

    public C7405e(C2532e c2532e, C9831e c9831e) {
        ArrayList arrayList = new ArrayList();
        this.ad = arrayList;
        this.license = null;
        this.appmetrica = false;
        this.purchase = true;
        this.billing = -1;
        if (c9831e == null) {
            return;
        }
        c9831e.subs(this);
        if (this.yandex) {
            this.license.vip((C6761e) arrayList.get(this.billing));
            arrayList.set(this.billing, this.license);
            this.yandex = false;
        }
        C6761e c6761e = this.license;
        if (c6761e != null) {
            arrayList.add(c6761e);
        }
    }

    @Override // defpackage.InterfaceC10371e
    public final void ad(float f, float f2, float f3, float f4) {
        this.license.ad(f, f2);
        this.ad.add(this.license);
        this.license = new C6761e(f3, f4, f3 - f, f4 - f2);
        this.yandex = false;
    }

    @Override // defpackage.InterfaceC10371e
    public final void appmetrica(float f, float f2) {
        this.license.ad(f, f2);
        this.ad.add(this.license);
        C6761e c6761e = this.license;
        this.license = new C6761e(f, f2, f - c6761e.ad, f2 - c6761e.vip);
        this.yandex = false;
    }

    @Override // defpackage.InterfaceC10371e
    public final void close() {
        this.ad.add(this.license);
        appmetrica(this.vip, this.metrica);
        this.yandex = true;
    }

    @Override // defpackage.InterfaceC10371e
    public final void license(float f, float f2, float f3, boolean z, boolean z2, float f4, float f5) {
        this.appmetrica = true;
        this.purchase = false;
        C6761e c6761e = this.license;
        C2532e.yandex(c6761e.ad, c6761e.vip, f, f2, f3, z, z2, f4, f5, this);
        this.purchase = true;
        this.yandex = false;
    }

    @Override // defpackage.InterfaceC10371e
    public final void metrica(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.purchase || this.appmetrica) {
            this.license.ad(f, f2);
            this.ad.add(this.license);
            this.appmetrica = false;
        }
        this.license = new C6761e(f5, f6, f5 - f3, f6 - f4);
        this.yandex = false;
    }

    @Override // defpackage.InterfaceC10371e
    public final void vip(float f, float f2) {
        boolean z = this.yandex;
        ArrayList arrayList = this.ad;
        if (z) {
            this.license.vip((C6761e) arrayList.get(this.billing));
            arrayList.set(this.billing, this.license);
            this.yandex = false;
        }
        C6761e c6761e = this.license;
        if (c6761e != null) {
            arrayList.add(c6761e);
        }
        this.vip = f;
        this.metrica = f2;
        this.license = new C6761e(f, f2, 0.0f, 0.0f);
        this.billing = arrayList.size();
    }
}
