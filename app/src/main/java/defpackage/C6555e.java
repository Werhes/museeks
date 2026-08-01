package defpackage;

import android.content.ComponentName;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؙٟ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6555e {
    public final Context ad;
    public final long adcel;
    public final boolean advert;
    public final ComponentName amazon;
    public final int appmetrica;
    public final AtomicInteger billing;
    public final C6660e license;
    public final C16911e loadAd;
    public final boolean metrica;
    public final int mopub;
    public final boolean purchase;
    public final Integer smaato;
    public final AtomicBoolean startapp;
    public final int vip;
    public final C2158e yandex;

    public C6555e(Context context, int i, boolean z, C6660e c6660e, int i2, boolean z2, AtomicInteger atomicInteger, C2158e c2158e, AtomicBoolean atomicBoolean, long j, int i3, boolean z3, Integer num, ComponentName componentName, C16911e c16911e) {
        this.ad = context;
        this.vip = i;
        this.metrica = z;
        this.license = c6660e;
        this.appmetrica = i2;
        this.purchase = z2;
        this.billing = atomicInteger;
        this.yandex = c2158e;
        this.startapp = atomicBoolean;
        this.adcel = j;
        this.mopub = i3;
        this.advert = z3;
        this.smaato = num;
        this.amazon = componentName;
        this.loadAd = c16911e;
    }

    public static C6555e ad(C6555e c6555e, int i, AtomicInteger atomicInteger, C2158e c2158e, AtomicBoolean atomicBoolean, long j, Integer num, int i2) {
        return new C6555e(c6555e.ad, c6555e.vip, c6555e.metrica, c6555e.license, (i2 & 16) != 0 ? c6555e.appmetrica : i, (i2 & 32) != 0 ? c6555e.purchase : true, (i2 & 64) != 0 ? c6555e.billing : atomicInteger, (i2 & 128) != 0 ? c6555e.yandex : c2158e, (i2 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? c6555e.startapp : atomicBoolean, (i2 & AbstractC1815e.AUDIO_CONTENT_BUFFER_SIZE) != 0 ? c6555e.adcel : j, (i2 & 1024) != 0 ? c6555e.mopub : 0, (i2 & 4096) != 0 ? c6555e.advert : true, (i2 & 8192) != 0 ? c6555e.smaato : num, c6555e.amazon, c6555e.loadAd);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C6555e) {
            C6555e c6555e = (C6555e) obj;
            if (this.ad.equals(c6555e.ad) && this.vip == c6555e.vip && this.metrica == c6555e.metrica && this.license.equals(c6555e.license) && this.appmetrica == c6555e.appmetrica && this.purchase == c6555e.purchase && AbstractC7890e.billing(this.billing, c6555e.billing) && AbstractC7890e.billing(this.yandex, c6555e.yandex) && AbstractC7890e.billing(this.startapp, c6555e.startapp) && this.adcel == c6555e.adcel && this.mopub == c6555e.mopub && this.advert == c6555e.advert && AbstractC7890e.billing(this.smaato, c6555e.smaato) && AbstractC7890e.billing(this.amazon, c6555e.amazon) && this.loadAd.equals(c6555e.loadAd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.startapp.hashCode() + ((this.yandex.hashCode() + ((this.billing.hashCode() + ((((((this.license.hashCode() + (((((this.ad.hashCode() * 31) + this.vip) * 31) + (this.metrica ? 1231 : 1237)) * 31)) * 31) + this.appmetrica) * 31) + (this.purchase ? 1231 : 1237)) * 31)) * 31)) * 31)) * 31;
        long j = this.adcel;
        int i = (((((((((int) (j ^ (j >>> 32))) + hashCode) * 31) + this.mopub) * 31) - 1) * 31) + (this.advert ? 1231 : 1237)) * 31;
        Integer num = this.smaato;
        int hashCode2 = (i + (num == null ? 0 : num.hashCode())) * 31;
        ComponentName componentName = this.amazon;
        return this.loadAd.hashCode() + ((hashCode2 + (componentName != null ? componentName.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TranslationContext(context=" + this.ad + ", appWidgetId=" + this.vip + ", isRtl=" + this.metrica + ", layoutConfiguration=" + this.license + ", itemPosition=" + this.appmetrica + ", isLazyCollectionDescendant=" + this.purchase + ", lastViewId=" + this.billing + ", parentContext=" + this.yandex + ", isBackgroundSpecified=" + this.startapp + ", layoutSize=" + ((Object) C16109e.metrica(this.adcel)) + ", layoutCollectionViewId=" + this.mopub + ", layoutCollectionItemId=-1, canUseSelectableGroup=" + this.advert + ", actionTargetId=" + this.smaato + ", actionBroadcastReceiver=" + this.amazon + ", glanceComponents=" + this.loadAd + ')';
    }

    public final C6555e vip(C2158e c2158e, int i) {
        return ad(this, i, null, c2158e, null, 0L, null, 65391);
    }
}
