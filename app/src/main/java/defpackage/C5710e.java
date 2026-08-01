package defpackage;

import android.os.Looper;
import android.text.TextUtils;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘِٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5710e implements InterfaceC13524e {
    public static final C18482e adcel = new C18482e("RemoteMediaClient", null);
    public final Object ad;
    public final C9407e appmetrica;
    public final C0912e license;
    public final C18111e metrica;
    public InterfaceC9591e purchase;
    public final ConcurrentHashMap startapp;
    public final HandlerC9134e vip;
    public final CopyOnWriteArrayList billing = new CopyOnWriteArrayList();
    public final CopyOnWriteArrayList yandex = new CopyOnWriteArrayList();

    static {
        String str = C18111e.signatures;
    }

    public C5710e(C18111e c18111e) {
        new ConcurrentHashMap();
        this.startapp = new ConcurrentHashMap();
        this.ad = new Object();
        this.vip = new HandlerC9134e(Looper.getMainLooper(), 6);
        C0912e c0912e = new C0912e(this);
        this.license = c0912e;
        this.metrica = c18111e;
        c18111e.yandex = new C10182e(this);
        c18111e.metrica = c0912e;
        this.appmetrica = new C9407e(this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.android.gms.common.api.internal.BasePendingResult, eؑؒۢ] */
    public static C0045e Signature() {
        ?? basePendingResult = new BasePendingResult();
        basePendingResult.adcel(new C18444e((C0045e) basePendingResult, new Status(17, null, null, null)));
        return basePendingResult;
    }

    public static final void subscription(AbstractC18345e abstractC18345e) {
        try {
            abstractC18345e.Signature();
        } catch (IllegalArgumentException e) {
            throw e;
        } catch (Throwable unused) {
            abstractC18345e.adcel(new C18444e(abstractC18345e, new Status(2100, null, null, null)));
        }
    }

    public final long ad() {
        long Signature;
        synchronized (this.ad) {
            AbstractC9528e.appmetrica();
            Signature = this.metrica.Signature();
        }
        return Signature;
    }

    public final boolean adcel() {
        AbstractC9528e.appmetrica();
        C0849e metrica = metrica();
        return metrica != null && metrica.f3238e;
    }

    public final boolean admob() {
        return this.purchase != null;
    }

    public final void advert() {
        AbstractC9528e.appmetrica();
        int license = license();
        if (license == 4 || license == 2) {
            AbstractC9528e.appmetrica();
            if (admob()) {
                subscription(new C9883e(this, 3, false));
                return;
            } else {
                Signature();
                return;
            }
        }
        AbstractC9528e.appmetrica();
        if (admob()) {
            subscription(new C9883e(this, 4, false));
        } else {
            Signature();
        }
    }

    public final void amazon() {
        InterfaceC9591e interfaceC9591e = this.purchase;
        if (interfaceC9591e == null) {
            return;
        }
        AbstractC9528e.appmetrica();
        String str = (String) this.metrica.vip;
        C4612e c4612e = (C4612e) interfaceC9591e;
        AbstractC5942e.vip(str);
        HashMap hashMap = c4612e.subs;
        synchronized (hashMap) {
            hashMap.put(str, this);
        }
        C9321e ad = C0381e.ad();
        ad.ad = new C0912e(15, c4612e, str, this);
        ad.appmetrica = 8413;
        c4612e.appmetrica(1, ad.ad());
        AbstractC9528e.appmetrica();
        if (admob()) {
            subscription(new C9883e(this, 5));
        } else {
            Signature();
        }
    }

    public final long appmetrica() {
        long j;
        synchronized (this.ad) {
            AbstractC9528e.appmetrica();
            C0849e c0849e = this.metrica.purchase;
            MediaInfo mediaInfo = c0849e == null ? null : c0849e.f3251e;
            j = mediaInfo != null ? mediaInfo.f684e : 0L;
        }
        return j;
    }

    public final boolean billing() {
        AbstractC9528e.appmetrica();
        MediaInfo vip = vip();
        return vip != null && vip.f691e == 2;
    }

    public final int license() {
        int i;
        synchronized (this.ad) {
            try {
                AbstractC9528e.appmetrica();
                C0849e metrica = metrica();
                i = metrica != null ? metrica.f3231e : 1;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }

    public final int loadAd() {
        if (vip() == null || !purchase()) {
            return 0;
        }
        AbstractC9528e.appmetrica();
        C0849e metrica = metrica();
        if (metrica != null && metrica.f3231e == 4) {
            return 6;
        }
        AbstractC9528e.appmetrica();
        C0849e metrica2 = metrica();
        if (metrica2 != null && metrica2.f3231e == 2) {
            return 3;
        }
        if (startapp()) {
            return 2;
        }
        if (!yandex()) {
            return 0;
        }
        AbstractC9528e.appmetrica();
        C0849e metrica3 = metrica();
        C12481e c12481e = null;
        if (metrica3 != null) {
            Integer num = (Integer) metrica3.f3250e.get(metrica3.f3233e);
            if (num != null) {
                c12481e = (C12481e) metrica3.f3240e.get(num.intValue());
            }
        }
        return (c12481e == null || c12481e.f24986e == null) ? 0 : 6;
    }

    public final C0849e metrica() {
        C0849e c0849e;
        synchronized (this.ad) {
            AbstractC9528e.appmetrica();
            c0849e = this.metrica.purchase;
        }
        return c0849e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x015d, code lost:
    
        if (r4 != false) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bd A[Catch: JSONException -> 0x007a, TryCatch #1 {JSONException -> 0x007a, blocks: (B:9:0x0048, B:11:0x0054, B:13:0x005e, B:14:0x006a, B:16:0x0070, B:25:0x0085, B:27:0x0091, B:29:0x00a1, B:34:0x00bd, B:37:0x00c2, B:38:0x0105, B:40:0x0109, B:41:0x0116, B:43:0x011a, B:44:0x0122, B:46:0x0126, B:47:0x012c, B:49:0x0130, B:50:0x0133, B:52:0x0137, B:53:0x013a, B:55:0x013e, B:56:0x0141, B:58:0x0145, B:60:0x014f, B:61:0x0152, B:63:0x0156, B:64:0x015f, B:65:0x0171, B:66:0x0175, B:68:0x017b, B:73:0x00c7, B:74:0x00ab, B:76:0x00b3, B:80:0x0163, B:84:0x018d, B:85:0x019c, B:87:0x01a2, B:93:0x01ba, B:95:0x01c6, B:97:0x01da, B:101:0x01eb, B:102:0x01f7, B:104:0x01fd, B:110:0x020f, B:112:0x0224, B:113:0x0243, B:115:0x0249, B:118:0x0253, B:119:0x025f, B:121:0x0265, B:127:0x0277, B:128:0x0283, B:130:0x0289, B:136:0x029b, B:137:0x02a7, B:139:0x02ad, B:149:0x02bf, B:150:0x02c3, B:152:0x02c9, B:154:0x02d9, B:156:0x02dd, B:157:0x02ec, B:159:0x02f2, B:166:0x0304, B:171:0x0316, B:172:0x0325, B:174:0x032b, B:180:0x0343, B:184:0x0350, B:185:0x035d, B:187:0x0363, B:189:0x0375, B:190:0x0381, B:192:0x0387, B:198:0x0399), top: B:5:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0109 A[Catch: JSONException -> 0x007a, TryCatch #1 {JSONException -> 0x007a, blocks: (B:9:0x0048, B:11:0x0054, B:13:0x005e, B:14:0x006a, B:16:0x0070, B:25:0x0085, B:27:0x0091, B:29:0x00a1, B:34:0x00bd, B:37:0x00c2, B:38:0x0105, B:40:0x0109, B:41:0x0116, B:43:0x011a, B:44:0x0122, B:46:0x0126, B:47:0x012c, B:49:0x0130, B:50:0x0133, B:52:0x0137, B:53:0x013a, B:55:0x013e, B:56:0x0141, B:58:0x0145, B:60:0x014f, B:61:0x0152, B:63:0x0156, B:64:0x015f, B:65:0x0171, B:66:0x0175, B:68:0x017b, B:73:0x00c7, B:74:0x00ab, B:76:0x00b3, B:80:0x0163, B:84:0x018d, B:85:0x019c, B:87:0x01a2, B:93:0x01ba, B:95:0x01c6, B:97:0x01da, B:101:0x01eb, B:102:0x01f7, B:104:0x01fd, B:110:0x020f, B:112:0x0224, B:113:0x0243, B:115:0x0249, B:118:0x0253, B:119:0x025f, B:121:0x0265, B:127:0x0277, B:128:0x0283, B:130:0x0289, B:136:0x029b, B:137:0x02a7, B:139:0x02ad, B:149:0x02bf, B:150:0x02c3, B:152:0x02c9, B:154:0x02d9, B:156:0x02dd, B:157:0x02ec, B:159:0x02f2, B:166:0x0304, B:171:0x0316, B:172:0x0325, B:174:0x032b, B:180:0x0343, B:184:0x0350, B:185:0x035d, B:187:0x0363, B:189:0x0375, B:190:0x0381, B:192:0x0387, B:198:0x0399), top: B:5:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x011a A[Catch: JSONException -> 0x007a, TryCatch #1 {JSONException -> 0x007a, blocks: (B:9:0x0048, B:11:0x0054, B:13:0x005e, B:14:0x006a, B:16:0x0070, B:25:0x0085, B:27:0x0091, B:29:0x00a1, B:34:0x00bd, B:37:0x00c2, B:38:0x0105, B:40:0x0109, B:41:0x0116, B:43:0x011a, B:44:0x0122, B:46:0x0126, B:47:0x012c, B:49:0x0130, B:50:0x0133, B:52:0x0137, B:53:0x013a, B:55:0x013e, B:56:0x0141, B:58:0x0145, B:60:0x014f, B:61:0x0152, B:63:0x0156, B:64:0x015f, B:65:0x0171, B:66:0x0175, B:68:0x017b, B:73:0x00c7, B:74:0x00ab, B:76:0x00b3, B:80:0x0163, B:84:0x018d, B:85:0x019c, B:87:0x01a2, B:93:0x01ba, B:95:0x01c6, B:97:0x01da, B:101:0x01eb, B:102:0x01f7, B:104:0x01fd, B:110:0x020f, B:112:0x0224, B:113:0x0243, B:115:0x0249, B:118:0x0253, B:119:0x025f, B:121:0x0265, B:127:0x0277, B:128:0x0283, B:130:0x0289, B:136:0x029b, B:137:0x02a7, B:139:0x02ad, B:149:0x02bf, B:150:0x02c3, B:152:0x02c9, B:154:0x02d9, B:156:0x02dd, B:157:0x02ec, B:159:0x02f2, B:166:0x0304, B:171:0x0316, B:172:0x0325, B:174:0x032b, B:180:0x0343, B:184:0x0350, B:185:0x035d, B:187:0x0363, B:189:0x0375, B:190:0x0381, B:192:0x0387, B:198:0x0399), top: B:5:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0126 A[Catch: JSONException -> 0x007a, TryCatch #1 {JSONException -> 0x007a, blocks: (B:9:0x0048, B:11:0x0054, B:13:0x005e, B:14:0x006a, B:16:0x0070, B:25:0x0085, B:27:0x0091, B:29:0x00a1, B:34:0x00bd, B:37:0x00c2, B:38:0x0105, B:40:0x0109, B:41:0x0116, B:43:0x011a, B:44:0x0122, B:46:0x0126, B:47:0x012c, B:49:0x0130, B:50:0x0133, B:52:0x0137, B:53:0x013a, B:55:0x013e, B:56:0x0141, B:58:0x0145, B:60:0x014f, B:61:0x0152, B:63:0x0156, B:64:0x015f, B:65:0x0171, B:66:0x0175, B:68:0x017b, B:73:0x00c7, B:74:0x00ab, B:76:0x00b3, B:80:0x0163, B:84:0x018d, B:85:0x019c, B:87:0x01a2, B:93:0x01ba, B:95:0x01c6, B:97:0x01da, B:101:0x01eb, B:102:0x01f7, B:104:0x01fd, B:110:0x020f, B:112:0x0224, B:113:0x0243, B:115:0x0249, B:118:0x0253, B:119:0x025f, B:121:0x0265, B:127:0x0277, B:128:0x0283, B:130:0x0289, B:136:0x029b, B:137:0x02a7, B:139:0x02ad, B:149:0x02bf, B:150:0x02c3, B:152:0x02c9, B:154:0x02d9, B:156:0x02dd, B:157:0x02ec, B:159:0x02f2, B:166:0x0304, B:171:0x0316, B:172:0x0325, B:174:0x032b, B:180:0x0343, B:184:0x0350, B:185:0x035d, B:187:0x0363, B:189:0x0375, B:190:0x0381, B:192:0x0387, B:198:0x0399), top: B:5:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0130 A[Catch: JSONException -> 0x007a, TryCatch #1 {JSONException -> 0x007a, blocks: (B:9:0x0048, B:11:0x0054, B:13:0x005e, B:14:0x006a, B:16:0x0070, B:25:0x0085, B:27:0x0091, B:29:0x00a1, B:34:0x00bd, B:37:0x00c2, B:38:0x0105, B:40:0x0109, B:41:0x0116, B:43:0x011a, B:44:0x0122, B:46:0x0126, B:47:0x012c, B:49:0x0130, B:50:0x0133, B:52:0x0137, B:53:0x013a, B:55:0x013e, B:56:0x0141, B:58:0x0145, B:60:0x014f, B:61:0x0152, B:63:0x0156, B:64:0x015f, B:65:0x0171, B:66:0x0175, B:68:0x017b, B:73:0x00c7, B:74:0x00ab, B:76:0x00b3, B:80:0x0163, B:84:0x018d, B:85:0x019c, B:87:0x01a2, B:93:0x01ba, B:95:0x01c6, B:97:0x01da, B:101:0x01eb, B:102:0x01f7, B:104:0x01fd, B:110:0x020f, B:112:0x0224, B:113:0x0243, B:115:0x0249, B:118:0x0253, B:119:0x025f, B:121:0x0265, B:127:0x0277, B:128:0x0283, B:130:0x0289, B:136:0x029b, B:137:0x02a7, B:139:0x02ad, B:149:0x02bf, B:150:0x02c3, B:152:0x02c9, B:154:0x02d9, B:156:0x02dd, B:157:0x02ec, B:159:0x02f2, B:166:0x0304, B:171:0x0316, B:172:0x0325, B:174:0x032b, B:180:0x0343, B:184:0x0350, B:185:0x035d, B:187:0x0363, B:189:0x0375, B:190:0x0381, B:192:0x0387, B:198:0x0399), top: B:5:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0137 A[Catch: JSONException -> 0x007a, TryCatch #1 {JSONException -> 0x007a, blocks: (B:9:0x0048, B:11:0x0054, B:13:0x005e, B:14:0x006a, B:16:0x0070, B:25:0x0085, B:27:0x0091, B:29:0x00a1, B:34:0x00bd, B:37:0x00c2, B:38:0x0105, B:40:0x0109, B:41:0x0116, B:43:0x011a, B:44:0x0122, B:46:0x0126, B:47:0x012c, B:49:0x0130, B:50:0x0133, B:52:0x0137, B:53:0x013a, B:55:0x013e, B:56:0x0141, B:58:0x0145, B:60:0x014f, B:61:0x0152, B:63:0x0156, B:64:0x015f, B:65:0x0171, B:66:0x0175, B:68:0x017b, B:73:0x00c7, B:74:0x00ab, B:76:0x00b3, B:80:0x0163, B:84:0x018d, B:85:0x019c, B:87:0x01a2, B:93:0x01ba, B:95:0x01c6, B:97:0x01da, B:101:0x01eb, B:102:0x01f7, B:104:0x01fd, B:110:0x020f, B:112:0x0224, B:113:0x0243, B:115:0x0249, B:118:0x0253, B:119:0x025f, B:121:0x0265, B:127:0x0277, B:128:0x0283, B:130:0x0289, B:136:0x029b, B:137:0x02a7, B:139:0x02ad, B:149:0x02bf, B:150:0x02c3, B:152:0x02c9, B:154:0x02d9, B:156:0x02dd, B:157:0x02ec, B:159:0x02f2, B:166:0x0304, B:171:0x0316, B:172:0x0325, B:174:0x032b, B:180:0x0343, B:184:0x0350, B:185:0x035d, B:187:0x0363, B:189:0x0375, B:190:0x0381, B:192:0x0387, B:198:0x0399), top: B:5:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013e A[Catch: JSONException -> 0x007a, TryCatch #1 {JSONException -> 0x007a, blocks: (B:9:0x0048, B:11:0x0054, B:13:0x005e, B:14:0x006a, B:16:0x0070, B:25:0x0085, B:27:0x0091, B:29:0x00a1, B:34:0x00bd, B:37:0x00c2, B:38:0x0105, B:40:0x0109, B:41:0x0116, B:43:0x011a, B:44:0x0122, B:46:0x0126, B:47:0x012c, B:49:0x0130, B:50:0x0133, B:52:0x0137, B:53:0x013a, B:55:0x013e, B:56:0x0141, B:58:0x0145, B:60:0x014f, B:61:0x0152, B:63:0x0156, B:64:0x015f, B:65:0x0171, B:66:0x0175, B:68:0x017b, B:73:0x00c7, B:74:0x00ab, B:76:0x00b3, B:80:0x0163, B:84:0x018d, B:85:0x019c, B:87:0x01a2, B:93:0x01ba, B:95:0x01c6, B:97:0x01da, B:101:0x01eb, B:102:0x01f7, B:104:0x01fd, B:110:0x020f, B:112:0x0224, B:113:0x0243, B:115:0x0249, B:118:0x0253, B:119:0x025f, B:121:0x0265, B:127:0x0277, B:128:0x0283, B:130:0x0289, B:136:0x029b, B:137:0x02a7, B:139:0x02ad, B:149:0x02bf, B:150:0x02c3, B:152:0x02c9, B:154:0x02d9, B:156:0x02dd, B:157:0x02ec, B:159:0x02f2, B:166:0x0304, B:171:0x0316, B:172:0x0325, B:174:0x032b, B:180:0x0343, B:184:0x0350, B:185:0x035d, B:187:0x0363, B:189:0x0375, B:190:0x0381, B:192:0x0387, B:198:0x0399), top: B:5:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0145 A[Catch: JSONException -> 0x007a, TryCatch #1 {JSONException -> 0x007a, blocks: (B:9:0x0048, B:11:0x0054, B:13:0x005e, B:14:0x006a, B:16:0x0070, B:25:0x0085, B:27:0x0091, B:29:0x00a1, B:34:0x00bd, B:37:0x00c2, B:38:0x0105, B:40:0x0109, B:41:0x0116, B:43:0x011a, B:44:0x0122, B:46:0x0126, B:47:0x012c, B:49:0x0130, B:50:0x0133, B:52:0x0137, B:53:0x013a, B:55:0x013e, B:56:0x0141, B:58:0x0145, B:60:0x014f, B:61:0x0152, B:63:0x0156, B:64:0x015f, B:65:0x0171, B:66:0x0175, B:68:0x017b, B:73:0x00c7, B:74:0x00ab, B:76:0x00b3, B:80:0x0163, B:84:0x018d, B:85:0x019c, B:87:0x01a2, B:93:0x01ba, B:95:0x01c6, B:97:0x01da, B:101:0x01eb, B:102:0x01f7, B:104:0x01fd, B:110:0x020f, B:112:0x0224, B:113:0x0243, B:115:0x0249, B:118:0x0253, B:119:0x025f, B:121:0x0265, B:127:0x0277, B:128:0x0283, B:130:0x0289, B:136:0x029b, B:137:0x02a7, B:139:0x02ad, B:149:0x02bf, B:150:0x02c3, B:152:0x02c9, B:154:0x02d9, B:156:0x02dd, B:157:0x02ec, B:159:0x02f2, B:166:0x0304, B:171:0x0316, B:172:0x0325, B:174:0x032b, B:180:0x0343, B:184:0x0350, B:185:0x035d, B:187:0x0363, B:189:0x0375, B:190:0x0381, B:192:0x0387, B:198:0x0399), top: B:5:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0156 A[Catch: JSONException -> 0x007a, TryCatch #1 {JSONException -> 0x007a, blocks: (B:9:0x0048, B:11:0x0054, B:13:0x005e, B:14:0x006a, B:16:0x0070, B:25:0x0085, B:27:0x0091, B:29:0x00a1, B:34:0x00bd, B:37:0x00c2, B:38:0x0105, B:40:0x0109, B:41:0x0116, B:43:0x011a, B:44:0x0122, B:46:0x0126, B:47:0x012c, B:49:0x0130, B:50:0x0133, B:52:0x0137, B:53:0x013a, B:55:0x013e, B:56:0x0141, B:58:0x0145, B:60:0x014f, B:61:0x0152, B:63:0x0156, B:64:0x015f, B:65:0x0171, B:66:0x0175, B:68:0x017b, B:73:0x00c7, B:74:0x00ab, B:76:0x00b3, B:80:0x0163, B:84:0x018d, B:85:0x019c, B:87:0x01a2, B:93:0x01ba, B:95:0x01c6, B:97:0x01da, B:101:0x01eb, B:102:0x01f7, B:104:0x01fd, B:110:0x020f, B:112:0x0224, B:113:0x0243, B:115:0x0249, B:118:0x0253, B:119:0x025f, B:121:0x0265, B:127:0x0277, B:128:0x0283, B:130:0x0289, B:136:0x029b, B:137:0x02a7, B:139:0x02ad, B:149:0x02bf, B:150:0x02c3, B:152:0x02c9, B:154:0x02d9, B:156:0x02dd, B:157:0x02ec, B:159:0x02f2, B:166:0x0304, B:171:0x0316, B:172:0x0325, B:174:0x032b, B:180:0x0343, B:184:0x0350, B:185:0x035d, B:187:0x0363, B:189:0x0375, B:190:0x0381, B:192:0x0387, B:198:0x0399), top: B:5:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void mopub(java.lang.String r45) {
        /*
            Method dump skipped, instructions count: 1012
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C5710e.mopub(java.lang.String):void");
    }

    public final boolean purchase() {
        AbstractC9528e.appmetrica();
        AbstractC9528e.appmetrica();
        C0849e metrica = metrica();
        if (metrica != null && metrica.f3231e == 4) {
            return true;
        }
        AbstractC9528e.appmetrica();
        C0849e metrica2 = metrica();
        if (metrica2 != null && metrica2.f3231e == 5) {
            return true;
        }
        AbstractC9528e.appmetrica();
        C0849e metrica3 = metrica();
        return (metrica3 != null && metrica3.f3231e == 2) || startapp() || yandex();
    }

    public final void smaato(C4612e c4612e) {
        InterfaceC13524e interfaceC13524e;
        InterfaceC9591e interfaceC9591e = this.purchase;
        if (interfaceC9591e == c4612e) {
            return;
        }
        if (interfaceC9591e != null) {
            this.metrica.loadAd();
            this.appmetrica.ad();
            AbstractC9528e.appmetrica();
            String str = (String) this.metrica.vip;
            C4612e c4612e2 = (C4612e) interfaceC9591e;
            if (TextUtils.isEmpty(str)) {
                throw new IllegalArgumentException("Channel namespace cannot be null or empty");
            }
            HashMap hashMap = c4612e2.subs;
            synchronized (hashMap) {
                interfaceC13524e = (InterfaceC13524e) hashMap.remove(str);
            }
            C9321e ad = C0381e.ad();
            ad.ad = new C15024e(14, c4612e2, interfaceC13524e, str);
            ad.appmetrica = 8414;
            c4612e2.appmetrica(1, ad.ad());
            this.license.f3332e = null;
            this.vip.removeCallbacksAndMessages(null);
        }
        this.purchase = c4612e;
        if (c4612e != null) {
            this.license.f3332e = c4612e;
        }
    }

    public final boolean startapp() {
        int i;
        AbstractC9528e.appmetrica();
        C0849e metrica = metrica();
        if (metrica != null) {
            if (metrica.f3231e == 3) {
                return true;
            }
            if (billing()) {
                synchronized (this.ad) {
                    try {
                        AbstractC9528e.appmetrica();
                        C0849e metrica2 = metrica();
                        i = metrica2 != null ? metrica2.f3253e : 0;
                    } finally {
                    }
                }
                if (i == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final MediaInfo vip() {
        MediaInfo mediaInfo;
        synchronized (this.ad) {
            AbstractC9528e.appmetrica();
            C0849e c0849e = this.metrica.purchase;
            mediaInfo = c0849e == null ? null : c0849e.f3251e;
        }
        return mediaInfo;
    }

    public final boolean yandex() {
        AbstractC9528e.appmetrica();
        C0849e metrica = metrica();
        return (metrica == null || metrica.f3233e == 0) ? false : true;
    }
}
