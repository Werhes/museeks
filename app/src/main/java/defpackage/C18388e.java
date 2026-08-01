package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.Build;
import android.os.PersistableBundle;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18388e extends AbstractC3947e {

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public JobScheduler f36051e;

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public final int m4475e() {
        C6936e c6936e = (C6936e) this.f36443e;
        m1411e();
        mo2250e();
        if (this.f36051e == null) {
            return 7;
        }
        Boolean m2820e = c6936e.f14221e.m2820e("google_analytics_sgtm_upload_enabled");
        if (!(m2820e == null ? false : m2820e.booleanValue())) {
            return 8;
        }
        if (c6936e.smaato().f25482e < 119000) {
            return 6;
        }
        if (!C5240e.m1782e(c6936e.f14225e, "com.google.android.gms.measurement.AppMeasurementJobService")) {
            return 3;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return !c6936e.mopub().m2852e() ? 5 : 2;
        }
        return 4;
    }

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public final void m4476e(long j) {
        C6936e c6936e = (C6936e) this.f36443e;
        m1411e();
        mo2250e();
        JobScheduler jobScheduler = this.f36051e;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(c6936e.f14225e.getPackageName())).hashCode()) != null) {
            C13879e c13879e = c6936e.f14227e;
            C6936e.yandex(c13879e);
            c13879e.f27497e.ad("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        int m4475e = m4475e();
        if (m4475e != 2) {
            C13879e c13879e2 = c6936e.f14227e;
            C6936e.yandex(c13879e2);
            c13879e2.f27497e.vip(AbstractC1414e.pro(m4475e), "[sgtm] Not eligible for Scion upload");
            return;
        }
        C13879e c13879e3 = c6936e.f14227e;
        C6936e.yandex(c13879e3);
        c13879e3.f27497e.vip(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo build = new JobInfo.Builder("measurement-client".concat(String.valueOf(c6936e.f14225e.getPackageName())).hashCode(), new ComponentName(c6936e.f14225e, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.f36051e;
        AbstractC9528e.startapp(jobScheduler2);
        int schedule = jobScheduler2.schedule(build);
        C13879e c13879e4 = c6936e.f14227e;
        C6936e.yandex(c13879e4);
        c13879e4.f27497e.vip(schedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    @Override // defpackage.AbstractC3947e
    /* renamed from: eّٖٗ */
    public final boolean mo803e() {
        return true;
    }
}
