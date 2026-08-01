package defpackage;

import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٟٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC5684e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final String f12071e = C5401e.crashlytics("EnqueueRunnable");

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C13391e f12072e = new C13391e(2);

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C6117e f12073e;

    public RunnableC5684e(C6117e c6117e) {
        this.f12073e = c6117e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02f0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0155 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0256  */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean ad(defpackage.C6117e r25) {
        /*
            Method dump skipped, instructions count: 771
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC5684e.ad(eؙؑٛ):boolean");
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        C13391e c13391e = this.f12072e;
        C6117e c6117e = this.f12073e;
        C15899e c15899e = c6117e.metrica;
        try {
            HashSet hashSet = new HashSet();
            hashSet.addAll(c6117e.billing);
            HashSet advert = C6117e.advert(c6117e);
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    hashSet.removeAll(c6117e.billing);
                    z = false;
                    break;
                } else if (advert.contains((String) it.next())) {
                    z = true;
                    break;
                }
            }
            if (z) {
                throw new IllegalStateException("WorkContinuation has cycles (" + c6117e + ")");
            }
            WorkDatabase workDatabase = c15899e.appmetrica;
            workDatabase.metrica();
            try {
                boolean ad = ad(c6117e);
                workDatabase.yandex();
                if (ad) {
                    AbstractC16736e.ad(c15899e.metrica, RescheduleReceiver.class, true);
                    AbstractC8250e.ad(c15899e.license, c15899e.appmetrica, c15899e.billing);
                }
                c13391e.signatures(C13391e.f26641e);
            } finally {
                workDatabase.purchase();
            }
        } catch (Throwable th) {
            c13391e.signatures(new C8037e(th));
        }
    }
}
