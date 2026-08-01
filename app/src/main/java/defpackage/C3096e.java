package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؕؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3096e extends AbstractC10596e {
    public static final Object yandex = new Object();
    public final Object billing;
    public final Object purchase;

    public C3096e(AbstractC6690e abstractC6690e, Object obj, Object obj2) {
        super(abstractC6690e);
        this.purchase = obj;
        this.billing = obj2;
    }

    @Override // defpackage.AbstractC10596e, defpackage.AbstractC6690e
    public final Object advert(int i) {
        Object advert = this.appmetrica.advert(i);
        return Objects.equals(advert, this.billing) ? yandex : advert;
    }

    @Override // defpackage.AbstractC10596e, defpackage.AbstractC6690e
    public final C6158e purchase(int i, C6158e c6158e, boolean z) {
        this.appmetrica.purchase(i, c6158e, z);
        if (Objects.equals(c6158e.vip, this.billing) && z) {
            c6158e.vip = yandex;
        }
        return c6158e;
    }

    @Override // defpackage.AbstractC10596e, defpackage.AbstractC6690e
    public final C11501e smaato(int i, C11501e c11501e, long j) {
        this.appmetrica.smaato(i, c11501e, j);
        if (Objects.equals(c11501e.ad, this.purchase)) {
            c11501e.ad = C11501e.admob;
        }
        return c11501e;
    }

    @Override // defpackage.AbstractC10596e, defpackage.AbstractC6690e
    public final int vip(Object obj) {
        Object obj2;
        if (yandex.equals(obj) && (obj2 = this.billing) != null) {
            obj = obj2;
        }
        return this.appmetrica.vip(obj);
    }
}
