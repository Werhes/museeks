package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import ua.itaysonlab.vkapi2.objects.music.AudioBook;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1249e implements View.OnClickListener {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ AudioBook f3948e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f3949e;

    public /* synthetic */ ViewOnClickListenerC1249e(AudioBook audioBook, int i) {
        this.f3949e = i;
        this.f3948e = audioBook;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3949e) {
            case 0:
                Context context = view.getContext();
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if (activity != null) {
                    AbstractC7237e.metrica(activity, new C11210e(this.f3948e.ad));
                    return;
                }
                return;
            default:
                Context context2 = view.getContext();
                Activity activity2 = context2 instanceof Activity ? (Activity) context2 : null;
                if (activity2 != null) {
                    AbstractC7237e.metrica(activity2, new C11210e(this.f3948e.ad));
                    return;
                }
                return;
        }
    }
}
