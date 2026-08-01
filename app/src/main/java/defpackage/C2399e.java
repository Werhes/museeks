package defpackage;

import android.os.Handler;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؔٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2399e {
    public static final ArrayList vip = new ArrayList(50);
    public final Handler ad;

    public C2399e(Handler handler) {
        this.ad = handler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static C12414e metrica() {
        C12414e obj;
        ArrayList arrayList = vip;
        synchronized (arrayList) {
            try {
                obj = arrayList.isEmpty() ? new Object() : (C12414e) arrayList.remove(arrayList.size() - 1);
            } catch (Throwable th) {
                throw th;
            }
        }
        return obj;
    }

    public final C12414e ad(int i) {
        C12414e metrica = metrica();
        metrica.ad = this.ad.obtainMessage(i);
        return metrica;
    }

    public final void appmetrica() {
        this.ad.removeCallbacksAndMessages(null);
    }

    public final boolean billing(int i) {
        return this.ad.sendEmptyMessage(i);
    }

    public final boolean license(Runnable runnable) {
        return this.ad.post(runnable);
    }

    public final void purchase(int i) {
        AbstractC2301e.billing(i != 0);
        this.ad.removeMessages(i);
    }

    public final C12414e vip(int i, Object obj) {
        C12414e metrica = metrica();
        metrica.ad = this.ad.obtainMessage(i, obj);
        return metrica;
    }

    public final boolean yandex(int i, int i2) {
        return this.ad.sendEmptyMessageDelayed(i, i2);
    }
}
