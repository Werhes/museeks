package defpackage;

import android.content.Context;
import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.car.app.navigation.model.Maneuver;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٔۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14595e implements InterfaceC13521e, InterfaceC1481e, InterfaceC9575e, InterfaceC10817e, InterfaceC3832e, InterfaceC7268e, InterfaceC13204e, InterfaceC5808e, InterfaceC11232e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f28805e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ C14595e f28799e = new C14595e(14);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ C14595e f28798e = new C14595e(15);

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final /* synthetic */ C14595e f28801e = new C14595e(16);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final /* synthetic */ C14595e f28797e = new C14595e(17);

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ C14595e f28804e = new C14595e(18);

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final /* synthetic */ C14595e f28803e = new C14595e(20);

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ C14595e f28800e = new C14595e(21);

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final /* synthetic */ C14595e f28802e = new C14595e(22);

    public C14595e() {
        this.f28805e = 13;
        List list = Collections.EMPTY_LIST;
    }

    public /* synthetic */ C14595e(int i) {
        this.f28805e = i;
    }

    @Override // defpackage.InterfaceC13521e
    public void Signature(InterfaceC5052e interfaceC5052e, ArrayList arrayList) {
    }

    @Override // defpackage.InterfaceC13204e
    public Object ad() {
        switch (this.f28805e) {
            case 15:
                List list = AbstractC17254e.ad;
                return (String) C0343e.vip.get();
            case 16:
                List list2 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Long) C15469e.ad.billing(1800000L, 41, "measurement.sgtm.batch.retry_interval").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                List list3 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Long) C15469e.ad.billing(60000L, 27, "measurement.alarm_manager.minimum_interval").get();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List list4 = AbstractC17254e.ad;
                C3973e.f8863e.get();
                return (String) C16868e.ad.yandex("measurement.test.string_flag", 5, "---").get();
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            default:
                List list5 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return Integer.valueOf((int) ((Long) C15469e.ad.billing(100000L, 71, "measurement.upload.max_events_per_day").get()).longValue());
            case 20:
                List list6 = AbstractC17254e.ad;
                C1788e.f4842e.get();
                return (Boolean) C15469e.ad.license("measurement.config.notify_trigger_uris_on_backgrounded", true, 31).get();
            case 21:
                List list7 = AbstractC17254e.ad;
                return (Boolean) C4997e.ad.get();
        }
    }

    @Override // defpackage.InterfaceC1481e
    public AbstractC13960e advert(InterfaceC7227e interfaceC7227e, C8229e c8229e) {
        return billing(((InterfaceC18155e) interfaceC7227e).subs(), c8229e);
    }

    @Override // defpackage.InterfaceC1481e
    public AbstractC13960e billing(Class cls, C8229e c8229e) {
        return license(cls);
    }

    @Override // defpackage.InterfaceC7268e
    /* renamed from: eٟؕۡ */
    public /* synthetic */ String mo2279e(String str, String str2) {
        return null;
    }

    @Override // defpackage.InterfaceC1481e
    public AbstractC13960e license(Class cls) {
        return new C16301e(true);
    }

    @Override // defpackage.InterfaceC13521e
    public void loadAd(InterfaceC0390e interfaceC0390e) {
        if (interfaceC0390e == null) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1", "reportCannotInferVisibility"));
        }
    }

    public float metrica(InterfaceC11572e interfaceC11572e, MotionEvent motionEvent, MotionEvent motionEvent2) {
        if (motionEvent == null || motionEvent2 == null) {
            return 1.0f;
        }
        float x = motionEvent2.getX() - motionEvent.getX();
        return 1.0f - (Math.max(0.0f, Math.min(((C1059e) interfaceC11572e).f3570e ? (int) (interfaceC11572e.getWidth() - (x - interfaceC11572e.getX())) : (int) (x - interfaceC11572e.getX()), interfaceC11572e.getWidth())) / interfaceC11572e.getWidth());
    }

    @Override // defpackage.InterfaceC11232e
    public C3900e pro(Context context, String str, InterfaceC11716e interfaceC11716e) {
        int purchase;
        C3900e c3900e = new C3900e();
        int yandex = interfaceC11716e.yandex(context, str);
        c3900e.vip = yandex;
        int i = 1;
        int i2 = 0;
        if (yandex != 0) {
            purchase = interfaceC11716e.purchase(context, str, false);
            c3900e.metrica = purchase;
        } else {
            purchase = interfaceC11716e.purchase(context, str, true);
            c3900e.metrica = purchase;
        }
        int i3 = c3900e.vip;
        if (i3 != 0) {
            i2 = i3;
        } else if (purchase == 0) {
            i = 0;
            c3900e.license = i;
            return c3900e;
        }
        if (i2 >= purchase) {
            i = -1;
        }
        c3900e.license = i;
        return c3900e;
    }

    @Override // defpackage.InterfaceC5808e
    public Object smaato(C18464e c18464e) {
        C4205e c4205e = new C4205e();
        RunnableC18182e runnableC18182e = new RunnableC18182e(4);
        ReferenceQueue referenceQueue = c4205e.ad;
        Set set = c4205e.vip;
        set.add(new C13326e(c4205e, referenceQueue, set, runnableC18182e));
        Thread thread = new Thread(new RunnableC17144e(referenceQueue, set, 28), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return c4205e;
    }

    public String toString() {
        switch (this.f28805e) {
            case 4:
                return "REMOVE_FROZEN";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.InterfaceC3832e
    public long vip() {
        return SystemClock.elapsedRealtime();
    }
}
