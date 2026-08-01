package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؔ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC2906e extends AbstractBinderC3782e {
    public final int appmetrica;
    public AbstractC6785e license;

    public BinderC2906e(AbstractC6785e abstractC6785e, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 3);
        this.license = abstractC6785e;
        this.appmetrica = i;
    }

    @Override // defpackage.AbstractBinderC3782e
    /* renamed from: eٍۡ */
    public final boolean mo399e(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) AbstractC14342e.ad(parcel, Bundle.CREATOR);
            AbstractC14342e.metrica(parcel);
            AbstractC9528e.adcel(this.license, "onPostInitComplete can be called only once per call to getRemoteService");
            this.license.inmobi(readInt, readStrongBinder, bundle, this.appmetrica);
            this.license = null;
        } else if (i == 2) {
            parcel.readInt();
            AbstractC14342e.metrica(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            C4295e c4295e = (C4295e) AbstractC14342e.ad(parcel, C4295e.CREATOR);
            AbstractC14342e.metrica(parcel);
            AbstractC6785e abstractC6785e = this.license;
            AbstractC9528e.adcel(abstractC6785e, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            AbstractC9528e.startapp(c4295e);
            abstractC6785e.inmobi = c4295e;
            if (abstractC6785e.isPro()) {
                C14113e c14113e = c4295e.f9385e;
                C7850e crashlytics = C7850e.crashlytics();
                C2831e c2831e = c14113e == null ? null : c14113e.f27928e;
                synchronized (crashlytics) {
                    if (c2831e == null) {
                        c2831e = C7850e.f15895e;
                    } else {
                        C2831e c2831e2 = (C2831e) crashlytics.f15896e;
                        if (c2831e2 != null) {
                            if (c2831e2.f6801e < c2831e.f6801e) {
                            }
                        }
                    }
                    crashlytics.f15896e = c2831e;
                }
            }
            Bundle bundle2 = c4295e.f9386e;
            AbstractC9528e.adcel(this.license, "onPostInitComplete can be called only once per call to getRemoteService");
            this.license.inmobi(readInt2, readStrongBinder2, bundle2, this.appmetrica);
            this.license = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
