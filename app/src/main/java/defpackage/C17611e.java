package defpackage;

import java.util.ArrayDeque;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؚ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C17611e {
    public final boolean ad;
    public final C13520e appmetrica;
    public ArrayDeque billing;
    public final C10990e license;
    public final InterfaceC5876e metrica;
    public int purchase;
    public final boolean vip;
    public C7495e yandex;

    public C17611e(boolean z, boolean z2, InterfaceC4045e interfaceC4045e, C10990e c10990e, C13520e c13520e) {
        this.ad = z;
        this.vip = z2;
        this.metrica = interfaceC4045e;
        this.license = c10990e;
        this.appmetrica = c13520e;
    }

    public final void ad() {
        this.billing.clear();
        this.yandex.clear();
    }

    public final void vip() {
        if (this.billing == null) {
            this.billing = new ArrayDeque(4);
        }
        if (this.yandex == null) {
            int i = C7495e.f15273e;
            this.yandex = AbstractC9464e.billing();
        }
    }
}
