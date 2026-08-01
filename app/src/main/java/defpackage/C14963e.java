package defpackage;

import j$.util.Objects;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٜٔۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14963e implements InterfaceC11421e, InterfaceC15826e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public C15683e f29679e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Csuper f29680e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC1029e f29681e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f29682e;

    public C14963e(AbstractC1029e abstractC1029e, Object obj) {
        this.f29681e = abstractC1029e;
        this.f29680e = new Csuper((CopyOnWriteArrayList) abstractC1029e.metrica.f36471e, 0, (C18208e) null);
        this.f29679e = new C15683e(abstractC1029e.license.metrica, 0, null);
        this.f29682e = obj;
    }

    @Override // defpackage.InterfaceC15826e
    public final void ad(int i, C18208e c18208e, Exception exc) {
        if (vip(i, c18208e)) {
            this.f29679e.license(exc);
        }
    }

    @Override // defpackage.InterfaceC15826e
    public final void adcel(int i, C18208e c18208e, C8455e c8455e) {
        if (vip(i, c18208e)) {
            this.f29679e.ad(c8455e);
        }
    }

    @Override // defpackage.InterfaceC15826e
    public final void advert(int i, C18208e c18208e, int i2) {
        if (vip(i, c18208e)) {
            this.f29679e.metrica(i2);
        }
    }

    @Override // defpackage.InterfaceC15826e
    public final void applovin(int i, C18208e c18208e) {
        if (vip(i, c18208e)) {
            this.f29679e.vip();
        }
    }

    @Override // defpackage.InterfaceC11421e
    public final void billing(int i, C18208e c18208e, C0807e c0807e) {
        if (vip(i, c18208e)) {
            Csuper csuper = this.f29680e;
            C0807e metrica = metrica(c0807e, c18208e);
            csuper.getClass();
            csuper.loadAd(new C18070e(csuper, metrica, 13));
        }
    }

    @Override // defpackage.InterfaceC11421e
    /* renamed from: catch */
    public final void mo1483catch(int i, C18208e c18208e, C6913e c6913e, C0807e c0807e, int i2) {
        if (vip(i, c18208e)) {
            Csuper csuper = this.f29680e;
            C0807e metrica = metrica(c0807e, c18208e);
            csuper.getClass();
            csuper.loadAd(new C1308e(csuper, c6913e, metrica, i2));
        }
    }

    @Override // defpackage.InterfaceC11421e
    public final void inmobi(int i, C18208e c18208e, C6913e c6913e, C0807e c0807e, IOException iOException, boolean z) {
        if (vip(i, c18208e)) {
            Csuper csuper = this.f29680e;
            C0807e metrica = metrica(c0807e, c18208e);
            csuper.getClass();
            csuper.loadAd(new C7052e(csuper, c6913e, metrica, iOException, z));
        }
    }

    public final C0807e metrica(C0807e c0807e, C18208e c18208e) {
        long j = c0807e.purchase;
        AbstractC1029e abstractC1029e = this.f29681e;
        Object obj = this.f29682e;
        long signatures = abstractC1029e.signatures(j, obj);
        long j2 = c0807e.billing;
        long signatures2 = abstractC1029e.signatures(j2, obj);
        return (signatures == j && signatures2 == j2) ? c0807e : new C0807e(c0807e.ad, c0807e.vip, c0807e.metrica, c0807e.license, c0807e.appmetrica, signatures, signatures2);
    }

    @Override // defpackage.InterfaceC15826e
    /* renamed from: protected */
    public final void mo1496protected(int i, C18208e c18208e) {
        if (vip(i, c18208e)) {
            this.f29679e.appmetrica();
        }
    }

    @Override // defpackage.InterfaceC11421e
    public final void remoteconfig(int i, C18208e c18208e, C6913e c6913e, C0807e c0807e) {
        if (vip(i, c18208e)) {
            Csuper csuper = this.f29680e;
            C0807e metrica = metrica(c0807e, c18208e);
            csuper.getClass();
            csuper.loadAd(new C18156e(csuper, c6913e, metrica, 1));
        }
    }

    @Override // defpackage.InterfaceC11421e
    public final void tapsense(int i, C18208e c18208e, C6913e c6913e, C0807e c0807e) {
        if (vip(i, c18208e)) {
            Csuper csuper = this.f29680e;
            C0807e metrica = metrica(c0807e, c18208e);
            csuper.getClass();
            csuper.loadAd(new C18156e(csuper, c6913e, metrica, 0));
        }
    }

    public final boolean vip(int i, C18208e c18208e) {
        C18208e c18208e2;
        Object obj = this.f29682e;
        AbstractC1029e abstractC1029e = this.f29681e;
        if (c18208e != null) {
            c18208e2 = abstractC1029e.pro(obj, c18208e);
            if (c18208e2 == null) {
                return false;
            }
        } else {
            c18208e2 = null;
        }
        int tapsense = abstractC1029e.tapsense(i, obj);
        Csuper csuper = this.f29680e;
        if (csuper.f36470e != tapsense || !Objects.equals((C18208e) csuper.f36469e, c18208e2)) {
            this.f29680e = new Csuper((CopyOnWriteArrayList) abstractC1029e.metrica.f36471e, tapsense, c18208e2);
        }
        C15683e c15683e = this.f29679e;
        if (c15683e.ad == tapsense && Objects.equals(c15683e.vip, c18208e2)) {
            return true;
        }
        this.f29679e = new C15683e(abstractC1029e.license.metrica, tapsense, c18208e2);
        return true;
    }

    @Override // defpackage.InterfaceC11421e
    public final void yandex(int i, C18208e c18208e, C0807e c0807e) {
        if (vip(i, c18208e)) {
            Csuper csuper = this.f29680e;
            C0807e metrica = metrica(c0807e, c18208e);
            C18208e c18208e2 = (C18208e) csuper.f36469e;
            c18208e2.getClass();
            csuper.loadAd(new C9509e(10, csuper, c18208e2, metrica));
        }
    }
}
