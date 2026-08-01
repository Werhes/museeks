package defpackage;

import android.media.session.MediaController;
import android.net.Uri;
import android.os.Bundle;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؒؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C0813e extends C13935e {
    @Override // defpackage.C13935e
    /* renamed from: abstract, reason: not valid java name */
    public final void mo406abstract(String str, Bundle bundle) {
        ((MediaController.TransportControls) this.f27641e).prepareFromSearch(str, bundle);
    }

    @Override // defpackage.C13935e
    /* renamed from: break, reason: not valid java name */
    public final void mo407break(String str, Bundle bundle) {
        ((MediaController.TransportControls) this.f27641e).prepareFromMediaId(str, bundle);
    }

    @Override // defpackage.C13935e
    /* renamed from: default, reason: not valid java name */
    public final void mo408default(Uri uri, Bundle bundle) {
        ((MediaController.TransportControls) this.f27641e).prepareFromUri(uri, bundle);
    }

    @Override // defpackage.C13935e
    /* renamed from: protected, reason: not valid java name */
    public final void mo409protected() {
        ((MediaController.TransportControls) this.f27641e).prepare();
    }
}
