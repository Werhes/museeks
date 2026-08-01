package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۤؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15062e implements InterfaceC7865e {
    public final InterfaceC16964e ad;
    public final AtomicBoolean license = new AtomicBoolean(false);
    public volatile C12810e metrica;
    public final C8591e vip;

    public C15062e(InterfaceC16964e interfaceC16964e, C8591e c8591e) {
        this.ad = interfaceC16964e;
        this.vip = c8591e;
    }

    public static final C12810e advert(C15062e c15062e) {
        if (c15062e.license.get()) {
            throw new CancellationException("UseCaseCameraRequestControl is closed");
        }
        C12810e c12810e = c15062e.metrica;
        if (c12810e != null) {
            return c12810e;
        }
        C12810e c12810e2 = (C12810e) c15062e.ad.get();
        if (c15062e.license.get()) {
            c12810e2.close();
            throw new CancellationException("UseCaseCameraRequestControl closed during initialization");
        }
        c15062e.metrica = c12810e2;
        return c12810e2;
    }

    @Override // defpackage.InterfaceC7865e
    public final InterfaceC1908e ad(List list, List list2, List list3, C12236e c12236e, C6510e c6510e, long j) {
        C12810e c12810e = this.metrica;
        return c12810e != null ? c12810e.ad(list, list2, list3, c12236e, c6510e, j) : AbstractC5336e.vip(3, null, this.vip.appmetrica, new C7993e(this, null, list, list2, list3, c12236e, c6510e, j));
    }

    @Override // defpackage.InterfaceC7865e
    public final InterfaceC1908e adcel(Map map, EnumC13734e enumC13734e) {
        C12810e c12810e = this.metrica;
        if (c12810e != null) {
            return c12810e.adcel(map, enumC13734e);
        }
        return AbstractC5336e.vip(3, null, this.vip.appmetrica, new C8857e(this, (InterfaceC5083e) null, map, enumC13734e, 2));
    }

    @Override // defpackage.InterfaceC7865e
    public final InterfaceC1908e appmetrica(C11456e c11456e, Map map) {
        C12810e c12810e = this.metrica;
        if (c12810e != null) {
            return c12810e.appmetrica(c11456e, map);
        }
        return AbstractC5336e.vip(3, null, this.vip.appmetrica, new C8857e(this, (InterfaceC5083e) null, c11456e, map, 3));
    }

    @Override // defpackage.InterfaceC7865e
    public final InterfaceC1908e billing(List list) {
        C12810e c12810e = this.metrica;
        return c12810e != null ? c12810e.billing(list) : AbstractC5336e.vip(3, null, this.vip.appmetrica, new C15966e(this, (InterfaceC5083e) null, list));
    }

    @Override // defpackage.InterfaceC7865e
    public final void close() {
        if (this.license.getAndSet(true)) {
            return;
        }
        AbstractC5336e.purchase(this.vip.appmetrica, null, 0, new C9042e(null, this), 3);
    }

    @Override // defpackage.InterfaceC7865e
    public final Object license(AbstractC7185e abstractC7185e) {
        C12810e c12810e = this.metrica;
        return c12810e != null ? c12810e.license(abstractC7185e) : AbstractC5336e.advert(AbstractC18275e.purchase(this.vip.license), new C5998e(this, null, 0), abstractC7185e);
    }

    @Override // defpackage.InterfaceC7865e
    public final InterfaceC1908e metrica(List list, List list2, List list3) {
        C12810e c12810e = this.metrica;
        return c12810e != null ? c12810e.metrica(list, list2, list3) : AbstractC5336e.vip(3, null, this.vip.appmetrica, new C1247e(this, (InterfaceC5083e) null, list, list2, list3));
    }

    @Override // defpackage.InterfaceC7865e
    public final InterfaceC1908e mopub() {
        C12810e c12810e = this.metrica;
        if (c12810e != null) {
            return c12810e.mopub();
        }
        return AbstractC5336e.vip(3, null, this.vip.appmetrica, new C5998e(this, null, 1));
    }

    @Override // defpackage.InterfaceC7865e
    public final InterfaceC1908e purchase(int i) {
        C12810e c12810e = this.metrica;
        return c12810e != null ? c12810e.purchase(i) : AbstractC5336e.vip(3, null, this.vip.appmetrica, new C11143e(this, (InterfaceC5083e) null, i));
    }

    @Override // defpackage.InterfaceC7865e
    public final InterfaceC1908e startapp(Map map, EnumC4385e enumC4385e, EnumC13734e enumC13734e) {
        C12810e c12810e = this.metrica;
        return c12810e != null ? c12810e.startapp(map, enumC4385e, enumC13734e) : AbstractC5336e.vip(3, null, this.vip.appmetrica, new C1247e(this, (InterfaceC5083e) null, map, enumC4385e, enumC13734e));
    }

    @Override // defpackage.InterfaceC7865e
    public final InterfaceC1908e vip() {
        C12810e c12810e = this.metrica;
        if (c12810e != null) {
            return c12810e.vip();
        }
        return AbstractC5336e.vip(3, null, this.vip.appmetrica, new C5998e(this, null, 2));
    }

    @Override // defpackage.InterfaceC7865e
    public final InterfaceC1908e yandex(LinkedHashSet linkedHashSet, boolean z) {
        C12810e c12810e = this.metrica;
        return c12810e != null ? c12810e.yandex(linkedHashSet, z) : AbstractC5336e.vip(3, null, this.vip.appmetrica, new C6896e(this, (InterfaceC5083e) null, z, linkedHashSet));
    }
}
