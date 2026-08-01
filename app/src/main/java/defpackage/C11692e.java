package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.service.media.MediaBrowserService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِّؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C11692e extends C4363e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C10756e f23522e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11692e(C10756e c10756e, Context context) {
        super(c10756e, context);
        this.f23522e = c10756e;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        Bundle Signature = AbstractC9413e.Signature(bundle);
        C10756e c10756e = this.f23522e;
        ServiceC13230e serviceC13230e = c10756e.f21178e;
        C17684e c17684e = serviceC13230e.f26250e;
        C8311e c8311e = new C8311e(c10756e, str, new C2362e(18, result), Signature);
        serviceC13230e.f26259e = c17684e;
        serviceC13230e.license(str, c8311e, Signature);
        serviceC13230e.f26259e = null;
        serviceC13230e.f26259e = null;
    }
}
