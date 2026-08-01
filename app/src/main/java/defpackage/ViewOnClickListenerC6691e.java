package defpackage;

import android.view.View;
import ua.itaysonlab.vkapi2.objects.podcasts.Podcast;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙ۠ؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC6691e implements View.OnClickListener {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Podcast f13803e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13804e;

    public /* synthetic */ ViewOnClickListenerC6691e(Podcast podcast, int i) {
        this.f13804e = i;
        this.f13803e = podcast;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f13804e) {
            case 0:
                AbstractC7237e.ad(view, new C5421e(this.f13803e.vip));
                return;
            default:
                AbstractC7237e.ad(view, new C5421e(this.f13803e.vip));
                return;
        }
    }
}
