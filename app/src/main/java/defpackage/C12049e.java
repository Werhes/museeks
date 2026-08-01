package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۡۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12049e implements InterfaceC11096e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final String f24098e = C5401e.crashlytics("SystemJobScheduler");

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C15899e f24099e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final JobScheduler f24100e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C10868e f24101e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Context f24102e;

    public C12049e(Context context, C15899e c15899e) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        C10868e c10868e = new C10868e(context);
        this.f24102e = context;
        this.f24099e = c15899e;
        this.f24100e = jobScheduler;
        this.f24101e = c10868e;
    }

    public static void ad(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            C5401e.loadAd().amazon(f24098e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0012 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList metrica(android.content.Context r5, android.app.job.JobScheduler r6, java.lang.String r7) {
        /*
            java.util.ArrayList r5 = purchase(r5, r6)
            r6 = 0
            if (r5 != 0) goto L8
            return r6
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 2
            r0.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L12:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L44
            java.lang.Object r1 = r5.next()
            android.app.job.JobInfo r1 = (android.app.job.JobInfo) r1
            java.lang.String r2 = "EXTRA_WORK_SPEC_ID"
            android.os.PersistableBundle r3 = r1.getExtras()
            if (r3 == 0) goto L31
            boolean r4 = r3.containsKey(r2)     // Catch: java.lang.NullPointerException -> L31
            if (r4 == 0) goto L31
            java.lang.String r2 = r3.getString(r2)     // Catch: java.lang.NullPointerException -> L31
            goto L32
        L31:
            r2 = r6
        L32:
            boolean r2 = r7.equals(r2)
            if (r2 == 0) goto L12
            int r1 = r1.getId()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            goto L12
        L44:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12049e.metrica(android.content.Context, android.app.job.JobScheduler, java.lang.String):java.util.ArrayList");
    }

    public static ArrayList purchase(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            C5401e.loadAd().amazon(f24098e, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC11096e
    public final void appmetrica(C13394e... c13394eArr) {
        int m352native;
        ArrayList metrica;
        int m352native2;
        C15899e c15899e = this.f24099e;
        WorkDatabase workDatabase = c15899e.appmetrica;
        C0444e c0444e = new C0444e(workDatabase);
        for (C13394e c13394e : c13394eArr) {
            workDatabase.metrica();
            try {
                C13394e amazon = workDatabase.amazon().amazon(c13394e.ad);
                String str = f24098e;
                if (amazon == null) {
                    C5401e.loadAd().firebase(str, "Skipping scheduling " + c13394e.ad + " because it's no longer in the DB", new Throwable[0]);
                    workDatabase.yandex();
                } else if (amazon.vip != EnumC7300e.f14903e) {
                    C5401e.loadAd().firebase(str, "Skipping scheduling " + c13394e.ad + " because it is no longer enqueued", new Throwable[0]);
                    workDatabase.yandex();
                } else {
                    C17108e signatures = workDatabase.mopub().signatures(c13394e.ad);
                    if (signatures != null) {
                        m352native = signatures.vip;
                    } else {
                        c15899e.license.getClass();
                        m352native = c0444e.m352native(c15899e.license.vip);
                    }
                    if (signatures == null) {
                        c15899e.appmetrica.mopub().isVip(new C17108e(c13394e.ad, m352native));
                    }
                    billing(c13394e, m352native);
                    if (Build.VERSION.SDK_INT == 23 && (metrica = metrica(this.f24102e, this.f24100e, c13394e.ad)) != null) {
                        int indexOf = metrica.indexOf(Integer.valueOf(m352native));
                        if (indexOf >= 0) {
                            metrica.remove(indexOf);
                        }
                        if (metrica.isEmpty()) {
                            c15899e.license.getClass();
                            m352native2 = c0444e.m352native(c15899e.license.vip);
                        } else {
                            m352native2 = ((Integer) metrica.get(0)).intValue();
                        }
                        billing(c13394e, m352native2);
                    }
                    workDatabase.yandex();
                }
            } finally {
                workDatabase.purchase();
            }
        }
    }

    public final void billing(C13394e c13394e, int i) {
        JobScheduler jobScheduler = this.f24100e;
        JobInfo ad = this.f24101e.ad(c13394e, i);
        C5401e loadAd = C5401e.loadAd();
        String str = c13394e.ad;
        String str2 = f24098e;
        loadAd.smaato(str2, "Scheduling work ID " + str + " Job ID " + i, new Throwable[0]);
        try {
            if (jobScheduler.schedule(ad) == 0) {
                C5401e.loadAd().firebase(str2, "Unable to schedule work ID " + c13394e.ad, new Throwable[0]);
                if (c13394e.admob && c13394e.subscription == 1) {
                    c13394e.admob = false;
                    C5401e.loadAd().smaato(str2, "Scheduling a non-expedited job (work ID " + c13394e.ad + ")", new Throwable[0]);
                    billing(c13394e, i);
                }
            }
        } catch (IllegalStateException e) {
            ArrayList purchase = purchase(this.f24102e, jobScheduler);
            int size = purchase != null ? purchase.size() : 0;
            Locale locale = Locale.getDefault();
            Integer valueOf = Integer.valueOf(size);
            C15899e c15899e = this.f24099e;
            Integer valueOf2 = Integer.valueOf(c15899e.appmetrica.amazon().adcel().size());
            int i2 = c15899e.license.metrica;
            if (Build.VERSION.SDK_INT == 23) {
                i2 /= 2;
            }
            String format = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", valueOf, valueOf2, Integer.valueOf(i2));
            C5401e.loadAd().amazon(str2, format, new Throwable[0]);
            throw new IllegalStateException(format, e);
        } catch (Throwable th) {
            C5401e.loadAd().amazon(str2, "Unable to schedule " + c13394e, th);
        }
    }

    @Override // defpackage.InterfaceC11096e
    public final void license(String str) {
        Context context = this.f24102e;
        JobScheduler jobScheduler = this.f24100e;
        ArrayList metrica = metrica(context, jobScheduler, str);
        if (metrica == null || metrica.isEmpty()) {
            return;
        }
        Iterator it = metrica.iterator();
        while (it.hasNext()) {
            ad(jobScheduler, ((Integer) it.next()).intValue());
        }
        this.f24099e.appmetrica.mopub().applovin(str);
    }

    @Override // defpackage.InterfaceC11096e
    public final boolean vip() {
        return true;
    }
}
