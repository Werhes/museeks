package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import java.util.List;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.Catalog2ButtonAction;
import ua.itaysonlab.vkapi2.objects.music.SmartSuggestion;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؗۦ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0123e implements View.OnClickListener {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f1283e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f1284e;

    public /* synthetic */ ViewOnClickListenerC0123e(int i, Object obj) {
        this.f1284e = i;
        this.f1283e = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        AbstractC10716e c14850e;
        IBinder windowToken;
        int i = this.f1284e;
        int i2 = 2;
        InterfaceC5083e interfaceC5083e = null;
        Object obj = this.f1283e;
        switch (i) {
            case 0:
                AbstractC5004e abstractC5004e = (AbstractC5004e) obj;
                if (abstractC5004e.f10580e) {
                    return;
                }
                abstractC5004e.purchase();
                return;
            case 1:
                C15624e c15624e = (C15624e) obj;
                EditText editText = c15624e.startapp;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                c15624e.Signature();
                return;
            case 2:
                view.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://vk.com/club" + ((VKProfile) obj).ad)));
                return;
            case 3:
                ((C12801e) obj).pro();
                return;
            case 4:
                List list = ((C12521e) obj).f25064e;
                if (((Catalog2Button) list.get(0)).ad instanceof Catalog2ButtonAction.OpenUrl) {
                    C5658e.ad.vip(((Catalog2ButtonAction.OpenUrl) ((Catalog2Button) list.get(0)).ad).ad);
                    return;
                }
                String str = ((Catalog2Button) list.get(0)).vip;
                C5363e c5363e = C0308e.appmetrica;
                AbstractC7237e.ad(view, new C0963e(str, new C5625e(str, AbstractC18271e.metrica().license.pro(), 27)));
                return;
            case 5:
                ((C8977e) obj).m2513this();
                throw null;
            case 6:
                ((DialogC6627e) obj).dismiss();
                return;
            case 7:
                C15293e c15293e = (C15293e) obj;
                C13465e c13465e = c15293e.f30217e;
                if (c13465e != null) {
                    ((C12344e) c13465e.f26730e).Signature();
                }
                c15293e.m3926private();
                return;
            case 8:
                C4462e c4462e = (C4462e) obj;
                EditText editText2 = c4462e.purchase;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = c4462e.purchase;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    c4462e.purchase.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    c4462e.purchase.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    c4462e.purchase.setSelection(selectionEnd);
                }
                c4462e.Signature();
                return;
            case 9:
                AbstractC16519e.ad((C8390e) obj, view.getContext(), false, new C7236e(i2, interfaceC5083e));
                return;
            case 10:
                ((Function1) obj).invoke(view);
                return;
            case 11:
                SmartSuggestion smartSuggestion = (SmartSuggestion) obj;
                AppActivity appActivity = (AppActivity) view.getContext();
                InputMethodManager inputMethodManager = (InputMethodManager) appActivity.getSystemService("input_method");
                View currentFocus = appActivity.getCurrentFocus();
                if (currentFocus != null && (windowToken = currentFocus.getWindowToken()) != null) {
                    inputMethodManager.hideSoftInputFromWindow(windowToken, 2);
                }
                boolean billing = AbstractC7890e.billing(smartSuggestion.metrica, "synth_fc");
                String str2 = smartSuggestion.ad;
                if (billing) {
                    c14850e = new C0963e(str2, 4);
                } else {
                    if (str2 == null) {
                        str2 = BuildConfig.FLAVOR;
                    }
                    c14850e = new C14850e(smartSuggestion.license, str2);
                }
                AbstractC7237e.ad(view, c14850e);
                return;
            default:
                C15820e c15820e = (C15820e) obj;
                AudioPlaylist audioPlaylist = c15820e.f31221e;
                if (audioPlaylist == null) {
                    return;
                }
                c15820e.m2514goto(new C1718e(new C5814e(Math.abs(AbstractC15440e.f30517e.license()), null, audioPlaylist)));
                return;
        }
    }
}
