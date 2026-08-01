package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import androidx.car.app.model.Alert;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙ۠ۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6698e {

    /* renamed from: goto, reason: not valid java name */
    public static final int f13838goto;

    /* renamed from: this, reason: not valid java name */
    public static final boolean f13839this;
    public final C1198e Signature;
    public final Context ad;
    public C3335e adcel;
    public final C17615e admob;
    public final int ads;
    public boolean advert;
    public final int amazon;
    public final int applovin;
    public final C13633e appmetrica;
    public final C13633e billing;

    /* renamed from: class, reason: not valid java name */
    public final C13935e f13840class;
    public boolean crashlytics;
    public final String firebase;
    public final int inmobi;

    /* renamed from: interface, reason: not valid java name */
    public final boolean f13841interface;
    public final int isPro;
    public final long isVip;
    public final C8431e license;
    public boolean loadAd;
    public final C8431e metrica;
    public boolean mopub;
    public boolean premium;
    public final long pro;
    public InterfaceC6823e purchase;
    public long remoteconfig;
    public final C5635e signatures;
    public boolean smaato;
    public final int startapp;
    public boolean subs;
    public long subscription;
    public final long tapsense;
    public final C17381e vip;
    public final Looper yandex;

    static {
        String str = AbstractC9413e.ad;
        String tapsense = AbstractC3628e.tapsense(Build.DEVICE);
        f13838goto = (tapsense.contains("emulator") || tapsense.contains("emu64a") || tapsense.contains("emu64x") || tapsense.contains("generic")) ? 30000 : ModuleDescriptor.MODULE_VERSION;
        f13839this = true;
    }

    public C6698e(Context context, C0142e c0142e, C0433e c0433e) {
        C8431e c8431e = new C8431e(2, c0142e);
        C8431e c8431e2 = new C8431e(3, c0433e);
        C13633e c13633e = new C13633e(context, 1);
        C8456e c8456e = new C8456e(3);
        C13633e c13633e2 = new C13633e(context, 2);
        context.getClass();
        this.ad = context;
        this.metrica = c8431e;
        this.license = c8431e2;
        this.appmetrica = c13633e;
        this.purchase = c8456e;
        this.billing = c13633e2;
        this.yandex = AbstractC9413e.applovin();
        this.adcel = C3335e.startapp;
        this.amazon = 1;
        this.loadAd = true;
        this.Signature = C1198e.license;
        this.subscription = 5000L;
        this.remoteconfig = 15000L;
        this.pro = 3000L;
        this.admob = C17615e.vip;
        this.signatures = new C5635e(AbstractC9413e.m2546case(20L), AbstractC9413e.m2546case(500L));
        this.vip = C17381e.ad;
        this.tapsense = 500L;
        this.isVip = 2000L;
        this.inmobi = 600000;
        int i = Alert.DURATION_SHOW_INDEFINITELY;
        boolean z = f13839this;
        this.isPro = z ? f13838goto : Integer.MAX_VALUE;
        this.applovin = z ? 60000 : i;
        this.ads = 600000;
        this.premium = true;
        this.firebase = BuildConfig.FLAVOR;
        this.startapp = -1000;
        this.f13840class = new C13935e(9);
        this.f13841interface = true;
    }
}
