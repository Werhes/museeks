package defpackage;

import android.net.Uri;
import java.net.URLDecoder;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٕٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7950e {
    public final C15172e ad;
    public final C15172e vip;

    public C7950e(final AppActivity appActivity) {
        final int i = 0;
        this.ad = appActivity.amazon(new InterfaceC17091e(this) { // from class: eٗ۠ۦ
            @Override // defpackage.InterfaceC17091e
            public final void purchase(Object obj) {
                switch (i) {
                    case 0:
                        C7950e.ad(appActivity, (Uri) obj);
                        return;
                    default:
                        C7950e.ad(appActivity, (Uri) obj);
                        return;
                }
            }
        }, new C4094e(0));
        final int i2 = 1;
        this.vip = appActivity.amazon(new InterfaceC17091e(this) { // from class: eٗ۠ۦ
            @Override // defpackage.InterfaceC17091e
            public final void purchase(Object obj) {
                switch (i2) {
                    case 0:
                        C7950e.ad(appActivity, (Uri) obj);
                        return;
                    default:
                        C7950e.ad(appActivity, (Uri) obj);
                        return;
                }
            }
        }, new C4094e(0));
    }

    public static void ad(AppActivity appActivity, Uri uri) {
        int i = 0;
        if (uri == null) {
            AbstractC15615e.ad(new C1478e(i, appActivity, "Возвращенный URL оказался пустым.\nПожалуйста, проверьте выбранный путь и попробуйте еще раз."));
            return;
        }
        appActivity.getContentResolver().takePersistableUriPermission(uri, 3);
        String decode = URLDecoder.decode(uri.toString(), "UTF-8");
        C5775e.ad.metrica(uri.toString());
        AbstractC15615e.ad(new C1478e(i, appActivity, ((C6965e) appActivity.getResources()).ad.getString(R.string.downloader_saf_picker_selected, decode)));
        C2287e c2287e = new C2287e(decode);
        VKXApplication vKXApplication = VKXApplication.f36528e;
        if (vKXApplication == null) {
            vKXApplication = null;
        }
        AbstractC6232e.billing(c2287e, vKXApplication);
    }
}
