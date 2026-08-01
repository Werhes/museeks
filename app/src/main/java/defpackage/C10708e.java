package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import java.util.List;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.catalogkit.objects.Catalog2Badge;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.catalogkit.objects.Catalog2ButtonAction;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Block;
import ua.itaysonlab.catalogkit.objects.seals.Catalog2Layout;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُِؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10708e extends AbstractC17112e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final AbstractC15876e f21091e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final Catalog2Block f21092e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final String f21093e;

    public C10708e(AbstractC15876e abstractC15876e, String str, Catalog2Block catalog2Block) {
        this.f21091e = abstractC15876e;
        this.f21093e = str;
        this.f21092e = catalog2Block;
    }

    @Override // defpackage.AbstractC17112e
    public final void ads(int i, InterfaceC10283e interfaceC10283e) {
        C12467e c12467e = (C12467e) interfaceC10283e;
        TextView textView = c12467e.f24960e;
        TextView textView2 = c12467e.f24959e;
        TextView textView3 = c12467e.f24958e;
        c12467e.f24957e.setText(this.f21093e);
        Catalog2Block.NoDataBlock noDataBlock = (Catalog2Block.NoDataBlock) this.f21092e;
        Catalog2Badge catalog2Badge = noDataBlock.purchase;
        List list = noDataBlock.metrica;
        if (catalog2Badge != null) {
            AbstractC17680e.amazon(textView2);
            textView2.setText(catalog2Badge.vip);
        } else {
            AbstractC17680e.mopub(textView2);
        }
        Catalog2Layout catalog2Layout = noDataBlock.vip;
        Catalog2Layout.ExtendedHeader extendedHeader = catalog2Layout instanceof Catalog2Layout.ExtendedHeader ? (Catalog2Layout.ExtendedHeader) catalog2Layout : null;
        String str = extendedHeader != null ? extendedHeader.vip : null;
        if (str == null || str.length() == 0) {
            AbstractC17680e.mopub(textView);
        } else {
            AbstractC17680e.amazon(textView);
            textView.setText(str);
        }
        if (list == null || list.isEmpty()) {
            AbstractC17680e.mopub(textView3);
            return;
        }
        AbstractC17680e.amazon(textView3);
        Catalog2Button catalog2Button = (Catalog2Button) AbstractC13480e.m3591interface(list);
        textView3.setText(catalog2Button.yandex);
        textView3.setOnClickListener(new ViewOnClickListenerC0858e(catalog2Button, this));
        Catalog2ButtonAction catalog2ButtonAction = catalog2Button.ad;
        if ((catalog2ButtonAction instanceof C16512e) || (catalog2ButtonAction instanceof C10164e)) {
            textView3.setText(BuildConfig.FLAVOR);
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_chevron_right_circle_28, 0);
            AbstractC12534e.license(textView3, R.attr.text_primary);
        } else if (!(catalog2ButtonAction instanceof C5295e)) {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        } else {
            textView3.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_chevron_down_24, 0);
            AbstractC12534e.license(textView3, R.attr.global_accent);
        }
    }

    @Override // androidx.recyclerview.widget.startapp
    public final int billing() {
        return 1;
    }

    @Override // defpackage.AbstractC17112e
    public final InterfaceC10283e premium(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.c3_header, viewGroup, false);
        int i = R.id.badge;
        TextView textView = (TextView) AbstractC7779e.vip(inflate, R.id.badge);
        if (textView != null) {
            i = R.id.extendedAlign;
            if (((LinearLayout) AbstractC7779e.vip(inflate, R.id.extendedAlign)) != null) {
                i = R.id.show_all_btn;
                TextView textView2 = (TextView) AbstractC7779e.vip(inflate, R.id.show_all_btn);
                if (textView2 != null) {
                    i = R.id.subtitle;
                    TextView textView3 = (TextView) AbstractC7779e.vip(inflate, R.id.subtitle);
                    if (textView3 != null) {
                        i = R.id.title;
                        TextView textView4 = (TextView) AbstractC7779e.vip(inflate, R.id.title);
                        if (textView4 != null) {
                            return new C12467e((RelativeLayout) inflate, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.AbstractC17112e
    public final int subs() {
        return R.layout.c3_header;
    }
}
