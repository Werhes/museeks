package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ۡؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC18060e implements View.OnClickListener {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f35421e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f35422e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f35423e = 0;

    public ViewOnClickListenerC18060e(C4961e c4961e, C6541e c6541e) {
        this.f35421e = c4961e;
        this.f35422e = c6541e;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eؒٞۨ, java.lang.Object] */
    public ViewOnClickListenerC18060e(C5286e c5286e) {
        this.f35421e = c5286e;
        Context context = c5286e.ad.getContext();
        CharSequence charSequence = c5286e.yandex;
        ?? obj = new Object();
        obj.f3862e = 4096;
        obj.f3876e = 4096;
        obj.f3864e = null;
        obj.f3863e = null;
        obj.f3867e = false;
        obj.f3869e = false;
        obj.f3870e = 16;
        obj.f3874e = context;
        obj.f3875e = charSequence;
        this.f35422e = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f35423e) {
            case 0:
                C4961e c4961e = (C4961e) this.f35421e;
                DialogC6738e dialogC6738e = c4961e.isPro.f5346e;
                C6541e c6541e = (C6541e) this.f35422e;
                dialogC6738e.f13930e = c6541e;
                c6541e.advert(true);
                c4961e.tapsense.setVisibility(4);
                c4961e.isVip.setVisibility(0);
                return;
            default:
                C5286e c5286e = (C5286e) this.f35421e;
                Window.Callback callback = c5286e.mopub;
                if (callback == null || !c5286e.advert) {
                    return;
                }
                callback.onMenuItemSelected(0, (C1225e) this.f35422e);
                return;
        }
    }
}
