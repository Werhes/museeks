package defpackage;

import android.animation.ValueAnimator;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.ColorSpace;
import android.graphics.PointF;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import com.google.firebase.datatransport.TransportRegistrar;
import j$.util.stream.IntStream;
import java.io.File;
import java.security.cert.PKIXRevocationChecker;
import java.util.ArrayList;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۖؒ */
/* loaded from: classes.dex */
public final /* synthetic */ class C11180e implements InterfaceC16996e, InterfaceC13824e, InterfaceC14017e, InterfaceC3812e, InterfaceC8427e, InterfaceC0771e, InterfaceC9620e, InterfaceC3337e, InterfaceC11806e, InterfaceC17022e, InterfaceC7424e, InterfaceC5808e {

    /* renamed from: eّٖۦ */
    public final /* synthetic */ int f22444e;

    /* renamed from: eؘٙؓ */
    public static final C11180e f22441e = new C11180e(17);

    /* renamed from: eًؔؐ */
    public static final C11180e f22440e = new C11180e(18);

    /* renamed from: eؙِٖ */
    public static final C11180e f22442e = new C11180e(19);

    /* renamed from: eّؑؑ */
    public static final C11180e f22439e = new C11180e(20);

    /* renamed from: eٗۚۖ */
    public static final C11180e f22443e = new C11180e(21);

    public /* synthetic */ C11180e(int i) {
        this.f22444e = i;
    }

    public /* synthetic */ C11180e(int i, Object obj) {
        this.f22444e = i;
    }

    public static /* synthetic */ IntStream adcel(CharSequence charSequence) {
        return IntStream.VivifiedWrapper.convert(charSequence.codePoints());
    }

    public static /* bridge */ /* synthetic */ ColorSpace billing(Object obj) {
        return (ColorSpace) obj;
    }

    public static /* bridge */ /* synthetic */ PKIXRevocationChecker startapp(Object obj) {
        return (PKIXRevocationChecker) obj;
    }

    @Override // defpackage.InterfaceC8427e
    public void accept(Object obj) {
        ((C3819e) obj).vip.release();
    }

    @Override // defpackage.InterfaceC3337e
    public void ad(C7383e c7383e, float[] fArr, RunnableC2623e runnableC2623e) {
        switch (this.f22444e) {
            case 13:
                runnableC2623e.run();
                return;
            default:
                ValueAnimator duration = ValueAnimator.ofFloat(1.0f, 0.0f).setDuration(200L);
                duration.addUpdateListener(new C1498e(4, c7383e));
                duration.addListener(new C9380e(7, runnableC2623e));
                duration.start();
                return;
        }
    }

    @Override // defpackage.InterfaceC0771e
    public Object advert(C0560e c0560e) {
        boolean z;
        if (c0560e.advert()) {
            C16281e c16281e = (C16281e) c0560e.adcel();
            C5438e c5438e = C5438e.f11671e;
            c5438e.subscription("Crashlytics report successfully enqueued to DataTransport: " + c16281e.vip);
            File file = c16281e.metrica;
            z = true;
            if (file.delete()) {
                c5438e.subscription("Deleted report file: " + file.getPath());
            } else {
                c5438e.isVip("Crashlytics could not delete report file: " + file.getPath(), null);
            }
        } else {
            Log.w("FirebaseCrashlytics", "Crashlytics report could not be enqueued to DataTransport", c0560e.startapp());
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.InterfaceC3812e
    public Object apply(Object obj) {
        Cursor rawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (rawQuery.moveToNext()) {
                C12894e ad = C7869e.ad();
                ad.crashlytics(rawQuery.getString(1));
                ad.f25752e = AbstractC12589e.vip(rawQuery.getInt(2));
                String string = rawQuery.getString(3);
                ad.f25750e = string == null ? null : Base64.decode(string, 0);
                arrayList.add(ad.startapp());
            }
            return arrayList;
        } finally {
            rawQuery.close();
        }
    }

    @Override // defpackage.InterfaceC11806e
    public C16465e appmetrica(Float f) {
        return new C16465e(new PointF());
    }

    @Override // defpackage.InterfaceC16996e
    public void license(C0167e c0167e) {
    }

    @Override // defpackage.InterfaceC17022e
    public /* synthetic */ boolean metrica() {
        switch (this.f22444e) {
            case 22:
                return true;
            default:
                return true;
        }
    }

    @Override // defpackage.InterfaceC14017e
    public double mopub(double d) {
        return d;
    }

    @Override // defpackage.InterfaceC7424e
    public void purchase(Exception exc) {
    }

    @Override // defpackage.InterfaceC5808e
    public Object smaato(C18464e c18464e) {
        InterfaceC11846e lambda$getComponents$0;
        InterfaceC11846e lambda$getComponents$1;
        InterfaceC11846e lambda$getComponents$2;
        switch (this.f22444e) {
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                lambda$getComponents$0 = TransportRegistrar.lambda$getComponents$0(c18464e);
                return lambda$getComponents$0;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                lambda$getComponents$1 = TransportRegistrar.lambda$getComponents$1(c18464e);
                return lambda$getComponents$1;
            default:
                lambda$getComponents$2 = TransportRegistrar.lambda$getComponents$2(c18464e);
                return lambda$getComponents$2;
        }
    }

    @Override // defpackage.InterfaceC17022e
    public void vip(C1059e c1059e, View view, int i, float f) {
        switch (this.f22444e) {
            case 22:
                if (view != null) {
                    view.setTranslationX(0.0f);
                    view.setTranslationY(0.0f);
                    view.setScaleY(1.0f);
                    view.setScaleX(1.0f);
                    return;
                }
                return;
            default:
                float f2 = 1.0f - f;
                if (view != null) {
                    if (i == 2) {
                        view.setTranslationX(c1059e.getWidth() * f2);
                        return;
                    } else {
                        float width = c1059e.getWidth();
                        view.setTranslationX((-(width - (f2 * width))) * 0.35f);
                        return;
                    }
                }
                return;
        }
    }

    @Override // defpackage.InterfaceC13824e
    public void yandex(InterfaceC7970e interfaceC7970e) {
        interfaceC7970e.get().getClass();
        throw new ClassCastException();
    }
}
