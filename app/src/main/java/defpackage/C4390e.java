package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؖۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4390e extends AbstractC5224e {

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public final List f9566e;

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public final C17954e f9569e;

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public final C1615e f9568e = AbstractC9180e.metrica(BuildConfig.FLAVOR);

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public final List f9567e = AbstractC6874e.startapp(new C14850e(this, "search_owned_audios"), new C14850e(this, "search_owned_playlists"), new C14850e(this, "search_owned_albums"));

    public C4390e() {
        VKXApplication vKXApplication = VKXApplication.f36528e;
        String string = (vKXApplication == null ? null : vKXApplication).getString(R.string.fake_catalog_tracks);
        VKXApplication vKXApplication2 = VKXApplication.f36528e;
        String string2 = (vKXApplication2 == null ? null : vKXApplication2).getString(R.string.fake_catalog_playlists);
        VKXApplication vKXApplication3 = VKXApplication.f36528e;
        List startapp = AbstractC6874e.startapp(string, string2, (vKXApplication3 != null ? vKXApplication3 : null).getString(R.string.fake_catalog_albums));
        this.f9566e = startapp;
        this.f9569e = new C17954e(startapp, true, new C2525e(this, 1));
    }

    @Override // defpackage.AbstractC5224e, defpackage.AbstractC10716e, defpackage.AbstractC13859e
    public final void applovin() {
        super.applovin();
        this.f9569e.getClass();
    }

    @Override // defpackage.AbstractC5224e
    /* renamed from: final */
    public final List mo373final() {
        return this.f9567e;
    }

    @Override // defpackage.AbstractC5224e, defpackage.AbstractC10716e, defpackage.AbstractC13859e
    public final void firebase() {
        super.firebase();
        this.f9569e.getClass();
    }

    @Override // defpackage.AbstractC5224e
    /* renamed from: new */
    public final List mo374new() {
        return this.f9566e;
    }

    /* renamed from: private, reason: not valid java name */
    public final void m1627private(String str) {
        this.f9568e.advert(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f9567e) {
            if (obj instanceof AbstractC15876e) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC15876e) it.next()).mo1388instanceof();
        }
    }

    @Override // defpackage.AbstractC5224e, defpackage.AbstractC10716e
    /* renamed from: protected */
    public final View mo376protected(Context context, LayoutInflater layoutInflater) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(this.f9569e.purchase(context, linearLayout), new LinearLayout.LayoutParams(-1, -2));
        linearLayout.addView(super.mo376protected(context, layoutInflater), new LinearLayout.LayoutParams(-1, 0, 1.0f));
        return linearLayout;
    }

    @Override // defpackage.AbstractC5224e
    /* renamed from: strictfp */
    public final void mo377strictfp(int i, float f) {
        this.f9569e.loadAd(i, f);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [eُْٜ] */
    @Override // defpackage.AbstractC5224e, defpackage.AbstractC10716e
    /* renamed from: try */
    public final AbstractC18491e mo216try() {
        final int i = 0;
        final int i2 = 1;
        return new C9456e(new C0568e(8), new Function0(this) { // from class: eُْٜ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C4390e f22041e;

            {
                this.f22041e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        this.f22041e.m1627private(BuildConfig.FLAVOR);
                        return Unit.INSTANCE;
                    default:
                        this.f22041e.pro().onBackPressed();
                        return Unit.INSTANCE;
                }
            }
        }, null, new C2525e(this, 0), true, true, new Function0(this) { // from class: eُْٜ

            /* renamed from: eؘٙؓ, reason: contains not printable characters */
            public final /* synthetic */ C4390e f22041e;

            {
                this.f22041e = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        this.f22041e.m1627private(BuildConfig.FLAVOR);
                        return Unit.INSTANCE;
                    default:
                        this.f22041e.pro().onBackPressed();
                        return Unit.INSTANCE;
                }
            }
        }, 4);
    }
}
