package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۣؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC2181e implements View.OnClickListener {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Context f5546e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f5547e;

    public /* synthetic */ ViewOnClickListenerC2181e(Context context, int i) {
        this.f5547e = i;
        this.f5546e = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f5547e) {
            case 0:
                ((Activity) this.f5546e).onBackPressed();
                return;
            default:
                ((Activity) this.f5546e).onBackPressed();
                return;
        }
    }
}
