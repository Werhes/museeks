package defpackage;

import android.text.TextUtils;
import android.view.View;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٕؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5432e extends AbstractC3757e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ int f11661e;

    public C5432e(int i, Class cls, int i2, int i3, int i4) {
        this.f11661e = i4;
        this.f8353e = i;
        this.f8352e = cls;
        this.f8350e = i2;
        this.f8351e = i3;
    }

    @Override // defpackage.AbstractC3757e
    public final void appmetrica(View view, Object obj) {
        switch (this.f11661e) {
            case 0:
                AbstractC5226e.purchase(view, ((Boolean) obj).booleanValue());
                return;
            case 1:
                AbstractC5226e.appmetrica(view, (CharSequence) obj);
                return;
            case 2:
                AbstractC18534e.metrica(view, (CharSequence) obj);
                return;
            default:
                AbstractC5226e.license(view, ((Boolean) obj).booleanValue());
                return;
        }
    }

    @Override // defpackage.AbstractC3757e
    public final Object metrica(View view) {
        switch (this.f11661e) {
            case 0:
                return Boolean.valueOf(AbstractC5226e.metrica(view));
            case 1:
                return AbstractC5226e.ad(view);
            case 2:
                return AbstractC18534e.vip(view);
            default:
                return Boolean.valueOf(AbstractC5226e.vip(view));
        }
    }

    @Override // defpackage.AbstractC3757e
    public final boolean yandex(Object obj, Object obj2) {
        boolean equals;
        switch (this.f11661e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                equals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            case 2:
                equals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
        return !equals;
    }
}
