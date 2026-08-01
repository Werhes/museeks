package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘْؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4850e implements InterfaceC1722e {
    public Object ad;
    public final C10739e appmetrica;
    public boolean license;
    public Object metrica;
    public C13391e vip;

    public C4850e() {
        C3295e c3295e = C3295e.f7451e;
        this.ad = c3295e;
        this.metrica = c3295e;
        this.appmetrica = new C10739e(10, this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Set, java.lang.Object] */
    @Override // defpackage.InterfaceC1722e
    public final void ad(C11887e c11887e) {
        if (this.ad.contains(c11887e)) {
            throw new IllegalStateException("Callback is already registered");
        }
        this.ad = AbstractC4511e.Signature(this.ad, c11887e);
        c11887e.vip = AbstractC4511e.Signature(c11887e.vip, this.appmetrica);
        purchase();
    }

    public final boolean appmetrica() {
        Iterable iterable = (Iterable) this.ad;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                C1577e c1577e = ((C11887e) it.next()).metrica;
                InterfaceC8614e interfaceC8614e = C11887e.yandex[0];
                if (((Boolean) c1577e.ad).booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void billing(C8226e c8226e) {
        Function1 function1;
        C13391e c13391e = this.vip;
        if (c13391e == null) {
            return;
        }
        if (((C11887e) c13391e.f26644e) == null) {
            C11887e ad = AbstractC16082e.ad((Iterable) this.ad);
            c13391e.f26644e = ad;
            if (ad != null) {
                C8226e c8226e2 = (C8226e) c13391e.f26645e;
                Function1 function12 = ad.license;
                if (function12 != null) {
                    function12.invoke(c8226e2);
                }
            }
        }
        C11887e c11887e = (C11887e) c13391e.f26644e;
        if (c11887e == null || (function1 = c11887e.appmetrica) == null) {
            return;
        }
        function1.invoke(c8226e);
    }

    public final boolean license() {
        C11887e ad;
        C13391e c13391e = this.vip;
        if (c13391e == null || (ad = (C11887e) c13391e.f26644e) == null) {
            ad = AbstractC16082e.ad((Iterable) this.ad);
        }
        this.vip = null;
        if (ad != null) {
            ad.billing.invoke();
        }
        return ad != null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Set, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Set, java.lang.Object] */
    @Override // defpackage.InterfaceC1722e
    public final void metrica(C11887e c11887e) {
        if (!this.ad.contains(c11887e)) {
            throw new IllegalStateException("Callback is not registered");
        }
        this.ad = AbstractC4511e.advert(this.ad, c11887e);
        c11887e.vip = AbstractC4511e.advert(c11887e.vip, this.appmetrica);
        C13391e c13391e = this.vip;
        if (c11887e.equals(c13391e != null ? (C11887e) c13391e.f26644e : null)) {
            C13391e c13391e2 = this.vip;
            if (c13391e2 != null) {
                c13391e2.f26644e = null;
            }
            Function0 function0 = c11887e.purchase;
            if (function0 != null) {
                function0.invoke();
            }
        }
        purchase();
    }

    public final void purchase() {
        boolean appmetrica = appmetrica();
        if (this.license != appmetrica) {
            this.license = appmetrica;
            Iterator it = ((Iterable) this.metrica).iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(Boolean.valueOf(appmetrica));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Set, java.lang.Object] */
    @Override // defpackage.InterfaceC1722e
    public final boolean vip(C11887e c11887e) {
        return this.ad.contains(c11887e);
    }
}
