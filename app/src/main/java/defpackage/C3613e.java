package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؕۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3613e implements InterfaceC11623e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final boolean f8154e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final boolean f8155e;

    public C3613e(C3909e c3909e) {
        boolean z;
        Iterator it = c3909e.metrica(CaptureIntentPreviewQuirk.class).iterator();
        while (true) {
            if (!it.hasNext()) {
                z = false;
                break;
            } else if (((CaptureIntentPreviewQuirk) it.next()).metrica()) {
                z = true;
                break;
            }
        }
        this.f8155e = z;
        this.f8154e = c3909e.ad(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }

    public C3613e(boolean z, boolean z2) {
        this.f8155e = z;
        this.f8154e = z2;
    }

    @Override // defpackage.InterfaceC11623e
    public Map ad(C18217e c18217e) {
        return (c18217e != null && c18217e.ad == 3 && this.f8155e) ? Collections.singletonMap(CaptureRequest.CONTROL_CAPTURE_INTENT, 1) : (c18217e != null && c18217e.ad == 4 && this.f8154e) ? Collections.singletonMap(CaptureRequest.CONTROL_CAPTURE_INTENT, 2) : C9139e.f18290e;
    }
}
