package defpackage;

import android.content.ContentProviderClient;
import android.content.res.TypedArray;
import android.drm.DrmManagerClient;
import android.graphics.SurfaceTexture;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.util.Log;
import android.view.Surface;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؒٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12984e implements InterfaceC8943e {
    public final /* synthetic */ CountDownLatch ad;
    public final /* synthetic */ SurfaceTexture license;
    public final /* synthetic */ Surface metrica;
    public final /* synthetic */ C2673e vip;

    public C12984e(CountDownLatch countDownLatch, C2673e c2673e, Surface surface, SurfaceTexture surfaceTexture) {
        this.ad = countDownLatch;
        this.vip = c2673e;
        this.metrica = surface;
        this.license = surfaceTexture;
    }

    @Override // defpackage.InterfaceC8260e
    public final void ad() {
    }

    @Override // defpackage.InterfaceC8943e
    public final void appmetrica() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC8943e
    public final void billing(InterfaceC6545e interfaceC6545e) {
        Log.d("CXCP", "Empty capture session configured. Closing it");
        if (interfaceC6545e instanceof AutoCloseable) {
            interfaceC6545e.close();
        } else if (interfaceC6545e instanceof ExecutorService) {
            AbstractC6418e.smaato((ExecutorService) interfaceC6545e);
        } else if (interfaceC6545e instanceof TypedArray) {
            ((TypedArray) interfaceC6545e).recycle();
        } else if (interfaceC6545e instanceof MediaMetadataRetriever) {
            ((MediaMetadataRetriever) interfaceC6545e).release();
        } else if (interfaceC6545e instanceof MediaDrm) {
            ((MediaDrm) interfaceC6545e).release();
        } else if (interfaceC6545e instanceof DrmManagerClient) {
            ((DrmManagerClient) interfaceC6545e).release();
        } else {
            if (!(interfaceC6545e instanceof ContentProviderClient)) {
                throw new IllegalArgumentException();
            }
            ((ContentProviderClient) interfaceC6545e).release();
        }
        this.ad.countDown();
    }

    @Override // defpackage.InterfaceC8943e
    public final void license() {
        Log.d("CXCP", "Empty capture session closed");
        if (this.vip.ad()) {
            this.metrica.release();
            this.license.release();
        }
    }

    @Override // defpackage.InterfaceC8943e
    public final void metrica() {
    }

    @Override // defpackage.InterfaceC8943e
    public final void purchase() {
    }

    @Override // defpackage.InterfaceC8260e
    public final void vip() {
    }

    @Override // defpackage.InterfaceC8943e
    public final void yandex() {
        Log.d("CXCP", "Empty capture session configure failed");
        if (this.vip.ad()) {
            this.metrica.release();
            this.license.release();
        }
        this.ad.countDown();
    }
}
