package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.google.android.material.button.MaterialButton;
import java.util.Iterator;
import java.util.List;
import ua.itaysonlab.catalogkit.objects.Catalog2Button;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;
import ua.itaysonlab.vkapi2.objects.users.VKProfile;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓ٘ؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1875e extends AbstractC5604e implements InterfaceC18435e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final AbstractC15876e f5004e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final List f5005e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public final /* synthetic */ C14826e f5006e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ int f5007e;

    public C1875e(AbstractC15876e abstractC15876e, List list, int i) {
        this.f5007e = i;
        switch (i) {
            case 1:
                this.f5006e = AbstractC9743e.vip();
                this.f5004e = abstractC15876e;
                this.f5005e = list;
                return;
            default:
                this.f5006e = AbstractC9743e.vip();
                this.f5004e = abstractC15876e;
                this.f5005e = list;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [eٍؚؔ, java.lang.Object] */
    @Override // defpackage.AbstractC5604e
    public final void ads(int i, Object obj, InterfaceC10283e interfaceC10283e) {
        CatalogArtist catalogArtist;
        int i2 = this.f5007e;
        int i3 = 1;
        Object obj2 = null;
        List list = this.f5005e;
        int i4 = 0;
        switch (i2) {
            case 0:
                CatalogArtist catalogArtist2 = (CatalogArtist) obj;
                C0714e c0714e = (C0714e) interfaceC10283e;
                MaterialButton materialButton = c0714e.f3004e;
                MaterialButton materialButton2 = c0714e.f3001e;
                ?? obj3 = new Object();
                obj3.f18534e = catalogArtist2.yandex;
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((Catalog2Button) next).ad instanceof C8799e) {
                            obj2 = next;
                        }
                    }
                }
                Catalog2Button catalog2Button = (Catalog2Button) obj2;
                ImageView imageView = c0714e.f3002e;
                String ad = catalogArtist2.ad();
                InterfaceC12732e ad2 = AbstractC16550e.ad(imageView.getContext());
                C5944e c5944e = new C5944e(imageView.getContext());
                c5944e.metrica = ad;
                AbstractC15659e.license(c5944e, imageView);
                if (catalogArtist2.billing) {
                    AbstractC2182e.metrica(c5944e, new C5654e(c0714e.f3005e.getContext(), 25.0f, 2.5f));
                }
                ((C0624e) ad2).ad(c5944e.ad());
                c0714e.f3003e.setText(catalogArtist2.ad);
                c0714e.f3006e.setLayoutParams(new RelativeLayout.LayoutParams(-1, AbstractC3489e.ad));
                if (catalog2Button != null) {
                    materialButton.setVisibility(0);
                    materialButton.setOnClickListener(new ViewOnClickListenerC16710e(i4, this, c0714e, catalog2Button));
                } else {
                    materialButton.setVisibility(8);
                }
                if (catalogArtist2.startapp) {
                    materialButton2.setVisibility(0);
                    materialButton2.setIconResource(catalogArtist2.yandex ? R.drawable.ic_unfavorite_outline_28 : R.drawable.ic_favorite_outline_28);
                    catalogArtist = catalogArtist2;
                    materialButton2.setOnClickListener(new ViewOnClickListenerC10470e(this, c0714e, obj3, catalogArtist, 0));
                } else {
                    catalogArtist = catalogArtist2;
                    materialButton2.setVisibility(8);
                }
                this.f5004e.inmobi(catalogArtist);
                return;
            default:
                VKProfile vKProfile = (VKProfile) obj;
                C0714e c0714e2 = (C0714e) interfaceC10283e;
                MaterialButton materialButton3 = c0714e2.f3004e;
                MaterialButton materialButton4 = c0714e2.f3001e;
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        Object next2 = it2.next();
                        if (((Catalog2Button) next2).ad instanceof C8799e) {
                            obj2 = next2;
                        }
                    }
                }
                Catalog2Button catalog2Button2 = (Catalog2Button) obj2;
                c0714e2.f3003e.setText(vKProfile.appmetrica);
                c0714e2.f3006e.setLayoutParams(new RelativeLayout.LayoutParams(-1, AbstractC3489e.ad));
                materialButton3.setVisibility(catalog2Button2 == null ? 8 : 0);
                materialButton3.setOnClickListener(new ViewOnClickListenerC16710e(i3, this, c0714e2, catalog2Button2));
                Boolean bool = vKProfile.billing;
                Boolean bool2 = Boolean.TRUE;
                if (!AbstractC7890e.billing(bool, bool2) || vKProfile.purchase == null) {
                    materialButton4.setVisibility(8);
                    return;
                }
                materialButton4.setVisibility(0);
                materialButton4.setIconResource(AbstractC7890e.billing(vKProfile.purchase, bool2) ? R.drawable.ic_unfavorite_outline_28 : R.drawable.ic_favorite_outline_28);
                materialButton4.setOnClickListener(new ViewOnClickListenerC16710e(2, this, c0714e2, vKProfile));
                return;
        }
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        switch (this.f5007e) {
            case 0:
                return this.f5006e.f29359e;
            default:
                return this.f5006e.f29359e;
        }
    }

    @Override // defpackage.AbstractC5604e
    public final int crashlytics() {
        switch (this.f5007e) {
            case 0:
                return R.layout.artist_header_v2c;
            default:
                return R.layout.artist_header_v2c;
        }
    }

    @Override // defpackage.AbstractC5604e
    public final InterfaceC10283e subs(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        switch (this.f5007e) {
            case 0:
                return C0714e.ad(layoutInflater, viewGroup);
            default:
                return C0714e.ad(layoutInflater, viewGroup);
        }
    }
}
