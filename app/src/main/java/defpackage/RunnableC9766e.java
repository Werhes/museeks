package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Looper;
import android.os.Process;
import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.util.concurrent.ScheduledFuture;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٖۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC9766e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f19309e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f19310e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f19311e;

    public /* synthetic */ RunnableC9766e(int i, Runnable runnable) {
        this.f19311e = 0;
        this.f19310e = i;
        this.f19309e = runnable;
    }

    public /* synthetic */ RunnableC9766e(Object obj, int i, int i2) {
        this.f19311e = i2;
        this.f19309e = obj;
        this.f19310e = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ScheduledFuture scheduledFuture;
        C18405e c18405e;
        int i = this.f19311e;
        int i2 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        int i3 = this.f19310e;
        Object obj = this.f19309e;
        switch (i) {
            case 0:
                Process.setThreadPriority(i3);
                ((Runnable) obj).run();
                return;
            case 1:
                ((C0708e) obj).f2996e.onAudioFocusChange(i3);
                return;
            case 2:
                SurfaceHolderCallbackC0960e surfaceHolderCallbackC0960e = (SurfaceHolderCallbackC0960e) ((C17424e) obj).f34141e;
                String str = AbstractC9413e.ad;
                C17790e c17790e = surfaceHolderCallbackC0960e.ad.f33588e;
                C13218e c13218e = new C13218e(i3, objArr == true ? 1 : 0);
                c17790e.getClass();
                AbstractC2301e.subscription(Looper.myLooper() == ((C2399e) c17790e.f34881e).ad.getLooper());
                c17790e.f34880e++;
                c17790e.m4427extends(new RunnableC16019e(c17790e, c13218e, 11));
                c17790e.m4429implements(Integer.valueOf(i3));
                return;
            case 3:
                ((AbstractC1037e) obj).ad(i3);
                return;
            case 4:
                ((C10454e) obj).vip = i3;
                AbstractC9464e.remoteconfig("CameraController", "setEnabledUseCases: failed to enable use cases properly for enabledUseCases = " + Integer.toBinaryString(2) + ", restoring back previous values " + Integer.toBinaryString(i3));
                return;
            case 5:
                C11068e c11068e = (C11068e) obj;
                C18405e c18405e2 = c11068e.advert;
                if (c11068e.adcel) {
                    AbstractC9464e.remoteconfig(c18405e2.ad, "Receives input frame after codec is reset.");
                    return;
                }
                switch (AbstractC8703e.m2467class(c18405e2.f36090class)) {
                    case 0:
                    case 7:
                    case 8:
                        return;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        c18405e2.mopub.offer(Integer.valueOf(i3));
                        c18405e2.vip();
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(AbstractC4653e.m1645goto(c18405e2.f36090class)));
                }
            case 6:
                C4174e c4174e = ((C11246e) obj).f22579e;
                C18177e m1498super = c4174e.m1498super();
                c4174e.m1501transient(m1498super, 1034, new C5055e(m1498super, i3, i2));
                return;
            case 7:
                C4275e c4275e = (C4275e) obj;
                C17548e c17548e = c4275e.mopub;
                c17548e.remove(Integer.valueOf(i3));
                c4275e.advert.delete(i3);
                C7543e c7543e = c4275e.amazon;
                if (c7543e == null || c7543e.ad.firebase() >= 5 || !c17548e.isEmpty()) {
                    return;
                }
                c4275e.smaato.postDelayed(new RunnableC6364e(c4275e, objArr2 == true ? 1 : 0), 500L);
                return;
            case 8:
                C13343e c13343e = (C13343e) obj;
                int i4 = c13343e.premium;
                c13343e.premium = i3;
                if (i4 == i3) {
                    AbstractC9464e.yandex("Recorder", "Video source transitions to the same state: ".concat(AbstractC8647e.m2462try(i3)));
                    return;
                }
                AbstractC9464e.yandex("Recorder", "Video source has transitioned to state: ".concat(AbstractC8647e.m2462try(i3)));
                if (i3 != 3) {
                    if (i3 != 2 || (scheduledFuture = c13343e.tapsense) == null || !scheduledFuture.cancel(false) || (c18405e = c13343e.remoteconfig) == null) {
                        return;
                    }
                    C13343e.smaato(c18405e);
                    return;
                }
                if (c13343e.admob == null) {
                    C16042e c16042e = c13343e.isPro;
                    if (c16042e != null) {
                        if (!c16042e.f31595e) {
                            c16042e.f31595e = true;
                            ScheduledFuture scheduledFuture2 = (ScheduledFuture) c16042e.f31600e;
                            if (scheduledFuture2 != null) {
                                scheduledFuture2.cancel(false);
                                c16042e.f31600e = null;
                            }
                        }
                        c13343e.isPro = null;
                    }
                    c13343e.loadAd();
                    return;
                }
                return;
            case 9:
                ((AbstractC14437e) obj).yandex(i3);
                return;
            case 10:
                C8565e c8565e = (C8565e) obj;
                if (c8565e.metrica.get()) {
                    C10454e c10454e = c8565e.ad.f8273e;
                    c10454e.remoteconfig = i3;
                    C12477e c12477e = c10454e.billing;
                    if (c12477e.subs(i3)) {
                        c12477e.m3356while();
                    }
                    c10454e.license.m1346throw(i3);
                    C16864e c16864e = c10454e.yandex;
                    if (c16864e.subs(i3)) {
                        c16864e.m4190implements();
                        return;
                    }
                    return;
                }
                return;
            case 11:
                C8635e c8635e = (C8635e) obj;
                if (c8635e.metrica.get()) {
                    ((AbstractC16510e) c8635e.ad.f5254e).tapsense(i3);
                    return;
                }
                return;
            case 12:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) obj;
                View view = (View) sideSheetBehavior.Signature.get();
                if (view != null) {
                    sideSheetBehavior.signatures(view, i3, false);
                    return;
                }
                return;
            default:
                C17790e c17790e2 = (C17790e) obj;
                Context context = (Context) c17790e2.f34879e;
                AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                audioManager.getClass();
                c17790e2.f34884e = audioManager;
                C13264e c13264e = new C13264e(9, c17790e2);
                try {
                    context.registerReceiver(c13264e, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
                    c17790e2.f34883e = c13264e;
                } catch (RuntimeException e) {
                    AbstractC2803e.amazon("StreamVolumeManager", "Error registering stream volume receiver", e);
                }
                ((C17790e) c17790e2.f34878e).m4432protected(c17790e2.mopub(i3));
                return;
        }
    }
}
