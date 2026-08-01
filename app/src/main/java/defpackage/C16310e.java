package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٚؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16310e extends AbstractC9497e {
    public final C16628e license;
    public final C8988e metrica;
    public final C0381e vip;

    public C16310e(int i, C0381e c0381e, C8988e c8988e, C16628e c16628e) {
        super(i);
        this.metrica = c8988e;
        this.vip = c0381e;
        this.license = c16628e;
        if (i == 2 && c0381e.metrica) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // defpackage.AbstractC9497e
    public final C1032e[] ad(C1623e c1623e) {
        return (C1032e[]) this.vip.license;
    }

    @Override // defpackage.AbstractC9497e
    public final void appmetrica(Exception exc) {
        this.metrica.metrica(exc);
    }

    @Override // defpackage.AbstractC9497e
    public final void billing(C1623e c1623e) {
        C8988e c8988e = this.metrica;
        try {
            C0381e c0381e = this.vip;
            ((C9321e) c0381e.appmetrica).ad.accept(c1623e.license, c8988e);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            license(AbstractC9497e.yandex(e2));
        } catch (RuntimeException e3) {
            c8988e.metrica(e3);
        }
    }

    @Override // defpackage.AbstractC9497e
    public final void license(Status status) {
        this.license.getClass();
        this.metrica.metrica(AbstractC9600e.vip(status));
    }

    @Override // defpackage.AbstractC9497e
    public final int metrica(C1623e c1623e) {
        return this.vip.vip;
    }

    @Override // defpackage.AbstractC9497e
    public final void purchase(C5720e c5720e, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        Map map = c5720e.vip;
        C8988e c8988e = this.metrica;
        map.put(c8988e, valueOf);
        c8988e.ad.ad(new C3168e(c5720e, c8988e));
    }

    @Override // defpackage.AbstractC9497e
    public final boolean vip(C1623e c1623e) {
        return this.vip.metrica;
    }
}
