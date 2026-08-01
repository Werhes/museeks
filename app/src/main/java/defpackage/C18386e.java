package defpackage;

import android.app.Activity;
import android.content.Intent;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e۟ؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18386e extends AbstractDialogInterfaceOnClickListenerC5702e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f36048e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Activity f36049e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ Intent f36050e;

    public C18386e(Intent intent, Activity activity, int i) {
        this.f36050e = intent;
        this.f36049e = activity;
        this.f36048e = i;
    }

    @Override // defpackage.AbstractDialogInterfaceOnClickListenerC5702e
    public final void ad() {
        Intent intent = this.f36050e;
        if (intent != null) {
            this.f36049e.startActivityForResult(intent, this.f36048e);
        }
    }
}
