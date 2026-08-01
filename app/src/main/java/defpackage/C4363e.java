package defpackage;

import android.content.Context;
import android.service.media.MediaBrowserService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؖۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C4363e extends MediaBrowserService {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C11467e f9493e;

    public C4363e(C11467e c11467e, Context context) {
        this.f9493e = c11467e;
        attachBaseContext(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0242 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021f  */
    @Override // android.service.media.MediaBrowserService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.service.media.MediaBrowserService.BrowserRoot onGetRoot(java.lang.String r24, int r25, android.os.Bundle r26) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4363e.onGetRoot(java.lang.String, int, android.os.Bundle):android.service.media.MediaBrowserService$BrowserRoot");
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result) {
        C8311e c8311e = new C8311e(str, new C2362e(18, result), 0);
        ServiceC13230e serviceC13230e = (ServiceC13230e) this.f9493e.f23071e;
        serviceC13230e.f26259e = serviceC13230e.f26250e;
        serviceC13230e.license(str, c8311e, null);
        serviceC13230e.f26259e = null;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadItem(String str, MediaBrowserService.Result result) {
        C8311e c8311e = new C8311e(str, new C2362e(18, result), 1);
        ServiceC13230e serviceC13230e = (ServiceC13230e) this.f9493e.f23071e;
        serviceC13230e.f26259e = serviceC13230e.f26250e;
        serviceC13230e.appmetrica(str, c8311e);
        serviceC13230e.f26259e = null;
    }
}
