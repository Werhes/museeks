package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.TypedValue;
import androidx.recyclerview.widget.RecyclerView;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۡۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9825e {

    /* renamed from: abstract, reason: not valid java name */
    public boolean f19392abstract;
    public C0032e ads;
    public int applovin;
    public int appmetrica;
    public int billing;

    /* renamed from: break, reason: not valid java name */
    public final int f19393break;

    /* renamed from: case, reason: not valid java name */
    public final boolean f19394case;

    /* renamed from: class, reason: not valid java name */
    public boolean f19396class;
    public C2450e crashlytics;

    /* renamed from: default, reason: not valid java name */
    public final boolean f19397default;

    /* renamed from: extends, reason: not valid java name */
    public final int f19398extends;
    public boolean firebase;

    /* renamed from: goto, reason: not valid java name */
    public boolean f19400goto;

    /* renamed from: implements, reason: not valid java name */
    public final boolean f19401implements;
    public final float inmobi;

    /* renamed from: interface, reason: not valid java name */
    public boolean f19402interface;
    public boolean isPro;
    public final float isVip;
    public float metrica;

    /* renamed from: native, reason: not valid java name */
    public InterfaceC16400e f19403native;

    /* renamed from: new, reason: not valid java name */
    public int f19404new;
    public AbstractC14905e premium;

    /* renamed from: protected, reason: not valid java name */
    public final boolean f19405protected;
    public int purchase;

    /* renamed from: strictfp, reason: not valid java name */
    public final int f19406strictfp;
    public final int subs;

    /* renamed from: super, reason: not valid java name */
    public int f19407super;

    /* renamed from: this, reason: not valid java name */
    public final long f19408this;

    /* renamed from: throw, reason: not valid java name */
    public final int f19409throw;

    /* renamed from: try, reason: not valid java name */
    public final int f19410try;

    /* renamed from: while, reason: not valid java name */
    public final long f19411while;
    public int yandex;
    public int ad = RecyclerView.UNDEFINED_DURATION;
    public final int vip = new Point(Resources.getSystem().getDisplayMetrics().widthPixels, Resources.getSystem().getDisplayMetrics().heightPixels).x;
    public int license = RecyclerView.UNDEFINED_DURATION;
    public final boolean startapp = true;
    public final int adcel = RecyclerView.UNDEFINED_DURATION;
    public int mopub = AbstractC1561e.appmetrica(TypedValue.applyDimension(1, 12, Resources.getSystem().getDisplayMetrics()));
    public final int advert = RecyclerView.UNDEFINED_DURATION;
    public final int smaato = RecyclerView.UNDEFINED_DURATION;
    public float amazon = 0.5f;

    /* renamed from: catch, reason: not valid java name */
    public int f19395catch = 1;

    /* renamed from: final, reason: not valid java name */
    public final int f19399final = 1;
    public EnumC12644e loadAd = EnumC12644e.f25365e;
    public final float Signature = 2.5f;
    public int admob = -16777216;
    public float subscription = TypedValue.applyDimension(1, 5.0f, Resources.getSystem().getDisplayMetrics());
    public String remoteconfig = BuildConfig.FLAVOR;
    public int pro = -1;
    public float signatures = 12.0f;
    public int tapsense = 17;

    public C9825e(Activity activity) {
        float f = 28;
        AbstractC1561e.appmetrica(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
        AbstractC1561e.appmetrica(TypedValue.applyDimension(1, f, Resources.getSystem().getDisplayMetrics()));
        AbstractC1561e.appmetrica(TypedValue.applyDimension(1, 8, Resources.getSystem().getDisplayMetrics()));
        this.isVip = 1.0f;
        this.inmobi = TypedValue.applyDimension(1, 2.0f, Resources.getSystem().getDisplayMetrics());
        this.ads = new C0032e();
        this.premium = C10833e.ad;
        this.subs = 17;
        this.firebase = true;
        this.f19396class = true;
        this.f19400goto = true;
        this.f19408this = -1L;
        this.f19398extends = RecyclerView.UNDEFINED_DURATION;
        this.f19409throw = RecyclerView.UNDEFINED_DURATION;
        this.f19407super = 3;
        this.f19404new = 2;
        this.f19411while = 500L;
        this.f19406strictfp = 1;
        this.f19410try = RecyclerView.UNDEFINED_DURATION;
        boolean z = activity.getResources().getConfiguration().getLayoutDirection() == 1;
        this.f19405protected = z;
        this.f19393break = z ? -1 : 1;
        this.f19392abstract = true;
        this.f19397default = true;
        this.f19401implements = true;
        this.f19394case = true;
    }

    public final /* synthetic */ int ad() {
        int i = this.smaato;
        return i != Integer.MIN_VALUE ? i : this.mopub;
    }

    public final /* synthetic */ int vip() {
        int i = this.advert;
        return i != Integer.MIN_VALUE ? i : this.mopub;
    }
}
