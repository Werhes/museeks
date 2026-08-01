package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executors;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَُؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10914e implements InterfaceC12233e, InterfaceC9575e, InterfaceC5019e, InterfaceC13204e, InterfaceC12937e, InterfaceC17847e, InterfaceC10544e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static C10914e f21618e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f21624e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ C10914e f21616e = new C10914e(15);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ C10914e f21620e = new C10914e(16);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ C10914e f21615e = new C10914e(17);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ C10914e f21623e = new C10914e(18);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final /* synthetic */ C10914e f21622e = new C10914e(19);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ C10914e f21619e = new C10914e(20);

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final /* synthetic */ C10914e f21621e = new C10914e(22);

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final /* synthetic */ C10914e f21617e = new C10914e(23);

    public /* synthetic */ C10914e(int i) {
        this.f21624e = i;
    }

    public C10914e(C1239e c1239e, AbstractC7905e abstractC7905e) {
        this.f21624e = 1;
    }

    public C10914e(InterfaceC7648e interfaceC7648e, int i) {
        this.f21624e = 13;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eِٖۢ, java.lang.Object] */
    public static byte[] appmetrica(List list) {
        ?? obj = new Object();
        Iterator it = license(list).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            obj.m4128final(str.length());
            obj.m4133public(0, str.length(), str);
        }
        return obj.subs(obj.f31731e);
    }

    public static ArrayList license(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((EnumC12473e) obj) != EnumC12473e.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((EnumC12473e) it.next()).f24979e);
        }
        return arrayList2;
    }

    @Override // defpackage.InterfaceC17847e
    public /* synthetic */ void accept(Object obj, Object obj2) {
        int i = C3355e.mopub;
    }

    @Override // defpackage.InterfaceC13204e
    public Object ad() {
        switch (this.f21624e) {
            case 15:
                List list = AbstractC17254e.ad;
                return (String) C0343e.metrica.get();
            case 16:
                List list2 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Long) C15469e.ad.billing(21600000L, 43, "measurement.sgtm.batch.retry_max_wait").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                List list3 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Long) C15469e.ad.billing(86400000L, 53, "measurement.upload.stale_data_deletion_interval").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List list4 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (String) C15469e.ad.yandex("measurement.config.url_authority", 7, "app-measurement.com").get();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list5 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (String) C15469e.ad.yandex("measurement.rb.attribution.uri_scheme", 60, "https").get();
            case 20:
                List list6 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return Integer.valueOf((int) ((Long) C15469e.ad.billing(3000L, 30, "measurement.rb.attribution.notify_app_delay_millis").get()).longValue());
            default:
                List list7 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Long) C15469e.ad.billing(10000L, 0, "measurement.ad_id_cache_time").get();
        }
    }

    @Override // defpackage.InterfaceC16964e
    public Object get() {
        return new ExecutorC14432e(Executors.newSingleThreadExecutor());
    }

    @Override // defpackage.InterfaceC10544e
    public C17996e metrica(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // defpackage.InterfaceC12937e
    /* renamed from: metrica, reason: collision with other method in class */
    public boolean mo2946metrica(Class cls) {
        return false;
    }

    @Override // defpackage.InterfaceC12937e
    public C5166e vip(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    @Override // defpackage.InterfaceC10544e
    /* renamed from: vip, reason: collision with other method in class */
    public boolean mo2947vip(Class cls) {
        return false;
    }
}
