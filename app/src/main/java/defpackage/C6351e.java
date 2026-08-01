package defpackage;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙِۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6351e {
    public SSLSocketFactory Signature;
    public boolean adcel;
    public X509TrustManager admob;
    public int ads;
    public C4524e advert;
    public InterfaceC4529e amazon;
    public int applovin;
    public C12582e appmetrica;
    public boolean billing;
    public C14899e crashlytics;
    public int inmobi;
    public int isPro;
    public int isVip;
    public SocketFactory loadAd;
    public C5107e mopub;
    public long premium;
    public HostnameVerifier pro;
    public boolean purchase;
    public List remoteconfig;
    public C12932e signatures;
    public ProxySelector smaato;
    public boolean startapp;
    public C16089e subs;
    public List subscription;
    public AbstractC0014e tapsense;
    public C2362e vip;
    public C5107e yandex;
    public C11980e ad = new C11980e(8);
    public final ArrayList metrica = new ArrayList();
    public final ArrayList license = new ArrayList();

    public C6351e() {
        TimeZone timeZone = AbstractC16286e.ad;
        this.appmetrica = new C12582e(24);
        this.purchase = true;
        this.billing = true;
        C5107e c5107e = InterfaceC4529e.ad;
        this.yandex = c5107e;
        this.startapp = true;
        this.adcel = true;
        this.mopub = C5107e.f10967e;
        this.advert = C4524e.f9801e;
        this.amazon = c5107e;
        this.loadAd = SocketFactory.getDefault();
        this.subscription = C1343e.f4132class;
        this.remoteconfig = C1343e.firebase;
        this.pro = C6249e.ad;
        this.signatures = C12932e.metrica;
        this.inmobi = ModuleDescriptor.MODULE_VERSION;
        this.isPro = ModuleDescriptor.MODULE_VERSION;
        this.applovin = ModuleDescriptor.MODULE_VERSION;
        this.ads = 60000;
        this.premium = 1024L;
    }
}
