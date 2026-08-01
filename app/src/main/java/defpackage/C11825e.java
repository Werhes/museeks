package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import android.os.Build;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٚؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11825e extends AbstractC1487e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final AlarmManager f23715e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public Integer f23716e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public C9940e f23717e;

    public C11825e(C15398e c15398e) {
        super(c15398e);
        this.f23715e = (AlarmManager) ((C6936e) this.f36443e).f14225e.getSystemService("alarm");
    }

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public final void m3276e() {
        m613e();
        C13879e c13879e = ((C6936e) this.f36443e).f14227e;
        C6936e.yandex(c13879e);
        c13879e.f27497e.ad("Unscheduling upload");
        AlarmManager alarmManager = this.f23715e;
        if (alarmManager != null) {
            alarmManager.cancel(m3278e());
        }
        m3280e().metrica();
        if (Build.VERSION.SDK_INT >= 24) {
            m3277e();
        }
    }

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public final void m3277e() {
        JobScheduler jobScheduler = (JobScheduler) ((C6936e) this.f36443e).f14225e.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(m3279e());
        }
    }

    /* renamed from: eؙٚؑ, reason: contains not printable characters */
    public final PendingIntent m3278e() {
        Context context = ((C6936e) this.f36443e).f14225e;
        return PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), AbstractC3831e.ad);
    }

    /* renamed from: eًؚْ, reason: contains not printable characters */
    public final int m3279e() {
        if (this.f23716e == null) {
            this.f23716e = Integer.valueOf("measurement".concat(String.valueOf(((C6936e) this.f36443e).f14225e.getPackageName())).hashCode());
        }
        return this.f23716e.intValue();
    }

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public final AbstractC11861e m3280e() {
        if (this.f23717e == null) {
            this.f23717e = new C9940e(this, this.f19060e.f30352e, 1);
        }
        return this.f23717e;
    }

    @Override // defpackage.AbstractC1487e
    /* renamed from: eّٖٗ */
    public final void mo554e() {
        AlarmManager alarmManager = this.f23715e;
        if (alarmManager != null) {
            alarmManager.cancel(m3278e());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            m3277e();
        }
    }
}
