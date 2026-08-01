package defpackage;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۣۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC16525e implements Runnable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f32403e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Notification f32404e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ SystemForegroundService f32405e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f32406e;

    public RunnableC16525e(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        this.f32405e = systemForegroundService;
        this.f32406e = i;
        this.f32404e = notification;
        this.f32403e = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = Build.VERSION.SDK_INT;
        Notification notification = this.f32404e;
        int i2 = this.f32406e;
        SystemForegroundService systemForegroundService = this.f32405e;
        if (i >= 29) {
            systemForegroundService.startForeground(i2, notification, this.f32403e);
        } else {
            systemForegroundService.startForeground(i2, notification);
        }
    }
}
