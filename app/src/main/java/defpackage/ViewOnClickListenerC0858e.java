package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.Catalog2ButtonAction;
import ua.itaysonlab.vkapi2.objects.message.Conversation;
import ua.itaysonlab.vkapi2.objects.music.SmartSuggestion;
import ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒؗؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0858e implements View.OnClickListener {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f3267e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f3268e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f3269e;

    public /* synthetic */ ViewOnClickListenerC0858e(Object obj, Object obj2, int i) {
        this.f3269e = i;
        this.f3268e = obj;
        this.f3267e = obj2;
    }

    public /* synthetic */ ViewOnClickListenerC0858e(Catalog2Button catalog2Button, C10708e c10708e) {
        this.f3269e = 2;
        this.f3267e = catalog2Button;
        this.f3268e = c10708e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f3269e) {
            case 0:
                C0808e c0808e = (C0808e) this.f3268e;
                C3288e.ad(c0808e.f3200e.getContext(), (Catalog2Button) this.f3267e);
                return;
            case 1:
                AbstractC7237e.ad(view, new C18311e(((Conversation) this.f3268e).ad.ad, ((C18348e) this.f3267e).tapsense.getText().toString()));
                return;
            case 2:
                Catalog2Button catalog2Button = (Catalog2Button) this.f3267e;
                C10708e c10708e = (C10708e) this.f3268e;
                Catalog2ButtonAction catalog2ButtonAction = catalog2Button.ad;
                if (catalog2ButtonAction instanceof C5295e) {
                    new C11467e(view, new C9041e(catalog2Button, c10708e, 19)).m3218this();
                    return;
                }
                if (!(catalog2ButtonAction instanceof C16512e)) {
                    if (catalog2ButtonAction instanceof Catalog2ButtonAction.SynthCustomAction) {
                        ((Catalog2ButtonAction.SynthCustomAction) catalog2ButtonAction).license.invoke(view.getContext());
                        return;
                    }
                    return;
                }
                Context context = view.getContext();
                String m4037volatile = c10708e.f21091e.m4037volatile();
                if ((catalog2ButtonAction instanceof C16512e) || (catalog2ButtonAction instanceof C10164e)) {
                    String str = catalog2Button.vip;
                    if (str == null) {
                        return;
                    }
                    AbstractC7237e.metrica(context, new C0963e(str, new C5625e(str, m4037volatile, 27)));
                    return;
                }
                if (catalog2ButtonAction instanceof Catalog2ButtonAction.OpenUrl) {
                    C5658e.metrica(C5658e.ad, Uri.parse(((Catalog2ButtonAction.OpenUrl) catalog2ButtonAction).ad), false, 6);
                    return;
                } else {
                    if (catalog2ButtonAction instanceof Catalog2ButtonAction.SynthCustomAction) {
                        ((Catalog2ButtonAction.SynthCustomAction) catalog2ButtonAction).license.invoke(context);
                        return;
                    }
                    return;
                }
            case 3:
                NextDockView nextDockView = (NextDockView) this.f3268e;
                boolean z = true;
                nextDockView.post(new RunnableC12719e(nextDockView.f36761e.indexOf((C0998e) this.f3267e), nextDockView, z, z));
                return;
            default:
                SmartSuggestion smartSuggestion = (SmartSuggestion) this.f3268e;
                InterfaceC8370e interfaceC8370e = ((C3884e) this.f3267e).f8714e;
                boolean billing = AbstractC7890e.billing(smartSuggestion.metrica, "synth_fc");
                String str2 = smartSuggestion.license;
                String str3 = smartSuggestion.ad;
                if (billing || interfaceC8370e.metrica()) {
                    interfaceC8370e.signatures(str3);
                    return;
                }
                interfaceC8370e.getClass();
                if (str3 == null) {
                    str3 = BuildConfig.FLAVOR;
                }
                AbstractC7237e.ad(view, new C14850e(str2, str3));
                return;
        }
    }
}
