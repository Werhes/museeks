package defpackage;

import android.R;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import ua.itaysonlab.vkapi2.objects.music.SmartSuggestion;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟ٘ۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17923e extends AbstractC5604e {
    @Override // defpackage.AbstractC5604e
    public final void ads(int i, Object obj, InterfaceC10283e interfaceC10283e) {
        SmartSuggestion smartSuggestion = (SmartSuggestion) obj;
        C10094e c10094e = (C10094e) interfaceC10283e;
        StringBuilder sb = new StringBuilder();
        String str = smartSuggestion.ad;
        sb.append(str);
        sb.append(' ');
        sb.append(smartSuggestion.vip);
        String sb2 = sb.toString();
        SpannableString spannableString = new SpannableString(sb2);
        VKXApplication.Companion companion = VKXApplication.f36531e;
        spannableString.setSpan(new ForegroundColorSpan(AbstractC15933e.ad(R.attr.textColorSecondary)), str.length(), sb2.length(), 33);
        c10094e.f19947e.setText(spannableString);
        c10094e.f19948e.setOnClickListener(new ViewOnClickListenerC0123e(11, smartSuggestion));
    }

    @Override // defpackage.AbstractC5604e
    public final int crashlytics() {
        return ua.itaysonlab.vkx.R.layout.c3_search_suggestion;
    }

    @Override // defpackage.AbstractC5604e
    public final InterfaceC10283e subs(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(ua.itaysonlab.vkx.R.layout.c3_search_suggestion, viewGroup, false);
        TextView textView = (TextView) AbstractC7779e.vip(inflate, ua.itaysonlab.vkx.R.id.catalog_item_title);
        if (textView != null) {
            return new C10094e((LinearLayout) inflate, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(ua.itaysonlab.vkx.R.id.catalog_item_title)));
    }
}
