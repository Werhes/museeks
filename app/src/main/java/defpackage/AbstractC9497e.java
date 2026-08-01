package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9497e {
    public final int ad;

    public AbstractC9497e(int i) {
        this.ad = i;
    }

    public static Status yandex(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract C1032e[] ad(C1623e c1623e);

    public abstract void appmetrica(Exception exc);

    public abstract void billing(C1623e c1623e);

    public abstract void license(Status status);

    public abstract int metrica(C1623e c1623e);

    public abstract void purchase(C5720e c5720e, boolean z);

    public abstract boolean vip(C1623e c1623e);
}
