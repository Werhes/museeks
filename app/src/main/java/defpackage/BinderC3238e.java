package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؕٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class BinderC3238e extends AbstractBinderC3782e implements InterfaceC9895e, InterfaceC14876e {
    public final C2580e appmetrica;
    public final C5976e billing;
    public final Context license;
    public final C2271e purchase;

    /* JADX WARN: Type inference failed for: r0v1, types: [eٕ٘ؔ, eؓۨۖ] */
    public BinderC3238e(Context context, C2580e c2580e, C5976e c5976e) {
        super("com.google.android.gms.nearby.internal.connection.IPayloadListener", 5);
        this.purchase = new C17519e(0);
        AbstractC9528e.startapp(context);
        this.license = context;
        this.appmetrica = c2580e;
        this.billing = c5976e;
    }

    @Override // defpackage.InterfaceC9895e
    public final synchronized void appmetrica() {
        try {
            Iterator it = ((C10442e) this.purchase.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                this.appmetrica.ad(new C12276e(((C1241e) entry.getKey()).ad, (C16062e) entry.getValue()));
            }
            this.purchase.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.AbstractBinderC3782e
    /* renamed from: eًٖٕ */
    public final boolean mo687e(Parcel parcel, int i) {
        if (i == 2) {
            C7668e c7668e = (C7668e) AbstractC0923e.ad(parcel, C7668e.CREATOR);
            AbstractC0923e.vip(parcel);
            m1327e(c7668e);
            return true;
        }
        if (i != 3) {
            return false;
        }
        C4318e c4318e = (C4318e) AbstractC0923e.ad(parcel, C4318e.CREATOR);
        AbstractC0923e.vip(parcel);
        synchronized (this) {
            try {
                C16062e c16062e = c4318e.f9429e;
                if (c16062e.f31623e == 3) {
                    this.purchase.put(new C1241e(c16062e.f31625e, c4318e.f9431e), c16062e);
                } else {
                    this.purchase.remove(new C1241e(c16062e.f31625e, c4318e.f9431e));
                    C5976e c5976e = this.billing;
                    if (c5976e != null) {
                        c5976e.vip(c4318e.f9429e.f31625e);
                    }
                }
                this.appmetrica.ad(new C12276e(c4318e, 6));
            } catch (Throwable th) {
                throw th;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [eؚٖۜ, java.lang.Object] */
    /* renamed from: eٖۤٝ, reason: contains not printable characters */
    public final synchronized void m1327e(C7668e c7668e) {
        C2180e purchase = AbstractC0250e.purchase(this.license, c7668e.f15582e);
        int i = 1;
        if (purchase == null) {
            Log.w("NearbyConnectionsClient", String.format("Failed to convert incoming ParcelablePayload %d to Payload.", Long.valueOf(c7668e.f15582e.f14730e)));
            return;
        }
        C2271e c2271e = this.purchase;
        String str = c7668e.f15584e;
        long j = c7668e.f15582e.f14730e;
        C1241e c1241e = new C1241e(j, str);
        ?? obj = new Object();
        obj.f31625e = j;
        c2271e.put(c1241e, obj);
        this.appmetrica.ad(new C16542e(c7668e, purchase, i));
    }
}
