package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import j$.time.Instant;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import ua.itaysonlab.vkapi2.objects.music.catalog.CatalogArtist;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٕۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C6607e implements InterfaceC15269e, InterfaceC13603e, InterfaceC8370e, InterfaceC16100e, InterfaceC16700e, InterfaceC18295e, InterfaceC3604e, InterfaceC14746e, InterfaceC1481e, InterfaceC13204e, InterfaceC11232e, InterfaceC5808e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static C6607e f13625e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13631e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ C6607e f13624e = new C6607e(14);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ C6607e f13627e = new C6607e(15);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ C6607e f13623e = new C6607e(16);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ C6607e f13630e = new C6607e(17);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final /* synthetic */ C6607e f13629e = new C6607e(19);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ C6607e f13626e = new C6607e(20);

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final /* synthetic */ C6607e f13628e = new C6607e(21);

    public /* synthetic */ C6607e(int i) {
        this.f13631e = i;
    }

    public static void ads(C17698e c17698e, Map.Entry entry) {
        AbstractC10814e abstractC10814e = (AbstractC10814e) entry.getKey();
        EnumC1699e enumC1699e = EnumC1699e.f4631e;
        abstractC10814e.getClass();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0021, code lost:
    
        r2 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0031, code lost:
    
        if (defpackage.C11811e.ad(1800000000000L, r10) == (-1)) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001e, code lost:
    
        if (defpackage.C11811e.ad(10000000000L, r10) == (-1)) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean applovin(int r5, int r6, long r7, boolean r9, boolean r10, defpackage.C11811e r11) {
        /*
            boolean r10 = isPro(r5, r10)
            java.lang.String r0 = "CXCP"
            if (r10 == 0) goto Ld
            java.lang.String r1 = "shouldRetry: Active resume mode is activated"
            android.util.Log.d(r0, r1)
        Ld:
            r1 = -1
            if (r10 != 0) goto L23
            r2 = 10000000000(0x2540be400, double:4.9406564584E-314)
            if (r11 != 0) goto L18
            goto L33
        L18:
            long r10 = r11.ad
            int r4 = defpackage.C11811e.ad(r2, r10)
            if (r4 != r1) goto L21
            goto L33
        L21:
            r2 = r10
            goto L33
        L23:
            r2 = 1800000000000(0x1a3185c5000, double:8.89318162514E-312)
            if (r11 != 0) goto L2b
            goto L33
        L2b:
            long r10 = r11.ad
            int r4 = defpackage.C11811e.ad(r2, r10)
            if (r4 != r1) goto L21
        L33:
            int r7 = defpackage.C11811e.ad(r7, r2)
            r8 = 0
            if (r7 <= 0) goto L3b
            goto L7b
        L3b:
            r7 = 1
            if (r5 != 0) goto L41
            if (r6 > r7) goto L7b
            goto L7a
        L41:
            if (r5 != r7) goto L4c
            int r5 = android.os.Build.VERSION.SDK_INT
            r9 = 29
            if (r5 >= r9) goto L7a
            if (r6 > r7) goto L7b
            goto L7a
        L4c:
            r10 = 2
            if (r5 != r10) goto L50
            goto L7a
        L50:
            r10 = 3
            if (r5 != r10) goto L58
            if (r9 == 0) goto L7a
            if (r6 > r7) goto L7b
            goto L7a
        L58:
            r9 = 4
            if (r5 != r9) goto L5c
            goto L7a
        L5c:
            r9 = 5
            if (r5 != r9) goto L60
            goto L7a
        L60:
            r9 = 6
            if (r5 != r9) goto L64
            goto L7a
        L64:
            r9 = 7
            if (r5 != r9) goto L68
            goto L7a
        L68:
            r9 = 8
            if (r5 != r9) goto L6f
            if (r6 > r7) goto L7b
            goto L7a
        L6f:
            r9 = 10
            if (r5 != r9) goto L74
            goto L7b
        L74:
            r9 = 11
            if (r5 != r9) goto L7c
            if (r6 > r7) goto L7b
        L7a:
            return r7
        L7b:
            return r8
        L7c:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Unexpected CameraError: "
            r5.<init>(r6)
            eؙٕۘ r6 = defpackage.C16760e.startapp
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r0, r5)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C6607e.applovin(int, int, long, boolean, boolean, eؘِٙ):boolean");
    }

    public static boolean isPro(int i, boolean z) {
        int i2;
        if (!z || 29 > (i2 = Build.VERSION.SDK_INT) || i2 >= 33) {
            return false;
        }
        return i == 1 || i == 2 || i == 6;
    }

    @Override // defpackage.InterfaceC8370e
    public void Signature(int i, String str, List list) {
    }

    @Override // defpackage.InterfaceC13204e
    public Object ad() {
        switch (this.f13631e) {
            case 14:
                return new Boolean(((Boolean) C16502e.ad.get()).booleanValue());
            case 15:
                List list = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (String) C15469e.ad.yandex("measurement.upload.url", 78, "https://app-measurement.com/a").get();
            case 16:
                List list2 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Long) C15469e.ad.billing(86400000L, 5, "measurement.config.cache_time").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                List list3 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Long) C15469e.ad.billing(518400000L, 73, "measurement.upload.max_queue_time").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            default:
                List list4 = AbstractC17254e.ad;
                C4261e.f9346e.get();
                return (Boolean) C13302e.ad.license("measurement.rb.attribution.uuid_generation", true, 8).get();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list5 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return Integer.valueOf((int) ((Long) C15469e.ad.billing(65536L, 75, "measurement.upload.max_batch_size").get()).longValue());
            case 20:
                List list6 = AbstractC17254e.ad;
                return (Boolean) C7338e.ad.get();
        }
    }

    @Override // defpackage.InterfaceC16700e
    public void adcel(SharedPreferences sharedPreferences, String str, Object obj) {
        Integer valueOf = Integer.valueOf(((Number) obj).intValue());
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putInt(str, valueOf.intValue());
        edit.apply();
    }

    @Override // defpackage.InterfaceC8370e
    public boolean admob() {
        return true;
    }

    @Override // defpackage.InterfaceC1481e
    public AbstractC13960e advert(InterfaceC7227e interfaceC7227e, C8229e c8229e) {
        return billing(((InterfaceC18155e) interfaceC7227e).subs(), c8229e);
    }

    @Override // defpackage.InterfaceC8370e
    public void amazon(C18010e c18010e) {
    }

    @Override // defpackage.InterfaceC8370e
    public void appmetrica() {
    }

    public AbstractC13960e billing(Class cls, C8229e c8229e) {
        return license(cls);
    }

    @Override // defpackage.InterfaceC14746e
    public void crashlytics(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override // defpackage.InterfaceC16964e
    public Object get() {
        return C10618e.ad;
    }

    @Override // defpackage.InterfaceC8370e
    public void inmobi(CatalogArtist catalogArtist) {
    }

    @Override // defpackage.InterfaceC16100e
    /* renamed from: interface */
    public InterfaceC12438e mo819interface() {
        return new C2405e();
    }

    @Override // defpackage.InterfaceC18242e
    public InterfaceC13659e isVip() {
        return C4069e.license();
    }

    public AbstractC13960e license(Class cls) {
        return AbstractC4465e.purchase(cls);
    }

    @Override // defpackage.InterfaceC3604e
    public InterfaceC6347e loadAd() {
        return new C5990e(-9223372036854775807L);
    }

    @Override // defpackage.InterfaceC8370e
    public boolean metrica() {
        return false;
    }

    @Override // defpackage.InterfaceC8370e
    public String mopub() {
        return "STUB";
    }

    @Override // defpackage.InterfaceC11232e
    public C3900e pro(Context context, String str, InterfaceC11716e interfaceC11716e) {
        C3900e c3900e = new C3900e();
        int purchase = interfaceC11716e.purchase(context, str, true);
        c3900e.metrica = purchase;
        if (purchase != 0) {
            c3900e.license = 1;
            return c3900e;
        }
        int yandex = interfaceC11716e.yandex(context, str);
        c3900e.vip = yandex;
        if (yandex != 0) {
            c3900e.license = -1;
        }
        return c3900e;
    }

    @Override // defpackage.InterfaceC13603e
    public C5471e purchase() {
        Instant now = Instant.now();
        C5471e c5471e = C5471e.f11744e;
        return C13023e.metrica(now.getEpochSecond(), now.getNano());
    }

    @Override // defpackage.InterfaceC18295e
    public C13827e remoteconfig(C9821e c9821e, JSONObject jSONObject) {
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        C5401e c5401e = jSONObject.has("session") ? new C5401e(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8), 16, (byte) 0) : new C5401e(new JSONObject().optInt("max_custom_exception_events", 8), 16, (byte) 0);
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        return new C13827e(jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : (optInt * 1000) + System.currentTimeMillis(), c5401e, new C10233e(2, jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false)), optDouble, optDouble2, optInt2);
    }

    @Override // defpackage.InterfaceC8370e
    public void signatures(String str) {
    }

    @Override // defpackage.InterfaceC5808e
    public Object smaato(C18464e c18464e) {
        return new C6043e((Context) c18464e.ad(Context.class));
    }

    @Override // defpackage.InterfaceC8370e
    public C12344e startapp() {
        throw new IllegalStateException("Not supported in current CatalogContext");
    }

    @Override // defpackage.InterfaceC8370e
    public void subscription() {
    }

    @Override // defpackage.InterfaceC3604e
    public void tapsense(long j) {
    }

    @Override // defpackage.InterfaceC3604e
    public long vip(InterfaceC2283e interfaceC2283e) {
        return -1L;
    }

    @Override // defpackage.InterfaceC16700e
    public Object yandex(SharedPreferences sharedPreferences, String str, Object obj) {
        return Integer.valueOf(sharedPreferences.getInt(str, ((Number) obj).intValue()));
    }
}
