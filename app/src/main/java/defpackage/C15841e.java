package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۥِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15841e implements InterfaceC1415e {
    public final /* synthetic */ int ad;
    public static final C15841e vip = new C15841e(0);
    public static final C15841e metrica = new C15841e(1);

    public /* synthetic */ C15841e(int i) {
        this.ad = i;
    }

    private final void vip(Object obj) {
    }

    @Override // defpackage.InterfaceC1415e
    public final void ad(Object obj) {
        switch (this.ad) {
            case 0:
                AutoCloseable autoCloseable = (AutoCloseable) obj;
                if (autoCloseable != null) {
                    if (autoCloseable instanceof AutoCloseable) {
                        autoCloseable.close();
                        return;
                    }
                    if (autoCloseable instanceof ExecutorService) {
                        AbstractC6418e.smaato((ExecutorService) autoCloseable);
                        return;
                    }
                    if (autoCloseable instanceof TypedArray) {
                        ((TypedArray) autoCloseable).recycle();
                        return;
                    }
                    if (autoCloseable instanceof MediaMetadataRetriever) {
                        ((MediaMetadataRetriever) autoCloseable).release();
                        return;
                    }
                    if (autoCloseable instanceof MediaDrm) {
                        ((MediaDrm) autoCloseable).release();
                        return;
                    } else if (autoCloseable instanceof DrmManagerClient) {
                        ((DrmManagerClient) autoCloseable).release();
                        return;
                    } else {
                        if (!(autoCloseable instanceof ContentProviderClient)) {
                            throw new IllegalArgumentException();
                        }
                        ((ContentProviderClient) autoCloseable).release();
                        return;
                    }
                }
                return;
            default:
                return;
        }
    }
}
