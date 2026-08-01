package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؔؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2302e extends AbstractC9497e {
    public final Object license;
    public final /* synthetic */ int metrica;
    public final C8988e vip;

    public C2302e(int i, C8988e c8988e) {
        super(i);
        this.vip = c8988e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2302e(C9364e c9364e, C8988e c8988e) {
        this(4, c8988e);
        this.metrica = 1;
        this.license = c9364e;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2302e(C11255e c11255e, C8988e c8988e) {
        this(3, c8988e);
        this.metrica = 0;
        this.license = c11255e;
    }

    private final /* bridge */ /* synthetic */ void adcel(C5720e c5720e, boolean z) {
    }

    private final /* bridge */ /* synthetic */ void startapp(C5720e c5720e, boolean z) {
    }

    @Override // defpackage.AbstractC9497e
    public final C1032e[] ad(C1623e c1623e) {
        switch (this.metrica) {
            case 0:
                return (C1032e[]) ((C11255e) this.license).ad.f2531e;
            default:
                C11255e c11255e = (C11255e) c1623e.yandex.get((C9364e) this.license);
                if (c11255e == null) {
                    return null;
                }
                return (C1032e[]) c11255e.ad.f2531e;
        }
    }

    @Override // defpackage.AbstractC9497e
    public final void appmetrica(Exception exc) {
        this.vip.metrica(exc);
    }

    @Override // defpackage.AbstractC9497e
    public final void billing(C1623e c1623e) {
        try {
            mopub(c1623e);
        } catch (DeadObjectException e) {
            license(AbstractC9497e.yandex(e));
            throw e;
        } catch (RemoteException e2) {
            license(AbstractC9497e.yandex(e2));
        } catch (RuntimeException e3) {
            this.vip.metrica(e3);
        }
    }

    @Override // defpackage.AbstractC9497e
    public final void license(Status status) {
        this.vip.metrica(new C10427e(status));
    }

    @Override // defpackage.AbstractC9497e
    public final int metrica(C1623e c1623e) {
        switch (this.metrica) {
            case 0:
                return ((C11255e) this.license).ad.f2532e;
            default:
                C11255e c11255e = (C11255e) c1623e.yandex.get((C9364e) this.license);
                if (c11255e != null) {
                    return c11255e.ad.f2532e;
                }
                return -1;
        }
    }

    public final void mopub(C1623e c1623e) {
        switch (this.metrica) {
            case 0:
                C11255e c11255e = (C11255e) this.license;
                C0462e c0462e = c11255e.ad;
                ((InterfaceC17847e) ((C18100e) c0462e.f2536e).f35492e).accept(c1623e.license, this.vip);
                C9364e c9364e = (C9364e) ((C2580e) c0462e.f2534e).vip;
                if (c9364e != null) {
                    c1623e.yandex.put(c9364e, c11255e);
                    return;
                }
                return;
            default:
                C11255e c11255e2 = (C11255e) c1623e.yandex.remove((C9364e) this.license);
                if (c11255e2 == null) {
                    this.vip.license(Boolean.FALSE);
                    return;
                }
                ((InterfaceC17847e) ((C18100e) c11255e2.vip.f14915e).f35489e).accept(c1623e.license, this.vip);
                ((C2580e) c11255e2.ad.f2534e).vip = null;
                return;
        }
    }

    @Override // defpackage.AbstractC9497e
    public final /* bridge */ /* synthetic */ void purchase(C5720e c5720e, boolean z) {
        int i = this.metrica;
    }

    @Override // defpackage.AbstractC9497e
    public final boolean vip(C1623e c1623e) {
        switch (this.metrica) {
            case 0:
                return ((C11255e) this.license).ad.f2533e;
            default:
                C11255e c11255e = (C11255e) c1623e.yandex.get((C9364e) this.license);
                return c11255e != null && c11255e.ad.f2533e;
        }
    }
}
