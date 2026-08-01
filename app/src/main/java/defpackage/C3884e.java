package defpackage;

import android.R;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ua.itaysonlab.vkapi2.objects.music.SmartSuggestion;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖؕۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3884e extends AbstractC5604e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final InterfaceC8370e f8714e;

    public C3884e(InterfaceC8370e interfaceC8370e) {
        this.f8714e = interfaceC8370e;
    }

    @Override // defpackage.AbstractC5604e
    public final void ads(int i, Object obj, InterfaceC10283e interfaceC10283e) {
        SmartSuggestion smartSuggestion = (SmartSuggestion) obj;
        StringBuilder sb = new StringBuilder();
        String str = smartSuggestion.ad;
        sb.append(str);
        sb.append(' ');
        sb.append(smartSuggestion.vip);
        String sb2 = sb.toString();
        SpannableString spannableString = new SpannableString(sb2);
        VKXApplication.Companion companion = VKXApplication.f36531e;
        spannableString.setSpan(new ForegroundColorSpan(AbstractC15933e.ad(R.attr.textColorSecondary)), str.length(), sb2.length(), 33);
        TextView textView = ((C11147e) interfaceC10283e).f22369e;
        textView.setText(spannableString);
        textView.setOnClickListener(new ViewOnClickListenerC0858e(smartSuggestion, this, 4));
    }

    @Override // defpackage.AbstractC5604e
    public final int crashlytics() {
        return ua.itaysonlab.vkx.R.layout.c3_search_suggestion_vertical;
    }

    @Override // defpackage.AbstractC5604e
    public final InterfaceC10283e subs(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(ua.itaysonlab.vkx.R.layout.c3_search_suggestion_vertical, viewGroup, false);
        if (inflate != null) {
            return new C11147e((TextView) inflate);
        }
        throw new NullPointerException("rootView");
    }
}
