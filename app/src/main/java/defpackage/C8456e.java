package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.util.Base64;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8456e implements InterfaceC6823e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f17225e;

    @Override // defpackage.InterfaceC6823e
    public final Object get() {
        int i;
        switch (this.f17225e) {
            case 0:
                ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
                if (newSingleThreadExecutor instanceof InterfaceExecutorServiceC13317e) {
                    return (InterfaceExecutorServiceC13317e) newSingleThreadExecutor;
                }
                return newSingleThreadExecutor instanceof ScheduledExecutorService ? new C3598e((ScheduledExecutorService) newSingleThreadExecutor) : new C0918e(newSingleThreadExecutor);
            case 1:
                Resources system = Resources.getSystem();
                try {
                    i = system.getDimensionPixelSize(system.getIdentifier("notification_right_icon_size", "dimen", "android"));
                    if (Build.VERSION.SDK_INT < 31) {
                        i = Math.max(Math.max(i, system.getDimensionPixelSize(system.getIdentifier("notification_media_image_max_width", "dimen", "android"))), system.getDimensionPixelSize(system.getIdentifier("notification_media_image_max_height", "dimen", "android")));
                    }
                } catch (Resources.NotFoundException unused) {
                    i = (int) ((Build.VERSION.SDK_INT < 31 ? 280 : 48) * system.getDisplayMetrics().density);
                }
                return Integer.valueOf(i);
            case 2:
                byte[] bArr = new byte[12];
                C6671e.startapp.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 3:
                return new C2734e(new C11669e(65536), 50000, 1000, 50000, 50000, 1000, 1000, 2000, 1000, false, 0, C0409e.f2448e);
            case 4:
                Resources system2 = Resources.getSystem();
                int i2 = system2.getDisplayMetrics().widthPixels;
                try {
                    i2 = system2.getDimensionPixelSize(system2.getIdentifier("config_mediaMetadataBitmapMaxSize", "dimen", "android"));
                } catch (Resources.NotFoundException unused2) {
                }
                return Integer.valueOf(i2);
            case 5:
                Resources system3 = Resources.getSystem();
                int i3 = system3.getDisplayMetrics().widthPixels;
                try {
                    i3 = system3.getDimensionPixelSize(system3.getIdentifier("config_mediaMetadataBitmapMaxSize", "dimen", "android"));
                } catch (Resources.NotFoundException unused3) {
                }
                return Integer.valueOf(i3);
            case 6:
                try {
                    return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            default:
                throw new IllegalStateException();
        }
    }
}
