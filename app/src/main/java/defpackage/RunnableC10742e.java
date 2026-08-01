package defpackage;

import android.content.Context;
import android.database.Cursor;
import androidx.work.ListenableWorker;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٖؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC10742e implements Runnable {

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public static final String f21140e = C5401e.crashlytics("WorkerWrapper");

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public ListenableWorker f21141e;

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public C11883e f21142e;

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public C18540e f21143e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public List f21144e;

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public WorkDatabase f21145e;

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public ArrayList f21146e;

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public volatile boolean f21147e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public String f21148e;

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public ListenableFuture f21149e;

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public String f21150e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public C6566e f21151e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C11224e f21152e;

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public C4956e f21153e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C13394e f21154e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public C9327e f21155e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public Context f21156e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public AbstractC18068e f21157e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C0912e f21158e;

    public final void ad(AbstractC18068e abstractC18068e) {
        boolean z = abstractC18068e instanceof C17239e;
        String str = f21140e;
        if (!z) {
            if (abstractC18068e instanceof C10152e) {
                C5401e.loadAd().premium(str, AbstractC17861e.Signature("Worker result RETRY for ", this.f21150e), new Throwable[0]);
                license();
                return;
            }
            C5401e.loadAd().premium(str, AbstractC17861e.Signature("Worker result FAILURE for ", this.f21150e), new Throwable[0]);
            if (this.f21154e.metrica()) {
                appmetrica();
                return;
            } else {
                yandex();
                return;
            }
        }
        C5401e.loadAd().premium(str, AbstractC17861e.Signature("Worker result SUCCESS for ", this.f21150e), new Throwable[0]);
        if (this.f21154e.metrica()) {
            appmetrica();
            return;
        }
        C18540e c18540e = this.f21143e;
        String str2 = this.f21148e;
        C4956e c4956e = this.f21153e;
        WorkDatabase workDatabase = this.f21145e;
        workDatabase.metrica();
        try {
            c4956e.isVip(EnumC7300e.f14900e, str2);
            c4956e.signatures(str2, ((C17239e) this.f21157e).ad);
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = c18540e.m4567break(str2).iterator();
            while (it.hasNext()) {
                String str3 = (String) it.next();
                if (c4956e.advert(str3) == EnumC7300e.f14899e) {
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) c18540e.f36383e;
                    C6096e purchase = C6096e.purchase(1, "SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)");
                    if (str3 == null) {
                        purchase.loadAd(1);
                    } else {
                        purchase.Signature(1, str3);
                    }
                    workDatabase_Impl.vip();
                    Cursor billing = workDatabase_Impl.billing(purchase);
                    try {
                        if (billing.moveToFirst() && billing.getInt(0) != 0) {
                            C5401e.loadAd().premium(str, "Setting status to enqueued for " + str3, new Throwable[0]);
                            c4956e.isVip(EnumC7300e.f14903e, str3);
                            c4956e.tapsense(currentTimeMillis, str3);
                        }
                    } finally {
                        billing.close();
                        purchase.isVip();
                    }
                }
            }
            workDatabase.yandex();
            workDatabase.purchase();
            purchase(false);
        } catch (Throwable th) {
            workDatabase.purchase();
            purchase(false);
            throw th;
        }
    }

    public final void appmetrica() {
        String str = this.f21148e;
        C4956e c4956e = this.f21153e;
        WorkDatabase workDatabase = this.f21145e;
        workDatabase.metrica();
        try {
            c4956e.tapsense(System.currentTimeMillis(), str);
            c4956e.isVip(EnumC7300e.f14903e, str);
            c4956e.pro(str);
            c4956e.remoteconfig(-1L, str);
            workDatabase.yandex();
        } finally {
            workDatabase.purchase();
            purchase(false);
        }
    }

    public final void billing() {
        C4956e c4956e = this.f21153e;
        String str = this.f21148e;
        EnumC7300e advert = c4956e.advert(str);
        EnumC7300e enumC7300e = EnumC7300e.f14901e;
        String str2 = f21140e;
        if (advert == enumC7300e) {
            C5401e.loadAd().smaato(str2, AbstractC5087e.m1746extends("Status for ", str, " is RUNNING;not doing any work and rescheduling for later execution"), new Throwable[0]);
            purchase(true);
            return;
        }
        C5401e.loadAd().smaato(str2, "Status for " + str + " is " + advert + "; not doing any work", new Throwable[0]);
        purchase(false);
    }

    public final void license() {
        String str = this.f21148e;
        C4956e c4956e = this.f21153e;
        WorkDatabase workDatabase = this.f21145e;
        workDatabase.metrica();
        try {
            c4956e.isVip(EnumC7300e.f14903e, str);
            c4956e.tapsense(System.currentTimeMillis(), str);
            c4956e.remoteconfig(-1L, str);
            workDatabase.yandex();
        } finally {
            workDatabase.purchase();
            purchase(true);
        }
    }

    public final void metrica() {
        List list = this.f21144e;
        String str = this.f21148e;
        WorkDatabase workDatabase = this.f21145e;
        if (!startapp()) {
            workDatabase.metrica();
            try {
                EnumC7300e advert = this.f21153e.advert(str);
                C15024e smaato = workDatabase.smaato();
                WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) smaato.f29788e;
                workDatabase_Impl.vip();
                C9707e c9707e = (C9707e) smaato.f29787e;
                C1573e ad = c9707e.ad();
                if (str == null) {
                    ad.advert(1);
                } else {
                    ad.loadAd(1, str);
                }
                workDatabase_Impl.metrica();
                try {
                    ad.crashlytics();
                    workDatabase_Impl.yandex();
                    if (advert == null) {
                        purchase(false);
                    } else if (advert == EnumC7300e.f14901e) {
                        ad(this.f21157e);
                    } else if (!advert.ad()) {
                        license();
                    }
                    workDatabase.yandex();
                    workDatabase.purchase();
                } finally {
                    workDatabase_Impl.purchase();
                    c9707e.metrica(ad);
                }
            } catch (Throwable th) {
                workDatabase.purchase();
                throw th;
            }
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC11096e) it.next()).license(str);
            }
            AbstractC8250e.ad(this.f21152e, workDatabase, list);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0039 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:3:0x0005, B:10:0x0031, B:12:0x0039, B:14:0x0045, B:15:0x005b, B:17:0x005f, B:19:0x0063, B:21:0x0069, B:22:0x006f, B:30:0x007c, B:32:0x007d, B:38:0x0091, B:39:0x0097, B:24:0x0070, B:25:0x0078, B:5:0x0020, B:7:0x0026), top: B:2:0x0005, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:3:0x0005, B:10:0x0031, B:12:0x0039, B:14:0x0045, B:15:0x005b, B:17:0x005f, B:19:0x0063, B:21:0x0069, B:22:0x006f, B:30:0x007c, B:32:0x007d, B:38:0x0091, B:39:0x0097, B:24:0x0070, B:25:0x0078, B:5:0x0020, B:7:0x0026), top: B:2:0x0005, inners: #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void purchase(boolean r5) {
        /*
            r4 = this;
            androidx.work.impl.WorkDatabase r0 = r4.f21145e
            r0.metrica()
            androidx.work.impl.WorkDatabase r0 = r4.f21145e     // Catch: java.lang.Throwable -> L41
            eؗ٘ٔ r0 = r0.amazon()     // Catch: java.lang.Throwable -> L41
            r0.getClass()     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"
            r2 = 0
            eؘۨۨ r1 = defpackage.C6096e.purchase(r2, r1)     // Catch: java.lang.Throwable -> L41
            java.lang.Object r0 = r0.f10517e     // Catch: java.lang.Throwable -> L41
            androidx.work.impl.WorkDatabase_Impl r0 = (androidx.work.impl.WorkDatabase_Impl) r0     // Catch: java.lang.Throwable -> L41
            r0.vip()     // Catch: java.lang.Throwable -> L41
            android.database.Cursor r0 = r0.billing(r1)     // Catch: java.lang.Throwable -> L41
            boolean r3 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L30
            int r3 = r0.getInt(r2)     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L30
            r3 = 1
            goto L31
        L2e:
            r5 = move-exception
            goto L91
        L30:
            r3 = r2
        L31:
            r0.close()     // Catch: java.lang.Throwable -> L41
            r1.isVip()     // Catch: java.lang.Throwable -> L41
            if (r3 != 0) goto L43
            android.content.Context r0 = r4.f21156e     // Catch: java.lang.Throwable -> L41
            java.lang.Class<androidx.work.impl.background.systemalarm.RescheduleReceiver> r1 = androidx.work.impl.background.systemalarm.RescheduleReceiver.class
            defpackage.AbstractC16736e.ad(r0, r1, r2)     // Catch: java.lang.Throwable -> L41
            goto L43
        L41:
            r5 = move-exception
            goto L98
        L43:
            if (r5 == 0) goto L5b
            eؗ٘ٔ r0 = r4.f21153e     // Catch: java.lang.Throwable -> L41
            eؚٜٞ r1 = defpackage.EnumC7300e.f14903e     // Catch: java.lang.Throwable -> L41
            java.lang.String r2 = r4.f21148e     // Catch: java.lang.Throwable -> L41
            java.lang.String[] r2 = new java.lang.String[]{r2}     // Catch: java.lang.Throwable -> L41
            r0.isVip(r1, r2)     // Catch: java.lang.Throwable -> L41
            eؗ٘ٔ r0 = r4.f21153e     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = r4.f21148e     // Catch: java.lang.Throwable -> L41
            r2 = -1
            r0.remoteconfig(r2, r1)     // Catch: java.lang.Throwable -> L41
        L5b:
            eْٞ r0 = r4.f21154e     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L7d
            androidx.work.ListenableWorker r0 = r4.f21141e     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L7d
            boolean r0 = r0.metrica()     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L7d
            eًٍٜ r0 = r4.f21155e     // Catch: java.lang.Throwable -> L41
            java.lang.String r1 = r4.f21148e     // Catch: java.lang.Throwable -> L41
            java.lang.Object r2 = r0.f18581e     // Catch: java.lang.Throwable -> L41
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L41
            java.util.HashMap r3 = r0.f18586e     // Catch: java.lang.Throwable -> L7a
            r3.remove(r1)     // Catch: java.lang.Throwable -> L7a
            r0.startapp()     // Catch: java.lang.Throwable -> L7a
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7a
            goto L7d
        L7a:
            r5 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L7a
            throw r5     // Catch: java.lang.Throwable -> L41
        L7d:
            androidx.work.impl.WorkDatabase r0 = r4.f21145e     // Catch: java.lang.Throwable -> L41
            r0.yandex()     // Catch: java.lang.Throwable -> L41
            androidx.work.impl.WorkDatabase r0 = r4.f21145e
            r0.purchase()
            eؙٟۢ r0 = r4.f21151e
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r0.startapp(r5)
            return
        L91:
            r0.close()     // Catch: java.lang.Throwable -> L41
            r1.isVip()     // Catch: java.lang.Throwable -> L41
            throw r5     // Catch: java.lang.Throwable -> L41
        L98:
            androidx.work.impl.WorkDatabase r0 = r4.f21145e
            r0.purchase()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC10742e.purchase(boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c3, code lost:
    
        if ((r9.vip == r12 && r9.mopub > 0) != false) goto L37;
     */
    /* JADX WARN: Type inference failed for: r2v5, types: [eٍۡ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v9, types: [androidx.work.WorkerParameters, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.RunnableC10742e.run():void");
    }

    public final boolean startapp() {
        if (!this.f21147e) {
            return false;
        }
        C5401e.loadAd().smaato(f21140e, AbstractC17861e.Signature("Work interrupted for ", this.f21150e), new Throwable[0]);
        if (this.f21153e.advert(this.f21148e) == null) {
            purchase(false);
            return true;
        }
        purchase(!r0.ad());
        return true;
    }

    public final void vip(String str) {
        C4956e c4956e = this.f21153e;
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (c4956e.advert(str2) != EnumC7300e.f14905e) {
                c4956e.isVip(EnumC7300e.f14902e, str2);
            }
            linkedList.addAll(this.f21143e.m4567break(str2));
        }
    }

    public final void yandex() {
        String str = this.f21148e;
        WorkDatabase workDatabase = this.f21145e;
        workDatabase.metrica();
        try {
            vip(str);
            this.f21153e.signatures(str, ((C14638e) this.f21157e).ad);
            workDatabase.yandex();
        } finally {
            workDatabase.purchase();
            purchase(false);
        }
    }
}
