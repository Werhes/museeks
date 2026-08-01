package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.adcel;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕٓۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3356e extends AbstractC6945e {
    public final /* synthetic */ int license;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3356e(adcel adcelVar, int i) {
        super(adcelVar);
        this.license = i;
    }

    @Override // defpackage.AbstractC6945e
    public final int adcel() {
        switch (this.license) {
            case 0:
                return ((adcel) this.vip).smaato;
            default:
                return ((adcel) this.vip).advert;
        }
    }

    @Override // defpackage.AbstractC6945e
    public final int advert() {
        int m161goto;
        int m166this;
        switch (this.license) {
            case 0:
                adcel adcelVar = (adcel) this.vip;
                m161goto = adcelVar.amazon - adcelVar.m161goto();
                m166this = adcelVar.m166this();
                break;
            default:
                adcel adcelVar2 = (adcel) this.vip;
                m161goto = adcelVar2.loadAd - adcelVar2.m163native();
                m166this = adcelVar2.m162interface();
                break;
        }
        return m161goto - m166this;
    }

    @Override // defpackage.AbstractC6945e
    public final int amazon(View view) {
        switch (this.license) {
            case 0:
                adcel adcelVar = (adcel) this.vip;
                Rect rect = (Rect) this.metrica;
                adcelVar.m167try(view, rect);
                return rect.left;
            default:
                adcel adcelVar2 = (adcel) this.vip;
                Rect rect2 = (Rect) this.metrica;
                adcelVar2.m167try(view, rect2);
                return rect2.top;
        }
    }

    @Override // defpackage.AbstractC6945e
    public final int appmetrica(View view) {
        int ads;
        int i;
        switch (this.license) {
            case 0:
                C8274e c8274e = (C8274e) view.getLayoutParams();
                ((adcel) this.vip).getClass();
                ads = adcel.ads(view);
                i = ((ViewGroup.MarginLayoutParams) c8274e).leftMargin;
                break;
            default:
                C8274e c8274e2 = (C8274e) view.getLayoutParams();
                ((adcel) this.vip).getClass();
                ads = adcel.firebase(view);
                i = ((ViewGroup.MarginLayoutParams) c8274e2).topMargin;
                break;
        }
        return ads - i;
    }

    @Override // defpackage.AbstractC6945e
    public final int billing() {
        int i;
        int m166this;
        switch (this.license) {
            case 0:
                adcel adcelVar = (adcel) this.vip;
                i = adcelVar.amazon;
                m166this = adcelVar.m166this();
                break;
            default:
                adcel adcelVar2 = (adcel) this.vip;
                i = adcelVar2.loadAd;
                m166this = adcelVar2.m162interface();
                break;
        }
        return i - m166this;
    }

    @Override // defpackage.AbstractC6945e
    public final int license(View view) {
        int premium;
        int i;
        switch (this.license) {
            case 0:
                C8274e c8274e = (C8274e) view.getLayoutParams();
                ((adcel) this.vip).getClass();
                premium = adcel.premium(view) + ((ViewGroup.MarginLayoutParams) c8274e).topMargin;
                i = ((ViewGroup.MarginLayoutParams) c8274e).bottomMargin;
                break;
            default:
                C8274e c8274e2 = (C8274e) view.getLayoutParams();
                ((adcel) this.vip).getClass();
                premium = adcel.subs(view) + ((ViewGroup.MarginLayoutParams) c8274e2).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) c8274e2).rightMargin;
                break;
        }
        return premium + i;
    }

    @Override // defpackage.AbstractC6945e
    public final void loadAd(int i) {
        switch (this.license) {
            case 0:
                ((adcel) this.vip).mo142implements(i);
                return;
            default:
                ((adcel) this.vip).mo113case(i);
                return;
        }
    }

    @Override // defpackage.AbstractC6945e
    public final int metrica(View view) {
        int subs;
        int i;
        switch (this.license) {
            case 0:
                C8274e c8274e = (C8274e) view.getLayoutParams();
                ((adcel) this.vip).getClass();
                subs = adcel.subs(view) + ((ViewGroup.MarginLayoutParams) c8274e).leftMargin;
                i = ((ViewGroup.MarginLayoutParams) c8274e).rightMargin;
                break;
            default:
                C8274e c8274e2 = (C8274e) view.getLayoutParams();
                ((adcel) this.vip).getClass();
                subs = adcel.premium(view) + ((ViewGroup.MarginLayoutParams) c8274e2).topMargin;
                i = ((ViewGroup.MarginLayoutParams) c8274e2).bottomMargin;
                break;
        }
        return subs + i;
    }

    @Override // defpackage.AbstractC6945e
    public final int mopub() {
        switch (this.license) {
            case 0:
                return ((adcel) this.vip).m161goto();
            default:
                return ((adcel) this.vip).m163native();
        }
    }

    @Override // defpackage.AbstractC6945e
    public final int purchase() {
        switch (this.license) {
            case 0:
                return ((adcel) this.vip).amazon;
            default:
                return ((adcel) this.vip).loadAd;
        }
    }

    @Override // defpackage.AbstractC6945e
    public final int smaato(View view) {
        switch (this.license) {
            case 0:
                adcel adcelVar = (adcel) this.vip;
                Rect rect = (Rect) this.metrica;
                adcelVar.m167try(view, rect);
                return rect.right;
            default:
                adcel adcelVar2 = (adcel) this.vip;
                Rect rect2 = (Rect) this.metrica;
                adcelVar2.m167try(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // defpackage.AbstractC6945e
    public final int startapp() {
        switch (this.license) {
            case 0:
                return ((adcel) this.vip).advert;
            default:
                return ((adcel) this.vip).smaato;
        }
    }

    @Override // defpackage.AbstractC6945e
    public final int vip(View view) {
        int crashlytics;
        int i;
        switch (this.license) {
            case 0:
                C8274e c8274e = (C8274e) view.getLayoutParams();
                ((adcel) this.vip).getClass();
                crashlytics = adcel.crashlytics(view);
                i = ((ViewGroup.MarginLayoutParams) c8274e).rightMargin;
                break;
            default:
                C8274e c8274e2 = (C8274e) view.getLayoutParams();
                ((adcel) this.vip).getClass();
                crashlytics = adcel.isPro(view);
                i = ((ViewGroup.MarginLayoutParams) c8274e2).bottomMargin;
                break;
        }
        return crashlytics + i;
    }

    @Override // defpackage.AbstractC6945e
    public final int yandex() {
        switch (this.license) {
            case 0:
                return ((adcel) this.vip).m166this();
            default:
                return ((adcel) this.vip).m162interface();
        }
    }
}
