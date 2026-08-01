package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؔٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2762e extends WindowInsetsAnimation$Callback {
    public final AbstractC15825e ad;
    public final HashMap license;
    public ArrayList metrica;
    public List vip;

    public C2762e(AbstractC15825e abstractC15825e) {
        super(abstractC15825e.f31257e);
        this.license = new HashMap();
        this.ad = abstractC15825e;
    }

    public final C12773e ad(WindowInsetsAnimation windowInsetsAnimation) {
        C12773e c12773e = (C12773e) this.license.get(windowInsetsAnimation);
        if (c12773e != null) {
            return c12773e;
        }
        C12773e c12773e2 = new C12773e(0, null, 0L);
        c12773e2.ad = new C3109e(windowInsetsAnimation);
        this.license.put(windowInsetsAnimation, c12773e2);
        return c12773e2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.ad.advert(ad(windowInsetsAnimation));
        this.license.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.ad.smaato(ad(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.metrica;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.metrica = arrayList2;
            this.vip = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            C12773e ad = ad(windowInsetsAnimation);
            ad.ad.appmetrica(windowInsetsAnimation.getFraction());
            this.metrica.add(ad);
        }
        return this.ad.amazon(C12948e.yandex(null, windowInsets), this.vip).billing();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        C7302e loadAd = this.ad.loadAd(ad(windowInsetsAnimation), new C7302e(bounds));
        loadAd.getClass();
        AbstractC9564e.metrica();
        return AbstractC9564e.ad(((C7088e) loadAd.f14916e).license(), ((C7088e) loadAd.f14915e).license());
    }
}
