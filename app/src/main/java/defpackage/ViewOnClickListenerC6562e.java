package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import ua.itaysonlab.vkapi2.objects.radio.RadioStation;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٟٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC6562e implements View.OnClickListener {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ RadioStation f13532e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13533e;

    public /* synthetic */ ViewOnClickListenerC6562e(RadioStation radioStation, int i) {
        this.f13533e = i;
        this.f13532e = radioStation;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f13533e) {
            case 0:
                Context context = view.getContext();
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if (activity != null) {
                    AbstractC13201e.license(activity, new C15167e(this.f13532e));
                    return;
                }
                return;
            default:
                Context context2 = view.getContext();
                Activity activity2 = context2 instanceof Activity ? (Activity) context2 : null;
                if (activity2 != null) {
                    AbstractC13201e.license(activity2, new C15167e(this.f13532e));
                    return;
                }
                return;
        }
    }
}
