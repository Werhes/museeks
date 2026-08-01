package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.adcel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚِؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6945e {
    public int ad;
    public final Object metrica;
    public final Object vip;

    public AbstractC6945e(adcel adcelVar) {
        this.ad = RecyclerView.UNDEFINED_DURATION;
        this.metrica = new Rect();
        this.vip = adcelVar;
    }

    public AbstractC6945e(InterfaceC12379e interfaceC12379e) {
        this.ad = 0;
        this.metrica = new C13090e();
        this.vip = interfaceC12379e;
    }

    public static AbstractC6945e ad(adcel adcelVar, int i) {
        if (i == 0) {
            return new C3356e(adcelVar, 0);
        }
        if (i == 1) {
            return new C3356e(adcelVar, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract int adcel();

    public abstract int advert();

    public abstract int amazon(View view);

    public abstract int appmetrica(View view);

    public abstract int billing();

    public abstract int license(View view);

    public abstract void loadAd(int i);

    public abstract int metrica(View view);

    public abstract int mopub();

    public abstract int purchase();

    public abstract int smaato(View view);

    public abstract int startapp();

    public abstract int vip(View view);

    public abstract int yandex();
}
