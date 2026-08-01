package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.HashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۦؙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C15093e implements InterfaceC17847e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ String f29877e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C4612e f29878e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ String f29879e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f29880e;

    public /* synthetic */ C15093e(C4612e c4612e, String str, String str2, int i) {
        this.f29880e = i;
        this.f29878e = c4612e;
        this.f29877e = str;
        this.f29879e = str2;
    }

    @Override // defpackage.InterfaceC17847e
    public final void accept(Object obj, Object obj2) {
        C8988e c8988e = (C8988e) obj2;
        switch (this.f29880e) {
            case 0:
                String str = this.f29877e;
                String str2 = this.f29879e;
                C4379e c4379e = (C4379e) obj;
                C4612e c4612e = this.f29878e;
                HashMap hashMap = c4612e.premium;
                long incrementAndGet = c4612e.admob.incrementAndGet();
                AbstractC9528e.mopub("Not connected to device", c4612e.f9941class == 3);
                try {
                    hashMap.put(Long.valueOf(incrementAndGet), c8988e);
                    Context context = c4379e.metrica;
                    C10988e appmetrica = AbstractC10432e.appmetrica();
                    C1091e c1091e = (C1091e) c4379e.loadAd();
                    Parcel m4156e = c1091e.m4156e();
                    m4156e.writeString(str);
                    m4156e.writeString(str2);
                    m4156e.writeLong(incrementAndGet);
                    AbstractC3336e.vip(m4156e, appmetrica);
                    c1091e.m4151e(m4156e, 9);
                    return;
                } catch (RemoteException e) {
                    hashMap.remove(Long.valueOf(incrementAndGet));
                    c8988e.ad(e);
                    return;
                }
            default:
                C4379e c4379e2 = (C4379e) obj;
                C4612e c4612e2 = this.f29878e;
                String str3 = this.f29877e;
                String str4 = this.f29879e;
                AbstractC9528e.mopub("Not connected to device", c4612e2.f9941class == 3);
                C1091e c1091e2 = (C1091e) c4379e2.loadAd();
                C10988e appmetrica2 = AbstractC10432e.appmetrica();
                Parcel m4156e2 = c1091e2.m4156e();
                m4156e2.writeString(str3);
                m4156e2.writeString(str4);
                int i = AbstractC3336e.ad;
                m4156e2.writeInt(0);
                AbstractC3336e.vip(m4156e2, appmetrica2);
                c1091e2.m4151e(m4156e2, 14);
                synchronized (c4612e2.subscription) {
                    try {
                        if (c4612e2.loadAd != null) {
                            c4612e2.adcel(2477);
                        }
                        c4612e2.loadAd = c8988e;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
