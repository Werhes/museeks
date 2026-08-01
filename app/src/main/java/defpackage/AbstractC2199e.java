package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.loadAd;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؓۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2199e {
    public InterfaceC3209e ad;
    public long appmetrica;
    public long license;
    public long metrica;
    public long purchase;
    public ArrayList vip;

    public static void vip(loadAd loadad) {
        int i = loadad.adcel;
        if (!loadad.yandex() && (i & 4) == 0) {
            loadad.vip();
        }
    }

    public abstract boolean ad(loadAd loadad, loadAd loadad2, C8876e c8876e, C8876e c8876e2);

    public abstract void appmetrica();

    public abstract void license(loadAd loadad);

    public final void metrica(loadAd loadad) {
        InterfaceC3209e interfaceC3209e = this.ad;
        if (interfaceC3209e != null) {
            RecyclerView recyclerView = (RecyclerView) ((C2691e) interfaceC3209e).f6570e;
            loadad.Signature(true);
            View view = loadad.ad;
            if (loadad.yandex != null && loadad.startapp == null) {
                loadad.yandex = null;
            }
            loadad.startapp = null;
            if ((loadad.adcel & 16) == 0 && !recyclerView.removeAnimatingView(view) && loadad.advert()) {
                recyclerView.removeDetachedView(view, false);
            }
        }
    }

    public abstract boolean purchase();
}
