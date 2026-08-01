package defpackage;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.view.View;
import androidx.car.app.navigation.model.Maneuver;
import io.realm.kotlin.internal.interop.DataInitializationCallback;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؓ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2007e implements InterfaceC12523e, DataInitializationCallback, InterfaceC8946e, InterfaceC10178e, InterfaceC16205e, InterfaceC8427e, InterfaceC4097e, InterfaceC6395e, InterfaceC0771e, InterfaceC10808e, InterfaceC12765e, InterfaceC0569e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f5254e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f5255e;

    public /* synthetic */ C2007e(int i, Object obj) {
        this.f5255e = i;
        this.f5254e = obj;
    }

    public /* synthetic */ C2007e(C0222e c0222e, ServiceConnectionC12367e serviceConnectionC12367e) {
        this.f5255e = 6;
        this.f5254e = c0222e;
    }

    public /* synthetic */ C2007e(C16864e c16864e, C16990e c16990e) {
        this.f5255e = 24;
        this.f5254e = c16990e;
    }

    private final void license() {
        C9041e c9041e = (C9041e) this.f5254e;
        synchronized (AbstractC12909e.metrica) {
            AbstractC12909e.startapp = AbstractC13480e.m3576default((List) AbstractC12909e.startapp, c9041e);
            Unit unit = Unit.INSTANCE;
        }
        AbstractC12909e.ad();
    }

    @Override // defpackage.InterfaceC8427e
    public void accept(Object obj) {
        switch (this.f5255e) {
            case 12:
                C11611e c11611e = (C11611e) this.f5254e;
                C17169e c17169e = (C17169e) obj;
                C10718e c10718e = new C10718e(c17169e.vip, C10990e.smaato(c17169e.ad, c17169e.metrica));
                c11611e.metrica.add(c10718e);
                long j = c11611e.adcel;
                if (j == -9223372036854775807L || c17169e.license >= j) {
                    c11611e.billing(c10718e);
                    return;
                }
                return;
            default:
                ((C13304e) this.f5254e).metrica((C17169e) obj);
                return;
        }
    }

    @Override // defpackage.InterfaceC16205e
    public void ad(Object obj, Object obj2) {
        C17790e c17790e = (C17790e) this.f5254e;
        C13843e c13843e = (C13843e) obj;
        C13843e c13843e2 = (C13843e) obj2;
        SurfaceHolderCallbackC0960e surfaceHolderCallbackC0960e = (SurfaceHolderCallbackC0960e) c17790e.f34881e;
        boolean z = c13843e.metrica;
        int i = c13843e.vip;
        if (!z && c13843e2.metrica) {
            c17790e.f34880e = i;
        }
        int i2 = c13843e2.vip;
        boolean z2 = c13843e2.metrica;
        if (i != i2 || z != z2) {
            surfaceHolderCallbackC0960e.ad.f33577e.billing(30, new C6877e(i2, z2));
        }
        if (c13843e.ad == c13843e2.ad && c13843e.license == c13843e2.license && c13843e.appmetrica == c13843e2.appmetrica) {
            return;
        }
        C17148e c17148e = surfaceHolderCallbackC0960e.ad;
        C17790e c17790e2 = c17148e.f33603e;
        C11226e c11226e = new C11226e(0);
        c11226e.metrica = c17790e2 != null ? ((C13843e) ((C17790e) c17790e2.f34878e).amazon()).license : 0;
        c11226e.license = c17790e2 != null ? ((C13843e) ((C17790e) c17790e2.f34878e).amazon()).appmetrica : 0;
        C5251e license = c11226e.license();
        if (license.equals(c17148e.f33615e)) {
            return;
        }
        c17148e.f33615e = license;
        c17148e.f33577e.billing(29, new C17687e(3, license));
    }

    @Override // defpackage.InterfaceC8946e
    public void adcel(long j, C1292e c1292e) {
        switch (this.f5255e) {
            case 7:
                AbstractC10509e.startapp(j, c1292e, (InterfaceC18147e[]) ((C0912e) this.f5254e).f3331e);
                return;
            default:
                AbstractC10509e.adcel(j, c1292e, (InterfaceC18147e[]) ((C15024e) this.f5254e).f29787e);
                return;
        }
    }

    @Override // defpackage.InterfaceC0771e
    public Object advert(C0560e c0560e) {
        ((CountDownLatch) this.f5254e).countDown();
        return null;
    }

    @Override // defpackage.InterfaceC12523e
    public Object amazon(C7169e c7169e) {
        int i = 10;
        boolean z = false;
        switch (this.f5255e) {
            case 0:
                C8765e c8765e = (C8765e) this.f5254e;
                AbstractC5336e.purchase((C14826e) c8765e.f17674e, null, 0, new C10954e(c8765e, c7169e, (InterfaceC5083e) null, 3), 3);
                return "FetchData for PipeCameraPresence0";
            case 5:
                C13343e c13343e = (C13343e) this.f5254e;
                C18405e c18405e = c13343e.remoteconfig;
                C5891e c5891e = new C5891e(c13343e, c7169e, z, i);
                ExecutorC12245e executorC12245e = c13343e.license;
                synchronized (c18405e.vip) {
                    c18405e.pro = c5891e;
                    c18405e.signatures = executorC12245e;
                }
                return "videoEncodingFuture";
            case 14:
                C16887e c16887e = (C16887e) this.f5254e;
                c16887e.loadAd = c7169e;
                return "SettableFuture hashCode: " + c16887e.hashCode();
            case 15:
                ((C13705e) this.f5254e).f27147e = c7169e;
                return "SurfaceOutputImpl close future complete";
            case 16:
                ((C0748e) this.f5254e).mopub.set(c7169e);
                return "textureViewImpl_waitForNextFrame";
            default:
                C16990e c16990e = (C16990e) this.f5254e;
                ((C5489e) c16990e.vip.f20512e).ad.put("androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(c7169e.hashCode()));
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                C18393e c18393e = new C18393e(atomicBoolean, c7169e, c16990e);
                RunnableC9527e runnableC9527e = new RunnableC9527e(i, atomicBoolean, c16990e, c18393e);
                ExecutorC0082e billing = AbstractC3062e.billing();
                C4001e c4001e = c7169e.metrica;
                if (c4001e != null) {
                    c4001e.ad(runnableC9527e, billing);
                }
                c16990e.vip.amazon(c18393e);
                return String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(c7169e.hashCode()));
        }
    }

    @Override // defpackage.InterfaceC10808e
    /* renamed from: apply */
    public String mo4378apply(Object obj) {
        return (String) ((C13506e) this.f5254e).get(obj);
    }

    public void appmetrica(AbstractC14436e abstractC14436e) {
        AbstractC16666e abstractC16666e;
        C8356e c8356e = (C8356e) this.f5254e;
        if (!(abstractC14436e instanceof C15746e) || (abstractC16666e = c8356e.f17103e) == null) {
            return;
        }
        float f = ((C15746e) abstractC14436e).metrica;
        if (!abstractC16666e.adcel()) {
            AbstractC9464e.remoteconfig("CameraController", "Use cases not attached to camera.");
            return;
        }
        if (!abstractC16666e.pro) {
            AbstractC9464e.yandex("CameraController", "Pinch to zoom disabled.");
            return;
        }
        AbstractC9464e.yandex("CameraController", "Pinch to zoom with scale: " + f);
        AbstractC13062e.metrica();
        C11608e c11608e = (C11608e) abstractC16666e.isVip.license();
        if (c11608e == null) {
            return;
        }
        abstractC16666e.mopub(Math.min(Math.max(c11608e.ad() * (f > 1.0f ? AbstractC1634e.billing(f, 1.0f, 2.0f, 1.0f) : 1.0f - ((1.0f - f) * 2.0f)), c11608e.vip), c11608e.metrica));
    }

    @Override // defpackage.InterfaceC0569e
    /* renamed from: extends */
    public C12948e mo378extends(View view, C12948e c12948e) {
        C17879e c17879e = (C17879e) this.f5254e;
        C2893e c2893e = c12948e.ad;
        AbstractC3489e.ad = c2893e.startapp(1).vip;
        AbstractC3489e.vip = c2893e.startapp(2).license;
        AbstractC3489e.metrica = Math.max(c2893e.startapp(2).ad, c2893e.startapp(128).ad);
        AbstractC3489e.license = Math.max(c2893e.startapp(2).metrica, c2893e.startapp(128).metrica);
        c17879e.invoke(c12948e);
        return c12948e;
    }

    @Override // defpackage.InterfaceC12765e
    /* renamed from: final */
    public void mo213final(C0560e c0560e) {
        switch (this.f5255e) {
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                AbstractC2940e.vip((Intent) this.f5254e);
                return;
            default:
                ((C17296e) this.f5254e).vip.license(null);
                return;
        }
    }

    @Override // io.realm.kotlin.internal.interop.DataInitializationCallback
    public void invoke() {
        ((C9302e) this.f5254e).f18534e = true;
    }

    @Override // defpackage.InterfaceC4097e
    public void metrica(float f) {
        ((InterfaceC1160e) this.f5254e).ad(f);
    }

    @Override // defpackage.InterfaceC6395e
    public Object purchase() {
        SQLiteDatabase ad;
        int i = this.f5255e;
        boolean z = false;
        Object obj = this.f5254e;
        switch (i) {
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C2417e c2417e = (C2417e) ((InterfaceC2361e) obj);
                c2417e.getClass();
                int i2 = C7866e.appmetrica;
                C11980e c11980e = new C11980e(5, z);
                c11980e.f23950e = null;
                c11980e.f23949e = new ArrayList();
                c11980e.f23951e = null;
                c11980e.f23948e = BuildConfig.FLAVOR;
                HashMap hashMap = new HashMap();
                ad = c2417e.ad();
                ad.beginTransaction();
                try {
                    C7866e c7866e = (C7866e) C2417e.inmobi(ad.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new C9509e(17, c2417e, hashMap, c11980e));
                    ad.setTransactionSuccessful();
                    return c7866e;
                } finally {
                }
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C2417e c2417e2 = (C2417e) ((InterfaceC8685e) obj);
                long vip = c2417e2.f6207e.vip() - c2417e2.f6208e.license;
                ad = c2417e2.ad();
                ad.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(vip)};
                    Cursor rawQuery = ad.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (rawQuery.moveToNext()) {
                        try {
                            c2417e2.loadAd(rawQuery.getInt(0), EnumC2962e.MESSAGE_TOO_OLD, rawQuery.getString(1));
                        } catch (Throwable th) {
                            rawQuery.close();
                            throw th;
                        }
                    }
                    rawQuery.close();
                    int delete = ad.delete("events", "timestamp_ms < ?", strArr);
                    ad.setTransactionSuccessful();
                    ad.endTransaction();
                    return Integer.valueOf(delete);
                } finally {
                }
            default:
                C2417e c2417e3 = (C2417e) ((InterfaceC2361e) ((C4956e) obj).f10516e);
                ad = c2417e3.ad();
                ad.beginTransaction();
                try {
                    ad.compileStatement("DELETE FROM log_event_dropped").execute();
                    ad.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + c2417e3.f6207e.vip()).execute();
                    ad.setTransactionSuccessful();
                    return null;
                } finally {
                }
        }
    }

    public void vip() {
        switch (this.f5255e) {
            case 9:
                license();
                return;
            default:
                Function2 function2 = (Function2) this.f5254e;
                synchronized (AbstractC12909e.metrica) {
                    AbstractC12909e.yandex = AbstractC13480e.m3576default((List) AbstractC12909e.yandex, function2);
                    Unit unit = Unit.INSTANCE;
                }
                return;
        }
    }
}
