package defpackage;

import android.media.session.MediaSessionManager;
import android.text.TextUtils;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؓٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C3097e extends C15944e {
    /* JADX WARN: Type inference failed for: r1v0, types: [eٖۣؒ, java.lang.Object] */
    @Override // defpackage.C15944e
    public final C15938e metrica() {
        MediaSessionManager.RemoteUserInfo currentControllerInfo = this.ad.getCurrentControllerInfo();
        ?? obj = new Object();
        String packageName = currentControllerInfo.getPackageName();
        if (packageName == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(packageName)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        obj.ad = new C6165e(currentControllerInfo.getPackageName(), currentControllerInfo.getPid(), currentControllerInfo.getUid());
        return obj;
    }

    @Override // defpackage.C15944e
    public final void purchase(C15938e c15938e) {
    }
}
