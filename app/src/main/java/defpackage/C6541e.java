package defpackage;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙِٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C6541e {
    public int Signature;
    public final C9701e ad;
    public boolean adcel;
    public int admob;
    public int advert;
    public int amazon;
    public String appmetrica;
    public boolean billing;
    public String license;
    public int loadAd;
    public final String metrica;
    public IntentSender pro;
    public Uri purchase;
    public Bundle remoteconfig;
    public C16289e signatures;
    public int smaato;
    public int startapp;
    public final String vip;
    public final boolean yandex;
    public final ArrayList mopub = new ArrayList();
    public int subscription = -1;
    public ArrayList tapsense = new ArrayList();

    public C6541e(C9701e c9701e, String str, String str2, boolean z) {
        this.ad = c9701e;
        this.vip = str;
        this.metrica = str2;
        this.yandex = z;
    }

    public static AbstractC16709e vip() {
        C10085e.vip();
        AbstractC13922e abstractC13922e = C10085e.metrica().appmetrica;
        if (abstractC13922e instanceof AbstractC16709e) {
            return (AbstractC16709e) abstractC13922e;
        }
        return null;
    }

    public final C14756e ad() {
        if (this instanceof C14756e) {
            return (C14756e) this;
        }
        return null;
    }

    public final void adcel(int i) {
        C10085e.vip();
        C14090e metrica = C10085e.metrica();
        int min = Math.min(this.admob, Math.max(0, i));
        AbstractC13922e billing = metrica.billing(this);
        if (billing != null) {
            billing.purchase(min);
        }
    }

    public final void advert(boolean z) {
        C10085e.vip();
        C10085e.metrica().mopub(this, 3, z);
    }

    public final boolean appmetrica() {
        return !this.tapsense.isEmpty();
    }

    public final boolean billing() {
        C10085e.vip();
        return C10085e.metrica().yandex() == this;
    }

    public final boolean license() {
        C10085e.vip();
        C6541e c6541e = C10085e.metrica().tapsense;
        if (c6541e == null) {
            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
        }
        if (c6541e == this || this.amazon == 3) {
            return true;
        }
        return TextUtils.equals(((ComponentName) metrica().f18729e.f5914e).getPackageName(), "android") && smaato("android.media.intent.category.LIVE_AUDIO") && !smaato("android.media.intent.category.LIVE_VIDEO");
    }

    public final AbstractC9410e metrica() {
        C9701e c9701e = this.ad;
        c9701e.getClass();
        C10085e.vip();
        return c9701e.ad;
    }

    public final void mopub(int i) {
        AbstractC13922e billing;
        C10085e.vip();
        if (i == 0 || (billing = C10085e.metrica().billing(this)) == null) {
            return;
        }
        billing.startapp(i);
    }

    public final boolean purchase() {
        return this.signatures != null && this.billing;
    }

    public final boolean smaato(String str) {
        C10085e.vip();
        Iterator it = this.mopub.iterator();
        while (it.hasNext()) {
            if (((IntentFilter) it.next()).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x00fe, code lost:
    
        if (r3.hasNext() == false) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int startapp(defpackage.C16289e r15) {
        /*
            Method dump skipped, instructions count: 587
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6541e.startapp(eٖ٘۠):int");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb.append(this.metrica);
        sb.append(", name=");
        sb.append(this.license);
        sb.append(", description=");
        sb.append(this.appmetrica);
        sb.append(", iconUri=");
        sb.append(this.purchase);
        sb.append(", enabled=");
        sb.append(this.billing);
        sb.append(", isSystemRoute=");
        sb.append(this.yandex);
        sb.append(", connectionState=");
        sb.append(this.startapp);
        sb.append(", canDisconnect=");
        sb.append(this.adcel);
        sb.append(", playbackType=");
        sb.append(this.advert);
        sb.append(", playbackStream=");
        sb.append(this.smaato);
        sb.append(", deviceType=");
        sb.append(this.amazon);
        sb.append(", volumeHandling=");
        sb.append(this.loadAd);
        sb.append(", volume=");
        sb.append(this.Signature);
        sb.append(", volumeMax=");
        sb.append(this.admob);
        sb.append(", presentationDisplayId=");
        sb.append(this.subscription);
        sb.append(", extras=");
        sb.append(this.remoteconfig);
        sb.append(", settingsIntent=");
        sb.append(this.pro);
        sb.append(", providerPackageName=");
        sb.append(((ComponentName) this.ad.license.f5914e).getPackageName());
        if (appmetrica()) {
            sb.append(", members=[");
            int size = this.tapsense.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                if (this.tapsense.get(i) != this) {
                    sb.append(((C6541e) this.tapsense.get(i)).metrica);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }

    public final boolean yandex(C0056e c0056e) {
        if (c0056e == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        C10085e.vip();
        ArrayList arrayList = this.mopub;
        if (arrayList == null) {
            return false;
        }
        c0056e.ad();
        if (c0056e.vip.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            IntentFilter intentFilter = (IntentFilter) it.next();
            if (intentFilter != null) {
                Iterator it2 = c0056e.vip.iterator();
                while (it2.hasNext()) {
                    if (intentFilter.hasCategory((String) it2.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
