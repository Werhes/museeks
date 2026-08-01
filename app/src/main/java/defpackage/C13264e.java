package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import j$.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13264e extends BroadcastReceiver {
    public final /* synthetic */ int ad;
    public final Object vip;

    public /* synthetic */ C13264e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    public C13264e(C6936e c6936e) {
        this.ad = 11;
        this.vip = c6936e;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        KeyEvent keyEvent;
        switch (this.ad) {
            case 0:
                C7366e c7366e = (C7366e) this.vip;
                c7366e.metrica.execute(new RunnableC2613e(c7366e, 2));
                return;
            case 1:
                ((AbstractC11130e) this.vip).mo2983e();
                return;
            case 2:
                C7116e c7116e = (C7116e) this.vip;
                if (isInitialStickyBroadcast()) {
                    return;
                }
                c7116e.vip(C16717e.vip(context, intent, c7116e.adcel, c7116e.startapp, c7116e.ad()));
                return;
            case 3:
                if (intent != null) {
                    ((AbstractC9246e) this.vip).billing(intent);
                    return;
                }
                return;
            case 4:
                if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
                    ((DialogC6627e) this.vip).dismiss();
                    return;
                }
                return;
            case 5:
                if (Objects.equals(intent.getAction(), "android.intent.action.MEDIA_BUTTON") && (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) != null) {
                    ((C8603e) ((C5891e) ((C5537e) this.vip).amazon.f26644e).f12440e).ad.dispatchMediaButtonEvent(keyEvent);
                    return;
                }
                return;
            case 6:
                if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                    return;
                }
                C5401e.loadAd().smaato(C9551e.adcel, "Network broadcast received", new Throwable[0]);
                C9551e c9551e = (C9551e) this.vip;
                c9551e.metrica(c9551e.purchase());
                return;
            case 7:
                ((Executor) ((C0462e) this.vip).f2534e).execute(new RunnableC7410e(this, context, 28));
                return;
            case 8:
                ((C0222e) this.vip).purchase();
                return;
            case 9:
                ((C17790e) ((C17790e) this.vip).f34878e).m4427extends(new RunnableC1352e(3, this));
                return;
            case 10:
                ((C1126e) this.vip).metrica();
                return;
            default:
                C6936e c6936e = (C6936e) this.vip;
                if (intent == null) {
                    C13879e c13879e = c6936e.f14227e;
                    C6936e.yandex(c13879e);
                    c13879e.f27495e.ad("App receiver called with null intent");
                    return;
                }
                String action = intent.getAction();
                if (action == null) {
                    C13879e c13879e2 = c6936e.f14227e;
                    C6936e.yandex(c13879e2);
                    c13879e2.f27495e.ad("App receiver called with null action");
                    return;
                }
                int hashCode = action.hashCode();
                if (hashCode != -1928239649) {
                    if (hashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                        C13879e c13879e3 = c6936e.f14227e;
                        C6936e.yandex(c13879e3);
                        c13879e3.f27497e.ad("[sgtm] App Receiver notified batches are available");
                        C6915e c6915e = c6936e.f14226e;
                        C6936e.yandex(c6915e);
                        c6915e.m2254e(new RunnableC16721e(25, this));
                        return;
                    }
                } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                    C4261e.ad();
                    if (c6936e.f14221e.m2822e(null, AbstractC17254e.f33825e)) {
                        C13879e c13879e4 = c6936e.f14227e;
                        C6936e.yandex(c13879e4);
                        c13879e4.f27497e.ad("App receiver notified triggers are available");
                        C6915e c6915e2 = c6936e.f14226e;
                        C6936e.yandex(c6915e2);
                        c6915e2.m2254e(new RunnableC16721e(26, c6936e));
                        return;
                    }
                    return;
                }
                C13879e c13879e5 = c6936e.f14227e;
                C6936e.yandex(c13879e5);
                c13879e5.f27495e.ad("App receiver called with unknown action");
                return;
        }
    }
}
