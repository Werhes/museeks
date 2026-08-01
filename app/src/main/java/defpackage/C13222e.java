package defpackage;

import android.view.View;
import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.loadAd;
import androidx.recyclerview.widget.mopub;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّْۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13222e {
    public boolean ad;
    public int adcel;
    public boolean advert;
    public int appmetrica;
    public int billing;
    public int license;
    public int metrica;
    public List mopub;
    public int purchase;
    public int startapp;
    public int vip;
    public int yandex;

    public final void ad(View view) {
        int license;
        int size = this.mopub.size();
        View view2 = null;
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        for (int i2 = 0; i2 < size; i2++) {
            View view3 = ((loadAd) this.mopub.get(i2)).ad;
            C8274e c8274e = (C8274e) view3.getLayoutParams();
            if (view3 != view && !c8274e.ad.adcel() && (license = (c8274e.ad.license() - this.license) * this.appmetrica) >= 0 && license < i) {
                view2 = view3;
                if (license == 0) {
                    break;
                } else {
                    i = license;
                }
            }
        }
        if (view2 == null) {
            this.license = -1;
        } else {
            this.license = ((C8274e) view2.getLayoutParams()).ad.license();
        }
    }

    public final View vip(mopub mopubVar) {
        List list = this.mopub;
        if (list == null) {
            View view = mopubVar.advert(this.license, Long.MAX_VALUE).ad;
            this.license += this.appmetrica;
            return view;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            View view2 = ((loadAd) this.mopub.get(i)).ad;
            C8274e c8274e = (C8274e) view2.getLayoutParams();
            if (!c8274e.ad.adcel() && this.license == c8274e.ad.license()) {
                ad(view2);
                return view2;
            }
        }
        return null;
    }
}
