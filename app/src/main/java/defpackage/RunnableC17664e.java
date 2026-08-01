package defpackage;

import android.util.Log;
import androidx.car.app.hardware.info.EnergyProfile;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؙ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class RunnableC17664e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C9149e f34619e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f34620e;

    public /* synthetic */ RunnableC17664e(C9149e c9149e, int i) {
        this.f34620e = i;
        this.f34619e = c9149e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f34620e;
        C9149e c9149e = this.f34619e;
        switch (i) {
            case 0:
                c9149e.getClass();
                C8167e c8167e = new C8167e(c9149e);
                C14618e c14618e = c9149e.purchase;
                AbstractC9528e.startapp(c14618e);
                c14618e.ad(c8167e);
                return;
            default:
                C18482e c18482e = C9149e.billing;
                Log.i(c18482e.ad, c18482e.license("transfer with type = %d has timed out", 0));
                c18482e.vip("notify failed transfer with type = %d, reason = %d", 0, Integer.valueOf(EnergyProfile.EVCONNECTOR_TYPE_OTHER));
                Iterator it = new HashSet(c9149e.vip).iterator();
                while (it.hasNext()) {
                    C11766e c11766e = (C11766e) it.next();
                    switch (c11766e.ad) {
                        case 0:
                            C18482e c18482e2 = C0055e.startapp;
                            C0055e.startapp.vip("onTransferFailed with type = %d and reason = %d", 0, Integer.valueOf(EnergyProfile.EVCONNECTOR_TYPE_OTHER));
                            C0055e c0055e = (C0055e) c11766e.vip;
                            c0055e.appmetrica();
                            C7935e c7935e = c0055e.metrica;
                            C7322e c7322e = c0055e.billing;
                            C0140e c0140e = c0055e.ad;
                            C17488e vip = c7935e.vip(c7322e);
                            C1282e smaato = C2440e.smaato(vip.license());
                            smaato.ad();
                            ((C2440e) smaato.f20053e).tapsense();
                            smaato.ad();
                            ((C2440e) smaato.f20053e).isVip();
                            vip.appmetrica((C2440e) smaato.metrica());
                            c0140e.ad((C4469e) vip.metrica(), 232);
                            break;
                        default:
                            C7306e c7306e = new C7306e(11);
                            c7306e.f14927e = Integer.valueOf(EnergyProfile.EVCONNECTOR_TYPE_OTHER);
                            C11328e c11328e = (C11328e) c11766e.vip;
                            c7306e.f14926e = Boolean.valueOf(((BinderC15170e) c11328e.f22772e).purchase == 2);
                            c11328e.ad(new C11742e(c7306e));
                            break;
                    }
                }
                c9149e.ad();
                return;
        }
    }
}
