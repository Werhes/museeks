package defpackage;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItemMeta;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ؐ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C17463e extends AbstractC5604e {
    @Override // defpackage.AbstractC5604e
    public final void ads(int i, Object obj, InterfaceC10283e interfaceC10283e) {
        CharSequence charSequence;
        CustomCatalogBlockItem customCatalogBlockItem = (CustomCatalogBlockItem) obj;
        C4569e c4569e = (C4569e) interfaceC10283e;
        TextView textView = c4569e.f9857e;
        ImageView imageView = c4569e.f9856e;
        CustomCatalogBlockItemMeta customCatalogBlockItemMeta = customCatalogBlockItem.purchase;
        AbstractC2379e.metrica(imageView, customCatalogBlockItemMeta != null ? customCatalogBlockItemMeta.ad : null, Integer.valueOf(R.drawable.ic_user_outline_28), new C9377e(new C15878e(), 14));
        c4569e.f9855e.setText(customCatalogBlockItem.ad);
        LinearLayout linearLayout = c4569e.f9854e;
        VKXApplication.Companion companion = VKXApplication.f36531e;
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), VKXApplication.Companion.ad(16.0f));
        textView.setMovementMethod(new LinkMovementMethod());
        C10445e c10445e = AbstractC4605e.ad;
        String str = customCatalogBlockItem.vip;
        int length = str.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                charSequence = BuildConfig.FLAVOR;
                break;
            } else {
                if (str.charAt(i2) != ' ') {
                    charSequence = str.subSequence(i2, str.length());
                    break;
                }
                i2++;
            }
        }
        textView.setText(AbstractC4605e.ad(charSequence.toString()));
        AbstractC13336e.metrica(textView);
    }

    @Override // defpackage.AbstractC5604e
    public final int crashlytics() {
        return R.layout.v7_post_header;
    }

    @Override // defpackage.AbstractC5604e
    public final InterfaceC10283e subs(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C4569e.ad(layoutInflater, viewGroup);
    }
}
