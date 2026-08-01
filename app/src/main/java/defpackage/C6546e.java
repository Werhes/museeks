package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٞۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6546e implements InterfaceC6882e, InterfaceC0325e, InterfaceC17499e {

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final String f13469e = C5401e.crashlytics("DelayMetCommandHandler");

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C16000e f13470e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final String f13471e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final int f13472e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public PowerManager.WakeLock f13473e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C15749e f13474e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Context f13476e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public boolean f13475e = false;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f13477e = 0;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final Object f13478e = new Object();

    public C6546e(Context context, int i, String str, C15749e c15749e) {
        this.f13476e = context;
        this.f13472e = i;
        this.f13474e = c15749e;
        this.f13471e = str;
        this.f13470e = new C16000e(context, c15749e.f31018e, this);
    }

    @Override // defpackage.InterfaceC6882e
    public final void ad(List list) {
        appmetrica();
    }

    public final void appmetrica() {
        synchronized (this.f13478e) {
            try {
                if (this.f13477e < 2) {
                    this.f13477e = 2;
                    C5401e loadAd = C5401e.loadAd();
                    String str = f13469e;
                    loadAd.smaato(str, "Stopping work for WorkSpec " + this.f13471e, new Throwable[0]);
                    Context context = this.f13476e;
                    String str2 = this.f13471e;
                    Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
                    intent.setAction("ACTION_STOP_WORK");
                    intent.putExtra("KEY_WORKSPEC_ID", str2);
                    C15749e c15749e = this.f13474e;
                    c15749e.purchase(new RunnableC10028e(c15749e, intent, this.f13472e, 3));
                    if (this.f13474e.f31020e.appmetrica(this.f13471e)) {
                        C5401e.loadAd().smaato(str, "WorkSpec " + this.f13471e + " needs to be rescheduled", new Throwable[0]);
                        Intent vip = C0201e.vip(this.f13476e, this.f13471e);
                        C15749e c15749e2 = this.f13474e;
                        c15749e2.purchase(new RunnableC10028e(c15749e2, vip, this.f13472e, 3));
                    } else {
                        C5401e.loadAd().smaato(str, "Processor does not have WorkSpec " + this.f13471e + ". No need to reschedule ", new Throwable[0]);
                    }
                } else {
                    C5401e.loadAd().smaato(f13469e, "Already stopped work for " + this.f13471e, new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void license() {
        StringBuilder sb = new StringBuilder();
        String str = this.f13471e;
        sb.append(str);
        sb.append(" (");
        sb.append(this.f13472e);
        sb.append(")");
        this.f13473e = AbstractC7293e.ad(this.f13476e, sb.toString());
        C5401e loadAd = C5401e.loadAd();
        PowerManager.WakeLock wakeLock = this.f13473e;
        String str2 = f13469e;
        loadAd.smaato(str2, "Acquiring wakelock " + wakeLock + " for WorkSpec " + str, new Throwable[0]);
        this.f13473e.acquire();
        C13394e amazon = this.f13474e.f31015e.appmetrica.amazon().amazon(str);
        if (amazon == null) {
            appmetrica();
            return;
        }
        boolean vip = amazon.vip();
        this.f13475e = vip;
        if (vip) {
            this.f13470e.metrica(Collections.singletonList(amazon));
        } else {
            C5401e.loadAd().smaato(str2, AbstractC17861e.Signature("No constraints for ", str), new Throwable[0]);
            purchase(Collections.singletonList(str));
        }
    }

    @Override // defpackage.InterfaceC0325e
    public final void metrica(String str, boolean z) {
        C5401e.loadAd().smaato(f13469e, "onExecuted " + str + ", " + z, new Throwable[0]);
        vip();
        int i = this.f13472e;
        C15749e c15749e = this.f13474e;
        Context context = this.f13476e;
        if (z) {
            c15749e.purchase(new RunnableC10028e(c15749e, C0201e.vip(context, this.f13471e), i, 3));
        }
        if (this.f13475e) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_CONSTRAINTS_CHANGED");
            c15749e.purchase(new RunnableC10028e(c15749e, intent, i, 3));
        }
    }

    @Override // defpackage.InterfaceC6882e
    public final void purchase(List list) {
        if (list.contains(this.f13471e)) {
            synchronized (this.f13478e) {
                try {
                    if (this.f13477e == 0) {
                        this.f13477e = 1;
                        C5401e.loadAd().smaato(f13469e, "onAllConstraintsMet for " + this.f13471e, new Throwable[0]);
                        if (this.f13474e.f31020e.yandex(this.f13471e, null)) {
                            this.f13474e.f31016e.ad(this.f13471e, this);
                        } else {
                            vip();
                        }
                    } else {
                        C5401e.loadAd().smaato(f13469e, "Already started work for " + this.f13471e, new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void vip() {
        synchronized (this.f13478e) {
            try {
                this.f13470e.license();
                this.f13474e.f31016e.vip(this.f13471e);
                PowerManager.WakeLock wakeLock = this.f13473e;
                if (wakeLock != null && wakeLock.isHeld()) {
                    C5401e.loadAd().smaato(f13469e, "Releasing wakelock " + this.f13473e + " for WorkSpec " + this.f13471e, new Throwable[0]);
                    this.f13473e.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
