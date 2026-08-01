package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Editable;
import android.view.View;
import android.widget.Toast;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.Unit;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.Catalog2ButtonAction;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٗؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC16710e implements View.OnClickListener {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f32766e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f32767e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f32768e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f32769e;

    public /* synthetic */ ViewOnClickListenerC16710e(int i, Object obj, Object obj2, Object obj3) {
        this.f32769e = i;
        this.f32768e = obj;
        this.f32767e = obj2;
        this.f32766e = obj3;
    }

    public /* synthetic */ ViewOnClickListenerC16710e(C11467e c11467e, Activity activity, AudioTrack audioTrack, C15584e c15584e) {
        this.f32769e = 3;
        this.f32768e = c11467e;
        this.f32767e = activity;
        this.f32766e = audioTrack;
    }

    public /* synthetic */ ViewOnClickListenerC16710e(Catalog2Button catalog2Button, C12521e c12521e, C17030e c17030e) {
        this.f32769e = 5;
        this.f32766e = catalog2Button;
        this.f32768e = c12521e;
        this.f32767e = c17030e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Editable text;
        int i = this.f32769e;
        InterfaceC5083e interfaceC5083e = null;
        int i2 = 0;
        Object obj = this.f32766e;
        Object obj2 = this.f32767e;
        Object obj3 = this.f32768e;
        switch (i) {
            case 0:
                AbstractC0223e.startapp(((C0714e) obj2).f3005e.getContext(), ((C1875e) obj3).f5004e, (Catalog2Button) obj);
                return;
            case 1:
                Catalog2Button catalog2Button = (Catalog2Button) obj;
                Context context = ((C0714e) obj2).f3005e.getContext();
                AbstractC15876e abstractC15876e = ((C1875e) obj3).f5004e;
                if (catalog2Button == null) {
                    return;
                }
                AbstractC0223e.startapp(context, abstractC15876e, catalog2Button);
                return;
            case 2:
                C1875e c1875e = (C1875e) obj3;
                C0714e c0714e = (C0714e) obj2;
                AbstractC16519e.ad(c1875e, c0714e.f3005e.getContext(), false, new C14869e((VKProfile) obj, c1875e, c0714e, null, 25));
                return;
            case 3:
                C11467e c11467e = (C11467e) obj3;
                Context context2 = (Context) obj2;
                AudioTrack audioTrack = (AudioTrack) obj;
                TextInputEditText textInputEditText = (TextInputEditText) c11467e.f23071e;
                TextInputEditText textInputEditText2 = (TextInputEditText) c11467e.f23070e;
                Editable text2 = textInputEditText.getText();
                if (text2 == null || text2.length() == 0 || (text = textInputEditText2.getText()) == null || text.length() == 0) {
                    Toast.makeText(context2, "Оба поля должны быть заполнены!", 1).show();
                    return;
                }
                ((MaterialButton) c11467e.f23069e).setEnabled(false);
                AbstractC18406e.appmetrica(new C13029e(audioTrack, String.valueOf(textInputEditText.getText()), String.valueOf(textInputEditText2.getText())));
                String.valueOf(textInputEditText.getText());
                String.valueOf(textInputEditText2.getText());
                Unit unit = Unit.INSTANCE;
                ((DialogInterfaceC15370e) AbstractC2835e.startapp.get()).dismiss();
                AbstractC2835e.startapp = null;
                return;
            case 4:
                AbstractC16519e.vip((AppActivity) C1059e.billing(view.getContext()), new C8857e((C9302e) obj3, (C12521e) obj2, (C2109e) obj, (InterfaceC5083e) null, 18));
                return;
            case 5:
                Catalog2Button catalog2Button2 = (Catalog2Button) obj;
                C12521e c12521e = (C12521e) obj3;
                C17030e c17030e = (C17030e) obj2;
                Catalog2ButtonAction catalog2ButtonAction = catalog2Button2.ad;
                if (catalog2ButtonAction instanceof C9256e) {
                    new C13182e(new C9041e(c12521e, view, 21), null, null, 14).signatures((Activity) view.getContext());
                    return;
                }
                if (!(catalog2ButtonAction instanceof C8799e) && !(catalog2ButtonAction instanceof C4582e)) {
                    if (catalog2ButtonAction instanceof Catalog2ButtonAction.SynthCustomAction) {
                        ((Catalog2ButtonAction.SynthCustomAction) catalog2ButtonAction).license.invoke(view.getContext());
                        return;
                    }
                    return;
                } else {
                    Context context3 = c17030e.f33365e.getContext();
                    AbstractC15876e abstractC15876e2 = c12521e.f25065e;
                    if (abstractC15876e2 == null) {
                        return;
                    }
                    AbstractC0223e.startapp(context3, abstractC15876e2, catalog2Button2);
                    return;
                }
            default:
                final C1652e c1652e = (C1652e) obj3;
                final C8745e c8745e = (C8745e) obj2;
                final C15820e c15820e = c1652e.f4581e;
                int ordinal = ((EnumC18011e) obj).ordinal();
                int i3 = 4;
                switch (ordinal) {
                    case 0:
                        AbstractC16519e.ad(c15820e, c15820e.pro(), false, new C17716e(c15820e, interfaceC5083e, i2));
                        return;
                    case 1:
                        C16985e c16985e = new C16985e(c15820e.pro());
                        C11486e c11486e = (C11486e) c16985e.f26878e;
                        c11486e.license = c11486e.ad.getText(R.string.confirm);
                        c11486e.purchase = AbstractC1786e.signatures(new StringBuilder("Удалить \""), c15820e.f31221e.subs, "\"?");
                        c16985e.premium(R.string.remove, new DialogInterfaceOnClickListenerC10930e(0, c15820e));
                        c16985e.ads(R.string.cancel, new DialogInterfaceOnClickListenerC11813e(3));
                        c16985e.isPro();
                        return;
                    case 2:
                        C15820e.m4026switch(c15820e, new C16668e(c15820e, i3));
                        return;
                    case 3:
                        C16985e c16985e2 = new C16985e(c15820e.pro());
                        C11486e c11486e2 = (C11486e) c16985e2.f26878e;
                        c11486e2.license = c11486e2.ad.getText(R.string.confirm);
                        c11486e2.purchase = c15820e.pro().getString(R.string.cache_remove_playlist_desc, c15820e.f31221e.subs);
                        c16985e2.premium(R.string.remove, new DialogInterface.OnClickListener() { // from class: eٗۤۜ
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i4) {
                                dialogInterface.dismiss();
                                C15820e c15820e2 = C15820e.this;
                                AppActivity appActivity = (AppActivity) c15820e2.pro();
                                AbstractC16519e.ad(AbstractC17947e.billing(appActivity), appActivity, true, new C16373e(c15820e2, c1652e, c8745e, (InterfaceC5083e) null, 5));
                            }
                        });
                        DialogInterfaceOnClickListenerC10930e dialogInterfaceOnClickListenerC10930e = new DialogInterfaceOnClickListenerC10930e(1, c15820e);
                        c11486e2.mopub = c11486e2.ad.getText(R.string.playlist_cache_update);
                        c11486e2.advert = dialogInterfaceOnClickListenerC10930e;
                        c16985e2.ads(R.string.cancel, new DialogInterfaceOnClickListenerC11813e(4));
                        c16985e2.isPro();
                        return;
                    case 4:
                        C15820e.m4026switch(c15820e, new C16668e(c15820e, 5));
                        return;
                    case 5:
                        new C13424e(new C10702e(c15820e.f31221e)).signatures(c15820e.pro());
                        return;
                    case 6:
                        C15820e.m4026switch(c15820e, new C16668e(c15820e, 6));
                        return;
                    case 7:
                        C15820e.m4026switch(c15820e, new C16668e(c15820e, 7));
                        return;
                    default:
                        throw new C14803e(10);
                }
        }
    }
}
