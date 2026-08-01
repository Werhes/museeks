package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.SystemClock;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۤ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10640e extends AbstractC3947e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public InterfaceC8227e f20961e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public final ArrayList f20962e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public ScheduledExecutorService f20963e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public final C14928e f20964e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final ServiceConnectionC10526e f20965e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final C3318e f20966e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final C14928e f20967e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public volatile Boolean f20968e;

    public C10640e(C6936e c6936e) {
        super(c6936e);
        this.f20962e = new ArrayList();
        this.f20966e = new C3318e(c6936e.f14215e);
        this.f20965e = new ServiceConnectionC10526e(this);
        this.f20967e = new C14928e(this, c6936e, 0);
        this.f20964e = new C14928e(this, c6936e, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0056  */
    /* renamed from: eّؑۛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2847e(android.os.Bundle r8) {
        /*
            r7 = this;
            r7.mo2250e()
            r7.m1411e()
            eَؕٝ r4 = new eَؕٝ
            r4.<init>(r8)
            r7.m2861e()
            java.lang.Object r0 = r7.f36443e
            eؚؖٞ r0 = (defpackage.C6936e) r0
            eَۘٓ r1 = r0.f14221e
            r2 = 0
            eَؙؚ r3 = defpackage.AbstractC17254e.f33832e
            boolean r1 = r1.m2822e(r2, r3)
            r2 = 0
            if (r1 == 0) goto L59
            eَْۢ r0 = r0.adcel()
            java.lang.Object r1 = r0.f36443e
            eؚؖٞ r1 = (defpackage.C6936e) r1
            eۣؗۦ r3 = r1.f14223e
            eٍؙٓ r1 = r1.f14227e
            defpackage.C6936e.purchase(r3)
            byte[] r3 = defpackage.C5240e.m1776e(r4)
            if (r3 != 0) goto L3f
            defpackage.C6936e.yandex(r1)
            eِٔۙ r0 = r1.f27498e
            java.lang.String r1 = "Null default event parameters; not writing to database"
            r0.ad(r1)
        L3d:
            r0 = r2
            goto L54
        L3f:
            int r5 = r3.length
            r6 = 131072(0x20000, float:1.83671E-40)
            if (r5 <= r6) goto L4f
            defpackage.C6936e.yandex(r1)
            eِٔۙ r0 = r1.f27498e
            java.lang.String r1 = "Default event parameters too long for local database. Sending directly to service"
            r0.ad(r1)
            goto L3d
        L4f:
            r1 = 4
            boolean r0 = r0.m3534e(r1, r3)
        L54:
            if (r0 == 0) goto L59
            r0 = 1
            r3 = r0
            goto L5a
        L59:
            r3 = r2
        L5a:
            eًٙۢ r2 = r7.m2858e(r2)
            eٓؒؖ r0 = new eٓؒؖ
            r1 = r7
            r5 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            r7.m2851e(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10640e.m2847e(android.os.Bundle):void");
    }

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public final void m2848e() {
        mo2250e();
        m1411e();
        if (m2862e()) {
            return;
        }
        if (m2852e()) {
            this.f20965e.ad();
            return;
        }
        C6936e c6936e = (C6936e) this.f36443e;
        if (c6936e.f14221e.m2827e()) {
            return;
        }
        List<ResolveInfo> queryIntentServices = c6936e.f14225e.getPackageManager().queryIntentServices(new Intent().setClassName(c6936e.f14225e, "com.google.android.gms.measurement.AppMeasurementService"), 65536);
        if (queryIntentServices == null || queryIntentServices.isEmpty()) {
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27502e.ad("Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.measurement.START");
        intent.setComponent(new ComponentName(c6936e.f14225e, "com.google.android.gms.measurement.AppMeasurementService"));
        ServiceConnectionC10526e serviceConnectionC10526e = this.f20965e;
        C10640e c10640e = serviceConnectionC10526e.f20780e;
        c10640e.mo2250e();
        Context context = ((C6936e) c10640e.f36443e).f14225e;
        C5459e vip = C5459e.vip();
        synchronized (serviceConnectionC10526e) {
            try {
                if (serviceConnectionC10526e.f20782e) {
                    C13879e c13879e2 = ((C6936e) serviceConnectionC10526e.f20780e.f36443e).f14227e;
                    C6936e.yandex(c13879e2);
                    c13879e2.f27497e.ad("Connection attempt already in progress");
                } else {
                    C10640e c10640e2 = serviceConnectionC10526e.f20780e;
                    C13879e c13879e3 = ((C6936e) c10640e2.f36443e).f14227e;
                    C6936e.yandex(c13879e3);
                    c13879e3.f27497e.ad("Using local app measurement service");
                    serviceConnectionC10526e.f20782e = true;
                    vip.ad(context, intent, c10640e2.f20965e, 129);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: eؘؙؕ, reason: contains not printable characters */
    public final void m2849e() {
        mo2250e();
        C6936e c6936e = (C6936e) this.f36443e;
        C13879e c13879e = c6936e.f14227e;
        C6936e.yandex(c13879e);
        C14937e c14937e = c13879e.f27497e;
        ArrayList arrayList = this.f20962e;
        c14937e.vip(Integer.valueOf(arrayList.size()), "Processing queued up service tasks");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((Runnable) it.next()).run();
            } catch (RuntimeException e) {
                C13879e c13879e2 = c6936e.f14227e;
                C6936e.yandex(c13879e2);
                c13879e2.f27502e.vip(e, "Task exception while flushing queue");
            }
        }
        arrayList.clear();
        this.f20964e.metrica();
    }

    /* renamed from: eؙٚؑ, reason: contains not printable characters */
    public final void m2850e() {
        mo2250e();
        m1411e();
        ServiceConnectionC10526e serviceConnectionC10526e = this.f20965e;
        if (serviceConnectionC10526e.f20781e != null && (serviceConnectionC10526e.f20781e.remoteconfig() || serviceConnectionC10526e.f20781e.pro())) {
            serviceConnectionC10526e.f20781e.purchase();
        }
        serviceConnectionC10526e.f20781e = null;
        try {
            C5459e.vip().metrica(((C6936e) this.f36443e).f14225e, serviceConnectionC10526e);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.f20961e = null;
    }

    /* renamed from: eًؕ۟, reason: contains not printable characters */
    public final void m2851e(Runnable runnable) {
        mo2250e();
        if (m2862e()) {
            runnable.run();
            return;
        }
        ArrayList arrayList = this.f20962e;
        long size = arrayList.size();
        C6936e c6936e = (C6936e) this.f36443e;
        c6936e.getClass();
        if (size >= 1000) {
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27502e.ad("Discarding data. Max runnable queue size reached");
        } else {
            arrayList.add(runnable);
            this.f20964e.vip(60000L);
            m2848e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0116  */
    /* renamed from: eًؚْ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m2852e() {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10640e.m2852e():boolean");
    }

    /* renamed from: eِۢٔ, reason: contains not printable characters */
    public final void m2853e() {
        mo2250e();
        C3318e c3318e = this.f20966e;
        ((C17647e) c3318e.f7485e).getClass();
        c3318e.f7486e = SystemClock.elapsedRealtime();
        ((C6936e) this.f36443e).getClass();
        this.f20967e.vip(((Long) AbstractC17254e.f33861private.ad(null)).longValue());
    }

    /* renamed from: eُِۤ, reason: contains not printable characters */
    public final boolean m2854e() {
        mo2250e();
        m1411e();
        if (!m2852e()) {
            return true;
        }
        C5240e c5240e = ((C6936e) this.f36443e).f14223e;
        C6936e.purchase(c5240e);
        return c5240e.m1795e() >= 241200;
    }

    /* renamed from: eّْؗ, reason: contains not printable characters */
    public final void m2855e(C15148e c15148e) {
        boolean m3534e;
        mo2250e();
        m1411e();
        C6936e c6936e = (C6936e) this.f36443e;
        c6936e.getClass();
        C13185e adcel = c6936e.adcel();
        C6936e c6936e2 = (C6936e) adcel.f36443e;
        C6936e.purchase(c6936e2.f14223e);
        byte[] m1776e = C5240e.m1776e(c15148e);
        if (m1776e.length > 131072) {
            C13879e c13879e = c6936e2.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27498e.ad("Conditional user property too long for local database. Sending directly to service");
            m3534e = false;
        } else {
            m3534e = adcel.m3534e(2, m1776e);
        }
        m2851e(new RunnableC12430e(this, m2858e(true), m3534e, new C15148e(c15148e)));
    }

    /* renamed from: eؚؚْ, reason: contains not printable characters */
    public final void m2856e(ComponentName componentName) {
        mo2250e();
        if (this.f20961e != null) {
            this.f20961e = null;
            C13879e c13879e = ((C6936e) this.f36443e).f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27497e.vip(componentName, "Disconnected from device MeasurementService");
            mo2250e();
            m2848e();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x04dc  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0444 A[Catch: all -> 0x0480, TRY_ENTER, TryCatch #55 {all -> 0x0480, blocks: (B:196:0x0470, B:219:0x0444, B:221:0x044a, B:222:0x044d, B:210:0x0491, B:338:0x037b, B:342:0x0385, B:343:0x0396), top: B:195:0x0470 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x04a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x02da A[Catch: all -> 0x0202, SQLiteException -> 0x02b4, SQLiteDatabaseLockedException -> 0x02b9, SQLiteFullException -> 0x02bd, TryCatch #58 {all -> 0x0202, blocks: (B:166:0x01dd, B:169:0x01f1, B:171:0x01f6, B:180:0x021a, B:181:0x021d, B:178:0x0216, B:229:0x0223, B:232:0x0237, B:234:0x024f, B:237:0x0258, B:238:0x025b, B:240:0x0249, B:243:0x025f, B:246:0x0273, B:248:0x028b, B:251:0x0295, B:252:0x0298, B:254:0x0285, B:264:0x029c, B:272:0x02b0, B:274:0x02da, B:282:0x02e4, B:283:0x02e7, B:288:0x02d4, B:259:0x02f4, B:261:0x0301, B:335:0x0366), top: B:165:0x01dd }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x059d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x062c  */
    /* renamed from: eؚٔۦ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2857e(defpackage.InterfaceC8227e r70, defpackage.AbstractC6484e r71, defpackage.C8019e r72) {
        /*
            Method dump skipped, instructions count: 1754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C10640e.m2857e(eًٍۜ, eؙٚؑ, eًٙۢ):void");
    }

    /* renamed from: eٔۜۙ, reason: contains not printable characters */
    public final C8019e m2858e(boolean z) {
        long abs;
        Pair pair;
        C6936e c6936e = (C6936e) this.f36443e;
        c6936e.getClass();
        C12724e smaato = c6936e.smaato();
        String str = null;
        if (z) {
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            C6936e c6936e2 = (C6936e) c13879e.f36443e;
            C1195e c1195e = c6936e2.f14198e;
            C6936e.purchase(c1195e);
            if (c1195e.f3820e != null) {
                C1195e c1195e2 = c6936e2.f14198e;
                C6936e.purchase(c1195e2);
                C9156e c9156e = c1195e2.f3820e;
                C1195e c1195e3 = (C1195e) c9156e.f18314e;
                c1195e3.mo2250e();
                c1195e3.mo2250e();
                long j = ((C1195e) c9156e.f18314e).m490e().getLong((String) c9156e.f18316e, 0L);
                if (j == 0) {
                    c9156e.subs();
                    abs = 0;
                } else {
                    ((C6936e) c1195e3.f36443e).f14215e.getClass();
                    abs = Math.abs(j - System.currentTimeMillis());
                }
                long j2 = c9156e.f18318e;
                if (abs >= j2) {
                    if (abs > j2 + j2) {
                        c9156e.subs();
                    } else {
                        String string = c1195e3.m490e().getString((String) c9156e.f18317e, null);
                        long j3 = c1195e3.m490e().getLong((String) c9156e.f18315e, 0L);
                        c9156e.subs();
                        pair = (string == null || j3 <= 0) ? C1195e.f3798e : new Pair(string, Long.valueOf(j3));
                        if (pair != null && pair != C1195e.f3798e) {
                            String valueOf = String.valueOf(pair.second);
                            String str2 = (String) pair.first;
                            str = AbstractC8647e.ads(new StringBuilder(valueOf.length() + 1 + String.valueOf(str2).length()), valueOf, ":", str2);
                        }
                    }
                }
                pair = null;
                if (pair != null) {
                    String valueOf2 = String.valueOf(pair.second);
                    String str22 = (String) pair.first;
                    str = AbstractC8647e.ads(new StringBuilder(valueOf2.length() + 1 + String.valueOf(str22).length()), valueOf2, ":", str22);
                }
            }
        }
        return smaato.m3393e(str);
    }

    /* renamed from: eَٖؑ, reason: contains not printable characters */
    public final boolean m2859e() {
        mo2250e();
        m1411e();
        if (!m2852e()) {
            return true;
        }
        C5240e c5240e = ((C6936e) this.f36443e).f14223e;
        C6936e.purchase(c5240e);
        return c5240e.m1795e() >= ((Integer) AbstractC17254e.f33816e.ad(null)).intValue();
    }

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public final void m2860e(AtomicReference atomicReference) {
        mo2250e();
        m1411e();
        m2851e(new RunnableC11666e(this, atomicReference, m2858e(false)));
    }

    @Override // defpackage.AbstractC3947e
    /* renamed from: eّٖٗ */
    public final boolean mo803e() {
        return false;
    }

    /* renamed from: eًٜ٘, reason: contains not printable characters */
    public final void m2861e() {
        ((C6936e) this.f36443e).getClass();
    }

    /* renamed from: eۡۘ, reason: contains not printable characters */
    public final boolean m2862e() {
        mo2250e();
        m1411e();
        return this.f20961e != null;
    }
}
